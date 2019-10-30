package Packages;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Stage_5 extends Default_Frame implements Runnable{
	
	Image Nojingu_Missile_Image; // ������ �̻��� �̹���	
	Image Doraemon_Missile_Image; // ���󿡸� �̻��� �̹���

	Image Nojingu_Image; // ������ �̹���
	Image Doraemon_Image; // ���󿡸� �̹���
	Image Shield_Image; // ���󿡸� ���� �̹���
	
	Image ST_B_Flight0; // �������� Blue ����� �̹���
	Image ST_B_Flight1;
	Image ST_B_Flight2;
	
	Image B_G_Ms; // Green �Ŵ� �̻���
	
	Nojingu ng; // ������ Ŭ����
	Doraemon dm; // ���󿡸� Ŭ����
	Enemy SH; // ���� Ŭ����
	Blue_Flight BF = new Blue_Flight(); // ��� Ŭ����
	Green_Flight GF = new Green_Flight(); // �׸� Ŭ����
	Pink_Flight PF = new Pink_Flight(); // ��ũ Ŭ����
	Yellow_Flight YF = new Yellow_Flight(); // ���ο� Ŭ����
	
	ArrayList<Nojingu> Nojingu_List; // ������ ������
	ArrayList<Doraemon> Doraemon_List; // ���󿡸� ������
	ArrayList<Enemy> Shield_List; // ���󿡸� ���� ������
	
	ArrayList<Missile> Nojingu_Missile_List; // �������� �̻����� �����ϱ� ���� �迭
	ArrayList<Missile> Doraemon_Missile_List; // ���󿡸��� �̻����� �����ϱ� ���� �迭
	
	int cnt; // ī��Ʈ
	int s_cnt = 0; // ��ų ī��Ʈ
	int stack = 0; // ��ų ����
	
	int e_s_cnt = 0; // �� ��ų ī��Ʈ
	int e_stack = 0; // �� ��ų ����
	
	boolean E_S_C; // �� ��ų ī��Ʈ ����
	boolean S_C; // ��ų ī��Ʈ ����
	boolean N_LR = true; // �� �翷 Ȯ�� ( false : ���� ������ , true : ������ ������ )
	
	int NG = 0; // �÷��̾� �Ǹ� ������ ����������
	int DM = 0; // �÷��̾� �Ǹ� ������ ���󿡸��̿���
	int P_HP = 0; // �÷��̾� HP 
	
	int fl_num; // ������� ��ü  ( 0 : Blue , 1 : Green , 2 : Pink , 3 : Yellow)
	
	String flight;
	
	public void Game_Start(String Flight, int player_Hitpoint, int player_Speed, int missile_Speed)
	{
		Default_Frame(Flight, 5, player_Hitpoint, player_Speed,  missile_Speed); // ����Ʈ �����ӿ� ������ �����ϴ�.
		start(); // ����
		
		this.player_Hitpoint = player_Hitpoint; // �÷��̾� ü��
		this.player_Speed = player_Speed; // �÷��̾� �̵� �ӵ�
		this.missile_Speed = missile_Speed; // �̻��� ������ �ӵ�
		this.flight = Flight; // �Է� �ޱ�
		
		Nojingu_Image = new ImageIcon("src\\Files\\S_Nojingu.png").getImage(); // ������ �̹��� 
		Doraemon_Image = new ImageIcon("src\\Files\\S_Doraemon.png").getImage(); // ���󿡸� �̹��� 
		Shield_Image = new ImageIcon("src\\Files\\Shield.png").getImage(); // ���� �̹��� 
		
		Nojingu_Missile_Image = new ImageIcon("src\\Files\\Nojingu_missile.png").getImage(); // ������ �̻��� �̹���
		Doraemon_Missile_Image = new ImageIcon("src\\Files\\Doraemon_missile.png").getImage(); // ���󿡸� �̻��� �̹���
		
		Nojingu_List = new ArrayList<Nojingu>(); // �ټ���  �������� �����ϱ� ���� �迭
		Doraemon_List = new ArrayList<Doraemon>(); // �ټ��� ���󿡸��� �����ϱ� ���� �迭
		Shield_List = new ArrayList<Enemy>(); // �ټ��� ���带 �����ϱ� ���� �迭
		
		Nojingu_Missile_List = new ArrayList<Missile>(); // ������ �̻����� �����ϱ� ���� �迭
		Doraemon_Missile_List = new ArrayList<Missile>(); // ���󿡸� �̻����� �����ϱ� ���� �迭
				
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
		// ������ �߰� 
		ng = new Nojingu(60,350);
		Nojingu_List.add(ng);

		ng = new Nojingu(190,350);
		Nojingu_List.add(ng);
		
		ng = new Nojingu(320,350);
		Nojingu_List.add(ng);
		
		ng = new Nojingu(450,350);
		Nojingu_List.add(ng);
		
		//���󿡸� �߰�
		dm = new Doraemon(200,80);
		Doraemon_List.add(dm);
		
		//���󿡸� ���� �߰�
		
		SH = new Doraemon(0,300);
		Shield_List.add(SH);
		
		SH = new Doraemon(0,320);
		Shield_List.add(SH);

		
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
				Nojingu_moveProcess(); // ������ �����̱� ó��
				
				if (cnt > 50) // 50 �̻� ���� ���� �̻��� �߻�
				{
					Enemy_MissileProcess(); // �� �̻��� ó��
					
					if(Doraemon_List.size() == 0) // ������ ���ո� ���̸� ��
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
				SCF.Stage_Setting(flight, 777); // ���� ȭ������ �̵��ϱ�
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
				Nojingu_Image = new ImageIcon("src\\Files\\F_Nojingu.png").getImage(); // ������ �̹��� 
				Doraemon_Image = new ImageIcon("src\\Files\\F_Doraemon.png").getImage(); // ���󿡸� �̹��� 
			}
			
			if (KeyB) // ��� �ٲٱ�
			{
			
				BackGround_Image_0 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_1 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_2 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_3 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
				BackGround_Image_4 = new ImageIcon("src\\Files\\bonus.png").getImage(); // ��� �̹���
	
			}
		}
	}
	
	public void Nojingu_moveProcess() // ������ �����̱�
	{
		if (cnt > 50 && cnt % 5 == 0) // 50 �̻��϶� ���� ����
		{
			if(N_LR) // ���������� ���� !  
			{
				for ( int i = 0 ; i < Nojingu_List.size(); i++) // �������� ���� ��� �� �˻�
				{
					ng = (Nojingu)Nojingu_List.get(i); // ���� �������� 
					
					ng.x = ng.x + ng.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�

					if ( ng.x > 480 ) // 480 �Ѿ�� �������� ! 
					{
						N_LR = false; // ��������
						break;
					}
					
				}
			}
			
			if(!N_LR) // �������� ���� !
				
				for ( int i =0; i < Nojingu_List.size(); i++) // �������� ���� ��� �� �˻�
				{
					ng = (Nojingu)Nojingu_List.get(i); // ���� �������� 
					
					ng.x = ng.x - ng.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�
					
					if ( ng.x < 20 ) // 20 �Ѿ�� ���������� ! 
					{
						N_LR = true; // ����������
						break;
					}

				}
		}
	}
	
	public void HeartProcess() // ü�� ���� �ϴ� ��
	{
		if (P_HP > 0) // �ǰ� �޾ҳ�?
		{
			if (NG > 0) // �������� �׷���?
			{
				player_Hitpoint = player_Hitpoint - ng.missile_Damage; // ������ ������ ��ŭ ���̱�
				
				if (player_Speed > 5)// ������ �нú� ��ų 
				{
					player_Speed = player_Speed - ng.de_player_speed; // ���� �ӵ� ����
				}
					
				P_HP = 0; // �ʱ�ȭ
				NG = 0; // �ʱ�ȭ
			}
			if (DM > 0) // ���󿡸��� �׷���? 
			{
				player_Hitpoint = player_Hitpoint - dm.missile_Damage; // ���󿡸� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				DM = 0; // �ʱ�ȭ
			}
		}
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
	}
	
	public void Enemy_MissileProcess() // �� �̻��� ��ǥ ���� �κ�
	{
		for(int i = 0; i < Nojingu_List.size(); ++i) // ������ ��� ��������
		{
			ng = (Nojingu)(Nojingu_List.get(i)); // ������ ���� ��������

			if ( cnt % ng.missile_Speed == 0 ) // �������� ���� �ӵ���ŭ �̻��� �߰��ϱ�
			{
				ms = new Missile(ng.x + 45, ng.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Nojingu_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
			for (int j = 0; j < Nojingu_Missile_List.size(); ++j) // �������� ��� �̻��� ��������
			{
				ms = (Missile)Nojingu_Missile_List.get(j); // ������ �̻��� ���� ��������
			
				if ( ms.x > x && ms.x + Nojingu_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// �÷��̾�� �̻����� �ε��� ���� �˻��ϱ�
					
					Nojingu_Missile_List.remove(j); // ������ �̻��� ����
					
					if(!BF.Shield) // ��� ����� ��ų ���� �ʴ� ��쿡��
					{
						NG ++; // �������� �׷����
						P_HP ++; // �÷��̾� �ǰ� �޾Ҿ��
					}
					
					Sound("src\\Files\\NJ.wav"); // Ŭ�� �Ҹ� Ʋ��

				}
			}
		}
		
		for(int i = 0; i < Doraemon_List.size(); ++i) // ���󿡸� ��� ��������
		{
			dm = (Doraemon)(Doraemon_List.get(i)); // ���󿡸� ���� ��������

			if ( cnt % dm.missile_Speed == 0 ) // ���󿡸��� ���ݼӵ� �� �ȴٸ� �̻��� �׸���
			{
				ms = new Missile(dm.x - 10, dm.y + 310); // ��ǥ üũ�Ͽ� �ѱ��
				Doraemon_Missile_List.add(ms); // �ش� �̻��� �߰�
				
				ms = new Missile(dm.x + 90, dm.y + 310); // ��ǥ üũ�Ͽ� �ѱ��
				Doraemon_Missile_List.add(ms); // �ش� �̻��� �߰�
				
				ms = new Missile(dm.x + 190, dm.y + 310); // ��ǥ üũ�Ͽ� �ѱ��
				Doraemon_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
		}
		
		for (int j = 0; j < Doraemon_Missile_List.size(); ++j) // ��� ���󿡸� ���� ��������
		{
			ms = (Missile)Doraemon_Missile_List.get(j); // ���󿡸� ���� ��������
				
			if ( ms.x > x && ms.x + Doraemon_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
			{
				// �÷��̾�� �̻����� �ε������� Ȯ���ϱ�
				Doraemon_Missile_List.remove(j); // �׷��� �̻��� ����
						
				if(!BF.Shield) // ��� ��ų ���� ���Ҷ���
				{
					DM ++; // ���󿡸��� �׷����
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

				for (int j = 0; j < Nojingu_List.size(); ++j) // ������ ��������
				{					
					ng = (Nojingu)Nojingu_List.get(j); // �������� ���� ��������
				
					if ( ms.x > ng.x + 20 && ms.x + B_G_Ms.getWidth(null) < ng.x + Nojingu_Image.getWidth(null) && ms.y < ng.y + Nojingu_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� ���ϱ�
					{
						//�������� �̻����̶� �ε����ٸ�
						
						Nojingu_List.remove(j); // ������ ����
						Missile_List.remove(i); // �̻��� �ְŶ�
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������

				for (int j = 0; j < Doraemon_List.size(); ++j) // ���󿡸� ���� ��������
				{					
					dm = (Doraemon)Doraemon_List.get(j); // ���󿡸� ���� ��������
				
					if ( ms.x > dm.x + 20 && ms.x + B_G_Ms.getWidth(null) < dm.x + Doraemon_Image.getWidth(null) && ms.y < dm.y + Doraemon_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� �˻�
					{
						// �̻��ϰ� ���󿡸��� �ε������� Ȯ���ϱ�
						
						Doraemon_List.remove(j); // ���󿡸� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������
				
				for (int j = 0; j < Shield_List.size(); ++j) // ���� ���� ��������
				{
					
					SH = (Doraemon)Shield_List.get(j); // ���� ���� ��������
				
					if ( ms.x > SH.x + 20 && ms.x + B_G_Ms.getWidth(null) < SH.x +Shield_Image.getWidth(null) && ms.y < SH.y + Shield_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� �˻�
					{
						// �̻��ϰ� ���尡 �ε������� Ȯ���ϱ�
						
						Shield_List.remove(j); // ���� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
						
						Sound("src\\Files\\glass.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
		}
		else // �׸� �нú갡 �ƴ� ��쿡�� �⺻ �̻��� �̹����� �˻��ϱ�
		{
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				
				for (int j = 0; j < Nojingu_List.size(); ++j) // �������� ���� ��������
				{
				
					ng = (Nojingu)Nojingu_List.get(j); // ������ ���� ��������
			
					if ( ms.x > ng.x + 20 && ms.x + Missile_Image.getWidth(null) < ng.x + Nojingu_Image.getWidth(null) && ms.y < ng.y + Nojingu_Image.getHeight(null))
					{
						// �̻����̶� �������� �ε�������
						Nojingu_List.remove(j); // ������ �ְŶ�
						Missile_List.remove(i); // �̻��� �ְŶ�
					
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
		
			for (int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				
				for (int j = 0; j < Doraemon_List.size(); ++j) // ��� ���󿡸� ���� ��������
				{
				
					dm = (Doraemon)Doraemon_List.get(j); // ���󿡸� ���� ��������
			
					if ( ms.x > dm.x + 20 && ms.x + Missile_Image.getWidth(null) < dm.x + Doraemon_Image.getWidth(null) && ms.y < dm.y + Doraemon_Image.getHeight(null))
					{
						// �̻����̶� ���󿡸� �ε�������
						Doraemon_List.remove(j); // ���󿡸� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
					
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������

				for (int j = 0; j < Shield_List.size(); ++j) // ���� ���� ��������
				{					
					SH = (Doraemon)Shield_List.get(j); // ���� ���� ��������
				
					if ( ms.x > SH.x + 20 && ms.x + Missile_Image.getWidth(null) < SH.x +Shield_Image.getWidth(null) && ms.y < SH.y + Shield_Image.getHeight(null)) 
					{
						// �̻��ϰ� ���尡 �ε������� Ȯ���ϱ�
						
						Shield_List.remove(j); // ���� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
						
						Sound("src\\Files\\glass.wav"); // Ŭ�� �Ҹ� Ʋ��

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
		for (int i= 0; i < Nojingu_List.size(); ++i) // ��� �������� �����ͼ�
		{
			ng = (Nojingu)(Nojingu_List.get(i)); // ��ǥ ���� ������ �Ŀ� 
			buffg.drawImage(Nojingu_Image,ng.x,ng.y,this); // �� ��ǥ�� �׸���
		}
		
		for (int i= 0; i < Doraemon_List.size(); ++i) // ��� ���󿡸��� �����ͼ�
		{
			dm = (Doraemon)(Doraemon_List.get(i)); // ��ǥ ���� ������ �Ŀ�
			buffg.drawImage(Doraemon_Image,dm.x,dm.y,this); // �� ��ǥ�� �׸���
		}
		
		for (int i= 0; i < Shield_List.size(); ++i) // ��� ���� �����ͼ�
		{
			SH = (Doraemon)(Shield_List.get(i)); // ��ǥ ���� ������ �Ŀ�
			buffg.drawImage(Shield_Image,SH.x,SH.y,this); // �� ��ǥ�� �׸���
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
		
		for(int i = 0; i < Nojingu_Missile_List.size(); ++i) // ��� ������ �̻��� ��������
		{
			ms = (Missile)Nojingu_Missile_List.get(i);
			//�̻��� ��ġ��
			buffg.drawImage(Nojingu_Missile_Image, ms.x, ms.y, this);
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��� ���� �����
			{
				Nojingu_Missile_List.remove(i); // �����
			}
			
		}
		
		for(int i = 0; i < Doraemon_Missile_List.size(); ++i) // ��� ���󿡸� �̻��� ��������
		{
			ms = (Missile)Doraemon_Missile_List.get(i);
			//�̻��� ��ġ��
			buffg.drawImage(Doraemon_Missile_Image, ms.x, ms.y, this); // �׳� �̻��Ϸ� �׸���
			
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��η� ���� �����
			{
				Doraemon_Missile_List.remove(i); // �����
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
		System.out.println("     ��	  / / __ / /| |  / /|_/ // __/    / / / /| | / // __/  / /_/ / 	        ������ ���տ��� �� ������ ���ڴ� ������ ���ֿ� �Բ�             ��");
		System.out.println("     ��	 / /_/ // ___ | / /  / // /___   / /_/ / | |/ // /___ / _, _/ 	        ������� ���ϻ��� ���⸸ �ϰ� �˴ϴ�...              ��");
		System.out.println("     ��	 \\____//_/  |_|/_/  /_//_____/   \\____/  |___//_____//_/ |_|        �ٽ� ������ �ּ��� �Ф�		                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                      Press F11 to restart.   ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
		System.exit(0); // ���α׷� ����
	}
	
}
