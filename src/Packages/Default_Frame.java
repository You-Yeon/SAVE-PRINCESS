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
	int Frame_width; // 프레임의 가로
	int Frame_height; // 프레임의 세로
	
	int x, y; //캐릭터의 좌표 변수

	boolean KeyLeft = false; // 키보드 입력처리를 위한 변수
	boolean KeyRight = false;
	boolean KeyUp = false; 
	boolean KeyDown = false;
	boolean KeySpace = false; // 미사일 발사를 위한 키
	
	boolean KeyF = false; // 꽃 
	boolean KeyB = false; // 배경
	
	int rand; // 랜덤을 위한 미지수
	int missile_Speed; // 미사일 속도
	int player_Hitpoint;  // 플레이어 캐릭터의 체력
	int player_Speed; // 플레이어 이동 속도

	Thread th; // 쓰레드 
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	Image BackGround_Image_0; // 배경 이미지
	Image BackGround_Image_1; 
	Image BackGround_Image_2; 
	Image BackGround_Image_3; 
	Image BackGround_Image_4; 
	
	Image Flight_Image_0; // 플레이어 이미지
	Image Flight_Image_1;
	Image Flight_Image_2;
	
	Image Enemy_Missile_Image; // 적 미사일 이미지
	Image Missile_Image; // 미사일 이미지
	
	Image Heart_Image; // 체력
	
	ArrayList<Missile> Missile_List = new ArrayList<Missile>(); // 다수의 플레이어 미사일을 관리하기 위한 배열
	
	Image buff_Image; // 더블 버퍼링용
	Graphics buffg; // 더블 버퍼링용
	
	Missile ms; // 미사일 클래스
	Stage_Change_Frame SCF; // 화면 넘기기 클래스
	Random random = new Random(); // 랜덤 클래스

	
	public void Default_Frame(String Flight, int Stage_num, int player_Hitpoint, int player_Speed, int missile_Speed) // 프레임을 만드는 메소드입니다.
	{
		init(Flight, Stage_num, player_Hitpoint, player_Speed, missile_Speed); // 기본적인 세팅 메소드
		
		if (Stage_num == 1) // 타이틀 설정
		{
			setTitle("STAGE 1"); // 이름
		}
		if (Stage_num == 2)
		{
			setTitle("STAGE 2"); // 이름
		}
		if (Stage_num == 3)
		{
			setTitle("STAGE 3"); // 이름
		}
		if (Stage_num == 4)
		{
			setTitle("STAGE 4"); // 이름
		}
		if (Stage_num == 5)
		{
			setTitle("STAGE 5"); // 이름
		}
		
		setSize(Frame_width, Frame_height); // 사이즈 설정
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//프레임이 윈도우에 표시될때 위치를 세팅하기위해 모니터의 해상도를 가져옵니다.
		
		int f_xpos = (int)(screen.getWidth() - Frame_width); // 오른쪽
		int f_ypos = (int)(screen.getHeight() / 2 - Frame_height / 2); // 가운데 
		//프레임을 화면 정중앙 오른쪽에 배치시키기 위해 좌표값을 계산합니다. 
		
		setLocation(f_xpos, f_ypos); // 프레임을 화면에 배치
		setResizable(false); //프레임의 크기를 변경하지 못하게 설정
		setVisible(true); // 프레임을 눈에 보이게 출력합니다.
		
	}
	
	public void init(String Flight, int Stage_num, int Player_Hitpoint, int Player_Speed, int Missile_Speed) // 프레임 기본 세팅 메소드
	{ 
		x = 250; // 캐릭터의 최초 좌표 
		y = 700;
		Frame_width = 600; // 프레임 크기 
		Frame_height = 800;

		BackGround_Image_0 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_0.png").getImage(); // 배경 이미지
		BackGround_Image_1 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_1.png").getImage(); // 배경 이미지
		BackGround_Image_2 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_2.png").getImage(); // 배경 이미지
		BackGround_Image_3 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_3.png").getImage(); // 배경 이미지
		BackGround_Image_4 = new ImageIcon("src\\Files\\stage"+String.valueOf(Stage_num)+"_4.png").getImage(); // 배경 이미지
	
		Flight_Image_0 = new ImageIcon("src\\Files\\" + Flight + "_0.png").getImage(); // 비행기 이미지
		Flight_Image_1 = new ImageIcon("src\\Files\\" + Flight + "_1.png").getImage(); // 비행기 이미지
		Flight_Image_2 = new ImageIcon("src\\Files\\" + Flight + "_2.png").getImage(); // 비행기 이미지

		Missile_Image = new ImageIcon("src\\Files\\"+Flight+"_missile.png").getImage(); // 미사일 이미지
		
		player_Hitpoint = Player_Hitpoint; // 플레이어 체력
		player_Speed = Player_Speed; // 플레이어 이동 속도
		missile_Speed = Missile_Speed; // 미사일 움직임 속도
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); 


	}
	
	public void keyPressed(KeyEvent e) // 키보드가 눌러졌을때 이벤트 처리하는 곳
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
	
	public void keyReleased(KeyEvent e) // 키보드가 눌러졌다가 때어졌을때 이벤트 처리하는 곳
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
	
	public void keyTyped(KeyEvent e) // 키보드가 타이핑 될때 이벤트 처리하는 곳
	{
		
	}
	
	public void KeyProcess()
	{

		if(KeyLeft == true && x > 10) // 왼쪽
			x -= player_Speed;
		if(KeyRight == true && x < Frame_width - 110) // 오른쪽 ( 배경에 못나가게 합니다. )
			x += player_Speed;
		if(KeyUp == true && y > 500)
			y -= player_Speed;
		if(KeyDown == true && y < 700)
			y += player_Speed;
	}
	
	public void Sound(String file) // 사운드 재생용 메소드, 파일을 받아드려서 해당 사운드를 재생합니다.
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
	
	public static void clearScreen() // 콘솔 창 지우기
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
}