package Packages;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Stage_2 extends Default_Frame implements Runnable{
	
	Image Goom_ba_Missile_Image; // ���� �̻��� �̹���	
	Image Koo_pa_Missile_Image; // ���� �̻��� �̹���

	Image Goom_ba_Image; // ���� �̹���
	Image Koo_pa_Image; // ���� �̹���
	
	Image ST_B_Flight0; // �������� Blue ����� �̹���
	Image ST_B_Flight1;
	Image ST_B_Flight2;
	
	Image B_G_Ms; // Green �Ŵ� �̻���
	Image B_K_Ms; // ���� �Ŵ� �̻���
	
	Goom_ba gb; // ���� Ŭ����
	Koo_pa kp; // ���� Ŭ����
	Blue_Flight BF = new Blue_Flight(); // ��� Ŭ����
	Green_Flight GF = new Green_Flight(); // �׸� Ŭ����
	Pink_Flight PF = new Pink_Flight(); // ��ũ Ŭ����
	Yellow_Flight YF = new Yellow_Flight(); // ���ο� Ŭ����
	
	ArrayList<Goom_ba> Goom_ba_List; // ���� ������
	ArrayList<Koo_pa> Koo_pa_List; // ���� ������
	
	ArrayList<Missile> Goom_ba_Missile_List; // ������ �̻����� �����ϱ� ���� �迭
	ArrayList<Missile> Koo_pa_Missile_List; // ������ �̻����� �����ϱ� ���� �迭
	
	int cnt; // ī��Ʈ
	int s_cnt = 0; // ��ų ī��Ʈ
	int stack = 0; // ��ų ����
	
	int e_s_cnt = 0; // �� ��ų ī��Ʈ
	int e_stack = 0; // �� ��ų ����
	
	boolean E_S_C; // �� ��ų ī��Ʈ ����
	boolean S_C; // ��ų ī��Ʈ ����
	boolean G_LR = false; // �� �翷 Ȯ�� ( false : ���� ������ , true : ������ ������ )
	boolean K_LR = true; // �� �翷 Ȯ�� ( false : ���� ������ , true : ������ ������ )
	
	int GB = 0; // �÷��̾� �Ǹ� ������ ���ٿ���
	int KP = 0; // �÷��̾� �Ǹ� ������ ���Ŀ���
	int P_HP = 0; // �÷��̾� HP 
	
	int fl_num; // ������� ��ü  ( 0 : Blue , 1 : Green , 2 : Pink , 3 : Yellow)
	
	String flight;
	
	public void Game_Start(String Flight, int player_Hitpoint, int player_Speed, int missile_Speed)
	{
		Default_Frame(Flight, 2, player_Hitpoint, player_Speed,  missile_Speed); // ����Ʈ �����ӿ� ������ �����ϴ�.
		start(); // ����
		
		this.player_Hitpoint = player_Hitpoint; // �÷��̾� ü��
		this.player_Speed = player_Speed; // �÷��̾� �̵� �ӵ�
		this.missile_Speed = missile_Speed; // �̻��� ������ �ӵ�
		this.flight = Flight; // �Է� �ޱ�
		
		Goom_ba_Image = new ImageIcon("src\\Files\\S_Goom_ba.png").getImage(); // ���� �̹��� 
		Koo_pa_Image = new ImageIcon("src\\Files\\S_Koo_pa.png").getImage(); // ���� ���̴� �̹��� 
		
		Goom_ba_Missile_Image = new ImageIcon("src\\Files\\Goom_ba_missile.png").getImage(); // ���� �̻��� �̹���
		Koo_pa_Missile_Image = new ImageIcon("src\\Files\\Koo_pa_missile.png").getImage(); // ���� �̻��� �̹���
		
		Goom_ba_List = new ArrayList<Goom_ba>(); // �ټ��� ������ �����ϱ� ���� �迭
		Koo_pa_List = new ArrayList<Koo_pa>(); // �ټ��� ���ĸ� �����ϱ� ���� �迭

		Goom_ba_Missile_List = new ArrayList<Missile>(); // ���� �̻����� �����ϱ� ���� �迭
		Koo_pa_Missile_List = new ArrayList<Missile>(); // ���� �̻����� �����ϱ� ���� �迭
		
		B_K_Ms = new ImageIcon("src\\Files\\B_Koo_Pa_missile.png").getImage(); // ���� ���� �����
		
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
		gb = new Goom_ba(60,200);
		Goom_ba_List.add(gb);

		gb = new Goom_ba(190,200);
		Goom_ba_List.add(gb);
		
		gb = new Goom_ba(320,200);
		Goom_ba_List.add(gb);
		
		gb = new Goom_ba(450,200);
		Goom_ba_List.add(gb);
		
		// ���� �߰�
		kp = new Koo_pa(120,100);
		Koo_pa_List.add(kp);
	
		kp = new Koo_pa(250,100);
		Koo_pa_List.add(kp);
		
		kp = new Koo_pa(380,100);
		Koo_pa_List.add(kp);

		
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
				Goom_ba_moveProcess(); // �� �̵� ó�� �޼ҵ�
				Koo_pa_moveProcess();
				
				if (cnt > 50) // 50 �̻� ���� ���� �̻��� �߻�
				{
					Enemy_MissileProcess(); // �� �̻��� ó��
					
					if(Goom_ba_List.size() == 0 && Koo_pa_List.size() == 0) // ���� �ֳ�?
					{
						break; // �ݺ��� ������
					}
					
					if( cnt % ((e_stack +1)*150 + e_stack * 150) == 0) // ���� ��ų
					{
						kp.Big_MS = true; // ��ų ����
						E_S_C = true; // ��ų ī��Ʈ ����  
					}
					
					if( e_s_cnt == 100) // 2�ʰ�
					{
						kp.Big_MS = false; // ��ų ����
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
				SCF.Stage_Setting(flight, 3); // 3���������� �̵��ϱ�
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
				Goom_ba_Image = new ImageIcon("src\\Files\\F_Goom_ba.png").getImage(); // ���� �̹��� 
				Koo_pa_Image = new ImageIcon("src\\Files\\F_Koo_pa.png").getImage(); // ���� ���̴� �̹��� 	
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
			if (GB > 0) // ���ٰ� �׷���?
			{
				player_Hitpoint = player_Hitpoint - gb.missile_Damage; // ���� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				GB = 0; // �ʱ�ȭ
			}
			if (KP > 0) // ���İ� �׷���? 
			{
				player_Hitpoint = player_Hitpoint - kp.missile_Damage; // ���� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				KP = 0; // �ʱ�ȭ
			}
		}
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
	}
	
	public void Goom_ba_moveProcess() // ���� �����̱�
	{
		if (cnt > 50 && cnt % 10 == 0) // 50 �̻��϶� ���� ����
		{
			if(G_LR) // ���������� ���� !  
			{
				for ( int i =0; i < Goom_ba_List.size(); i++) // ���ٰ� ���� ��� �� �˻�
				{
					gb = (Goom_ba)Goom_ba_List.get(i); // ���� �������� 
					
					gb.x = gb.x + gb.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�

					if ( gb.x > 500 ) // 110 �Ѿ�� �������� ! 
					{
						G_LR = false; // ��������
						break;
					}
					
				}
			}
			
			if(!G_LR) // �������� ���� !
				
				for ( int i =0; i < Goom_ba_List.size(); i++) // ���ٰ� ���� ��� �� �˻�
				{
					gb = (Goom_ba)Goom_ba_List.get(i); // ���� �������� 
					
					gb.x = gb.x - gb.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�
					
					if ( gb.x < 20 ) // 10 �Ѿ�� ���������� ! 
					{
						G_LR = true; // ����������
						break;
					}

				}
		}
	}
	
	public void Koo_pa_moveProcess() // ���İ� �����̱�
	{
		if (cnt > 50 && cnt % 10 == 0) // 50 �̻��϶� ���� ����
		{
			if(K_LR) // ���������� ���� !  
			{
				for ( int i = 0; i < Koo_pa_List.size(); i++) // ���İ� ���� ��� �� �˻�
				{
					kp = (Koo_pa)Koo_pa_List.get(i); // ���� �������� 

					kp.x = kp.x + kp.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�

					if ( kp.x > 500 ) // 110 �Ѿ�� �������� ! 
					{
						K_LR = false; // ��������
						break;
					}
					
				}
			}
			
			if(!K_LR) // �������� ���� !

				for ( int i = 0; i < Koo_pa_List.size(); i++) // ���İ� ���� ��� �� �˻�
				{
					kp = (Koo_pa)Koo_pa_List.get(i); // ���� �������� 
						
					kp.x = kp.x - kp.player_Speed; // �÷��̾� ���ǵ� ��ŭ �����̱�

					if ( kp.x < 20 ) // 10 �Ѿ�� ���������� ! 
					{
						K_LR = true; // ����������
						break;
					}
					
				}

		}
	}
	
	public void Enemy_MissileProcess() // �� �̻��� ��ǥ ���� �κ�
	{
		for(int i = 0; i < Goom_ba_List.size(); ++i) // ���� ��� ��������
		{
			gb = (Goom_ba)(Goom_ba_List.get(i)); // ���� ���� ��������

			if ( cnt % gb.missile_Speed == 0 ) // ������ ���� �ӵ���ŭ �̻��� �߰��ϱ�
			{
				ms = new Missile(gb.x + 45, gb.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Goom_ba_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
			for (int j = 0; j < Goom_ba_Missile_List.size(); ++j) // ������ ��� �̻��� ��������
			{
				ms = (Missile)Goom_ba_Missile_List.get(j); // ���� �̻��� ���� ��������
			
				if ( ms.x > x && ms.x + Goom_ba_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// �÷��̾�� �̻����� �ε��� ���� �˻��ϱ�
					
					Goom_ba_Missile_List.remove(j); // ������ �̻��� ����
					
					if(!BF.Shield) // ��� ����� ��ų ���� �ʴ� ��쿡��
					{
						GB ++; // ���ٰ� �׷����
						P_HP ++; // �÷��̾� �ǰ� �޾Ҿ��
					}
					
					Sound("src\\Files\\KP.wav"); // Ŭ�� �Ҹ� Ʋ��

				}
			}
		}
		
		for(int i = 0; i < Koo_pa_List.size(); ++i) // ���� ��� ��������
		{
			kp = (Koo_pa)(Koo_pa_List.get(i)); // ���� ���� ��������

			if ( cnt % kp.missile_Speed == 0 ) // ������ ���ݼӵ� �� �ȴٸ� �̻��� �׸���
			{
				ms = new Missile(kp.x + 45, kp.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Koo_pa_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
		}
		
		if (kp.Big_MS) // ���� ��ų �϶�
		{
				
				for (int j = 0; j < Koo_pa_Missile_List.size(); ++j) // ���� ��� �̻��� ��������
				{
					ms = (Missile)Koo_pa_Missile_List.get(j); // �̻��� ���� ��������
				
					if ( ms.x > x && ms.x + B_K_Ms.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y) // ���� ���� �̻��Ϸ� �˻�
					{
						// �÷��̾�� �̻����� �ε��� ���
						
						Koo_pa_Missile_List.remove(j); // ���� �̻��� �����
						
						if(!BF.Shield) // ��� ��ų�� ���� ���� ��������
						{
							KP ++; // ���İ� �׷����
							P_HP ++;  // �÷��̾� �ǰ� �޾Ҿ�� !
						}
						
						Sound("src\\Files\\KP.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
		}
		
		else // �ƴҶ�
		{
				
				for (int j = 0; j < Koo_pa_Missile_List.size(); ++j) // ��� ���� ���� ��������
				{
					ms = (Missile)Koo_pa_Missile_List.get(j); // ���� ���� ��������
				
					if ( ms.x > x && ms.x + Koo_pa_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
					{
						// �÷��̾�� �̻����� �ε������� Ȯ���ϱ�
						Koo_pa_Missile_List.remove(j); // �׷��� �̻��� ����
						
						if(!BF.Shield) // ��� ��ų ���� ���Ҷ���
						{
							KP ++; // ���İ� �׷����
							P_HP ++; // ü���� �𿴾��
						}
						
						Sound("src\\Files\\KP.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
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
				
				for (int j = 0; j < Goom_ba_List.size(); ++j) //���� ��������
				{
					
					gb = (Goom_ba)Goom_ba_List.get(j); // ���ٵ� ���� ��������
				
					if ( ms.x > gb.x + 20 && ms.x + B_G_Ms.getWidth(null) < gb.x + Goom_ba_Image.getWidth(null) && ms.y < gb.y + Goom_ba_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� ���ϱ�
					{
						// ���ٶ� �̻����̶� �ε����ٸ�
						
						Goom_ba_List.remove(j); // ���� ����
						Missile_List.remove(i); // �̻��� �ְŶ�
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������
				
				for (int j = 0; j < Koo_pa_List.size(); ++j) // ���� ���� ��������
				{
					
					kp = (Koo_pa)Koo_pa_List.get(j); // ���� ���� ��������
				
					if ( ms.x > kp.x + 20 && ms.x + B_G_Ms.getWidth(null) < kp.x + Koo_pa_Image.getWidth(null) && ms.y < kp.y + Koo_pa_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� �˻�
					{
						// �̻��ϰ� ���İ� �ε������� Ȯ���ϱ�
						
						Koo_pa_List.remove(j); // ���� �ְŶ�
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
				for (int j = 0; j < Goom_ba_List.size(); ++j) // ���ٵ� ���� ��������
				{
				
					gb = (Goom_ba)Goom_ba_List.get(j); // ���� ���� ��������
			
					if ( ms.x > gb.x + 20 && ms.x + Missile_Image.getWidth(null) < gb.x + Goom_ba_Image.getWidth(null) && ms.y < gb.y + Goom_ba_Image.getHeight(null))
					{
						// �̻����̶� ������ �ε�������
						Goom_ba_List.remove(j); // ���� �ְŶ�
						Missile_List.remove(i); // �̻��� �ְŶ�
					
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
		
			for (int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				for (int j = 0; j < Koo_pa_List.size(); ++j) // ��� ���� ���� ��������
				{
				
					kp = (Koo_pa)Koo_pa_List.get(j); // ���� ���� ��������
			
					if ( ms.x > kp.x + 20 && ms.x + Missile_Image.getWidth(null) < kp.x + Koo_pa_Image.getWidth(null) && ms.y < kp.y + Koo_pa_Image.getHeight(null))
					{
						// �̻����̶� ���� �ε�������
						Koo_pa_List.remove(j); // ���� �ְŶ�
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
		for (int i= 0; i < Goom_ba_List.size(); ++i) // ��� ���ٵ� �����ͼ�
		{
			gb = (Goom_ba)(Goom_ba_List.get(i)); // ��ǥ ���� ������ �Ŀ� 
			buffg.drawImage(Goom_ba_Image,gb.x,gb.y,this); // �� ��ǥ�� �׸���
		}
		
		for (int i= 0; i < Koo_pa_List.size(); ++i) // ��� ���ĵ� �����ͼ�
		{
			kp = (Koo_pa)(Koo_pa_List.get(i)); // ��ǥ ���� ������ �Ŀ�
			buffg.drawImage(Koo_pa_Image,kp.x,kp.y,this); // �� ��ǥ�� �׸���
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
		
		for(int i = 0; i < Goom_ba_Missile_List.size(); ++i) // ��� ���� �̻��� ��������
		{
			ms = (Missile)Goom_ba_Missile_List.get(i);
			//�̻��� ��ġ��
			buffg.drawImage(Goom_ba_Missile_Image, ms.x, ms.y, this);
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��� ���� �����
			{
				Goom_ba_Missile_List.remove(i); // �����
			}
			
		}
		
		for(int i = 0; i < Koo_pa_Missile_List.size(); ++i) // ��� ���� �̻��� ��������
		{
			ms = (Missile)Koo_pa_Missile_List.get(i);
			//�̻��� ��ġ��
			if(kp.Big_MS) // ���� ��ų �϶�
			{
				buffg.drawImage(B_K_Ms, ms.x, ms.y, this); // ū �̻��Ϸ� �׸���
			}
			else // �׿ܿ��� �׳� ����  �̻���
			{
				buffg.drawImage(Koo_pa_Missile_Image, ms.x, ms.y, this); // �׳� �̻��Ϸ� �׸���
			}
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��η� ���� �����
			{
				Koo_pa_Missile_List.remove(i); // �����
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
		System.out.println("     ��	  / / __ / /| |  / /|_/ // __/    / / / /| | / // __/  / /_/ / 	        �ᱹ ������ ���ڴ� ���Ŀ� ���ٿ��� ���������Ƚ��ϴ�..    ��");
		System.out.println("     ��	 / /_/ // ___ | / /  / // /___   / /_/ / | |/ // /___ / _, _/ 	        �׸��� ���� �༺���� �Ϸ����� �˹ٸ� �ϰ� �˴ϴ�....    ��");
		System.out.println("     ��	 \\____//_/  |_|/_/  /_//_____/   \\____/  |___//_____//_/ |_|        �ٽ� ������ �ּ��� �Ф� 		                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                      Press F11 to restart.   ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
		System.exit(0); // ���α׷� ����
	}
}
