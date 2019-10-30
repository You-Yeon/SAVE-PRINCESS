package Packages;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.*;

public class Intro_Frame { // 인트로 클래스
	
	Scanner scan = new Scanner(System.in); // 스캔 클래스
	String Answer; // 입력 값
		
	public void Intro() // 인트로 화면
	{
		
		System.out.println("\n\n\n     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ           _____    ___    _    __    ______           ____     ____     ____    _   __   ______    ______   _____   _____  ㅣ");
		System.out.println("     ㅣ         / ___/   /   |  | |  / /   / ____/          / __ \\   / __ \\   /  _/   / | / /  / ____/   / ____/  / ___/  / ___/  ㅣ");
		System.out.println("     ㅣ         \\__ \\   / /| |  | | / /   / __/            / /_/ /  / /_/ /   / /    /  |/ /  / /       / __/     \\__ \\   \\__ \\   ㅣ");
		System.out.println("     ㅣ       ___/ /  / ___ |  | |/ /   / /___           / ____/  / _, _/  _/ /    / /|  /  / /___    / /___    ___/ /  ___/ /   ㅣ");
		System.out.println("     ㅣ     /____/  /_/  |_|  |___/   /_____/          /_/      /_/ |_|  /___/   /_/ |_/   \\____/   /_____/   /____/  /____/    ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                         1.게임 설명                                                                                                                    ㅣ");
		System.out.println("     ㅣ                                                                                                         2.게임 방법                                                                                                                    ㅣ");
		System.out.println("     ㅣ                                                                                                         3.게임 시작                                                                                                                    ㅣ");
		System.out.println("     ㅣ                                                                                                         4.게임 종료                                                                                                                    ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ㅣ                                                                                                                                                                                                                                              ㅣ");
		System.out.println("     ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★ \n\n\n");
		
		System.out.print("                                           (  1, 2, 3, 4  중에서 선택 해주세요. )\n\n -   ");
		
		Answer = scan.nextLine();

		if (Answer.equals("1")) // 게임 설명
		{
			Sound("src\\Files\\click.wav"); // 클릭 소리
			
			try { // 에러 방지
				System.out.println("\n\n                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                      ㅣ                                             1. 게임 설명을 선택하셨습니다.                          ㅣ");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 콘솔 창 지우기
				
				Loading();
				
				clearScreen();
				
				Game_Description(); // 게임 설명
				
			} catch (InterruptedException e) {	System.out.println(" 게임 설명 오류 "); }
		}
		
		else if (Answer.equals("2")) // 게임 방법
		{
			Sound("src\\Files\\click.wav"); // 클릭 소리

			try { // 에러 방지
				System.out.println("\n\n                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                      ㅣ                                             2. 게임 방법을 선택하셨습니다.                          ㅣ");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 콘솔 창 지우기
				
				Loading();
				
				clearScreen();
				
				Game_Rules(); // 게임 방법
				
			} catch (InterruptedException e) {	System.out.println(" 게임 방법 오류 "); }
		}
		
		else if (Answer.equals("3")) // 게임 시작
		{
			Sound("src\\Files\\click.wav"); // 클릭 소리 

			try { // 에러 방지
				System.out.println("\n\n                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                      ㅣ                                             3. 게임 시작을 선택하셨습니다.                          ㅣ");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 콘솔 창 지우기
				
				Loading();
				
				clearScreen();
				
				Game_Start(); // 게임 시작
				
			} catch (InterruptedException e) {	System.out.println(" 게임 시작 오류 "); }
		}
		
		else if (Answer.equals("4")) // 게임 종료
		{
			Sound("src\\Files\\click.wav"); // 클릭 소리 

			try { // 에러 방지
				System.out.println("\n\n                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                      ㅣ                                             4. 게임 종료를 선택하셨습니다.                          ㅣ");
				System.out.println("                      ㅣ                                                                                                                                               ㅣ");
				System.out.println("                           ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 콘솔 창 지우기
				
				Game_End(); // 게임 종료
				
			} catch (InterruptedException e) {	System.out.println(" 게임 종료 오류 "); }
		}
		
		else // 그외의 입력 값은 에러 판단
		{
			try {
				
				clearScreen();
				
				System.out.println("★★★													★★★");
				System.out.println("★★★			 □□□□□□□□□□									★★★");
				System.out.println("★★★			□□□□■□□■□□□□	     ______ ____   ____   ____   ____				★★★");
				System.out.println("★★★			□□□□■□□■□□□□	    / ____// __ \\ / __ \\ / __ \\ / __ \\				★★★");
				System.out.println("★★★			□□□□□□□□□□□□	   / __/  / /_/ // /_/ // / / // /_/ /				★★★");
				System.out.println("★★★			□□■■■■■■■■□□	  / /___ / _, _// _, _// /_/ // _, _/ 				★★★");
				System.out.println("★★★			□■□□□□□□□□■□	 /_____//_/ |_|/_/ |_| \\____//_/ |_|  				★★★");
				System.out.println("★★★			 □□□□□□□□□□ 									★★★");
				System.out.println("★★★													★★★\n\n");
				
				System.out.println("					※  ERROR : 다시 입력해 주세요. ※ ");
				
				TimeUnit.SECONDS.sleep(3); // 3초
				
				System.out.println("\n\n        3 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1초
				
				System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1초
				
				System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1초
	
				clearScreen(); // 콘솔 창 지우기
			    Intro(); // 인트로 화면 콜백
		    
			} catch (InterruptedException e) {	System.out.println(" 에러 화면 오류 "); }
		}
		
	}
	
	public void Loading() // 로딩 화면 메소드.
	{
		try {
			String Loading[] = {" 우주 날씨 검색 중 .. ", " 우주 날씨 검색 중 ... ", " 우주 날씨 검색 중 .... ", " 우주 날씨 검색 중 . ", " 우주 날씨 검색 중 .. ", 
					" 유연한 행성 미세먼지 많음 .. ", " 유연한 행성 미세먼지 많음 ... ", " 유연한 행성 미세먼지 많음 .... ", " 유연한 행성 미세먼지 많음 . ", " 유연한 행성 미세먼지 많음 .. ", 
					" 주민들에게 마스크 전달하는 중 .. ", " 주민들에게 마스크 전달하는 중 ... ", " 주민들에게 마스크 전달하는 중 .... ", " 주민들에게 마스크 전달하는 중 . ", " 주민들에게 마스크 전달하는 중 .. ", 
					" 행성 공기 청정기 가동 중 .. ", " 행성 공기 청정기 가동 중 ... ", " 행성 공기 청정기 가동 중 .... ", " 행성 공기 청정기 가동 중 . ", " 행성 공기 청정기 가동 중 .. ", 
					" 인공위성 신호 전달 중 .. ", " 인공위성 신호 전달 중 ... ", " 인공위성 신호 전달 중 .... ", " 인공위성 신호 전달 중 . ", " 인공위성 신호 전달 중 .. "};
			
			String Stars[] = {" ★☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆", " ★★★★☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ",  
			        " ★★★★★ ★☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★☆ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ☆☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", 
					" ★★★★★ ★★★★★ ★☆☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★☆☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★☆☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★☆ ☆☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ☆☆☆☆☆ ☆☆☆☆☆ ", 
			        " ★★★★★ ★★★★★ ★★★★★ ★☆☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★☆☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★☆☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★★☆ ☆☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★★★ ☆☆☆☆☆ ",
			        " ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★☆☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★☆☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★★☆☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★★★☆ ", " ★★★★★ ★★★★★ ★★★★★ ★★★★★ ★★★★★ ",};
			
			for ( int i = 0; i < 25 ; i++) // 로딩화면 만들기 
			{
				clearScreen();
				
				System.out.println("	*** *** *** *** *** *** *** *** *** *** *** *** *** \n\n");
				
				System.out.format("	    -*---*--   %s   --*---*-      %n%n%n", Loading[i]);
				System.out.format("		   %s %n%n%n", Stars[i]);
				
				System.out.println("	*** *** *** *** *** *** *** *** *** *** *** *** *** ");
				
				TimeUnit.NANOSECONDS.sleep(200000000); // 0.2초
			}
		
		} catch (InterruptedException e) {	System.out.println(" Loading() 오류 "); }
	}
	
	public void Game_Description() // 게임 설명 메소드.
	{
		try 
		{            
			
			String Story[] = {"	BC ", "87세기 ", "CODE ", "- 2000", "0607 ", ": 유연한 ","행성에", " 유연한 ", "왕자와 ", "유연한 ", "공주가", " 행복하게 ","살고 ", "있었습니다. \n\n",
					"	그런데 ", "어느날 ", "CODE ", "- 99999", "999 ", ": ", "뻣뻣한 ", "행성의 ", "못된 ", "뻣뻣한 ", "마왕이 ", "유연한 ", "공주를 ", "납치해 ", "갔습니다.\n\n" ,
					"	이를 ", "본 ", "유연한 ", "왕자는 ", "유연한 ", "공주를 ", "데려오기", "위해 ", "비행선을 ", "가지고 ", "뻣뻣한 ", "행성으로 ", "떠납니다.\n\n\n"};
			
		
			System.out.println("			    _____  __                     ");
			System.out.println("			   / ___/ / /_ ____   _____ __  __");
			System.out.println("			   \\__ \\ / __// __ \\ / ___// / / /");
			System.out.println("			  ___/ // /_ / /_/ // /   / /_/ / ");
			System.out.println("			 /____/ \\__/ \\____//_/    \\__, /  ");
			System.out.println("			                         /____/  \n");
			System.out.println("	★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n\n");
			
			Sound("src\\Files\\write.wav"); // 클릭 소리
			
			for (int i = 0; i < Story.length; i++) // 타이핑 사운드와 텍스트 동시 출력
			{
				TimeUnit.NANOSECONDS.sleep(200000000); // 0.2초 
				System.out.print(Story[i]);
				if ( i % 15 == 0 )
				{
					Sound("src\\Files\\write.wav"); // 클릭 소리 틀기
				}
			}

			System.out.println("	★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n");
			
			TimeUnit.SECONDS.sleep(5); // 5초
			
			System.out.println("\n\n        3 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1초
			
			System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1초
			
			System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen(); // 콘솔 창 지우기
		    Intro(); // 인트로 화면 콜백
		     
		} catch (InterruptedException e) {	System.out.println(" Game_Description() 오류 "); }
	}
	
	public void Game_Rules() // 게임 방법 메소드.
	{
		try 
		{            
		                                
			System.out.println("			    ____   __  __ __     ______ _____");
			System.out.println("			   / __ \\ / / / // /    / ____// ___/");
			System.out.println("			  / /_/ // / / // /    / __/   \\__ \\ ");
			System.out.println("			 / _, _// /_/ // /___ / /___  ___/ / ");
			System.out.println("			/_/ |_| \\____//_____//_____/ /____/  \n");
			
			System.out.println("	★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n\n");
			System.out.println("			* 게임을 시작하면 비행선을 고릅니다. *                          \n");
			System.out.println("	  ● Blue Flight         -STATUS-                       \n");
			System.out.println("				＃공격 속도 : 보통");
			System.out.println("				＃체력 하트 : 3개");
			System.out.println("				＃이동 속도 : 보통");
			System.out.println("				＃패시브 : 10초마다 보호 쉴드 생성 (지속시간 2초)");
			System.out.println("\n");
			System.out.println("	  ● Green Flight        -STATUS-                       \n");
			System.out.println("				＃공격 속도 : 빠름");
			System.out.println("				＃체력 하트 : 2개");
			System.out.println("				＃이동 속도 : 보통");
			System.out.println("				＃패시브 : 3초마다 거대 미사일 발사");
			System.out.println("\n");
			System.out.println("	  ● Pink Flight         -STATUS-                       \n");
			System.out.println("				＃공격 속도 : 보통");
			System.out.println("				＃체력 하트 : 5개");
			System.out.println("				＃이동 속도 : 느림");
			System.out.println("				＃패시브 : 5초마다 체력 반칸씩 회복 (최대 하트 5개)");
			System.out.println("\n");
			System.out.println("	  ● Yellow Flight       -STATUS-                       \n");
			System.out.println("				＃공격 속도 : 느림");
			System.out.println("				＃체력 하트 : 3개");
			System.out.println("				＃ 이동 속도 : 빠름");
			System.out.println("				＃패시브 : 10초마다 미사일을 두발씩 발사 (지속시간 3초)");
			System.out.println("\n\n ");
			System.out.println("	★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n\n");
			TimeUnit.SECONDS.sleep(5); 
			
			System.out.println("      			    			* 이동 *                           \n");
			System.out.println("	  _______ 	         _______ 		 _______ 	         _______");
			System.out.println("	 |\\     /| 	        |\\     /|		|\\     /| 	        |\\     /|");
			System.out.println("	 | +---+ |  	        | +---+ |		| +---+ |  	        | +---+ |");
			System.out.println("	 | | ← | |   	        | | → | |		| | ↑ | |   	        | | ↓ | |");
			System.out.println("	 | +---+ |   	        | +---+ |		| +---+ |   	        | +---+ |");
			System.out.println("	 |/_____\\|  ＃왼쪽 방향키 	|/_____\\|  ＃오른쪽 방향키   |/_____\\|  ＃위쪽 방향키 	|/_____\\|  ＃아래쪽 방향키\n\n");
			System.out.println("				    * 공격 *                           \n");
			System.out.println("		 _________________________________________________ ");
			System.out.println("		|\\                                               /|");
			System.out.println("		| +---------------------------------------------+ |");
			System.out.println("		| |                 Space bar                   | |");
			System.out.println("		| +---------------------------------------------+ |");
			System.out.println("		|/_______________________________________________\\|\n");
			System.out.println("				     ＃ 스페이스 바\n\n");
			System.out.println("		   ※ 총 5스테이지까지 있습니다. 적을 공격하여 유연한 공주를 구하세요. ※\n");
			System.out.println("	★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n");
			
			TimeUnit.SECONDS.sleep(5); // 5초
			
			System.out.println("\n\n        3 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1초
			
			System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1초
			
			System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1초
			
			clearScreen(); // 콘솔 창 지우기
		    Intro(); // 인트로 화면 콜백
			
		} catch (InterruptedException e) {	System.out.println(" Game_Rules() 오류 "); }
	}
	
	public void Game_Start() // 게임 시작 메소드.
	{
		System.out.println("                       _  _");
        System.out.println("                     ( `   )_                                          	        ____");
        System.out.println("                   (    )    `)                                      	|        | ___\\          /~~~|");
		System.out.println("                 (_   (_ .  _) _)                                      	_:_______|/'(..)`\\_______/  | |");
		System.out.println("                                         _                          	<_|``````  \\__~~__/       ___|_|");
		System.out.println("                                       (  )                         	:\\_____(=========,   ,--\\__|_/");
		System.out.println("         _ .                        ( `  ) . )                         	|       \\       /---'");
		System.out.println("      (  _ )_                      (_, _(  ,_)_)                    	        |     /");
		System.out.println("     (_  _(_ ,)                                                      	        |____/\n");
		System.out.println("  ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★");
		System.out.println("  ");
		System.out.println("  			유엔 :  안녕하세요.. 유연한 행성에서 일하고 있는 엔지니어 유엔입니다 ! ");
		System.out.println("  				왕자님이 탑승하실 비행기에 대해 간단히 소개를 드리겠습니다. ( Enter 키를 누르세요 ! )");
		System.out.println("");
		Answer = scan.nextLine();
		
		if (Answer.equals("Boss_is_Doraemon")) // 개발자 모드 실행. ( * 레인보우 비행기 사용 )
		{
			System.out.println("\n\n\n			*** 개발자 모드를 시작합니다. ***\n\n\n");
			Sound("src\\Files\\click.wav"); // 클릭 소리
			scan.nextLine();
			
			System.out.println("			유엔 : 아..! 개발자님이셨군요 ! 그렇다면 Rainbow 비행기를 드립니다 !\n ");
			System.out.println("				Rainbow 비행기 : 체력 하트가 5개에 공격속도가 빠르고 이동속도도 빠릅니다. ");
			System.out.println("					              미사일을 세발씩 쏘는 특징이 있습니다 ! ");
			System.out.println("");
			System.out.println("			                   유엔 : 내용을 다 읽으셨다면  비행을 준비하세요 !  :D ");
			System.out.println("");
			System.out.println("");
			System.out.println("  ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n\n");
			
			Sound("src\\Files\\click.wav"); // 클릭 소리
			scan.nextLine(); 
			
			Stage_Change_Frame frm2 = new Stage_Change_Frame(); // 탑승할 비행기의 종류와 스테이지 1로 가겠다는 대답.
			frm2.Stage_Setting("Rainbow", 1); // 비행기를 돌려주고 가야할 스테이지 알려주기.
		}
		else // 일반 모드
		{
			Sound("src\\Files\\click.wav"); // 클릭 소리
			
			System.out.println("");
			System.out.println("  			Blue 비행기 : 이동 속도 중간, 공격 속도 보통, 체력 하트가 3개인 디폴트 비행기입니다 !");
			System.out.println("					그렇지만 10초마다 비행기가 무적이됩니다 ! (지속시간 2초)");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // 클릭 소리
			
			System.out.println("");
			System.out.println("			Green 비행기 : 이동 속도가 느리고 체력 하트가 2개지만 공격 속도가 가장 빠른 비행기입니다 !");
			System.out.println("					또한 3초마다 거대 미사일을 발사하는 특징이 있습니다 !");
			System.out.println("");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // 클릭 소리
			
			System.out.println("			Pink 비행기 : 이동 속도가 느리고 공격 속도 보통이지만 체력 하트가 무려 5개인 비행기 입니다 !");
			System.out.println("					그리고 5초마다 체력 반칸씩 올라갑니다 !");
			System.out.println("");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // 클릭 소리
			
			System.out.println("			Yellow 비행기 : 체력 하트가 3개고 공격 속도는 느리지만 이동 속도가 가장 빠른 비행기입니다 !");
			System.out.println("					또한 10초마다 미사일을 두발씩 쏘는 특징이 있습니다 ! (지속시간 3초)");
			System.out.println("");

			scan.nextLine();
			System.out.println("			                   유엔 : 내용을 다 읽으셨다면  비행을 준비하세요 !  :D ");
			System.out.println("");
			System.out.println("");
			System.out.println("  ★ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ★\n\n");
			
			Sound("src\\Files\\click.wav"); // 클릭 소리
			
			System.out.print("                                 유연한 왕자님! 탑승하실 비행기를 선택해주세요. (Blue, Green, Pink, Yellow)\n\n -   ");

			Answer = scan.nextLine();
			
			if (Answer.equals("Blue") || Answer.equals("Green") || Answer.equals("Pink") || Answer.equals("Yellow")) 
			{
				Stage_Change_Frame frm2 = new Stage_Change_Frame(); // 탑승할 비행기의 종류와 스테이지 1로 가겠다는 대답.
				frm2.Stage_Setting(Answer, 1); // 비행기 를 돌려주고 가야할 스테이지 알려주기.
			}
			else // 예외 처리
			{
				try {
					
					clearScreen(); // 콘솔 창 지우기
					
					System.out.println("★★★													★★★");
					System.out.println("★★★			 □□□□□□□□□□									★★★");
					System.out.println("★★★			□□□□■□□■□□□□	     ______ ____   ____   ____   ____				★★★");
					System.out.println("★★★			□□□□■□□■□□□□	    / ____// __ \\ / __ \\ / __ \\ / __ \\				★★★");
					System.out.println("★★★			□□□□□□□□□□□□	   / __/  / /_/ // /_/ // / / // /_/ /				★★★");
					System.out.println("★★★			□□■■■■■■■■□□	  / /___ / _, _// _, _// /_/ // _, _/ 				★★★");
					System.out.println("★★★			□■□□□□□□□□■□	 /_____//_/ |_|/_/ |_| \\____//_/ |_|  				★★★");
					System.out.println("★★★			 □□□□□□□□□□ 									★★★");
					System.out.println("★★★													★★★\n\n");
					
					System.out.println("					※  ERROR : 다시 입력해 주세요. ※ ");
					
					TimeUnit.SECONDS.sleep(3); // 3초
					System.out.println("\n\n        3 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1초
					System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1초
					System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1초
		
					clearScreen(); // 콘솔 창 지우기
				    Intro(); // 인트로 화면 콜백
				    
				} catch (InterruptedException e) {	System.out.println(" 예외 처리 오류 "); }
			
			}
		}
		
	}
	
	public void Game_End() // 게임 종료  메소드.
	{
   
		System.out.println("★★★													★★★");
		System.out.println("★★★			 □□□□□□□□□□	    _____                                    			★★★");
		System.out.println("★★★			□□□□■□□■□□□□	   / ___/ ___   ___     __  __ ____   __  __ 			★★★");
		System.out.println("★★★			□□□□■□□■□□□□	   \\__ \\ / _ \\ / _ \\   / / / // __ \\ / / / / 			★★★");
		System.out.println("★★★			□□□□□□□□□□□□	  ___/ //  __//  __/  / /_/ // /_/ // /_/ /_ 			★★★");
		System.out.println("★★★			□■□□□□□□□□■□	 /____/ \\___/ \\___/   \\__, / \\____/ \\__,_/(_)			★★★");
		System.out.println("★★★			□□■■■■■■■■□□	                     /____/                  			★★★");
		System.out.println("★★★			 □□□□□□□□□□ 									★★★");
		System.out.println("★★★													★★★");
		
		System.exit(0); // 프로그램 종료
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
	    	 System.out.println(" Sound(String file) 오류 ");
	    }
		
	}
	
	public static void clearScreen()  // 콘솔 창 지우는 메소드
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
	
}
