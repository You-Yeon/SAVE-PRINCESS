package Packages;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Stage_5 extends Default_Frame implements Runnable{
	
	Image Nojingu_Missile_Image; // 노진구 미사일 이미지	
	Image Doraemon_Missile_Image; // 도라에몽 미사일 이미지

	Image Nojingu_Image; // 노진구 이미지
	Image Doraemon_Image; // 도라에몽 이미지
	Image Shield_Image; // 도라에몽 쉴드 이미지
	
	Image ST_B_Flight0; // 무적상태 Blue 비행기 이미지
	Image ST_B_Flight1;
	Image ST_B_Flight2;
	
	Image B_G_Ms; // Green 거대 미사일
	
	Nojingu ng; // 노진구 클래스
	Doraemon dm; // 도라에몽 클래스
	Enemy SH; // 쉴드 클래스
	Blue_Flight BF = new Blue_Flight(); // 블루 클래스
	Green_Flight GF = new Green_Flight(); // 그린 클래스
	Pink_Flight PF = new Pink_Flight(); // 핑크 클래스
	Yellow_Flight YF = new Yellow_Flight(); // 옐로우 클래스
	
	ArrayList<Nojingu> Nojingu_List; // 노진구 데이터
	ArrayList<Doraemon> Doraemon_List; // 도라에몽 데이터
	ArrayList<Enemy> Shield_List; // 도라에몽 쉴드 데이터
	
	ArrayList<Missile> Nojingu_Missile_List; // 노진구의 미사일을 관리하기 위한 배열
	ArrayList<Missile> Doraemon_Missile_List; // 도라에몽의 미사일을 관리하기 위한 배열
	
	int cnt; // 카운트
	int s_cnt = 0; // 스킬 카운트
	int stack = 0; // 스킬 스택
	
	int e_s_cnt = 0; // 적 스킬 카운트
	int e_stack = 0; // 적 스킬 스택
	
	boolean E_S_C; // 적 스킬 카운트 여부
	boolean S_C; // 스킬 카운트 여부
	boolean N_LR = true; // 적 양옆 확인 ( false : 왼쪽 가야함 , true : 오른쪽 가야함 )
	
	int NG = 0; // 플레이어 피를 깎은건 노진구에영
	int DM = 0; // 플레이어 피를 깎은건 도라에몽이에용
	int P_HP = 0; // 플레이어 HP 
	
	int fl_num; // 비행기의 정체  ( 0 : Blue , 1 : Green , 2 : Pink , 3 : Yellow)
	
	String flight;
	
	public void Game_Start(String Flight, int player_Hitpoint, int player_Speed, int missile_Speed)
	{
		Default_Frame(Flight, 5, player_Hitpoint, player_Speed,  missile_Speed); // 디폴트 프레임에 내용을 보냅니다.
		start(); // 시작
		
		this.player_Hitpoint = player_Hitpoint; // 플레이어 체력
		this.player_Speed = player_Speed; // 플레이어 이동 속도
		this.missile_Speed = missile_Speed; // 미사일 움직임 속도
		this.flight = Flight; // 입력 받기
		
		Nojingu_Image = new ImageIcon("src\\Files\\S_Nojingu.png").getImage(); // 노진구 이미지 
		Doraemon_Image = new ImageIcon("src\\Files\\S_Doraemon.png").getImage(); // 도라에몽 이미지 
		Shield_Image = new ImageIcon("src\\Files\\Shield.png").getImage(); // 쉴드 이미지 
		
		Nojingu_Missile_Image = new ImageIcon("src\\Files\\Nojingu_missile.png").getImage(); // 노진구 미사일 이미지
		Doraemon_Missile_Image = new ImageIcon("src\\Files\\Doraemon_missile.png").getImage(); // 도라에몽 미사일 이미지
		
		Nojingu_List = new ArrayList<Nojingu>(); // 다수의  노진구을 관리하기 위한 배열
		Doraemon_List = new ArrayList<Doraemon>(); // 다수의 도라에몽를 관리하기 위한 배열
		Shield_List = new ArrayList<Enemy>(); // 다수의 쉴드를 관리하기 위한 배열
		
		Nojingu_Missile_List = new ArrayList<Missile>(); // 노진구 미사일을 관리하기 위한 배열
		Doraemon_Missile_List = new ArrayList<Missile>(); // 도라에몽 미사일을 관리하기 위한 배열
				
		SCF = new Stage_Change_Frame(); // 스테이지 바꾸는 곳 객체
		
		if(flight.equals("Blue")) // 패시브 생성을 위해서 누구인지 알아보기
		{
			fl_num = 0; // 블루
			
			ST_B_Flight0 = new ImageIcon("src\\Files\\ST_Blue_0.png").getImage(); // 무적 이미지
			ST_B_Flight1 = new ImageIcon("src\\Files\\ST_Blue_1.png").getImage();
			ST_B_Flight2 = new ImageIcon("src\\Files\\ST_Blue_2.png").getImage();
		
		}
		
		if(flight.equals("Green"))
		{
			fl_num = 1; // 그린
			
			B_G_Ms = new ImageIcon("src\\Files\\B_Green_missile.png").getImage(); // 큰 미사일 이미지
		}
		
		if(flight.equals("Pink"))
		{
			fl_num = 2; // 핑크
		}

		if(flight.equals("Yellow"))
		{
			fl_num = 3; // 옐로우
		}
		if(flight.equals("Rainbow"))
		{
			fl_num = 777;
		}
		// 노진구 추가 
		ng = new Nojingu(60,350);
		Nojingu_List.add(ng);

		ng = new Nojingu(190,350);
		Nojingu_List.add(ng);
		
		ng = new Nojingu(320,350);
		Nojingu_List.add(ng);
		
		ng = new Nojingu(450,350);
		Nojingu_List.add(ng);
		
		//도라에몽 추가
		dm = new Doraemon(200,80);
		Doraemon_List.add(dm);
		
		//도라에몽 쉴드 추가
		
		SH = new Doraemon(0,300);
		Shield_List.add(SH);
		
		SH = new Doraemon(0,320);
		Shield_List.add(SH);

		
	}
	
	public void start() // 시작 명령 처리 메소드
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 오른쪽 위에 x버튼을 눌렀을때 
		// 프로그램이 정상적으로 종료가 됩니다.
		
		addKeyListener(this); // 키보드 이벤트 실행
		th = new Thread(this); // 스레드 생성
		th.start(); // 스레드 실행

	}
	
	public void run() //스레드가 무한 루프 될 부분입니다.
	{	
		try  // 에러 방지
		{	
			while(true) // while문으로 무한 루프
			{
				if (player_Hitpoint <= 0) // 플레이어 피 없으면 끝
				{
					break;
				}
				cnt++; //카운트 증가
				BonusProcess(); // 꽃 && 배경 
				HeartProcess(); // 체력 갱신
				KeyProcess(); // 키보드 입력처리를 하여 x,y 갱신
				MissileProcess(); // 미사일 입력처리 메소드
				Nojingu_moveProcess(); // 노진구 움직이기 처리
				
				if (cnt > 50) // 50 이상 부터 적이 미사일 발사
				{
					Enemy_MissileProcess(); // 적 미사일 처리
					
					if(Doraemon_List.size() == 0) // 뻣뻣한 마왕만 죽이면 됨
					{
						break; // 반복문 나가기
					}

				}
				
				if(fl_num == 0) // 블루 비행기 일때
				{
					if ( cnt % ((stack+1)*500 + stack* 150)== 0) // 10초 마다
					{
						Sound("src\\Files\\HPUP.wav"); // 업 소리
						BF.Shield = true; // 무적 가동
						S_C = true; // 카운트 시작
					}
					
					if ( s_cnt == 150) // 3초간
					{
						BF.Shield = false; // 무적 해제 
						S_C = false; // 스킬 카운트 끝
						s_cnt = 0; // 초기화
						stack ++ ; // 스택 쌓기
					}
				}
				
				if(fl_num == 1) // 그린 비행기 일때 
				{
					if ( cnt % ((stack+1)*250 + stack* 100) == 0) // 5초 마다
					{
						GF.Big_MS = true; // 무적 가동
						S_C = true; // 카운트 시작
					}
					
					if ( s_cnt == 100 ) // 2초간
					{
						GF.Big_MS = false;
						S_C = false; // 스킬 카운트 끝
						s_cnt = 0; // 초기화
						stack ++ ; // 스택 쌓기
					}
				}
				
				if(fl_num == 2) // 핑크 비행기 일때
				{
					if( cnt % 250 == 0 ) // 5초 마다
					{
						if(player_Hitpoint != PF.MX_HP) // 최대치인 10이하까지만
						{
							Sound("src\\Files\\HPUP.wav"); // 업 소리
							player_Hitpoint ++; // 피 회복								
						}
					}
				}
				
				if(fl_num == 3) // 옐로우 비행기 일때
				{
					if( cnt % ((stack+1)*500 + stack* 150) == 0) // 10초 마다
					{
						YF.Double_Ms = true; // 스킬 시작
						S_C = true; // 카운트 시작
					}
					
					if( s_cnt == 150 ) // 3초간
					{
						YF.Double_Ms = false;
						S_C = false; // 스킬 카운트 끝
						s_cnt = 0; // 초기화
						stack ++; // 스택 쌓기
					}
				}
				
				if (S_C) // 스킬 카운트 세는 곳
				{
					s_cnt ++; // 카운트 시작
				}
				
				if (E_S_C) // 적 스킬 카운트 세는 곳
				{
					e_s_cnt ++; // 카운트 시작
				}
				
				repaint(); // 갱신된 x,y값으로 이미지 새로 그리기
				Thread.sleep(20); // 20 밀리세턴드 로 스레드 돌리기
			}
			if (player_Hitpoint <= 0) // 피가 없다면
			{
				Sound("src\\Files\\OVER.wav"); // 게임오버 소리 틀기
				TimeUnit.SECONDS.sleep(1); // 1초
				GameOver(); // 게임 오버로
			}
			else // 게임 이겼다 !
			{
				SCF.Stage_Setting(flight, 777); // 엔딩 화면으로 이동하기
			}		
			dispose(); // 프레임 닫기
		}
		catch (Exception e) {}
	}
	
	public void BonusProcess() // 보너스 처리
	{
		if (flight.equals("Rainbow")) // rainbow 일때만
		{
			if (KeyF) // 꽃으로 바꾸기
			{
				Nojingu_Image = new ImageIcon("src\\Files\\F_Nojingu.png").getImage(); // 노진구 이미지 
				Doraemon_Image = new ImageIcon("src\\Files\\F_Doraemon.png").getImage(); // 도라에몽 이미지 
			}
			
			if (KeyB) // 배경 바꾸기
			{
			
				BackGround_Image_0 = new ImageIcon("src\\Files\\bonus.png").getImage(); // 배경 이미지
				BackGround_Image_1 = new ImageIcon("src\\Files\\bonus.png").getImage(); // 배경 이미지
				BackGround_Image_2 = new ImageIcon("src\\Files\\bonus.png").getImage(); // 배경 이미지
				BackGround_Image_3 = new ImageIcon("src\\Files\\bonus.png").getImage(); // 배경 이미지
				BackGround_Image_4 = new ImageIcon("src\\Files\\bonus.png").getImage(); // 배경 이미지
	
			}
		}
	}
	
	public void Nojingu_moveProcess() // 노진구 움직이기
	{
		if (cnt > 50 && cnt % 5 == 0) // 50 이상일때 부터 시작
		{
			if(N_LR) // 오른쪽으로 가자 !  
			{
				for ( int i = 0 ; i < Nojingu_List.size(); i++) // 노진구가 벽에 닿는 지 검사
				{
					ng = (Nojingu)Nojingu_List.get(i); // 정보 가져오기 
					
					ng.x = ng.x + ng.player_Speed; // 플레이어 스피드 만큼 움직이기

					if ( ng.x > 480 ) // 480 넘어가면 왼쪽으로 ! 
					{
						N_LR = false; // 왼쪽으로
						break;
					}
					
				}
			}
			
			if(!N_LR) // 왼쪽으로 가자 !
				
				for ( int i =0; i < Nojingu_List.size(); i++) // 노진구가 벽에 닿는 지 검사
				{
					ng = (Nojingu)Nojingu_List.get(i); // 정보 가져오기 
					
					ng.x = ng.x - ng.player_Speed; // 플레이어 스피드 만큼 움직이기
					
					if ( ng.x < 20 ) // 20 넘어가면 오른쪽으로 ! 
					{
						N_LR = true; // 오른쪽으로
						break;
					}

				}
		}
	}
	
	public void HeartProcess() // 체력 갱신 하는 곳
	{
		if (P_HP > 0) // 피가 달았나?
		{
			if (NG > 0) // 노진구가 그랬나?
			{
				player_Hitpoint = player_Hitpoint - ng.missile_Damage; // 노진구 데미지 만큼 줄이기
				
				if (player_Speed > 5)// 노진구 패시브 스킬 
				{
					player_Speed = player_Speed - ng.de_player_speed; // 공격 속도 저하
				}
					
				P_HP = 0; // 초기화
				NG = 0; // 초기화
			}
			if (DM > 0) // 도라에몽이 그랬나? 
			{
				player_Hitpoint = player_Hitpoint - dm.missile_Damage; // 도라에몽 데미지 만큼 줄이기
				P_HP = 0; // 초기화
				DM = 0; // 초기화
			}
		}
		
		Heart_Image = new ImageIcon("src\\Files\\Heart_" + String.valueOf(player_Hitpoint-1) + ".png").getImage(); // 체력 이미지 바꾸기
	}
	
	public void Enemy_MissileProcess() // 적 미사일 좌표 갱신 부분
	{
		for(int i = 0; i < Nojingu_List.size(); ++i) // 노진구 모두 데려오기
		{
			ng = (Nojingu)(Nojingu_List.get(i)); // 노진구 정보 가져오기

			if ( cnt % ng.missile_Speed == 0 ) // 노진구의 공격 속도만큼 미사일 추가하기
			{
				ms = new Missile(ng.x + 45, ng.y + 110); // 좌표 체크하여 넘기기
				Nojingu_Missile_List.add(ms); // 해당 미사일 추가
				
			}
			
			for (int j = 0; j < Nojingu_Missile_List.size(); ++j) // 노진구의 모든 미사일 가져오기
			{
				ms = (Missile)Nojingu_Missile_List.get(j); // 노진구 미사일 정보 가져오기
			
				if ( ms.x > x && ms.x + Nojingu_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
				{
					// 플레이어와 미사일이 부딪힌 여부 검사하기
					
					Nojingu_Missile_List.remove(j); // 맞으면 미사일 제거
					
					if(!BF.Shield) // 블루 비행기 스킬 쓰기 않는 경우에만
					{
						NG ++; // 노진구가 그랬어요
						P_HP ++; // 플레이어 피가 달았어요
					}
					
					Sound("src\\Files\\NJ.wav"); // 클릭 소리 틀기

				}
			}
		}
		
		for(int i = 0; i < Doraemon_List.size(); ++i) // 도라에몽 모두 데려오기
		{
			dm = (Doraemon)(Doraemon_List.get(i)); // 도라에몽 정보 가져오기

			if ( cnt % dm.missile_Speed == 0 ) // 도라에몽의 공격속도 가 된다면 미사일 그리기
			{
				ms = new Missile(dm.x - 10, dm.y + 310); // 좌표 체크하여 넘기기
				Doraemon_Missile_List.add(ms); // 해당 미사일 추가
				
				ms = new Missile(dm.x + 90, dm.y + 310); // 좌표 체크하여 넘기기
				Doraemon_Missile_List.add(ms); // 해당 미사일 추가
				
				ms = new Missile(dm.x + 190, dm.y + 310); // 좌표 체크하여 넘기기
				Doraemon_Missile_List.add(ms); // 해당 미사일 추가
				
			}
			
		}
		
		for (int j = 0; j < Doraemon_Missile_List.size(); ++j) // 모든 도라에몽 정보 데려오기
		{
			ms = (Missile)Doraemon_Missile_List.get(j); // 도라에몽 정보 가져오기
				
			if ( ms.x > x && ms.x + Doraemon_Missile_Image.getWidth(null) < x + Flight_Image_0.getWidth(null) - 20 && ms.y > y)
			{
				// 플레이어와 미사일이 부딪혔는지 확인하기
				Doraemon_Missile_List.remove(j); // 그러면 미사일 제거
						
				if(!BF.Shield) // 블루 스킬 시전 안할때만
				{
					DM ++; // 도라에몽이 그랬어요
					P_HP ++; // 체력이 깎였어요
				}
						
				Sound("src\\Files\\click.wav"); // 클릭 소리 틀기

			}
			
		}
		
	}
	
	public void MissileProcess() //미사일 처리 메소드
	{
		if(KeySpace && cnt % missile_Speed == 0) // 스페이스바 키 상태가 true 라면
		{
			if(YF.Double_Ms) // 노란 비행기 패시브 시전일때는 두발씩쏘기
			{
				ms = new Missile(x+ 35,y - 20); // 좌표 체크하여 넘기기
				Missile_List.add(ms); // 해당 미사일 추가
				
				ms = new Missile(x+ 55,y - 20); // 좌표 체크하여 넘기기
				Missile_List.add(ms); // 해당 미사일 추가
				
				Sound("src\\Files\\Fire.wav"); // 클릭 소리 틀기
			}
			
			else if (flight.equals("Rainbow"))
			{
				ms = new Missile(x+ 20,y - 20); // 좌표 체크하여 넘기기
				Missile_List.add(ms); // 해당 미사일 추가
				
				ms = new Missile(x+ 40,y - 20); // 좌표 체크하여 넘기기
				Missile_List.add(ms); // 해당 미사일 추가
	
				ms = new Missile(x+ 60,y - 20); // 좌표 체크하여 넘기기
				Missile_List.add(ms); // 해당 미사일 추가
				
				Sound("src\\Files\\Fire.wav"); // 클릭 소리 틀기
			}
			
			else // 그외에는 한 발씩 쏘기
			{
				ms = new Missile(x+ 45,y - 20); // 좌표 체크하여 넘기기
				Missile_List.add(ms); // 해당 미사일 추가
				
				Sound("src\\Files\\Fire.wav"); // 클릭 소리 틀기
			}
		}
		
		if(GF.Big_MS) // 그린 비행기 패시브일때 대형 미사일 발사
		{
			for (int i = 0; i < Missile_List.size(); ++i) // 모든 미사일 정보 가져오기
			{
				ms = (Missile)Missile_List.get(i); // 미사일들 정보 가져오기

				for (int j = 0; j < Nojingu_List.size(); ++j) // 노진구 데려오기
				{					
					ng = (Nojingu)Nojingu_List.get(j); // 노진구들 정보 가져오기
				
					if ( ms.x > ng.x + 20 && ms.x + B_G_Ms.getWidth(null) < ng.x + Nojingu_Image.getWidth(null) && ms.y < ng.y + Nojingu_Image.getHeight(null)) // 그린 대형 미사일로 비교하기
					{
						//노진구랑 미사일이랑 부딪혔다면
						
						Nojingu_List.remove(j); // 노진구 제거
						Missile_List.remove(i); // 미사일 주거라
						
						Sound("src\\Files\\click.wav"); // 클릭 소리 틀기

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // 미사일들 정보 데려오기
			{
				ms = (Missile)Missile_List.get(i); // 미사일들 정보 가져오기

				for (int j = 0; j < Doraemon_List.size(); ++j) // 도라에몽 정보 가져오기
				{					
					dm = (Doraemon)Doraemon_List.get(j); // 도라에몽 정보 가져오기
				
					if ( ms.x > dm.x + 20 && ms.x + B_G_Ms.getWidth(null) < dm.x + Doraemon_Image.getWidth(null) && ms.y < dm.y + Doraemon_Image.getHeight(null)) // 그린 대형 미사일로 검사
					{
						// 미사일과 도라에몽이 부딪혔는지 확인하기
						
						Doraemon_List.remove(j); // 도라에몽 주거라
						Missile_List.remove(i);  // 미사일도 주거라
						
						Sound("src\\Files\\click.wav"); // 클릭 소리 틀기

					}
			
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // 미사일들 정보 데려오기
			{
				ms = (Missile)Missile_List.get(i); // 미사일들 정보 가져오기
				
				for (int j = 0; j < Shield_List.size(); ++j) // 쉴드 정보 가져오기
				{
					
					SH = (Doraemon)Shield_List.get(j); // 쉴드 정보 가져오기
				
					if ( ms.x > SH.x + 20 && ms.x + B_G_Ms.getWidth(null) < SH.x +Shield_Image.getWidth(null) && ms.y < SH.y + Shield_Image.getHeight(null)) // 그린 대형 미사일로 검사
					{
						// 미사일과 쉴드가 부딪혔는지 확인하기
						
						Shield_List.remove(j); // 쉴드 주거라
						Missile_List.remove(i);  // 미사일도 주거라
						
						Sound("src\\Files\\glass.wav"); // 클릭 소리 틀기

					}
			
				}
			}
		}
		else // 그린 패시브가 아닐 경우에는 기본 미사일 이미지로 검사하기
		{
			for (int i = 0; i < Missile_List.size(); ++i) // 미사일들 정보 데려오기
			{
				ms = (Missile)Missile_List.get(i); // 미사일 정보 가져오기
				
				for (int j = 0; j < Nojingu_List.size(); ++j) // 노진구들 정보 데려오기
				{
				
					ng = (Nojingu)Nojingu_List.get(j); // 노진구 정보 가져오기
			
					if ( ms.x > ng.x + 20 && ms.x + Missile_Image.getWidth(null) < ng.x + Nojingu_Image.getWidth(null) && ms.y < ng.y + Nojingu_Image.getHeight(null))
					{
						// 미사일이랑 노진구이 부딪혔을때
						Nojingu_List.remove(j); // 노진구 주거라
						Missile_List.remove(i); // 미사일 주거라
					
						Sound("src\\Files\\click.wav"); // 클릭 소리 틀기

					}
		
				}
			}
		
			for (int i = 0; i < Missile_List.size(); ++i) // 모든 미사일 정보 데려오기
			{
				ms = (Missile)Missile_List.get(i); // 미사일 정보 가져오기
				
				for (int j = 0; j < Doraemon_List.size(); ++j) // 모든 도라에몽 정보 데려오기
				{
				
					dm = (Doraemon)Doraemon_List.get(j); // 도라에몽 정보 가져오기
			
					if ( ms.x > dm.x + 20 && ms.x + Missile_Image.getWidth(null) < dm.x + Doraemon_Image.getWidth(null) && ms.y < dm.y + Doraemon_Image.getHeight(null))
					{
						// 미사일이랑 도라에몽 부딪혔을때
						Doraemon_List.remove(j); // 도라에몽 주거라
						Missile_List.remove(i);  // 미사일도 주거라
					
						Sound("src\\Files\\click.wav"); // 클릭 소리 틀기

					}
		
				}
			}
			
			for (int i = 0; i < Missile_List.size(); ++i) // 미사일들 정보 데려오기
			{
				ms = (Missile)Missile_List.get(i); // 미사일들 정보 가져오기

				for (int j = 0; j < Shield_List.size(); ++j) // 쉴드 정보 가져오기
				{					
					SH = (Doraemon)Shield_List.get(j); // 쉴드 정보 가져오기
				
					if ( ms.x > SH.x + 20 && ms.x + Missile_Image.getWidth(null) < SH.x +Shield_Image.getWidth(null) && ms.y < SH.y + Shield_Image.getHeight(null)) 
					{
						// 미사일과 쉴드가 부딪혔는지 확인하기
						
						Shield_List.remove(j); // 쉴드 주거라
						Missile_List.remove(i);  // 미사일도 주거라
						
						Sound("src\\Files\\glass.wav"); // 클릭 소리 틀기

					}
			
				}
			}
		}
	}
	
	// 더블 버퍼링을 이용하여 생성해둔 버퍼 이미지에다가 그림을 먼저 다 그린 후
	// 실제 화면에다가 버퍼의 이미지를 가져다 붙여서 깜빡이는 현상을 제거 합니다.
	
	public void paint(Graphics g)
	{	
		try {
			buff_Image = createImage(Frame_width,Frame_height); // 더블버퍼링 버퍼 크기를 화면 크기와 같게 설정
			buffg = buff_Image.getGraphics(); // 버퍼의 그래픽 객체를 얻기
			Draw_BackGround(); // 실제 그려진 배경 그림을 가져온다.
			Draw_Char(); // 실제 그려진 플레이어 그림을 가져온다.
			Draw_Enemy(); // 적 그리깅
			Draw_Missile(); // 미사일도 그리깅
			Draw_Enemy_Missile(); // 적 미사일도 그리깅
			Drow_Heart(); // 체력 그리깅
			
			g.drawImage(buff_Image,0,0,this);
			// 화면에 버퍼에 그린 그림을 가져와 그리기
			}
		catch (Exception e) {}
	} 
	
	public void Draw_Char() //실제로 그림들을 그릴 부분
	{ 
		rand = random.nextInt(3); // 3개로 랜덤 돌리기
		
		if(fl_num == 0 && BF.Shield) // 블루 비행기 패시브일때는 무적 이미지로 돌리기
		{
			if (rand == 0)
			{
				buffg.drawImage(ST_B_Flight0,x,y,this);  // 무적 이미지 1
			}
			else if (rand == 1)
			{
				buffg.drawImage(ST_B_Flight1,x,y,this); // 무적 이미지2
			}
			else
			{
				buffg.drawImage(ST_B_Flight2,x,y,this); // 무적이미지 3
			}
		}
		
		else // 그 외에는 기본 비행기 이미지로 돌리기
		{
			if (rand == 0)
			{
				buffg.drawImage(Flight_Image_0,x,y,this); // 비행기 1
			}
			else if (rand == 1)
			{
				buffg.drawImage(Flight_Image_1,x,y,this); // 비행기 2
			}
			else
			{
				buffg.drawImage(Flight_Image_2,x,y,this); // 비행기 3
			}	
		}
	}
	
	public void Draw_BackGround() // 배경화면 그리기
	{
		rand = random.nextInt(5); // 총 5가지 그림으로 돌려가며 그리기
		
		if (rand == 0)
		{
			buffg.drawImage(BackGround_Image_0,0,0,this); // 배경 1
		}
		else if (rand == 1)
		{
			buffg.drawImage(BackGround_Image_1,0,0,this); // 배경 2
		}
		else if (rand == 2)
		{
			buffg.drawImage(BackGround_Image_2,0,0,this); // 배경 3
		}
		else if (rand == 3)
		{
			buffg.drawImage(BackGround_Image_3,0,0,this); // 배경 4
		}
		else 
		{
			buffg.drawImage(BackGround_Image_4,0,0,this); // 배경 5
		}
	}
	
	public void Draw_Enemy() // 적들 그리기
	{
		for (int i= 0; i < Nojingu_List.size(); ++i) // 모든 노진구들 데려와서
		{
			ng = (Nojingu)(Nojingu_List.get(i)); // 좌표 정보 가져온 후에 
			buffg.drawImage(Nojingu_Image,ng.x,ng.y,this); // 그 좌표에 그리기
		}
		
		for (int i= 0; i < Doraemon_List.size(); ++i) // 모든 도라에몽들 데려와서
		{
			dm = (Doraemon)(Doraemon_List.get(i)); // 좌표 정보 가져온 후에
			buffg.drawImage(Doraemon_Image,dm.x,dm.y,this); // 그 좌표에 그리기
		}
		
		for (int i= 0; i < Shield_List.size(); ++i) // 모든 쉴드 데려와서
		{
			SH = (Doraemon)(Shield_List.get(i)); // 좌표 정보 가져온 후에
			buffg.drawImage(Shield_Image,SH.x,SH.y,this); // 그 좌표에 그리기
		}
	}
	
	public void Draw_Missile() // 미사일 그리는 메소드
	{
		
		for(int i = 0; i < Missile_List.size(); ++i) // 모든 미사일 정보 가져오기
		{
			ms = (Missile)Missile_List.get(i); // 미사일 좌표 정보
			//미사일 위치값
			if(GF.Big_MS) // 그린 비행기 패시브일때는 큰 미사일로 그리기
			{
				buffg.drawImage(B_G_Ms, ms.x , ms.y, this); // 그린 대형 미사일
			}
			else // 그 외에는 그냥 미사일
			{
				buffg.drawImage(Missile_Image, ms.x , ms.y, this); // 그냥 미사일
			}
			//현재 좌표에 미사일 그리기
			ms.move();
			//그려진 미사일을 정해진 숫자만큼 이동시키기
			
			if (ms.y < 65) // 회색 위로 가면 지우기
			{
				Missile_List.remove(i); // 지우기
			}
			
		}
	}
	
	public void Draw_Enemy_Missile() // 적 미사일 그리기
	{
		
		for(int i = 0; i < Nojingu_Missile_List.size(); ++i) // 모든 노진구 미사일 가져오기
		{
			ms = (Missile)Nojingu_Missile_List.get(i);
			//미사일 위치값
			buffg.drawImage(Nojingu_Missile_Image, ms.x, ms.y, this);
			//현재 좌표에 미사일 그리기
			ms.e_move();
			//그려진 미사일을 정해진 숫자만큼 이동시키기
			
			if (ms.y > 780) // 회색 아래로 가면 지우기
			{
				Nojingu_Missile_List.remove(i); // 지우기
			}
			
		}
		
		for(int i = 0; i < Doraemon_Missile_List.size(); ++i) // 모든 도라에몽 미사일 가져오기
		{
			ms = (Missile)Doraemon_Missile_List.get(i);
			//미사일 위치값
			buffg.drawImage(Doraemon_Missile_Image, ms.x, ms.y, this); // 그냥 미사일로 그리기
			
			//현재 좌표에 미사일 그리기
			ms.e_move();
			//그려진 미사일을 정해진 숫자만큼 이동시키기
			
			if (ms.y > 780) // 회색 아래로로 가면 지우기
			{
				Doraemon_Missile_List.remove(i); // 지우기
			}
			
		}
	}
		
	public void Drow_Heart() // 심장 그리기
	{
		buffg.drawImage(Heart_Image,20,30,this); // 체력 !
	}
	
	public void GameOver() // 게임 오버화면
	{		
		
		clearScreen(); // 콘솔창 정리하고
		System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ㅣ	    ______ ___     __  ___ ______   ____  _    __ ______ ____ 			                                                              ㅣ");
		System.out.println("     ㅣ	   / ____//   |   /  |/  // ____/  / __ \\| |  / // ____// __ \\				                                              ㅣ");
		System.out.println("     ㅣ	  / / __ / /| |  / /|_/ // __/    / / / /| | / // __/  / /_/ / 	        뻣뻣한 마왕에게 진 유연한 왕자는 유연한 공주와 함께             ㅣ");
		System.out.println("     ㅣ	 / /_/ // ___ | / /  / // /___   / /_/ / | |/ // /___ / _, _/ 	        평생동안 단팥빵을 굽기만 하게 됩니다...              ㅣ");
		System.out.println("     ㅣ	 \\____//_/  |_|/_/  /_//_____/   \\____/  |___//_____//_/ |_|        다시 도전해 주세요 ㅠㅠ		                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                      Press F11 to restart.   ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                      ㅣ");
		System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
		System.exit(0); // 프로그램 종료
	}
	
}
