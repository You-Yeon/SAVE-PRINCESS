package Packages;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.*;

public class Intro_Frame { // 檣お煎 贗楚蝶
	
	Scanner scan = new Scanner(System.in); // 蝶警 贗楚蝶
	String Answer; // 殮溘 高
		
	public void Intro() // 檣お煎 �飛�
	{
		
		System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太           _____    ___    _    __    ______           ____     ____     ____    _   __   ______    ______   _____   _____  太");
		System.out.println("     太         / ___/   /   |  | |  / /   / ____/          / __ \\   / __ \\   /  _/   / | / /  / ____/   / ____/  / ___/  / ___/  太");
		System.out.println("     太         \\__ \\   / /| |  | | / /   / __/            / /_/ /  / /_/ /   / /    /  |/ /  / /       / __/     \\__ \\   \\__ \\   太");
		System.out.println("     太       ___/ /  / ___ |  | |/ /   / /___           / ____/  / _, _/  _/ /    / /|  /  / /___    / /___    ___/ /  ___/ /   太");
		System.out.println("     太     /____/  /_/  |_|  |___/   /_____/          /_/      /_/ |_|  /___/   /_/ |_/   \\____/   /_____/   /____/  /____/    太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                         1.啪歜 撲貲                                                                                                                    太");
		System.out.println("     太                                                                                                         2.啪歜 寞徹                                                                                                                    太");
		System.out.println("     太                                                                                                         3.啪歜 衛濛                                                                                                                    太");
		System.out.println("     太                                                                                                         4.啪歜 謙猿                                                                                                                    太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     太                                                                                                                                                                                                                                              太");
		System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠ \n\n\n");
		
		System.out.print("                                           (  1, 2, 3, 4  醞縑憮 摹鷗 п輿撮蹂. )\n\n -   ");
		
		Answer = scan.nextLine();

		if (Answer.equals("1")) // 啪歜 撲貲
		{
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			
			try { // 縑楝 寞雖
				System.out.println("\n\n                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                      太                                             1. 啪歜 撲貲擊 摹鷗ж樟蝗棲棻.                          太");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 夔樂 璽 雖辦晦
				
				Loading();
				
				clearScreen();
				
				Game_Description(); // 啪歜 撲貲
				
			} catch (InterruptedException e) {	System.out.println(" 啪歜 撲貲 螃盟 "); }
		}
		
		else if (Answer.equals("2")) // 啪歜 寞徹
		{
			Sound("src\\Files\\click.wav"); // 贗葛 模葬

			try { // 縑楝 寞雖
				System.out.println("\n\n                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                      太                                             2. 啪歜 寞徹擊 摹鷗ж樟蝗棲棻.                          太");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 夔樂 璽 雖辦晦
				
				Loading();
				
				clearScreen();
				
				Game_Rules(); // 啪歜 寞徹
				
			} catch (InterruptedException e) {	System.out.println(" 啪歜 寞徹 螃盟 "); }
		}
		
		else if (Answer.equals("3")) // 啪歜 衛濛
		{
			Sound("src\\Files\\click.wav"); // 贗葛 模葬 

			try { // 縑楝 寞雖
				System.out.println("\n\n                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                      太                                             3. 啪歜 衛濛擊 摹鷗ж樟蝗棲棻.                          太");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 夔樂 璽 雖辦晦
				
				Loading();
				
				clearScreen();
				
				Game_Start(); // 啪歜 衛濛
				
			} catch (InterruptedException e) {	System.out.println(" 啪歜 衛濛 螃盟 "); }
		}
		
		else if (Answer.equals("4")) // 啪歜 謙猿
		{
			Sound("src\\Files\\click.wav"); // 贗葛 模葬 

			try { // 縑楝 寞雖
				System.out.println("\n\n                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                      太                                             4. 啪歜 謙猿蒂 摹鷗ж樟蝗棲棻.                          太");
				System.out.println("                      太                                                                                                                                               太");
				System.out.println("                           ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // 夔樂 璽 雖辦晦
				
				Game_End(); // 啪歜 謙猿
				
			} catch (InterruptedException e) {	System.out.println(" 啪歜 謙猿 螃盟 "); }
		}
		
		else // 斜諼曖 殮溘 高擎 縑楝 っ欽
		{
			try {
				
				clearScreen();
				
				System.out.println("≠≠≠													≠≠≠");
				System.out.println("≠≠≠			 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤									≠≠≠");
				System.out.println("≠≠≠			﹤﹤﹤﹤﹥﹤﹤﹥﹤﹤﹤﹤	     ______ ____   ____   ____   ____				≠≠≠");
				System.out.println("≠≠≠			﹤﹤﹤﹤﹥﹤﹤﹥﹤﹤﹤﹤	    / ____// __ \\ / __ \\ / __ \\ / __ \\				≠≠≠");
				System.out.println("≠≠≠			﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤	   / __/  / /_/ // /_/ // / / // /_/ /				≠≠≠");
				System.out.println("≠≠≠			﹤﹤﹥﹥﹥﹥﹥﹥﹥﹥﹤﹤	  / /___ / _, _// _, _// /_/ // _, _/ 				≠≠≠");
				System.out.println("≠≠≠			﹤﹥﹤﹤﹤﹤﹤﹤﹤﹤﹥﹤	 /_____//_/ |_|/_/ |_| \\____//_/ |_|  				≠≠≠");
				System.out.println("≠≠≠			 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤ 									≠≠≠");
				System.out.println("≠≠≠													≠≠≠\n\n");
				
				System.out.println("					≦  ERROR : 棻衛 殮溘п 輿撮蹂. ≦ ");
				
				TimeUnit.SECONDS.sleep(3); // 3蟾
				
				System.out.println("\n\n        3 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1蟾
				
				System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1蟾
				
				System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1蟾
	
				clearScreen(); // 夔樂 璽 雖辦晦
			    Intro(); // 檣お煎 �飛� 屬寥
		    
			} catch (InterruptedException e) {	System.out.println(" 縑楝 �飛� 螃盟 "); }
		}
		
	}
	
	public void Loading() // 煎註 �飛� 詭模萄.
	{
		try {
			String Loading[] = {" 辦輿 陳噢 匐儀 醞 .. ", " 辦輿 陳噢 匐儀 醞 ... ", " 辦輿 陳噢 匐儀 醞 .... ", " 辦輿 陳噢 匐儀 醞 . ", " 辦輿 陳噢 匐儀 醞 .. ", 
					" 嶸翱и ч撩 嘐撮試雖 號擠 .. ", " 嶸翱и ч撩 嘐撮試雖 號擠 ... ", " 嶸翱и ч撩 嘐撮試雖 號擠 .... ", " 嶸翱и ч撩 嘐撮試雖 號擠 . ", " 嶸翱и ч撩 嘐撮試雖 號擠 .. ", 
					" 輿團菟縑啪 葆蝶觼 瞪殖ж朝 醞 .. ", " 輿團菟縑啪 葆蝶觼 瞪殖ж朝 醞 ... ", " 輿團菟縑啪 葆蝶觼 瞪殖ж朝 醞 .... ", " 輿團菟縑啪 葆蝶觼 瞪殖ж朝 醞 . ", " 輿團菟縑啪 葆蝶觼 瞪殖ж朝 醞 .. ", 
					" ч撩 奢晦 羶薑晦 陛翕 醞 .. ", " ч撩 奢晦 羶薑晦 陛翕 醞 ... ", " ч撩 奢晦 羶薑晦 陛翕 醞 .... ", " ч撩 奢晦 羶薑晦 陛翕 醞 . ", " ч撩 奢晦 羶薑晦 陛翕 醞 .. ", 
					" 檣奢嬪撩 褐�� 瞪殖 醞 .. ", " 檣奢嬪撩 褐�� 瞪殖 醞 ... ", " 檣奢嬪撩 褐�� 瞪殖 醞 .... ", " 檣奢嬪撩 褐�� 瞪殖 醞 . ", " 檣奢嬪撩 褐�� 瞪殖 醞 .. "};
			
			String Stars[] = {" ≠≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧", " ≠≠≠≠≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ",  
			        " ≠≠≠≠≠ ≠≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≧ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≧≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", 
					" ≠≠≠≠≠ ≠≠≠≠≠ ≠≧≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≧≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≧≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≧ ≧≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≧≧≧≧≧ ≧≧≧≧≧ ", 
			        " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≧≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≧≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≧≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≧ ≧≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≧≧≧≧≧ ",
			        " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≧≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≧≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≧≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≧ ", " ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ≠≠≠≠≠ ",};
			
			for ( int i = 0; i < 25 ; i++) // 煎註�飛� 虜菟晦 
			{
				clearScreen();
				
				System.out.println("	*** *** *** *** *** *** *** *** *** *** *** *** *** \n\n");
				
				System.out.format("	    -*---*--   %s   --*---*-      %n%n%n", Loading[i]);
				System.out.format("		   %s %n%n%n", Stars[i]);
				
				System.out.println("	*** *** *** *** *** *** *** *** *** *** *** *** *** ");
				
				TimeUnit.NANOSECONDS.sleep(200000000); // 0.2蟾
			}
		
		} catch (InterruptedException e) {	System.out.println(" Loading() 螃盟 "); }
	}
	
	public void Game_Description() // 啪歜 撲貲 詭模萄.
	{
		try 
		{            
			
			String Story[] = {"	BC ", "87撮晦 ", "CODE ", "- 2000", "0607 ", ": 嶸翱и ","ч撩縑", " 嶸翱и ", "諾濠諦 ", "嶸翱и ", "奢輿陛", " ч犒ж啪 ","髦堅 ", "氈歷蝗棲棻. \n\n",
					"	斜楛等 ", "橫替陳 ", "CODE ", "- 99999", "999 ", ": ", "遙遙и ", "ч撩曖 ", "跤脹 ", "遙遙и ", "葆諾檜 ", "嶸翱и ", "奢輿蒂 ", "陶纂п ", "鬲蝗棲棻.\n\n" ,
					"	檜蒂 ", "獄 ", "嶸翱и ", "諾濠朝 ", "嶸翱и ", "奢輿蒂 ", "等溥螃晦", "嬪п ", "綠ч摹擊 ", "陛雖堅 ", "遙遙и ", "ч撩戲煎 ", "集陶棲棻.\n\n\n"};
			
		
			System.out.println("			    _____  __                     ");
			System.out.println("			   / ___/ / /_ ____   _____ __  __");
			System.out.println("			   \\__ \\ / __// __ \\ / ___// / / /");
			System.out.println("			  ___/ // /_ / /_/ // /   / /_/ / ");
			System.out.println("			 /____/ \\__/ \\____//_/    \\__, /  ");
			System.out.println("			                         /____/  \n");
			System.out.println("	≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n\n");
			
			Sound("src\\Files\\write.wav"); // 贗葛 模葬
			
			for (int i = 0; i < Story.length; i++) // 顫檜ё 餌遴萄諦 臢蝶お 翕衛 轎溘
			{
				TimeUnit.NANOSECONDS.sleep(200000000); // 0.2蟾 
				System.out.print(Story[i]);
				if ( i % 15 == 0 )
				{
					Sound("src\\Files\\write.wav"); // 贗葛 模葬 ぎ晦
				}
			}

			System.out.println("	≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n");
			
			TimeUnit.SECONDS.sleep(5); // 5蟾
			
			System.out.println("\n\n        3 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen(); // 夔樂 璽 雖辦晦
		    Intro(); // 檣お煎 �飛� 屬寥
		     
		} catch (InterruptedException e) {	System.out.println(" Game_Description() 螃盟 "); }
	}
	
	public void Game_Rules() // 啪歜 寞徹 詭模萄.
	{
		try 
		{            
		                                
			System.out.println("			    ____   __  __ __     ______ _____");
			System.out.println("			   / __ \\ / / / // /    / ____// ___/");
			System.out.println("			  / /_/ // / / // /    / __/   \\__ \\ ");
			System.out.println("			 / _, _// /_/ // /___ / /___  ___/ / ");
			System.out.println("			/_/ |_| \\____//_____//_____/ /____/  \n");
			
			System.out.println("	≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n\n");
			System.out.println("			* 啪歜擊 衛濛ж賊 綠ч摹擊 堅落棲棻. *                          \n");
			System.out.println("	  ≒ Blue Flight         -STATUS-                       \n");
			System.out.println("				ㄒ奢問 樓紫 : 爾鱔");
			System.out.println("				ㄒ羹溘 жお : 3偃");
			System.out.println("				ㄒ檜翕 樓紫 : 爾鱔");
			System.out.println("				ㄒぬ衛粽 : 10蟾葆棻 爾�� 蔓萄 儅撩 (雖樓衛除 2蟾)");
			System.out.println("\n");
			System.out.println("	  ≒ Green Flight        -STATUS-                       \n");
			System.out.println("				ㄒ奢問 樓紫 : 緒葷");
			System.out.println("				ㄒ羹溘 жお : 2偃");
			System.out.println("				ㄒ檜翕 樓紫 : 爾鱔");
			System.out.println("				ㄒぬ衛粽 : 3蟾葆棻 剪渠 嘐餌橾 嫦餌");
			System.out.println("\n");
			System.out.println("	  ≒ Pink Flight         -STATUS-                       \n");
			System.out.println("				ㄒ奢問 樓紫 : 爾鱔");
			System.out.println("				ㄒ羹溘 жお : 5偃");
			System.out.println("				ㄒ檜翕 樓紫 : 替葡");
			System.out.println("				ㄒぬ衛粽 : 5蟾葆棻 羹溘 奩蘊噶 �蛹� (譆渠 жお 5偃)");
			System.out.println("\n");
			System.out.println("	  ≒ Yellow Flight       -STATUS-                       \n");
			System.out.println("				ㄒ奢問 樓紫 : 替葡");
			System.out.println("				ㄒ羹溘 жお : 3偃");
			System.out.println("				ㄒ 檜翕 樓紫 : 緒葷");
			System.out.println("				ㄒぬ衛粽 : 10蟾葆棻 嘐餌橾擊 舒嫦噶 嫦餌 (雖樓衛除 3蟾)");
			System.out.println("\n\n ");
			System.out.println("	≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n\n");
			TimeUnit.SECONDS.sleep(5); 
			
			System.out.println("      			    			* 檜翕 *                           \n");
			System.out.println("	  _______ 	         _______ 		 _______ 	         _______");
			System.out.println("	 |\\     /| 	        |\\     /|		|\\     /| 	        |\\     /|");
			System.out.println("	 | +---+ |  	        | +---+ |		| +---+ |  	        | +---+ |");
			System.out.println("	 | | ∠ | |   	        | | ⊥ | |		| | ∟ | |   	        | | ⊿ | |");
			System.out.println("	 | +---+ |   	        | +---+ |		| +---+ |   	        | +---+ |");
			System.out.println("	 |/_____\\|  ㄒ豭薹 寞щ酈 	|/_____\\|  ㄒ螃艇薹 寞щ酈   |/_____\\|  ㄒ嬪薹 寞щ酈 	|/_____\\|  ㄒ嬴楚薹 寞щ酈\n\n");
			System.out.println("				    * 奢問 *                           \n");
			System.out.println("		 _________________________________________________ ");
			System.out.println("		|\\                                               /|");
			System.out.println("		| +---------------------------------------------+ |");
			System.out.println("		| |                 Space bar                   | |");
			System.out.println("		| +---------------------------------------------+ |");
			System.out.println("		|/_______________________________________________\\|\n");
			System.out.println("				     ㄒ 蝶む檜蝶 夥\n\n");
			System.out.println("		   ≦ 識 5蝶纔檜雖梱雖 氈蝗棲棻. 瞳擊 奢問ж罹 嶸翱и 奢輿蒂 掘ж撮蹂. ≦\n");
			System.out.println("	≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n");
			
			TimeUnit.SECONDS.sleep(5); // 5蟾
			
			System.out.println("\n\n        3 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen(); // 夔樂 璽 雖辦晦
		    Intro(); // 檣お煎 �飛� 屬寥
			
		} catch (InterruptedException e) {	System.out.println(" Game_Rules() 螃盟 "); }
	}
	
	public void Game_Start() // 啪歜 衛濛 詭模萄.
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
		System.out.println("  ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		System.out.println("  ");
		System.out.println("  			嶸縛 :  寰喟ж撮蹂.. 嶸翱и ч撩縑憮 橾ж堅 氈朝 縛雖棲橫 嶸縛殮棲棻 ! ");
		System.out.println("  				諾濠椒檜 鱉蝓ж褒 綠ч晦縑 渠п 除欽�� 模偃蒂 萄葬啊蝗棲棻. ( Enter 酈蒂 援腦撮蹂 ! )");
		System.out.println("");
		Answer = scan.nextLine();
		
		if (Answer.equals("Boss_is_Doraemon")) // 偃嫦濠 賅萄 褒ч. ( * 溯檣爾辦 綠ч晦 餌辨 )
		{
			System.out.println("\n\n\n			*** 偃嫦濠 賅萄蒂 衛濛м棲棻. ***\n\n\n");
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			scan.nextLine();
			
			System.out.println("			嶸縛 : 嬴..! 偃嫦濠椒檜樟捱蹂 ! 斜溢棻賊 Rainbow 綠ч晦蒂 萄董棲棻 !\n ");
			System.out.println("				Rainbow 綠ч晦 : 羹溘 жお陛 5偃縑 奢問樓紫陛 緒腦堅 檜翕樓紫紫 緒落棲棻. ");
			System.out.println("					              嘐餌橾擊 撮嫦噶 踐朝 か癒檜 氈蝗棲棻 ! ");
			System.out.println("");
			System.out.println("			                   嶸縛 : 頂辨擊 棻 檗戲樟棻賊  綠ч擊 遽綠ж撮蹂 !  :D ");
			System.out.println("");
			System.out.println("");
			System.out.println("  ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n\n");
			
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			scan.nextLine(); 
			
			Stage_Change_Frame frm2 = new Stage_Change_Frame(); // 鱉蝓й 綠ч晦曖 謙盟諦 蝶纔檜雖 1煎 陛啊棻朝 渠港.
			frm2.Stage_Setting("Rainbow", 1); // 綠ч晦蒂 給溥輿堅 陛撿й 蝶纔檜雖 憲溥輿晦.
		}
		else // 橾奩 賅萄
		{
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			
			System.out.println("");
			System.out.println("  			Blue 綠ч晦 : 檜翕 樓紫 醞除, 奢問 樓紫 爾鱔, 羹溘 жお陛 3偃檣 蛤ィお 綠ч晦殮棲棻 !");
			System.out.println("					斜溢雖虜 10蟾葆棻 綠ч晦陛 鼠瞳檜腌棲棻 ! (雖樓衛除 2蟾)");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			
			System.out.println("");
			System.out.println("			Green 綠ч晦 : 檜翕 樓紫陛 替葬堅 羹溘 жお陛 2偃雖虜 奢問 樓紫陛 陛濰 緒艇 綠ч晦殮棲棻 !");
			System.out.println("					傳и 3蟾葆棻 剪渠 嘐餌橾擊 嫦餌ж朝 か癒檜 氈蝗棲棻 !");
			System.out.println("");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			
			System.out.println("			Pink 綠ч晦 : 檜翕 樓紫陛 替葬堅 奢問 樓紫 爾鱔檜雖虜 羹溘 жお陛 鼠溥 5偃檣 綠ч晦 殮棲棻 !");
			System.out.println("					斜葬堅 5蟾葆棻 羹溘 奩蘊噶 螢塭骨棲棻 !");
			System.out.println("");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			
			System.out.println("			Yellow 綠ч晦 : 羹溘 жお陛 3偃堅 奢問 樓紫朝 替葬雖虜 檜翕 樓紫陛 陛濰 緒艇 綠ч晦殮棲棻 !");
			System.out.println("					傳и 10蟾葆棻 嘐餌橾擊 舒嫦噶 踐朝 か癒檜 氈蝗棲棻 ! (雖樓衛除 3蟾)");
			System.out.println("");

			scan.nextLine();
			System.out.println("			                   嶸縛 : 頂辨擊 棻 檗戲樟棻賊  綠ч擊 遽綠ж撮蹂 !  :D ");
			System.out.println("");
			System.out.println("");
			System.out.println("  ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠\n\n");
			
			Sound("src\\Files\\click.wav"); // 贗葛 模葬
			
			System.out.print("                                 嶸翱и 諾濠椒! 鱉蝓ж褒 綠ч晦蒂 摹鷗п輿撮蹂. (Blue, Green, Pink, Yellow)\n\n -   ");

			Answer = scan.nextLine();
			
			if (Answer.equals("Blue") || Answer.equals("Green") || Answer.equals("Pink") || Answer.equals("Yellow")) 
			{
				Stage_Change_Frame frm2 = new Stage_Change_Frame(); // 鱉蝓й 綠ч晦曖 謙盟諦 蝶纔檜雖 1煎 陛啊棻朝 渠港.
				frm2.Stage_Setting(Answer, 1); // 綠ч晦 蒂 給溥輿堅 陛撿й 蝶纔檜雖 憲溥輿晦.
			}
			else // 蕨諼 籀葬
			{
				try {
					
					clearScreen(); // 夔樂 璽 雖辦晦
					
					System.out.println("≠≠≠													≠≠≠");
					System.out.println("≠≠≠			 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤									≠≠≠");
					System.out.println("≠≠≠			﹤﹤﹤﹤﹥﹤﹤﹥﹤﹤﹤﹤	     ______ ____   ____   ____   ____				≠≠≠");
					System.out.println("≠≠≠			﹤﹤﹤﹤﹥﹤﹤﹥﹤﹤﹤﹤	    / ____// __ \\ / __ \\ / __ \\ / __ \\				≠≠≠");
					System.out.println("≠≠≠			﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤	   / __/  / /_/ // /_/ // / / // /_/ /				≠≠≠");
					System.out.println("≠≠≠			﹤﹤﹥﹥﹥﹥﹥﹥﹥﹥﹤﹤	  / /___ / _, _// _, _// /_/ // _, _/ 				≠≠≠");
					System.out.println("≠≠≠			﹤﹥﹤﹤﹤﹤﹤﹤﹤﹤﹥﹤	 /_____//_/ |_|/_/ |_| \\____//_/ |_|  				≠≠≠");
					System.out.println("≠≠≠			 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤ 									≠≠≠");
					System.out.println("≠≠≠													≠≠≠\n\n");
					
					System.out.println("					≦  ERROR : 棻衛 殮溘п 輿撮蹂. ≦ ");
					
					TimeUnit.SECONDS.sleep(3); // 3蟾
					System.out.println("\n\n        3 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1蟾
					System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1蟾
					System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1蟾
		
					clearScreen(); // 夔樂 璽 雖辦晦
				    Intro(); // 檣お煎 �飛� 屬寥
				    
				} catch (InterruptedException e) {	System.out.println(" 蕨諼 籀葬 螃盟 "); }
			
			}
		}
		
	}
	
	public void Game_End() // 啪歜 謙猿  詭模萄.
	{
   
		System.out.println("≠≠≠													≠≠≠");
		System.out.println("≠≠≠			 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤	    _____                                    			≠≠≠");
		System.out.println("≠≠≠			﹤﹤﹤﹤﹥﹤﹤﹥﹤﹤﹤﹤	   / ___/ ___   ___     __  __ ____   __  __ 			≠≠≠");
		System.out.println("≠≠≠			﹤﹤﹤﹤﹥﹤﹤﹥﹤﹤﹤﹤	   \\__ \\ / _ \\ / _ \\   / / / // __ \\ / / / / 			≠≠≠");
		System.out.println("≠≠≠			﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤	  ___/ //  __//  __/  / /_/ // /_/ // /_/ /_ 			≠≠≠");
		System.out.println("≠≠≠			﹤﹥﹤﹤﹤﹤﹤﹤﹤﹤﹥﹤	 /____/ \\___/ \\___/   \\__, / \\____/ \\__,_/(_)			≠≠≠");
		System.out.println("≠≠≠			﹤﹤﹥﹥﹥﹥﹥﹥﹥﹥﹤﹤	                     /____/                  			≠≠≠");
		System.out.println("≠≠≠			 ﹤﹤﹤﹤﹤﹤﹤﹤﹤﹤ 									≠≠≠");
		System.out.println("≠≠≠													≠≠≠");
		
		System.exit(0); // Щ煎斜極 謙猿
	}
	
	public void Sound(String file) // 餌遴萄 營儅辨 詭模萄, だ橾擊 嫡嬴萄溥憮 п渡 餌遴萄蒂 營儅м棲棻.
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
	    	 System.out.println(" Sound(String file) 螃盟 ");
	    }
		
	}
	
	public static void clearScreen()  // 夔樂 璽 雖辦朝 詭模萄
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
	
}
