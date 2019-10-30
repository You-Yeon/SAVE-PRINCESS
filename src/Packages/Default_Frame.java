package Packages;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
import javax.swing.*;

class Default_Frame extends JFrame implements KeyListener
{
	int Frame_width; // �������� ����
	int Frame_height; // �������� ����
	
	int x, y; //ĳ������ ��ǥ ����

	boolean KeyLeft = false; // Ű���� �Է�ó���� ���� ����
	boolean KeyRight = false;
	boolean KeyUp = false; 
	boolean KeyDown = false;
	boolean KeySpace = false; // �̻��� �߻縦 ���� Ű
	
	boolean KeyF = false; // �� 
	boolean KeyB = false; // ���
	
	int rand; // ������ ���� ������
	int missile_Speed; // �̻��� �ӵ�
	int player_Hitpoint;  // �÷��̾� ĳ������ ü��
	int player_Speed; // �÷��̾� �̵� �ӵ�

	Thread th; // ������ 
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	Image BackGround_Image_0; // ��� �̹���
	Image BackGround_Image_1; 
	Image BackGround_Image_2; 
	Image BackGround_Image_3; 
	Image BackGround_Image_4; 
	
	Image Flight_Image_0; // �÷��̾� �̹���
	Image Flight_Image_1;
	Image Flight_Image_2;
	
	Image Enemy_Missile_Image; // �� �̻��� �̹���
	Image Missile_Image; // �̻��� �̹���
	
	Image Heart_Image; // ü��
	
	ArrayList<Missile> Missile_List = new ArrayList<Missile>(); // �ټ��� �÷��̾� �̻����� �����ϱ� ���� �迭
	
	Image buff_Image; // ���� ���۸���
	Graphics buffg; // ���� ���۸���
	
	Missile ms; // �̻��� Ŭ����
	Stage_Change_Frame SCF; // ȭ�� �ѱ�� Ŭ����
	Random random = new Random(); // ���� Ŭ����

	
	public void Default_Frame(String Flight, int Stage_num, int player_Hitpoint, int player_Speed, int missile_Speed) // �������� ����� �޼ҵ��Դϴ�.
	{
		init(Flight, Stage_num, player_Hitpoint, player_Speed, missile_Speed); // �⺻���� ���� �޼ҵ�
		
		if (Stage_num == 1) // Ÿ��Ʋ ����
		{
			setTitle("STAGE 1"); // �̸�
		}
		if (Stage_num == 2)
		{
			setTitle("STAGE 2"); // �̸�
		}
		if (Stage_num == 3)
		{
			setTitle("STAGE 3"); // �̸�
		}
		if (Stage_num == 4)
		{
			setTitle("STAGE 4"); // �̸�
		}
		if (Stage_num == 5)
		{
			setTitle("STAGE 5"); // �̸�
		}
		
		setSize(Frame_width, Frame_height); // ������ ����
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//�������� �����쿡 ǥ�õɶ� ��ġ�� �����ϱ����� ������� �ػ󵵸� �����ɴϴ�.
		
		int f_xpos = (int)(screen.getWidth() - Frame_width); // ������
		int f_ypos = (int)(screen.getHeight() / 2 - Frame_height / 2); // ��� 
		//�������� ȭ�� ���߾� �����ʿ� ��ġ��Ű�� ���� ��ǥ���� ����մϴ�. 
		
		setLocation(f_xpos, f_ypos); // �������� ȭ�鿡 ��ġ
		setResizable(false); //�������� ũ�⸦ �������� ���ϰ� ����
		setVisible(true); // �������� ���� ���̰� ����մϴ�.
		
	}
	
	public void init(String Flight, int Stage_num, int Player_Hitpoint, int Player_Speed, int Missile_Speed) // ������ �⺻ ���� �޼ҵ�
	{ 
		x = 250; // ĳ������ ���� ��ǥ 
		y = 700;
		Frame_width = 600; // ������ ũ�� 
		Frame_height = 800;

		BackGround_Image_0 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_0.png").getImage(); // ��� �̹���
		BackGround_Image_1 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_1.png").getImage(); // ��� �̹���
		BackGround_Image_2 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_2.png").getImage(); // ��� �̹���
		BackGround_Image_3 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_3.png").getImage(); // ��� �̹���
		BackGround_Image_4 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_4.png").getImage(); // ��� �̹���
	
		Flight_Image_0 = new ImageIcon("src\\Files\\" + Flight + "_0.png").getImage(); // ����� �̹���
		Flight_Image_1 = new ImageIcon("src\\Files\\" + Flight + "_1.png").getImage(); // ����� �̹���
		Flight_Image_2 = new ImageIcon("src\\Files\\" + Flight + "_2.png").getImage(); // ����� �̹���

		Missile_Image = new ImageIcon("src\\Files\\"+Flight+"_missile.png").getImage(); // �̻��� �̹���
		
		player_Hitpoint = Player_Hitpoint; // �÷��̾� ü��
		player_Speed = Player_Speed; // �÷��̾� �̵� �ӵ�
		missile_Speed = Missile_Speed; // �̻��� ������ �ӵ�
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); 


	}
	
	public void keyPressed(KeyEvent e) // Ű���尡 ���������� �̺�Ʈ ó���ϴ� ��
	{
		
		switch (e.getKeyCode()) 
		{
		case KeyEvent.VK_UP:
			KeyUp = true;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = true;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = true;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = true;
			break;
		case KeyEvent.VK_SPACE:
			KeySpace = true;
			break;
		case KeyEvent.VK_F:
			KeyF = true;
			break;
		case KeyEvent.VK_B:
			KeyB = true;
			break;
		}
		
	}
	
	public void keyReleased(KeyEvent e) // Ű���尡 �������ٰ� ���������� �̺�Ʈ ó���ϴ� ��
	{
		
		switch (e.getKeyCode())
		{
		case KeyEvent.VK_UP:
			KeyUp = false;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = false;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = false;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = false;
			break;
		case KeyEvent.VK_SPACE:
			KeySpace = false;
			break;
		case KeyEvent.VK_F:
			KeyF = false;
			break;
		case KeyEvent.VK_B:
			KeyB = false;
			break;
		}
		
	}
	
	public void keyTyped(KeyEvent e) // Ű���尡 Ÿ���� �ɶ� �̺�Ʈ ó���ϴ� ��
	{
		
	}
	
	public void KeyProcess()
	{

		if(KeyLeft == true && x > 10) // ����
			x -= player_Speed;
		if(KeyRight == true && x < Frame_width - 110) // ������ ( ��濡 �������� �մϴ�. )
			x += player_Speed;
		if(KeyUp == true && y > 500)
			y -= player_Speed;
		if(KeyDown == true && y < 700)
			y += player_Speed;
	}
	
	public void Sound(String file) // ���� ����� �޼ҵ�, ������ �޾Ƶ���� �ش� ���带 ����մϴ�.
	{
        Clip clip;
        
		try 
		{
	        AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
	        
	        clip = AudioSystem.getClip();
	        clip.open(ais);
	        clip.start(); 

	    } 
		catch (Exception e) 
		{
	    	 e.printStackTrace();
	    }
		
	}
	
	public static void clearScreen() // �ܼ� â �����
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
}