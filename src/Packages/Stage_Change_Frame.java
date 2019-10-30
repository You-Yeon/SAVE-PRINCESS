package Packages;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Stage_Change_Frame extends Default_Frame{
	
	Scanner scan = new Scanner(System.in); // 스캔 클래스
	
	Stage_1 st1 = new Stage_1(); // 스테이지 1
	Stage_2 st2 = new Stage_2(); // 스테이지 2
	Stage_3 st3 = new Stage_3(); // 스테이지 3
	Stage_4 st4 = new Stage_4(); // 스테이지 4
	Stage_5 st5 = new Stage_5(); // 스테이지 5
	
	int player_Hitpoint; // 최초 유닛 체력
	int player_Speed; // 플레이어 이동속도
	int missile_Speed; // 미사일 움직임 속도
	
	public void Stage_Setting(String Flight , int Stage_num)
	{
		// 비행기 세팅
		
		if (Flight.equals("Blue")) // 파랑
		{
			Blue_Flight BF = new Blue_Flight();
				
			player_Hitpoint = BF.player_Hitpoint;
			player_Speed = BF.player_Speed;
			missile_Speed = BF.missile_Speed;
		}
		else if (Flight.equals("Green")) // 초록
		{
			Green_Flight GF = new Green_Flight();
			
			player_Hitpoint = GF.player_Hitpoint; 
			player_Speed = GF.player_Speed;
			missile_Speed = GF.missile_Speed;				
		}
		else if (Flight.equals("Pink")) // 핑크
		{
			Pink_Flight PF = new Pink_Flight();
			
			player_Hitpoint = PF.player_Hitpoint; 
			player_Speed = PF.player_Speed;
			missile_Speed = PF.missile_Speed;				
		}
		else if (Flight.equals("Yellow"))// 옐로우
		{
			Yellow_Flight YF = new Yellow_Flight();
				
			player_Hitpoint = YF.player_Hitpoint; 
			player_Speed = YF.player_Speed;
			missile_Speed = YF.missile_Speed;				
			
		}
		else // 레인보우 비행기
		{
			player_Hitpoint = 10;
			player_Speed = 10;
			missile_Speed = 5;
		}
		
		
		// 스테이지 세팅
		
		if (Stage_num == 1) // 스테이지 1
		{
			Stage_1(); // Stage1 설명
			st1.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage1 Start
		}
		else if (Stage_num == 2) // 스테이지 2
		{
			Stage_2(); // Stage2 설명
			st2.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage2 Start
		}
		else if (Stage_num == 3) // 스테이지 3
		{
			Stage_3(); // Stage3 설명
			st3.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage3 Start
		}
		else if (Stage_num == 4) //스테이지 4
		{
			Stage_4(); // Stage4 설명
			st4.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage4 Start
		}
		else if (Stage_num == 5)// 스테이지 5
		{
			Stage_5(); // Stage5 설명
			st5.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage5 Start
		}
		else // 엔딩 
		{
			try {
				Sound("src\\Files\\finish.wav"); // 소리 틀기
				clearScreen();
				System.out.println("		     __  __ ___     ____   ____ __  __");
				System.out.println("		    / / / //   |   / __ \\ / __ \\\\ \\/ /");
				System.out.println("		   / /_/ // /| |  / /_/ // /_/ / \\  / ");
				System.out.println("		  / __  // ___ | / ____// ____/  / /  ");
				System.out.println("		 /_/ /_//_/  |_|/_/    /_/      /_/   ");
				System.out.println("		     ______ _   __ ____   ____ _   __ ______");
				System.out.println("		    / ____// | / // __ \\ /  _// | / // ____/");
				System.out.println("		   / __/  /  |/ // / / / / / /  |/ // / __  ");
				System.out.println("		  / /___ / /|  // /_/ /_/ / / /|  // /_/ /  ");
				System.out.println("		 /_____//_/ |_//_____//___//_/ |_/ \\____/  \n\n");
				
				System.out.println("★***************************************************************************★\n\n\n");
				System.out.println("	                                                             __");
				System.out.println("  Story..	                                             _     /_ `\\");
				System.out.println("                                                  	   /`_`\\  |/ `-.|");
				System.out.println("  유연한 왕자는 뻣뻣한 마왕을 물리치고 유연한 공주를 무사히 구해옵니다.	  ( / \\ )  \\^_^/");
				System.out.println("  그리고 유연한 행성으로 돌아가서 단팥빵을 먹으며 행복하게 살아갑니다 !	  )\\^_^/( __> <__");
				System.out.println("	                                                 (_.> <._)  '-'  `\\");
				System.out.println("                                                     	/   \\_/   \\        \\");
				System.out.println("");
				System.out.println("     플레이 해주셔서 감사합니다 ! 다음에 또 와주세요 !  :D \n");
				System.out.println("     ( 5초 뒤에 프로그램이 자동 종료가 됩니다. )\n\n\n");
				System.out.println("★***************************************************************************★");
				TimeUnit.SECONDS.sleep(5); // 5초
				
				System.exit(0); // 프로그램 종료
			} catch (InterruptedException e) { System.out.println(" 게임 엔딩 오류 "); }
		}
	}
	
	public void Stage_1() // Stage 1
	{
		try {
			
			Sound("src\\Files\\click.wav"); // 소리 틀기
			clearScreen();
			System.out.println("    ※ 콘솔 창을 최대한 왼쪽에 두시고 오른쪽은 바탕화면이 나오도록 해주세요 ! 오른쪽에 화면이 나옵니다. ※\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ Stage 1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	             ( Stage 1은 스타워즈를 모티브로 만든 맵입니다 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   뻣뻣한 행성으로 떠나고 있는 유연한 왕자는 다스베이더와 클론 트루퍼즈를 만난다.");
			System.out.println("	   자신의 아들 루크 스카이워커가 심부름을 시켜서 슈퍼마켓에 가고 있는 다스 베이더와");
			System.out.println("	   그의 부하들은 짜증난 나머지 지나가는 유연한 왕자를 공격하고 마는데.. \n\n  ");
			System.out.println("	                     # Stage 1 에 나오는 적 정보 # \n");
			System.out.println("	 ● Darth_Vader         -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 공격 속도 : 느림 ");
			System.out.println("	                      # 패시브 : 5초마다 거대 미사일 발사  (지속 시간 3초)\n");
			System.out.println("	 ● Clon                -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 공격 속도 : 느림 \n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	              ( 엔터 키를 입력하시면 5초 카운트가 시작됩니다. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  <  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     / /                           ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 5 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초

			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  <  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     / /                           ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 4 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  <  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     / /                           ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 3 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  <  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     / /                           ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 2 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  <  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     / /                           ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 1 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
		
		} catch (InterruptedException e) { System.out.println(" Stage1 오류 "); }
	}
	
	public void Stage_2() // Stage 2
	{
		try {
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 소리 틀기
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ㅣ");
			System.out.println("     ㅣ    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ㅣ");
			System.out.println("     ㅣ    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ㅣ");
			System.out.println("     ㅣ  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ㅣ");
			System.out.println("     ㅣ/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			TimeUnit.SECONDS.sleep(2); // 2초
			
			Sound("src\\Files\\click.wav"); // 소리 틀기
			clearScreen();
			System.out.println("    ※ 콘솔 창을 최대한 왼쪽에 두시고 오른쪽은 바탕화면이 나오도록 해주세요 ! 오른쪽에 화면이 나옵니다. ※\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ Stage 2 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	             ( Stage 2은 슈퍼 마리오를 모티브로 만든 맵입니다 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   비행기의 연료가 떨어진 유연한 왕자는 근처 행성인 쿠파 행성으로 가게된다.");
			System.out.println("	   하지만 최근 마리오와 싸우느라 쿠파 행성의 연료가 떨어지고있었다... 그런데 유연한 왕자가");
			System.out.println("	   연료를 몰래 챙겨가는 것을 보고 화나간 쿠파와 굼바는 유연한 왕자에게 싸움을 걸어온다. \n\n  ");
			System.out.println("	                     # Stage 2 에 나오는 적 정보 # \n");
			System.out.println("	 ● Goom_ba               -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 이동 속도 : 느림 ");
			System.out.println("	                      # 공격 속도 : 느림 \n");
			System.out.println("	 ● Koo_pa                -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 이동 속도 : 느림 ");
			System.out.println("	                      # 공격 속도 : 보통 ");
			System.out.println("	                      # 패시브 : 3초마다 거대 미사일 발사  (지속 시간 2초)\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	              ( 엔터 키를 입력하시면 5초 카운트가 시작됩니다. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 5 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 4 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 3 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 2 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ___	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 1 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
		
		} catch (InterruptedException e) { System.out.println(" Stage2 오류 "); }
	}
	
	public void Stage_3() // Stage 3
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 소리 틀기
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ㅣ");
			System.out.println("     ㅣ    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ㅣ");
			System.out.println("     ㅣ    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ㅣ");
			System.out.println("     ㅣ  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ㅣ");
			System.out.println("     ㅣ/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			TimeUnit.SECONDS.sleep(2); // 2초
			
			Sound("src\\Files\\click.wav"); // 소리 틀기
			clearScreen();
			System.out.println("    ※ 콘솔 창을 최대한 왼쪽에 두시고 오른쪽은 바탕화면이 나오도록 해주세요 ! 오른쪽에 화면이 나옵니다. ※\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ Stage 3 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	             ( Stage 3은 스폰지밥을 모티브로 만든 맵입니다 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   다람이의 우주선을 훔친 스폰지밥과 뚱이는 즐겁게 우주 여행을 하고 있었다.");
			System.out.println("	   그치만 우주여행을 나온지 23일만에 식량과 물이 떨어져서 스폰지밥과 뚱이는 어쩔줄 몰라하였다.");
			System.out.println("	   마침 지나가는 유연한 왕자를 보고 도둑질을 하기위해 스폰지밥과 뚱이는 유연한 왕자에게 다가갑니다. \n\n  ");
			System.out.println("	                     # Stage 3 에 나오는 적 정보 # \n");
			System.out.println("	 ● Sponge_bob          -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 이동 속도 : 보통 ");
			System.out.println("	                      # 공격 속도 : 보통 ");
			System.out.println("	                      # 패시브 : 스폰지밥 미사일은 거대 함\n");
			System.out.println("	 ● Patrick_Star        -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 공격 속도 : 보통 ");
			System.out.println("	                      # 패시브 : 뚱이 미사일을 맞으면 플레이어 이동 속도 감소\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	              ( 엔터 키를 입력하시면 5초 카운트가 시작됩니다. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   _____	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 5 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   _____	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 4 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   _____	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 3 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   _____	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 2 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   _____	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 1 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
		
		} catch (InterruptedException e) { System.out.println(" Stage3 오류 "); }
	}
	
	public void Stage_4() // Stage 4
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 소리 틀기
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ㅣ");
			System.out.println("     ㅣ    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ㅣ");
			System.out.println("     ㅣ    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ㅣ");
			System.out.println("     ㅣ  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ㅣ");
			System.out.println("     ㅣ/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			TimeUnit.SECONDS.sleep(2); // 2초
			
			Sound("src\\Files\\click.wav"); // 소리 틀기
			clearScreen();
			System.out.println("    ※ 콘솔 창을 최대한 왼쪽에 두시고 오른쪽은 바탕화면이 나오도록 해주세요 ! 오른쪽에 화면이 나옵니다. ※\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ Stage 4 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	             ( Stage 4은 토이스토리를 모티브로 만든 맵입니다 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   지구행성에서는 크리스마스라는 행사가 있었다. 그래서 우디와 버즈의 ");
			System.out.println("	   주인인 앤디가 여행을 떠나자 우디와 버즈도 우주로 여행을 가고있었다.");
			System.out.println("	   우디와 버즈는 길을 물어보기위해 지나가는 유연한 왕자에게 길을 물었다.");
			System.out.println("	   그런데 실수로 유연한 왕자가 버즈의 우주복 헬멧을 열어버렸다.");
			System.out.println("	   화가난 버즈와 우디는 유연한 왕자를 때리기 시작하는데.. \n\n  ");
			System.out.println("	                     # Stage 4 에 나오는 적 정보 # \n");
			System.out.println("	 ● Buzz                 -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 이동 속도 : 보통 ");
			System.out.println("	                      # 공격 속도 : 빠름 ");
			System.out.println("	                      # 패시브 : 5초마다 독 미사일 발사  (지속 시간 3초)\n");
			System.out.println("	 ● Woody                -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 한칸");
			System.out.println("	                      # 공격 속도 : 보통 ");
			System.out.println("	                      # 패시브 : 우디 미사일을 엇갈리게 발사\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	              ( 엔터 키를 입력하시면 5초 카운트가 시작됩니다. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   __ __	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / // /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 5 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   __ __	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / // /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 4 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   __ __	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / // /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 3 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   __ __	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / // /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 2 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   __ __	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / // /	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 1 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
		
		} catch (InterruptedException e) { System.out.println(" Stage4 오류 "); }
	}
	
	public void Stage_5() // Stage 5
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 소리 틀기
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ㅣ");
			System.out.println("     ㅣ    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ㅣ");
			System.out.println("     ㅣ    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ㅣ");
			System.out.println("     ㅣ  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ㅣ");
			System.out.println("     ㅣ/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ㅣ                                                                                                                                                                ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			TimeUnit.SECONDS.sleep(2); // 2초
			
			Sound("src\\Files\\click.wav"); // 소리 틀기
			clearScreen();
			System.out.println("    ※ 콘솔 창을 최대한 왼쪽에 두시고 오른쪽은 바탕화면이 나오도록 해주세요 ! 오른쪽에 화면이 나옵니다. ※\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ Stage 5 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	             ( Stage 5은 도라에몽을 모티브로 만든 맵입니다 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   드디어 뻣뻣한 행성에 도착한 유연한 왕자는 뻣뻣한 마왕을 만납니다.");
			System.out.println("	   뻣뻣한 마왕은 자칭 도라에몽으로 불리고 옆에 유연한 공주가 있었습니다.");
			System.out.println("	   알고보니 유연한 공주가 빵을 잘 만드는 것을 알고, 도라에몽이 좋아하는 ");
			System.out.println("	   단팥빵을 맨날 먹기 위해 유연한 공주를 납치한 것이였습니다.");
			System.out.println("	   유연한 왕자는 유연한 공주를 되찾기 위해 마왕에게 싸움을 겁니다..  \n\n  ");
			System.out.println("	                     # Stage 5 에 나오는 적 정보 # \n");
			System.out.println("	 ● Doraemon            -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 공격 속도 : 빠름 ");
			System.out.println("	                      # 패시브 1: 도라에몽 앞에 도라에몽 쉴드가 두개있다.");
			System.out.println("	                      # 패시브 2: 도라에몽은 미사일을 세 발씩 쏜다. \n");
			System.out.println("	 ● Nojingu             -STATUS-\n");
			System.out.println("	                      # 미사일 데미지 : 체력 반칸");
			System.out.println("	                      # 이동 속도 : 빠름 ");
			System.out.println("	                      # 공격 속도 : 느림 ");
			System.out.println("	                      # 패시브 : 노진구의 미사일을 맞으면 플레이어의 공격속도 감소\n\n");
			System.out.println("	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
			System.out.println("	              ( 엔터 키를 입력하시면 5초 카운트가 시작됩니다. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ______	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 5 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ______	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 4 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ______	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 3 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ______	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 2 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen();
			System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ  	    _____ ______ ___    ______ ______   ______	                                          ㅣ");
			System.out.println("     ㅣ	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ㅣ");
			System.out.println("     ㅣ	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ㅣ");
			System.out.println("     ㅣ	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ㅣ");
			System.out.println("     ㅣ	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ㅣ                                                                                        Start the game in 1 seconds. ㅣ");
			System.out.println("     ㅣ                                                                                                                                                  ㅣ");
			System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
			
			Sound("src\\Files\\CNT.wav"); // 소리 틀기
			TimeUnit.SECONDS.sleep(1); // 1초
		
		} catch (InterruptedException e) { System.out.println(" Stage5 오류 "); }
	}
	
	public static void clearScreen()  // 콘솔 창 지우기
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
}
