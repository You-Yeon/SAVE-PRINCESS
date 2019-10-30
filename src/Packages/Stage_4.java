package Packages;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Stage_4 extends Default_Frame implements Runnable{
	
	
	Image Buzz_Missile_Image; // ���� �̻��� �̹���	
	Image Woody_Missile_Image; // ��� �̻��� �̹���

	Image Buzz_Image; // ���� �̹���
	Image Woody_Image; // ��� �̹���
	
	Image ST_B_Flight0; // �������� Blue ����� �̹���
	Image ST_B_Flight1;
	Image ST_B_Flight2;
	
	Image B_G_Ms; // Green �Ŵ� �̻���
	Image P_B_Ms; // ���� �� �̻���
	
	Buzz bz; // ���� Ŭ����
	Woody wd; // ��� Ŭ����
	Blue_Flight BF = new Blue_Flight(); // ��� Ŭ����
	Green_Flight GF = new Green_Flight(); // �׸� Ŭ����
	Pink_Flight PF = new Pink_Flight(); // ��ũ Ŭ����
	Yellow_Flight YF = new Yellow_Flight(); // ���ο� Ŭ����
	
	ArrayList<Buzz> Buzz_List; // ���� ������
	ArrayList<Woody> Woody_List; // ��� ������
	
	ArrayList<Missile> Buzz_Missile_List; // ������ �̻����� �����ϱ� ���� �迭
	ArrayList<Missile> Woody_Missile_List; // ����� �̻����� �����ϱ� ���� �迭
	
	int cnt; // ī��Ʈ
	int s_cnt = 0; // ��ų ī��Ʈ
	int stack = 0; // ��ų ����
	
	int e_s_cnt = 0; // �� ��ų ī��Ʈ
	int e_stack = 0; // �� ��ų ����
	
	int p_cnt = 0 ; // ���� �� ���ӽð� ī��Ʈ
	
	boolean E_S_C; // �� ��ų ī��Ʈ ����
	boolean S_C; // ��ų ī��Ʈ ����
	
	boolean B_LR = true; // �� �翷 Ȯ�� ( false : ���� ������ , true : ������ ������ )
	
	int BZ = 0; // �÷��̾� �Ǹ� ������ �����
	int P_BZ = 0; // �÷��̾� �Ǹ� ������ �� �� �����
	int WD = 0; // �÷��̾� �Ǹ� ������ ��𿡿�
	int P_HP = 0; // �÷��̾� HP 
	
	int fl_num; // ������� ��ü  ( 0 : Blue , 1 : Green , 2 : Pink , 3 : Yellow)
	
	String flight;
	
	public void Game_Start(String Flight, int player_Hitpoint, int player_Speed, int missile_Speed)
	{
		Default_Frame(Flight, 4, player_Hitpoint, player_Speed,  missile_Speed); // ����Ʈ �����ӿ� ������ �����ϴ�.
		start(); // ����
		
		this.player_Hitpoint = player_Hitpoint; // �÷��̾� ü��
		this.player_Speed = player_Speed; // �÷��̾� �̵� �ӵ�
		this.missile_Speed = missile_Speed; // �̻��� ������ �ӵ�
		this.flight = Flight; // �Է� �ޱ�
		
		Buzz_Image = new ImageIcon("src\\Files\\S_Buzz.png").getImage(); // ���� �̹��� 
		Woody_Image = new ImageIcon("src\\Files\\S_Woody.png").getImage(); // ��� �̹��� 
		
		Buzz_Missile_Image = new ImageIcon("src\\Files\\Buzz_missile.png").getImage(); // ���� �̻��� �̹���
		Woody_Missile_Image = new ImageIcon("src\\Files\\Woody_missile.png").getImage(); // ��� �̻��� �̹���
		
		Buzz_List = new ArrayList<Buzz>(); // �ټ��� ��� �����ϱ� ���� �迭
		Woody_List = new ArrayList<Woody>(); // �ټ��� ��� �����ϱ� ���� �迭

		Buzz_Missile_List = new ArrayList<Missile>(); // ���� �̻����� �����ϱ� ���� �迭
		Woody_Missile_List = new ArrayList<Missile>(); // ��� �̻����� �����ϱ� ���� �迭
		
		P_B_Ms = new ImageIcon("src\\Files\\Buzz_p_missile.png").getImage(); // ���� �� �̻��� �̹���
				
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
		// ���� �߰� 
		bz = new Buzz(60,200);
		Buzz_List.add(bz);

		bz = new Buzz(190,200);
		Buzz_List.add(bz);
		
		bz = new Buzz(320,200);
		Buzz_List.add(bz);
		
		bz = new Buzz(450,200);
		Buzz_List.add(bz);
		
		// ��� �߰�
		wd = new Woody(120,100);
		Woody_List.add(wd);
	
		wd = new Woody(250,100);
		Woody_List.add(wd);
		
		wd = new Woody(380,100);
		Woody_List.add(wd);
		

		
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
				Buzz_moveProcess(); // ���� �̵� ó�� �޼ҵ�
				
				if (cnt > 50) // 50 �̻� ���� ���� �̻��� �߻�
				{
					Enemy_MissileProcess(); // �� �̻��� ó��
					
					if(Buzz_List.size() == 0 && Woody_List.size() == 0) // ���� �ֳ�?
					{
						break; // �ݺ��� ������
					}
					
					if( cnt % ((e_stack +1)*250 + e_stack * 150) == 0) // ���� ��ų
					{
						bz.P_MS = true; // ��ų ����
						E_S_C = true; // ��ų ī��Ʈ ����  
					}
					
					if( e_s_cnt == 150) // 3�ʰ�
					{
						bz.P_MS = false; // ��ų ����
						E_S_C = false; // ��ų ī��Ʈ ��
						e_s_cnt = 0; // �ʱ�ȭ
						e_stack ++; // ���ýױ�
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
				
				if (P_BZ> 0) // ���� �ɷ��� ��
				{
					p_cnt ++;
					
					if (p_cnt == 10 ) // 
					{
						player_Hitpoint --; // �� ��ĭ ���
						Heart_Image = new ImageIcon("src\\Files\\P_Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
					}
					
					if (p_cnt == 60 ) // 1�� �Ŀ�
					{
						player_Hitpoint --; // �� ��ĭ ���
						Heart_Image = new ImageIcon("src\\Files\\P_Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
					}
					
					if (p_cnt == 85) // 1.5�� �Ŀ� ��������
					{
						Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
						p_cnt = 0; //�ʱ�ȭ
						P_BZ = 0; //�ʱ�ȭ
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
				SCF.Stage_Setting(flight, 5); // 5���������� �̵��ϱ�
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
				Buzz_Image = new ImageIcon("src\\Files\\F_Buzz.png").getImage(); // ���� �̹��� 
				Woody_Image = new ImageIcon("src\\Files\\F_Woody.png").getImage(); // ��� �̹��� 
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
	
	public void HeartProcess() // ü�� ���� �ϴ� ��
	{
		if (P_HP > 0) // �ǰ� �޾ҳ�?
		{
			if (P_BZ > 0) // �� �� ��� �׷���?
			{
				P_HP = 0; // �ʱ�ȭ
			}
			
			if (BZ > 0) // ��� �׷���?
			{
				player_Hitpoint = player_Hitpoint - bz.missile_Damage; // ���� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				BZ = 0; // �ʱ�ȭ
				Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
			}
			
			if (WD > 0) // ��� �׷���? 
			{
				player_Hitpoint = player_Hitpoint - wd.missile_Damage; // ��� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				WD = 0; // �ʱ�ȭ
				Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
			}
		}
	}
	
	public void Buzz_moveProcess() // ���� �����̱�
	{
		if (cnt > 50 && cnt % 8 == 0) // 50 �̻��϶� ���� ����
		{
			if(B_LR) // ���������� ���� !  
			{
				for ( int i =0; i < Buzz_List.size(); i++) // ��� ���� ��� �� �˻�
				{
					bz = (Buzz)Buzz_List.get(i); // ���� �������� 
					
					bz.x = bz.x + bz.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�

					if ( bz.x > 480 ) // 480 �Ѿ�� �������� ! 
					{
						B_LR = false; // ��������
						break;
					}
					
				}
			}
			
			if(!B_LR) // �������� ���� !
				
				for ( int i =0; i < Buzz_List.size(); i++) // ��� ���� ��� �� �˻�
				{
					bz = (Buzz)Buzz_List.get(i); // ���� �������� 
					
					bz.x = bz.x - bz.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�
					
					if ( bz.x < 20 ) // 20 �Ѿ�� ���������� ! 
					{
						B_LR = true; // ����������
						break;
					}

				}
		}
	}
	
	public void Enemy_MissileProcess() // �� �̻��� ��ǥ ���� �κ�
	{
		for(int i = 0; i < Buzz_List.size(); ++i) // ���� ��� ��������
		{
			bz = (Buzz)(Buzz_List.get(i)); // ���� ���� ��������

			if ( cnt % bz.missile_Speed == 0 ) // ������ ���� �ӵ���ŭ �̻��� �߰��ϱ�
			{
				ms = new Missile(bz.x + 45, bz.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Buzz_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
		}
		
		if (bz.P_MS) // ���� ��ų�϶�
		{
			for (int j = 0; j < Buzz_Missile_List.size(); ++j) // ������ ��� �̻��� ��������
			{
				ms = (Missile)Buzz_Missile_List.get(j); // ���� �̻��� ���� ��������
			
				if ( ms.x > x && ms.x + P_B_Ms.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// �÷��̾�� �̻����� �ε��� ���� �˻��ϱ�
					
					Buzz_Missile_List.remove(j); // ������ �̻��� ����
					
					if(!BF.Shield) // ��� ����� ��ų ���� �ʴ� ��쿡��
					{
						P_BZ ++; // �� �� ��� �׷����
						P_HP ++; // �÷��̾� �ǰ� �޾Ҿ��
					}
					
					Sound("src\\Files\\BZ.wav"); // Ŭ�� �Ҹ� Ʋ��

				}
			}		
		}
		else // �ƴҶ�
		{
			for (int j = 0; j < Buzz_Missile_List.size(); ++j) // ������ ��� �̻��� ��������
			{
				ms = (Missile)Buzz_Missile_List.get(j); // ���� �̻��� ���� ��������
			
				if ( ms.x > x && ms.x + Buzz_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// �÷��̾�� �̻����� �ε��� ���� �˻��ϱ�
					
					Buzz_Missile_List.remove(j); // ������ �̻��� ����
					
					if(!BF.Shield) // ��� ����� ��ų ���� �ʴ� ��쿡��
					{
						BZ ++; // ��� �׷����
						P_HP ++; // �÷��̾� �ǰ� �޾Ҿ��
					}
					
					Sound("src\\Files\\BZ.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
				}
		}
		
		for(int i = 0; i < Woody_List.size(); ++i) // ��� ��� ��������
		{
			wd = (Woody)(Woody_List.get(i)); // ��� ���� ��������

			if ( cnt % wd.missile_Speed == 0 ) // ����� ���ݼӵ� �� �ȴٸ� �̻��� �׸���
			{
				if (cnt % 80 == 0) // �����Ƽ� �̻��� �����ϱ� ����� ���ݼӵ��� �ι�� �ؾ��ϳ�
				{
					ms = new Missile(wd.x + 20, wd.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
					Woody_Missile_List.add(ms); // �ش� �̻��� �߰�			
				}
				else
				{
					ms = new Missile(wd.x + 50, wd.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
					Woody_Missile_List.add(ms); // �ش� �̻��� �߰�
				}
				
			}
			
		}
				
		for (int j = 0; j < Woody_Missile_List.size(); ++j) // ��� ��� ���� ��������
		{
			ms = (Missile)Woody_Missile_List.get(j); // ��� ���� ��������
				
			if ( ms.x > x && ms.x + Woody_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
			{
				// �÷��̾�� �̻����� �ε������� Ȯ���ϱ�
				Woody_Missile_List.remove(j); // �׷��� �̻��� ����
						
				if(!BF.Shield) // ��� ��ų ���� ���Ҷ���
				{
					WD ++; // ��� �׷����
					P_HP ++; // ü���� �𿴾��
				}
						
				Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

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

				for (int j = 0; j < Buzz_List.size(); ++j) // ���� ��������
				{					
					bz = (Buzz)Buzz_List.get(j); // ����� ���� ��������
				
					if ( ms.x > bz.x + 20 && ms.x + B_G_Ms.getWidth(null) < bz.x + Buzz_Image.getWidth(null) && ms.y < bz.y + Buzz_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� ���ϱ�
					{
						//����� �̻����̶� �ε����ٸ�
						
						Buzz_List.remove(j); // ���� ����
						Missile_List.remove(i); // �̻��� �ְŶ�
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������
				
				for (int j = 0; j < Woody_List.size(); ++j) // ��� ���� ��������
				{
					
					wd = (Woody)Woody_List.get(j); // ��� ���� ��������
				
					if ( ms.x > wd.x + 20 && ms.x + B_G_Ms.getWidth(null) < wd.x + Woody_Image.getWidth(null) && ms.y < wd.y + Woody_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� �˻�
					{
						// �̻��ϰ� ��� �ε������� Ȯ���ϱ�
						
						Woody_List.remove(j); // ��� �ְŶ�
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
				
				for (int j = 0; j < Buzz_List.size(); ++j) // ����� ���� ��������
				{				
					bz = (Buzz)Buzz_List.get(j); // ���� ���� ��������
			
					if ( ms.x > bz.x + 20 && ms.x + Missile_Image.getWidth(null) < bz.x + Buzz_Image.getWidth(null) && ms.y < bz.y + Buzz_Image.getHeight(null))
					{
						// �̻����̶� ��� �ε�������
						Buzz_List.remove(j); // ���� �ְŶ�
						Missile_List.remove(i); // �̻��� �ְŶ�
					
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
		
			for (int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				
				for (int j = 0; j < Woody_List.size(); ++j) // ��� ��� ���� ��������
				{
				
					wd = (Woody)Woody_List.get(j); // ��� ���� ��������
			
					if ( ms.x > wd.x + 20 && ms.x + Missile_Image.getWidth(null) < wd.x + Woody_Image.getWidth(null) && ms.y < wd.y + Woody_Image.getHeight(null))
					{
						// �̻����̶� ��� �ε�������
						Woody_List.remove(j); // ��� �ְŶ�
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
		for (int i= 0; i < Buzz_List.size(); ++i) // ��� ����� �����ͼ�
		{
			bz = (Buzz)(Buzz_List.get(i)); // ��ǥ ���� ������ �Ŀ� 
			buffg.drawImage(Buzz_Image,bz.x,bz.y,this); // �� ��ǥ�� �׸���
		}
		
		for (int i= 0; i < Woody_List.size(); ++i) // ��� ���� �����ͼ�
		{
			wd = (Woody)(Woody_List.get(i)); // ��ǥ ���� ������ �Ŀ�
			buffg.drawImage(Woody_Image,wd.x,wd.y,this); // �� ��ǥ�� �׸���
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
		
		for(int i = 0; i < Buzz_Missile_List.size(); ++i) // ��� ���� �̻��� ��������
		{
			ms = (Missile)Buzz_Missile_List.get(i);
			//�̻��� ��ġ��
			if(bz.P_MS) // ���� ��ų �϶�
			{
				buffg.drawImage(P_B_Ms, ms.x, ms.y, this); // �� �̻��Ϸ� �׸���
			}
			else // �׿ܿ��� �׳� ���� �̻���
			{
				buffg.drawImage(Buzz_Missile_Image, ms.x, ms.y, this); // �׳� �̻��Ϸ� �׸���
			}
					
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			

			if (ms.y > 780) // ȸ�� �Ʒ��� ���� �����
			{
				Buzz_Missile_List.remove(i); // �����
			}
			
		}
		
		for(int i = 0; i < Woody_Missile_List.size(); ++i) // ��� ��� �̻��� ��������
		{
			ms = (Missile)Woody_Missile_List.get(i);
			//�̻��� ��ġ��
			buffg.drawImage(Woody_Missile_Image, ms.x, ms.y, this); // �׳� �̻��Ϸ� �׸���
			
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��η� ���� �����
			{
				Woody_Missile_List.remove(i); // �����
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
		System.out.println("     ��	  / / __ / /| |  / /|_/ // __/    / / / /| | / // __/  / /_/ / 	   ����� ��𿡰� ���� ȥ�� ������ ���ڴ�                                   ��");
		System.out.println("     ��	 / /_/ // ___ | / /  / // /___   / /_/ / | |/ // /___ / _, _/ 	   ����� ��� ���ֿ����ϴ� ���� ���� ���̵�� ���ϰ� �˴ϴ�.. ��");
		System.out.println("     ��	 \\____//_/  |_|/_/  /_//_____/   \\____/  |___//_____//_/ |_|      �ٽ� ������ �ּ��� �Ф�..		                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                      Press F11 to restart.   ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
		System.exit(0); // ���α׷� ����
	}
}
