package Packages;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Stage_3 extends Default_Frame implements Runnable{
	
	Image Sponge_bob_Missile_Image; // �������� �̻��� �̹���	
	Image Patrick_Star_Missile_Image; // ���� �̻��� �̹���

	Image Sponge_bob_Image; // �������� �̹���
	Image Patrick_Star_Image; // ���� �̹���
	
	Image ST_B_Flight0; // �������� Blue ����� �̹���
	Image ST_B_Flight1;
	Image ST_B_Flight2;
	
	Image B_G_Ms; // Green �Ŵ� �̻���
	
	Sponge_bob sb; // �������� Ŭ����
	Patrick_Star ps; // ���� Ŭ����
	Blue_Flight BF = new Blue_Flight(); // ��� Ŭ����
	Green_Flight GF = new Green_Flight(); // �׸� Ŭ����
	Pink_Flight PF = new Pink_Flight(); // ��ũ Ŭ����
	Yellow_Flight YF = new Yellow_Flight(); // ���ο� Ŭ����
	
	ArrayList<Sponge_bob> Sponge_bob_List; // �������� ������
	ArrayList<Patrick_Star> Patrick_Star_List; // ���� ������
	
	ArrayList<Missile> Sponge_bob_Missile_List; // ���������� �̻����� �����ϱ� ���� �迭
	ArrayList<Missile> Patrick_Star_Missile_List; // ������ �̻����� �����ϱ� ���� �迭
	
	
	int cnt; // ī��Ʈ
	int s_cnt = 0; // ��ų ī��Ʈ
	int stack = 0; // ��ų ����
	
	int e_s_cnt = 0; // �� ��ų ī��Ʈ
	int e_stack = 0; // �� ��ų ����
	
	boolean E_S_C; // �� ��ų ī��Ʈ ����	
	boolean S_C; // ��ų ī��Ʈ ����
	boolean S_LR = true; // �� �翷 Ȯ�� ( false : ���� ������ , true : ������ ������ )
	
	int SB = 0; // �÷��̾� �Ǹ� ������ ���������̿���
	int PS = 0; // �÷��̾� �Ǹ� ������ �����̿���
	int P_HP = 0; // �÷��̾� HP 
	
	int fl_num; // ������� ��ü  ( 0 : Blue , 1 : Green , 2 : Pink , 3 : Yellow)
	
	String flight;
	
	public void Game_Start(String Flight, int player_Hitpoint, int player_Speed, int missile_Speed)
	{
		Default_Frame(Flight, 3, player_Hitpoint, player_Speed,  missile_Speed); // ����Ʈ �����ӿ� ������ �����ϴ�.
		start(); // ����
		
		this.player_Hitpoint = player_Hitpoint; // �÷��̾� ü��
		this.player_Speed = player_Speed; // �÷��̾� �̵� �ӵ�
		this.missile_Speed = missile_Speed; // �̻��� ������ �ӵ�
		this.flight = Flight; // �Է� �ޱ�
		
		Sponge_bob_Image = new ImageIcon("src\\Files\\S_Sponge_bob.png").getImage(); // �������� �̹��� 
		Patrick_Star_Image = new ImageIcon("src\\Files\\S_Patrick_Star.png").getImage(); // ���� �̹��� 
		
		Sponge_bob_Missile_Image = new ImageIcon("src\\Files\\Sponge_bob_missile.png").getImage(); // �������� �̻��� �̹���
		Patrick_Star_Missile_Image = new ImageIcon("src\\Files\\Patrick_Star_missile.png").getImage(); // ���� �̻��� �̹���
		
		Sponge_bob_List = new ArrayList<Sponge_bob>(); // �ټ��� ���������� �����ϱ� ���� �迭
		Patrick_Star_List = new ArrayList<Patrick_Star>(); // �ټ��� ���̸� �����ϱ� ���� �迭

		Sponge_bob_Missile_List = new ArrayList<Missile>(); // �������� �̻����� �����ϱ� ���� �迭
		Patrick_Star_Missile_List = new ArrayList<Missile>(); // ���� �̻����� �����ϱ� ���� �迭
				
		SCF = new Stage_Change_Frame(); // �������� �ٲٴ� �� ��ü
		
		if(flight.equals("Blue")) // �нú� ������ ���ؼ� �������� �˾ƺ���
		{
			fl_num = 0; // ���
			
			ST_B_Flight0 = new ImageIcon("src\\Files\\ST_Blue_0.png").getImage(); // ���� �̹���
			ST_B_Flight1 = new ImageIcon("src\\Files\\ST_Blue_1.png").getImage();
			ST_B_Flight2 = new ImageIcon("src\\Files\\ST_Blue_2.png").getImage();
		
		}
		
		if(flight.equals("Green"))
		{
			fl_num = 1; // �׸�
			
			B_G_Ms = new ImageIcon("src\\Files\\B_Green_missile.png").getImage(); // ū �̻��� �̹���
		}
		
		if(flight.equals("Pink"))
		{
			fl_num = 2; // ��ũ
		}

		if(flight.equals("Yellow"))
		{
			fl_num = 3; // ���ο�
		}
		if(flight.equals("Rainbow"))
		{
			fl_num = 777;
		}
		// �������� �߰� 
		sb = new Sponge_bob(120,200);
		Sponge_bob_List.add(sb);
		
		sb = new Sponge_bob(250,200);
		Sponge_bob_List.add(sb);
		
		sb = new Sponge_bob(380,200);
		Sponge_bob_List.add(sb);
		
		// ���� �߰�
		ps = new Patrick_Star(60,100);
		Patrick_Star_List.add(ps);
	
		ps = new Patrick_Star(190,100);
		Patrick_Star_List.add(ps);
		
		ps = new Patrick_Star(320,100);
		Patrick_Star_List.add(ps);
		
		ps = new Patrick_Star(450,100);
		Patrick_Star_List.add(ps);
		

		
	}
	
	public void start() // ���� ��� ó�� �޼ҵ�
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ������ ������ ���� x��ư�� �������� 
		// ���α׷��� ���������� ���ᰡ �˴ϴ�.
		
		addKeyListener(this); // Ű���� �̺�Ʈ ����
		th = new Thread(this); // ������ ����
		th.start(); // ������ ����

	}
	
	public void run() //�����尡 ���� ���� �� �κ��Դϴ�.
	{	
		try  // ���� ����
		{	
			while(true) // while������ ���� ����
			{
				if (player_Hitpoint <= 0) // �÷��̾� �� ������ ��
				{
					break;
				}
				cnt++; //ī��Ʈ ����
				BonusProcess(); // �� && ���
				HeartProcess(); // ü�� ����
				KeyProcess(); // Ű���� �Է�ó���� �Ͽ� x,y ����
				MissileProcess(); // �̻��� �Է�ó�� �޼ҵ�
				Sponge_bob_moveProcess(); // �������� �̵� ó�� �޼ҵ�
				
				if (cnt > 50) // 50 �̻� ���� ���� �̻��� �߻�
				{
					Enemy_MissileProcess(); // �� �̻��� ó��
					
					if(Sponge_bob_List.size() == 0 && Patrick_Star_List.size() == 0) // ���� �ֳ�?
					{
						break; // �ݺ��� ������
					}
				}
				if(fl_num == 0) // ��� ����� �϶�
				{
					if ( cnt % ((stack+1)*500 + stack* 150)== 0) // 10�� ����
					{
						Sound("src\\Files\\HPUP.wav"); // �� �Ҹ�
						BF.Shield = true; // ���� ����
						S_C = true; // ī��Ʈ ����
					}
					
					if ( s_cnt == 150) // 3�ʰ�
					{
						BF.Shield = false; // ���� ���� 
						S_C = false; // ��ų ī��Ʈ ��
						s_cnt = 0; // �ʱ�ȭ
						stack ++ ; // ���� �ױ�
					}
				}
				
				if(fl_num == 1) // �׸� ����� �϶� 
				{
					if ( cnt % ((stack+1)*250 + stack* 100) == 0) // 5�� ����
					{
						GF.Big_MS = true; // ���� ����
						S_C = true; // ī��Ʈ ����
					}
					
					if ( s_cnt == 100 ) // 2�ʰ�
					{
						GF.Big_MS = false;
						S_C = false; // ��ų ī��Ʈ ��
						s_cnt = 0; // �ʱ�ȭ
						stack ++ ; // ���� �ױ�
					}
				}
				
				if(fl_num == 2) // ��ũ ����� �϶�
				{
					if( cnt % 250 == 0 ) // 5�� ����
					{
						if(player_Hitpoint != PF.MX_HP) // �ִ�ġ�� 10���ϱ�����
						{
							Sound("src\\Files\\HPUP.wav"); // �� �Ҹ�
							player_Hitpoint ++; // �� ȸ��								
						}
					}
				}
				
				if(fl_num == 3) // ���ο� ����� �϶�
				{
					if( cnt % ((stack+1)*500 + stack* 150) == 0) // 10�� ����
					{
						YF.Double_Ms = true; // ��ų ����
						S_C = true; // ī��Ʈ ����
					}
					
					if( s_cnt == 150 ) // 3�ʰ�
					{
						YF.Double_Ms = false;
						S_C = false; // ��ų ī��Ʈ ��
						s_cnt = 0; // �ʱ�ȭ
						stack ++; // ���� �ױ�
					}
				}
				
				if (S_C) // ��ų ī��Ʈ ���� ��
				{
					s_cnt ++; // ī��Ʈ ����
				}
				
				if (E_S_C) // �� ��ų ī��Ʈ ���� ��
				{
					e_s_cnt ++; // ī��Ʈ ����
				}
				repaint(); // ���ŵ� x,y������ �̹��� ���� �׸���
				Thread.sleep(20); // 20 �и����ϵ� �� ������ ������
			}
			if (player_Hitpoint <= 0) // �ǰ� ���ٸ�
			{
				Sound("src\\Files\\OVER.wav"); // ���ӿ��� �Ҹ� Ʋ��
				TimeUnit.SECONDS.sleep(1); // 1��
				GameOver(); // ���� ������
			}
			else // ���� �̰�� !
			{
				SCF.Stage_Setting(flight, 4); // 4���������� �̵��ϱ�
			}		
			dispose(); // ������ �ݱ�
		}
		catch (Exception e) {}
	}
	
	public void BonusProcess() // ���ʽ� ó��
	{
		if (flight.equals("Rainbow")) // rainbow �϶���
		{
			if (KeyF) // ������ �ٲٱ�
			{
				Sponge_bob_Image = new ImageIcon("src\\Files\\F_Sponge_bob.png").getImage(); // �������� �̹��� 
				Patrick_Star_Image = new ImageIcon("src\\Files\\F_Patrick_Star.png").getImage(); // ���� �̹���  	
			}
			
			if (KeyB) // ����� �ٲٱ�
			{
			
				BackGround_Image_0 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_1 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_2 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_3 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_4 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
	
			}
		}
	}
	
	public void Sponge_bob_moveProcess() // �������� �����̱�
	{
		if (cnt > 50 && cnt % 5 == 0) // 50 �̻��϶� ���� ����
		{
			if(S_LR) // ���������� ���� !  
			{
				for ( int i =0; i < Sponge_bob_List.size(); i++) // ���������� ���� ��� �� �˻�
				{
					sb = (Sponge_bob)Sponge_bob_List.get(i); // ���� �������� 
					
					sb.x = sb.x + sb.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�

					if ( sb.x > 470 ) // 470 �Ѿ�� �������� ! 
					{
						S_LR = false; // ��������
						break;
					}
					
				}
			}
			
			if(!S_LR) // �������� ���� !
				
				for ( int i =0; i < Sponge_bob_List.size(); i++) // ���������� ���� ��� �� �˻�
				{
					sb = (Sponge_bob)Sponge_bob_List.get(i); // ���� �������� 
					
					sb.x = sb.x - sb.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�
					
					if ( sb.x < 20 ) // 20 �Ѿ�� ���������� ! 
					{
						S_LR = true; // ����������
						break;
					}

				}
		}
	}
	
	public void HeartProcess() // ü�� ���� �ϴ� ��
	{
		if (P_HP > 0) // �ǰ� �޾ҳ�?
		{
			if (SB > 0) // ���������� �׷���?
			{
				player_Hitpoint = player_Hitpoint - sb.missile_Damage; // �������� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				SB = 0; // �ʱ�ȭ
			}
			if (PS > 0) // ���̰� �׷���? 
			{
				player_Hitpoint = player_Hitpoint - ps.missile_Damage; // ���� ������ ��ŭ ���̱�
				if (player_Speed > 2) // 5���� ũ��
				{
					player_Speed = player_Speed - ps.de_player_speed; // ���� �нú� ��ŭ ���
				}
				P_HP = 0; // �ʱ�ȭ
				PS = 0; // �ʱ�ȭ
			}
		}
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
	}
	
	public void Enemy_MissileProcess() // �� �̻��� ��ǥ ���� �κ�
	{
		for(int i = 0; i < Sponge_bob_List.size(); ++i) // �������� ��� ��������
		{
			sb = (Sponge_bob)(Sponge_bob_List.get(i)); // �������� ���� ��������

			if ( cnt % sb.missile_Speed == 0 ) // ���������� ���� �ӵ���ŭ �̻��� �߰��ϱ�
			{
				ms = new Missile(sb.x + 45, sb.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Sponge_bob_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
			for (int j = 0; j < Sponge_bob_Missile_List.size(); ++j) // ���������� ��� �̻��� ��������
			{
				ms = (Missile)Sponge_bob_Missile_List.get(j); // �������� �̻��� ���� ��������
			
				if ( ms.x > x && ms.x + Sponge_bob_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// �÷��̾�� �̻����� �ε��� ���� �˻��ϱ�
					
					Sponge_bob_Missile_List.remove(j); // ������ �̻��� ����
					
					if(!BF.Shield) // ��� ����� ��ų ���� �ʴ� ��쿡��
					{
						SB ++; // ���������� �׷����
						P_HP ++; // �÷��̾� �ǰ� �޾Ҿ��
					}
					
					Sound("src\\Files\\SB.wav"); // Ŭ�� �Ҹ� Ʋ��

				}
			}
		}
		
		for(int i = 0; i < Patrick_Star_List.size(); ++i) // ���� ��� ��������
		{
			ps = (Patrick_Star)(Patrick_Star_List.get(i)); // ���� ���� ��������

			if ( cnt % ps.missile_Speed == 0 ) // ������ ���ݼӵ� �� �ȴٸ� �̻��� �׸���
			{
				ms = new Missile(ps.x + 45, ps.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Patrick_Star_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
		}
		
		for (int j = 0; j < Patrick_Star_Missile_List.size(); ++j) // ��� ���� ���� ��������
		{
			ms = (Missile)Patrick_Star_Missile_List.get(j); // ���� ���� ��������
		
			if ( ms.x > x && ms.x + Patrick_Star_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
			{
				// �÷��̾�� �̻����� �ε������� Ȯ���ϱ�
				Patrick_Star_Missile_List.remove(j); // �׷��� �̻��� ����
					
				if(!BF.Shield) // ��� ��ų ���� ���Ҷ���
				{
					PS++; // ���̰� �׷����
					P_HP ++; // ü���� �𿴾��
				}
						
				Sound("src\\Files\\PS.wav"); // Ŭ�� �Ҹ� Ʋ��

			}
			
		}
	}
	
	public void MissileProcess() //�̻��� ó�� �޼ҵ�
	{
		if(KeySpace && cnt % missile_Speed == 0) // �����̽��� Ű ���°� true ���
		{
			if(YF.Double_Ms) // ��� ����� �нú� �����϶��� �ι߾����
			{
				ms = new Missile(x+ 35,y - 20); // ��ǥ üũ�Ͽ� �ѱ��
				Missile_List.add(ms); // �ش� �̻��� �߰�
				
				ms = new Missile(x+ 55,y - 20); // ��ǥ üũ�Ͽ� �ѱ��
				Missile_List.add(ms); // �ش� �̻��� �߰�
				
				Sound("src\\Files\\Fire.wav"); // Ŭ�� �Ҹ� Ʋ��
			}
			
			else if (flight.equals("Rainbow"))
			{
				ms = new Missile(x+ 20,y - 20); // ��ǥ üũ�Ͽ� �ѱ��
				Missile_List.add(ms); // �ش� �̻��� �߰�
				
				ms = new Missile(x+ 40,y - 20); // ��ǥ üũ�Ͽ� �ѱ��
				Missile_List.add(ms); // �ش� �̻��� �߰�
	
				ms = new Missile(x+ 60,y - 20); // ��ǥ üũ�Ͽ� �ѱ��
				Missile_List.add(ms); // �ش� �̻��� �߰�
				
				Sound("src\\Files\\Fire.wav"); // Ŭ�� �Ҹ� Ʋ��
			}
			
			else // �׿ܿ��� �� �߾� ���
			{
				ms = new Missile(x+ 45,y - 20); // ��ǥ üũ�Ͽ� �ѱ��
				Missile_List.add(ms); // �ش� �̻��� �߰�
				
				Sound("src\\Files\\Fire.wav"); // Ŭ�� �Ҹ� Ʋ��
			}
		}
		
		if(GF.Big_MS) // �׸� ����� �нú��϶� ���� �̻��� �߻�
		{
			for (int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������
				
				for (int j = 0; j < Sponge_bob_List.size(); ++j) // �������� ��������
				{
					
					sb = (Sponge_bob)Sponge_bob_List.get(j); // ��������� ���� ��������
				
					if ( ms.x > sb.x + 20 && ms.x + B_G_Ms.getWidth(null) < sb.x + Sponge_bob_Image.getWidth(null) && ms.y < sb.y + Sponge_bob_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� ���ϱ�
					{
						//���������̶� �̻����̶� �ε����ٸ�
						
						Sponge_bob_List.remove(j); // �������� ����
						Missile_List.remove(i); // �̻��� �ְŶ�
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������
				
				for (int j = 0; j < Patrick_Star_List.size(); ++j) // ���� ���� ��������
				{
					
					ps = (Patrick_Star)Patrick_Star_List.get(j); // ���� ���� ��������
				
					if ( ms.x > ps.x + 20 && ms.x + B_G_Ms.getWidth(null) < ps.x + Patrick_Star_Image.getWidth(null) && ms.y < ps.y + Patrick_Star_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� �˻�
					{
						// �̻��ϰ� ���̰� �ε������� Ȯ���ϱ�
						
						Patrick_Star_List.remove(j); // ���� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
		}
		else // �׸� �нú갡 �ƴ� ��쿡�� �⺻ �̻��� �̹����� �˻��ϱ�
		{
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				
				for (int j = 0; j < Sponge_bob_List.size(); ++j) // ��������� ���� ��������
				{
				
					sb = (Sponge_bob)Sponge_bob_List.get(j); // �������� ���� ��������
			
					if ( ms.x > sb.x + 20 && ms.x + Missile_Image.getWidth(null) < sb.x + Sponge_bob_Image.getWidth(null) && ms.y < sb.y + Sponge_bob_Image.getHeight(null))
					{
						// �̻����̶� ���������� �ε�������
						Sponge_bob_List.remove(j); // �������� �ְŶ�
						Missile_List.remove(i); // �̻��� �ְŶ�
					
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
		
			for (int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				
				for (int j = 0; j < Patrick_Star_List.size(); ++j) // ��� ���� ���� ��������
				{
				
					ps = (Patrick_Star)Patrick_Star_List.get(j); // ���� ���� ��������
			
					if ( ms.x > ps.x + 20 && ms.x + Missile_Image.getWidth(null) < ps.x + Patrick_Star_Image.getWidth(null) && ms.y < ps.y + Patrick_Star_Image.getHeight(null))
					{
						// �̻����̶� ���� �ε�������
						Patrick_Star_List.remove(j); // ���� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
					
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
		}
	}
	
	// ���� ���۸��� �̿��Ͽ� �����ص� ���� �̹������ٰ� �׸��� ���� �� �׸� ��
	// ���� ȭ�鿡�ٰ� ������ �̹����� ������ �ٿ��� �����̴� ������ ���� �մϴ�.
	
	public void paint(Graphics g)
	{	
		try {
			buff_Image = createImage(Frame_width,Frame_height); // ������۸� ���� ũ�⸦ ȭ�� ũ��� ���� ����
			buffg = buff_Image.getGraphics(); // ������ �׷��� ��ü�� ���
			Draw_BackGround(); // ���� �׷��� ��� �׸��� �����´�.
			Draw_Char(); // ���� �׷��� �÷��̾� �׸��� �����´�.
			Draw_Enemy(); // �� �׸���
			Draw_Missile(); // �̻��ϵ� �׸���
			Draw_Enemy_Missile(); // �� �̻��ϵ� �׸���
			Drow_Heart(); // ü�� �׸���
			
			g.drawImage(buff_Image,0,0,this);
			// ȭ�鿡 ���ۿ� �׸� �׸��� ������ �׸���
			}
		catch (Exception e) {}
	} 
	
	public void Draw_Char() //������ �׸����� �׸� �κ�
	{ 
		rand = random.nextInt(3); // 3���� ���� ������
		
		if(fl_num == 0 && BF.Shield) // ��� ����� �нú��϶��� ���� �̹����� ������
		{
			if (rand == 0)
			{
				buffg.drawImage(ST_B_Flight0,x,y,this);  // ���� �̹��� 1
			}
			else if (rand == 1)
			{
				buffg.drawImage(ST_B_Flight1,x,y,this); // ���� �̹���2
			}
			else
			{
				buffg.drawImage(ST_B_Flight2,x,y,this); // �����̹��� 3
			}
		}
		
		else // �� �ܿ��� �⺻ ����� �̹����� ������
		{
			if (rand == 0)
			{
				buffg.drawImage(Flight_Image_0,x,y,this); // ����� 1
			}
			else if (rand == 1)
			{
				buffg.drawImage(Flight_Image_1,x,y,this); // ����� 2
			}
			else
			{
				buffg.drawImage(Flight_Image_2,x,y,this); // ����� 3
			}	
		}
	}
	
	public void Draw_BackGround() // ���ȭ�� �׸���
	{
		rand = random.nextInt(5); // �� 5���� �׸����� �������� �׸���
		
		if (rand == 0)
		{
			buffg.drawImage(BackGround_Image_0,0,0,this); // ��� 1
		}
		else if (rand == 1)
		{
			buffg.drawImage(BackGround_Image_1,0,0,this); // ��� 2
		}
		else if (rand == 2)
		{
			buffg.drawImage(BackGround_Image_2,0,0,this); // ��� 3
		}
		else if (rand == 3)
		{
			buffg.drawImage(BackGround_Image_3,0,0,this); // ��� 4
		}
		else 
		{
			buffg.drawImage(BackGround_Image_4,0,0,this); // ��� 5
		}
	}
	
	public void Draw_Enemy() // ���� �׸���
	{
		for (int i= 0; i < Sponge_bob_List.size(); ++i) // ��� ��������� �����ͼ�
		{
			sb = (Sponge_bob)(Sponge_bob_List.get(i)); // ��ǥ ���� ������ �Ŀ� 
			buffg.drawImage(Sponge_bob_Image,sb.x,sb.y,this); // �� ��ǥ�� �׸���
		}
		
		for (int i= 0; i < Patrick_Star_List.size(); ++i) // ��� ���̵� �����ͼ�
		{
			ps = (Patrick_Star)(Patrick_Star_List.get(i)); // ��ǥ ���� ������ �Ŀ�
			buffg.drawImage(Patrick_Star_Image,ps.x,ps.y,this); // �� ��ǥ�� �׸���
		}
	}
	
	public void Draw_Missile() // �̻��� �׸��� �޼ҵ�
	{
		
		for(int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
		{
			ms = (Missile)Missile_List.get(i); // �̻��� ��ǥ ����
			//�̻��� ��ġ��
			if(GF.Big_MS) // �׸� ����� �нú��϶��� ū �̻��Ϸ� �׸���
			{
				buffg.drawImage(B_G_Ms, ms.x , ms.y, this); // �׸� ���� �̻���
			}
			else // �� �ܿ��� �׳� �̻���
			{
				buffg.drawImage(Missile_Image, ms.x , ms.y, this); // �׳� �̻���
			}
			//���� ��ǥ�� �̻��� �׸���
			ms.move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y < 65) // ȸ�� ���� ���� �����
			{
				Missile_List.remove(i); // �����
			}
			
		}
	}
	
	public void Draw_Enemy_Missile() // �� �̻��� �׸���
	{
		
		for(int i = 0; i < Sponge_bob_Missile_List.size(); ++i) // ��� �������� �̻��� ��������
		{
			ms = (Missile)Sponge_bob_Missile_List.get(i);
			//�̻��� ��ġ��
			buffg.drawImage(Sponge_bob_Missile_Image, ms.x, ms.y, this);
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��� ���� �����
			{
				Sponge_bob_Missile_List.remove(i); // �����
			}
			
		}
		
		for(int i = 0; i < Patrick_Star_Missile_List.size(); ++i) // ��� ���� �̻��� ��������
		{
			ms = (Missile)Patrick_Star_Missile_List.get(i);
			//�̻��� ��ġ��

			buffg.drawImage(Patrick_Star_Missile_Image, ms.x, ms.y, this); // �׳� �̻��Ϸ� �׸���
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��η� ���� �����
			{
				Patrick_Star_Missile_List.remove(i); // �����
			}
			
		}
	}
		
	public void Drow_Heart() // ���� �׸���
	{
		buffg.drawImage(Heart_Image,20,30,this); // ü�� !
	}
	
	public void GameOver() // ���� ����ȭ��
	{		
		
		clearScreen(); // �ܼ�â �����ϰ�
		System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��	    ______ ___     __  ___ ______   ____  _    __ ______ ____ 			                                                              ��");
		System.out.println("     ��	   / ____//   |   /  |/  // ____/  / __ \\| |  / // ____// __ \\				                                              ��");
		System.out.println("     ��	  / / __ / /| |  / /|_/ // __/    / / / /| | / // __/  / /_/ / 	  ��������� ���̴� ������ ������ ������ ����⸦ �������ϴ�.   ��");
		System.out.println("     ��	 / /_/ // ___ | / /  / // /___   / /_/ / | |/ // /___ / _, _/ 	  �׸��� ������ ���ڴ� ���ֿ��� ���ٴϴ� ������ �Ǿ����ϴ�..   ��");
		System.out.println("     ��	 \\____//_/  |_|/_/  /_//_____/   \\____/  |___//_____//_/ |_|     �ٽ� ������ �ּ��� �Ф�		                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                      Press F11 to restart.   ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
		System.exit(0); // ���α׷� ����
	}
}
