package Packages;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Stage_1 extends Default_Frame implements Runnable{
	
	Image Clon_Missile_Image; // Ŭ�� �̻��� �̹���	
	Image Darth_Missile_Image; // �ٽ� �̻��� �̹���

	Image Clon_Image; // Ŭ�� �̹���
	Image Darth_Image; // �ٽ� ���̴� �̹���
	
	Image ST_B_Flight0; // �������� Blue ����� �̹���
	Image ST_B_Flight1;
	Image ST_B_Flight2;
	
	Image B_G_Ms; // Green �Ŵ� �̻���
	Image B_D_Ms; // �ٽ����̴� �Ŵ� �̻���
	
	Clon cl; // Ŭ�� Ŭ����
	Darth_Vader dv; // �ٽ� ���̴� Ŭ����
	Blue_Flight BF = new Blue_Flight(); // ��� Ŭ����
	Green_Flight GF = new Green_Flight(); // �׸� Ŭ����
	Pink_Flight PF = new Pink_Flight(); // ��ũ Ŭ����
	Yellow_Flight YF = new Yellow_Flight(); // ���ο� Ŭ����
	
	ArrayList<Clon> Clon_List; // Ŭ�� ������
	ArrayList<Darth_Vader> Darth_List; // �ٽ� ������
	
	ArrayList<Missile> Clon_Missile_List; // Ŭ���� �̻����� �����ϱ� ���� �迭
	ArrayList<Missile> Darth_Missile_List; // �ٽ� ���̴��� �̻����� �����ϱ� ���� �迭
	
	int cnt; // ī��Ʈ
	int s_cnt = 0; // ��ų ī��Ʈ
	int stack = 0; // ��ų ����
	
	int e_s_cnt = 0; // �� ��ų ī��Ʈ
	int e_stack = 0; // �� ��ų ����
	
	boolean E_S_C; // �� ��ų ī��Ʈ ����
	boolean S_C; // ��ų ī��Ʈ ����
	
	int CL = 0; // �÷��̾� �Ǹ� ������ Ŭ���̿���
	int DV = 0; // �÷��̾� �Ǹ� ������ �ٽ����̴�����
	int P_HP = 0; // �÷��̾� HP 
	
	int fl_num; // ������� ��ü  ( 0 : Blue , 1 : Green , 2 : Pink , 3 : Yellow)
	
	String flight;
	
	public void Game_Start(String Flight, int player_Hitpoint, int player_Speed, int missile_Speed)
	{	
		Default_Frame(Flight, 1, player_Hitpoint, player_Speed,  missile_Speed); // ����Ʈ �����ӿ� ������ �����ϴ�.
		start(); // ����
		
		this.player_Hitpoint = player_Hitpoint; // �÷��̾� ü��
		this.player_Speed = player_Speed; // �÷��̾� �̵� �ӵ�
		this.missile_Speed = missile_Speed; // �̻��� ������ �ӵ�
		this.flight = Flight; // �Է� �ޱ�
		
		Clon_Image = new ImageIcon("src\\Files\\S_Clon.png").getImage(); // Ŭ�� �̹��� 
		Darth_Image = new ImageIcon("src\\Files\\S_Darth_Vader.png").getImage(); // �ٽ� ���̴� �̹��� 
		
		Clon_Missile_Image = new ImageIcon("src\\Files\\Clon_Missile.png").getImage(); // Ŭ�� �̻��� �̹���
		Darth_Missile_Image = new ImageIcon("src\\Files\\Darth_Vader_Missile.png").getImage(); // �ٽ����̴� �̻��� �̹���
		
		Clon_List = new ArrayList<Clon>(); // �ټ���  Ŭ���� �����ϱ� ���� �迭
		Darth_List = new ArrayList<Darth_Vader>(); // �ټ��� �ٽ����̴��� �����ϱ� ���� �迭

		Clon_Missile_List = new ArrayList<Missile>(); // Ŭ�� �̻����� �����ϱ� ���� �迭
		Darth_Missile_List = new ArrayList<Missile>(); // �ٽ� ���̴� �̻����� �����ϱ� ���� �迭
		
		B_D_Ms = new ImageIcon("src\\Files\\B_Darth_Vader_Missile.png").getImage(); // ���� �ٽ� ���̴� �����
		
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
			fl_num = 777; // ���κ��� �����
		}
		
		// Ŭ�� �߰� 
		cl = new Clon(60,200);
		Clon_List.add(cl);

		cl = new Clon(190,200);
		Clon_List.add(cl);
		
		cl = new Clon(320,200);
		Clon_List.add(cl);
		
		cl = new Clon(450,200);
		Clon_List.add(cl);
		
		//�ٽ� ���̴� �߰�
		dv = new Darth_Vader(120,100);
		Darth_List.add(dv);
	
		dv = new Darth_Vader(250,100);
		Darth_List.add(dv);
		
		dv = new Darth_Vader(380,100);
		Darth_List.add(dv);
		

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
				BonusProcess(); // �ɰ� ���
				HeartProcess(); // ü�� ����
				KeyProcess(); // Ű���� �Է�ó���� �Ͽ� x,y ����
				MissileProcess(); // �̻��� �Է�ó�� �޼ҵ�
				
				if (cnt > 50) // 50 �̻� ���� ���� �̻��� �߻�
				{
					Enemy_MissileProcess(); // �� �̻��� ó��
					
					if(Clon_List.size() == 0 && Darth_List.size() == 0) // ���� �ֳ�?
					{
						break; // �ݺ��� ������
					}
					
					if( cnt % ((e_stack +1)*250 + e_stack * 150) == 0) // �ٽ� ���̴� ��ų
					{
						dv.Big_MS = true; // ��ų ����
						E_S_C = true; // ��ų ī��Ʈ ����  
					}
					
					if( e_s_cnt == 150) // 3�ʰ�
					{
						dv.Big_MS = false; // ��ų ����
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
				SCF.Stage_Setting(flight, 2); // 2���������� �̵��ϱ�
			}		
			dispose(); // ������ �ݱ�
		}
		catch (Exception e) {}
	}
	
	public void BonusProcess() // ���ʽ� ó��
	{
		if (flight.equals("Rainbow")) // rainbow �϶���
		{
			if (KeyF) // ���͸� ������ �ٲٱ�
			{
				Clon_Image = new ImageIcon("src\\Files\\F_Clon.png").getImage(); // Ŭ�� �̹��� 
				Darth_Image = new ImageIcon("src\\Files\\F_Darth_Vader.png").getImage(); // �ٽ� ���̴� �̹��� 	
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
	
	public void HeartProcess() // ü�� ���� �ϴ� ��
	{
		if (P_HP > 0) // �ǰ� �޾ҳ�?
		{
			if (CL > 0) // Ŭ���� �׷���?
			{
				player_Hitpoint = player_Hitpoint - cl.missile_Damage; // Ŭ�� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				CL = 0; // �ʱ�ȭ
			}
			if (DV > 0) // �ٽ� ���̴��� �׷���? 
			{
				player_Hitpoint = player_Hitpoint - dv.missile_Damage; // �ٽ����̴� ������ ��ŭ ���̱�
				P_HP = 0; // �ʱ�ȭ
				DV = 0; // �ʱ�ȭ
			}
		}
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // ü�� �̹��� �ٲٱ�
	}
	
	public void Enemy_MissileProcess() // �� �̻��� ��ǥ ���� �κ�
	{
		for(int i = 0; i < Clon_List.size(); ++i) // Ŭ�� ��� ��������
		{
			cl = (Clon)(Clon_List.get(i)); // Ŭ�� ���� ��������

			if ( cnt % cl.missile_Speed == 0 ) // Ŭ���� ���� �ӵ���ŭ �̻��� �߰��ϱ�
			{
				ms = new Missile(cl.x + 45, cl.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Clon_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
			for (int j = 0; j < Clon_Missile_List.size(); ++j) // Ŭ���� ��� �̻��� ��������
			{
				ms = (Missile)Clon_Missile_List.get(j); // Ŭ�� �̻��� ���� ��������
			
				if ( ms.x > x && ms.x + Clon_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// �÷��̾�� �̻����� �ε��� ���� �˻��ϱ�
					
					Clon_Missile_List.remove(j); // ������ �̻��� ����
					
					if(!BF.Shield) // ��� ����� ��ų ���� �ʴ� ��쿡��
					{
						CL ++; // Ŭ���� �׷����
						P_HP ++; // �÷��̾� �ǰ� �޾Ҿ��
					}
					
					Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

				}
			}
		}
		
		for(int i = 0; i < Darth_List.size(); ++i) // �ٽ����̴� ��� ��������
		{
			dv = (Darth_Vader)(Darth_List.get(i)); // �ٽ����̴� ���� ��������

			if ( cnt % dv.missile_Speed == 0 ) // �ٽú��̴��� ���ݼӵ� �� �ȴٸ� �̻��� �׸���
			{
				ms = new Missile(dv.x + 45, dv.y + 110); // ��ǥ üũ�Ͽ� �ѱ��
				Darth_Missile_List.add(ms); // �ش� �̻��� �߰�
				
			}
			
		}
		
		if (dv.Big_MS) // �ٽ����̴� ��ų �϶�
		{
				
				for (int j = 0; j < Darth_Missile_List.size(); ++j) // �ٽ����̴� ��� �̻��� ��������
				{
					ms = (Missile)Darth_Missile_List.get(j); // �̻��� ���� ��������
				
					if ( ms.x > x && ms.x + B_D_Ms.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y) // ���� �ٽ����̴� �̻��Ϸ� �˻�
					{
						// �÷��̾�� �̻����� �ε��� ���
						
						Darth_Missile_List.remove(j); // �ٽ� ���̴� �̻��� �����
						
						if(!BF.Shield) // ��� ��ų�� ���� ���� ��������
						{
							DV ++; // �ٽ����̴��� �׷����
							P_HP ++;  // �÷��̾� �ǰ� �޾Ҿ�� !
						}
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
		}
		
		else // �ƴҶ�
		{
				
				for (int j = 0; j < Darth_Missile_List.size(); ++j) // ��� �ٽ� ���̴� ���� ��������
				{
					ms = (Missile)Darth_Missile_List.get(j); // �ٽ� ���̴� ���� ��������
				
					if ( ms.x > x && ms.x + Darth_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
					{
						// �÷��̾�� �̻����� �ε������� Ȯ���ϱ�
						Darth_Missile_List.remove(j); // �׷��� �̻��� ����
						
						if(!BF.Shield) // ��� ��ų ���� ���Ҷ���
						{
							DV ++; // �ٽ����̴��� �׷����
							P_HP ++; // ü���� �𿴾��
						}
						
						Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� Ʋ��

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
				for (int j = 0; j < Clon_List.size(); ++j) // Ŭ�� ��������
				{					
					cl = (Clon)Clon_List.get(j); // Ŭ�е� ���� ��������
				
					if ( ms.x > cl.x + 20 && ms.x + B_G_Ms.getWidth(null) < cl.x + Clon_Image.getWidth(null) && ms.y < cl.y + Clon_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� ���ϱ�
					{
						//Ŭ���̶� �̻����̶� �ε����ٸ�
						
						Clon_List.remove(j); // Ŭ�� ����
						Missile_List.remove(i); // �̻��� �ְŶ�
						
						Sound("src\\Files\\DV.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��ϵ� ���� ��������
				for (int j = 0; j < Darth_List.size(); ++j) // �ٽ� ���̴� ���� ��������
				{					
					dv = (Darth_Vader)Darth_List.get(j); // �ٽ� ���̴� ���� ��������
				
					if ( ms.x > dv.x + 20 && ms.x + B_G_Ms.getWidth(null) < dv.x + Darth_Image.getWidth(null) && ms.y < dv.y + Darth_Image.getHeight(null)) // �׸� ���� �̻��Ϸ� �˻�
					{
						// �̻��ϰ� �ٽ� ���̴��� �ε������� Ȯ���ϱ�
						
						Darth_List.remove(j); // �ٽ����̴� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
						
						Sound("src\\Files\\DV.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
			
				}
			}
		}
		else // �׸� �нú갡 �ƴ� ��쿡�� �⺻ �̻��� �̹����� �˻��ϱ�
		{
			
			for (int i = 0; i < Missile_List.size(); ++i) // �̻��ϵ� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������
				
				for (int j = 0; j < Clon_List.size(); ++j) // Ŭ�е� ���� ��������
				{					
					cl = (Clon)Clon_List.get(j); // Ŭ�� ���� ��������
			
					if ( ms.x > cl.x + 20 && ms.x + Missile_Image.getWidth(null) < cl.x + Clon_Image.getWidth(null) && ms.y < cl.y + Clon_Image.getHeight(null))
					{
						// �̻����̶� Ŭ���� �ε�������
						Clon_List.remove(j); // Ŭ�� �ְŶ�
						Missile_List.remove(i); // �̻��� �ְŶ�
					
						Sound("src\\Files\\DV.wav"); // Ŭ�� �Ҹ� Ʋ��

					}
		
				}
			}
		
			for (int i = 0; i < Missile_List.size(); ++i) // ��� �̻��� ���� ��������
			{
				ms = (Missile)Missile_List.get(i); // �̻��� ���� ��������				
				for (int j = 0; j < Darth_List.size(); ++j) // ��� �ٽ� ���̴� ���� ��������
				{
					dv = (Darth_Vader)Darth_List.get(j); // �ٽ� ���̴� ���� ��������
			
					if ( ms.x > dv.x + 20 && ms.x + Missile_Image.getWidth(null) < dv.x + Darth_Image.getWidth(null) && ms.y < dv.y + Darth_Image.getHeight(null))
					{
						// �̻����̶� �ٽ����̴� �ε�������
						Darth_List.remove(j); // �ٽ����̴� �ְŶ�
						Missile_List.remove(i);  // �̻��ϵ� �ְŶ�
					
						Sound("src\\Files\\DV.wav"); // Ŭ�� �Ҹ� Ʋ��

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
		for (int i= 0; i < Clon_List.size(); ++i) // ��� Ŭ�е� �����ͼ�
		{
			cl = (Clon)(Clon_List.get(i)); // ��ǥ ���� ������ �Ŀ� 
			buffg.drawImage(Clon_Image,cl.x,cl.y,this); // �� ��ǥ�� �׸���
		}
		
		for (int i= 0; i < Darth_List.size(); ++i) // ��� �ٽ� ���̴��� �����ͼ�
		{
			dv = (Darth_Vader)(Darth_List.get(i)); // ��ǥ ���� ������ �Ŀ�
			buffg.drawImage(Darth_Image,dv.x,dv.y,this); // �� ��ǥ�� �׸���
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
		
		for(int i = 0; i < Clon_Missile_List.size(); ++i) // ��� Ŭ�� �̻��� ��������
		{
			ms = (Missile)Clon_Missile_List.get(i);
			//�̻��� ��ġ��
			buffg.drawImage(Clon_Missile_Image, ms.x, ms.y, this);
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��� ���� �����
			{
				Clon_Missile_List.remove(i); // �����
			}
			
		}
		
		for(int i = 0; i < Darth_Missile_List.size(); ++i) // ��� �ٽ� ���̴� �̻��� ��������
		{
			ms = (Missile)Darth_Missile_List.get(i);
			//�̻��� ��ġ��
			if(dv.Big_MS) // �ٽ����̴� ��ų �϶�
			{
				buffg.drawImage(B_D_Ms, ms.x, ms.y, this); // ū �̻��Ϸ� �׸���
			}
			else // �׿ܿ��� �׳� �ٽ����̴� �̻���
			{
				buffg.drawImage(Darth_Missile_Image, ms.x, ms.y, this); // �׳� �̻��Ϸ� �׸���
			}
			//���� ��ǥ�� �̻��� �׸���
			ms.e_move();
			//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if (ms.y > 780) // ȸ�� �Ʒ��η� ���� �����
			{
				Darth_Missile_List.remove(i); // �����
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
		System.out.println("     ��	  / / __ / /| |  / /|_/ // __/    / / / /| | / // __/  / /_/ / 	        �ٽ� ���̴��� ������ ������ ������ ì�ܼ�                           ��");
		System.out.println("     ��	 / /_/ // ___ | / /  / // /___   / /_/ / | |/ // /___ / _, _/ 	        �ٽ� ���۸������� �����ϴ�....  �ٽ� ������ �ּ��� �Ф�   ��");
		System.out.println("     ��	 \\____//_/  |_|/_/  /_//_____/   \\____/  |___//_____//_/ |_|      		                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     ��                                                                                                                                                                                      Press F11 to restart.   ��");
		System.out.println("     ��                                                                                                                                                                                                                                      ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
		System.exit(0); // ���α׷� ����
	}
	
}
