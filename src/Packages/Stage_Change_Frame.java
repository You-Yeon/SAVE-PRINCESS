package Packages;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Stage_Change_Frame extends Default_Frame{
	
	Scanner scan = new Scanner(System.in); // 蝶警 贗楚蝶
	
	Stage_1 st1 = new Stage_1(); // 蝶纔檜雖 1
	Stage_2 st2 = new Stage_2(); // 蝶纔檜雖 2
	Stage_3 st3 = new Stage_3(); // 蝶纔檜雖 3
	Stage_4 st4 = new Stage_4(); // 蝶纔檜雖 4
	Stage_5 st5 = new Stage_5(); // 蝶纔檜雖 5
	
	int player_Hitpoint; // 譆蟾 嶸棉 羹溘
	int player_Speed; // Ы溯檜橫 檜翕樓紫
	int missile_Speed; // 嘐餌橾 遺霜歜 樓紫
	
	public void Stage_Setting(String Flight , int Stage_num)
	{
		// 綠ч晦 撮た
		
		if (Flight.equals("Blue")) // だ嫌
		{
			Blue_Flight BF = new Blue_Flight();
				
			player_Hitpoint = BF.player_Hitpoint;
			player_Speed = BF.player_Speed;
			missile_Speed = BF.missile_Speed;
		}
		else if (Flight.equals("Green")) // 蟾煙
		{
			Green_Flight GF = new Green_Flight();
			
			player_Hitpoint = GF.player_Hitpoint; 
			player_Speed = GF.player_Speed;
			missile_Speed = GF.missile_Speed;				
		}
		else if (Flight.equals("Pink")) // ё觼
		{
			Pink_Flight PF = new Pink_Flight();
			
			player_Hitpoint = PF.player_Hitpoint; 
			player_Speed = PF.player_Speed;
			missile_Speed = PF.missile_Speed;				
		}
		else if (Flight.equals("Yellow"))// 蕃煎辦
		{
			Yellow_Flight YF = new Yellow_Flight();
				
			player_Hitpoint = YF.player_Hitpoint; 
			player_Speed = YF.player_Speed;
			missile_Speed = YF.missile_Speed;				
			
		}
		else // 溯檣爾辦 綠ч晦
		{
			player_Hitpoint = 10;
			player_Speed = 10;
			missile_Speed = 5;
		}
		
		
		// 蝶纔檜雖 撮た
		
		if (Stage_num == 1) // 蝶纔檜雖 1
		{
			Stage_1(); // Stage1 撲貲
			st1.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage1 Start
		}
		else if (Stage_num == 2) // 蝶纔檜雖 2
		{
			Stage_2(); // Stage2 撲貲
			st2.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage2 Start
		}
		else if (Stage_num == 3) // 蝶纔檜雖 3
		{
			Stage_3(); // Stage3 撲貲
			st3.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage3 Start
		}
		else if (Stage_num == 4) //蝶纔檜雖 4
		{
			Stage_4(); // Stage4 撲貲
			st4.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage4 Start
		}
		else if (Stage_num == 5)// 蝶纔檜雖 5
		{
			Stage_5(); // Stage5 撲貲
			st5.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage5 Start
		}
		else // 縛註 
		{
			try {
				Sound("src\\Files\\finish.wav"); // 模葬 ぎ晦
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
				
				System.out.println("≠***************************************************************************≠\n\n\n");
				System.out.println("	                                                             __");
				System.out.println("  Story..	                                             _     /_ `\\");
				System.out.println("                                                  	   /`_`\\  |/ `-.|");
				System.out.println("  嶸翱и 諾濠朝 遙遙и 葆諾擊 僭葬纂堅 嶸翱и 奢輿蒂 鼠餌�� 掘п褫棲棻.	  ( / \\ )  \\^_^/");
				System.out.println("  斜葬堅 嶸翱и ч撩戲煎 給嬴陛憮 欽に誧擊 詳戲貊 ч犒ж啪 髦嬴骨棲棻 !	  )\\^_^/( __> <__");
				System.out.println("	                                                 (_.> <._)  '-'  `\\");
				System.out.println("                                                     	/   \\_/   \\        \\");
				System.out.println("");
				System.out.println("     Ы溯檜 п輿敷憮 馬餌м棲棻 ! 棻擠縑 傳 諦輿撮蹂 !  :D \n");
				System.out.println("     ( 5蟾 菴縑 Щ煎斜極檜 濠翕 謙猿陛 腌棲棻. )\n\n\n");
				System.out.println("≠***************************************************************************≠");
				TimeUnit.SECONDS.sleep(5); // 5蟾
				
				System.exit(0); // Щ煎斜極 謙猿
			} catch (InterruptedException e) { System.out.println(" 啪歜 縛註 螃盟 "); }
		}
	}
	
	public void Stage_1() // Stage 1
	{
		try {
			
			Sound("src\\Files\\click.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("    ≦ 夔樂 璽擊 譆渠и 豭薹縑 舒衛堅 螃艇薹擎 夥鰻�飛橉� 釭螃紫煙 п輿撮蹂 ! 螃艇薹縑 �飛橉� 釭褫棲棻. ≦\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天 Stage 1 天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	             ( Stage 1擎 蝶顫錶鍔蒂 賅じ粽煎 虜萇 裘殮棲棻 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   遙遙и ч撩戲煎 集釭堅 氈朝 嶸翱и 諾濠朝 棻蝶漆檜渦諦 贗煩 お瑞ぷ鍔蒂 虜陪棻.");
			System.out.println("	   濠褐曖 嬴菟 瑞觼 蝶蘋檜錶醴陛 褕睡葷擊 衛麵憮 蓬ぷ葆鰍縑 陛堅 氈朝 棻蝶 漆檜渦諦");
			System.out.println("	   斜曖 睡ж菟擎 瞼隸陪 釭該雖 雖釭陛朝 嶸翱и 諾濠蒂 奢問ж堅 葆朝等.. \n\n  ");
			System.out.println("	                     # Stage 1 縑 釭螃朝 瞳 薑爾 # \n");
			System.out.println("	 ≒ Darth_Vader         -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 奢問 樓紫 : 替葡 ");
			System.out.println("	                      # ぬ衛粽 : 5蟾葆棻 剪渠 嘐餌橾 嫦餌  (雖樓 衛除 3蟾)\n");
			System.out.println("	 ≒ Clon                -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 奢問 樓紫 : 替葡 \n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	              ( 縛攪 酈蒂 殮溘ж衛賊 5蟾 蘋遴お陛 衛濛腌棲棻. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  <  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     / /                           太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / /                            太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 5 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾

			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  <  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     / /                           太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / /                            太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 4 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  <  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     / /                           太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / /                            太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 3 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  <  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     / /                           太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / /                            太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 2 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  <  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     / /                           太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / /                            太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 1 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
		
		} catch (InterruptedException e) { System.out.println(" Stage1 螃盟 "); }
	}
	
	public void Stage_2() // Stage 2
	{
		try {
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ 太");
			System.out.println("     太    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / 太");
			System.out.println("     太    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  太");
			System.out.println("     太  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   太");
			System.out.println("     太/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			TimeUnit.SECONDS.sleep(2); // 2蟾
			
			Sound("src\\Files\\click.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("    ≦ 夔樂 璽擊 譆渠и 豭薹縑 舒衛堅 螃艇薹擎 夥鰻�飛橉� 釭螃紫煙 п輿撮蹂 ! 螃艇薹縑 �飛橉� 釭褫棲棻. ≦\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天 Stage 2 天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	             ( Stage 2擎 蓬ぷ 葆葬螃蒂 賅じ粽煎 虜萇 裘殮棲棻 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   綠ч晦曖 翱猿陛 雲橫霞 嶸翱и 諾濠朝 斬籀 ч撩檣 瓔だ ч撩戲煎 陛啪脹棻.");
			System.out.println("	   ж雖虜 譆斬 葆葬螃諦 諄辦替塭 瓔だ ч撩曖 翱猿陛 雲橫雖堅氈歷棻... 斜楛等 嶸翱и 諾濠陛");
			System.out.println("	   翱猿蒂 路楚 穫啖陛朝 匙擊 爾堅 �韋狐� 瓔だ諦 推夥朝 嶸翱и 諾濠縑啪 諄遺擊 勘橫螞棻. \n\n  ");
			System.out.println("	                     # Stage 2 縑 釭螃朝 瞳 薑爾 # \n");
			System.out.println("	 ≒ Goom_ba               -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 檜翕 樓紫 : 替葡 ");
			System.out.println("	                      # 奢問 樓紫 : 替葡 \n");
			System.out.println("	 ≒ Koo_pa                -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 檜翕 樓紫 : 替葡 ");
			System.out.println("	                      # 奢問 樓紫 : 爾鱔 ");
			System.out.println("	                      # ぬ衛粽 : 3蟾葆棻 剪渠 嘐餌橾 嫦餌  (雖樓 衛除 2蟾)\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	              ( 縛攪 酈蒂 殮溘ж衛賊 5蟾 蘋遴お陛 衛濛腌棲棻. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 5 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 4 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 3 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 2 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ___	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 1 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
		
		} catch (InterruptedException e) { System.out.println(" Stage2 螃盟 "); }
	}
	
	public void Stage_3() // Stage 3
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ 太");
			System.out.println("     太    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / 太");
			System.out.println("     太    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  太");
			System.out.println("     太  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   太");
			System.out.println("     太/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			TimeUnit.SECONDS.sleep(2); // 2蟾
			
			Sound("src\\Files\\click.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("    ≦ 夔樂 璽擊 譆渠и 豭薹縑 舒衛堅 螃艇薹擎 夥鰻�飛橉� 釭螃紫煙 п輿撮蹂 ! 螃艇薹縑 �飛橉� 釭褫棲棻. ≦\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天 Stage 3 天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	             ( Stage 3擎 蝶ア雖嫣擊 賅じ粽煎 虜萇 裘殮棲棻 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   棻塋檜曖 辦輿摹擊 �厊� 蝶ア雖嫣婁 匯檜朝 闌匏啪 辦輿 罹ч擊 ж堅 氈歷棻.");
			System.out.println("	   斜纂虜 辦輿罹ч擊 釭螞雖 23橾虜縑 衝榆婁 僭檜 雲橫螳憮 蝶ア雖嫣婁 匯檜朝 橫聶還 路塭ж艘棻.");
			System.out.println("	   葆藹 雖釭陛朝 嶸翱и 諾濠蒂 爾堅 紫舜韓擊 ж晦嬪п 蝶ア雖嫣婁 匯檜朝 嶸翱и 諾濠縑啪 棻陛骨棲棻. \n\n  ");
			System.out.println("	                     # Stage 3 縑 釭螃朝 瞳 薑爾 # \n");
			System.out.println("	 ≒ Sponge_bob          -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 檜翕 樓紫 : 爾鱔 ");
			System.out.println("	                      # 奢問 樓紫 : 爾鱔 ");
			System.out.println("	                      # ぬ衛粽 : 蝶ア雖嫣 嘐餌橾擎 剪渠 л\n");
			System.out.println("	 ≒ Patrick_Star        -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 奢問 樓紫 : 爾鱔 ");
			System.out.println("	                      # ぬ衛粽 : 匯檜 嘐餌橾擊 蜃戲賊 Ы溯檜橫 檜翕 樓紫 馬模\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	              ( 縛攪 酈蒂 殮溘ж衛賊 5蟾 蘋遴お陛 衛濛腌棲棻. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   _____	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 5 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   _____	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 4 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   _____	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 3 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   _____	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 2 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   _____	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  |__  /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 1 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
		
		} catch (InterruptedException e) { System.out.println(" Stage3 螃盟 "); }
	}
	
	public void Stage_4() // Stage 4
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ 太");
			System.out.println("     太    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / 太");
			System.out.println("     太    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  太");
			System.out.println("     太  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   太");
			System.out.println("     太/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			TimeUnit.SECONDS.sleep(2); // 2蟾
			
			Sound("src\\Files\\click.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("    ≦ 夔樂 璽擊 譆渠и 豭薹縑 舒衛堅 螃艇薹擎 夥鰻�飛橉� 釭螃紫煙 п輿撮蹂 ! 螃艇薹縑 �飛橉� 釭褫棲棻. ≦\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天 Stage 4 天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	             ( Stage 4擎 饜檜蝶饜葬蒂 賅じ粽煎 虜萇 裘殮棲棻 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   雖掘ч撩縑憮朝 觼葬蝶葆蝶塭朝 ч餌陛 氈歷棻. 斜楚憮 辦蛤諦 幗鍔曖 ");
			System.out.println("	   輿檣檣 撻蛤陛 罹ч擊 集釭濠 辦蛤諦 幗鍔紫 辦輿煎 罹ч擊 陛堅氈歷棻.");
			System.out.println("	   辦蛤諦 幗鍔朝 望擊 僭橫爾晦嬪п 雖釭陛朝 嶸翱и 諾濠縑啪 望擊 僭歷棻.");
			System.out.println("	   斜楛等 褒熱煎 嶸翱и 諾濠陛 幗鍔曖 辦輿犒 ⑦訾擊 翮橫幗溜棻.");
			System.out.println("	   �降○� 幗鍔諦 辦蛤朝 嶸翱и 諾濠蒂 陽葬晦 衛濛ж朝等.. \n\n  ");
			System.out.println("	                     # Stage 4 縑 釭螃朝 瞳 薑爾 # \n");
			System.out.println("	 ≒ Buzz                 -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 檜翕 樓紫 : 爾鱔 ");
			System.out.println("	                      # 奢問 樓紫 : 緒葷 ");
			System.out.println("	                      # ぬ衛粽 : 5蟾葆棻 絮 嘐餌橾 嫦餌  (雖樓 衛除 3蟾)\n");
			System.out.println("	 ≒ Woody                -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 и蘊");
			System.out.println("	                      # 奢問 樓紫 : 爾鱔 ");
			System.out.println("	                      # ぬ衛粽 : 辦蛤 嘐餌橾擊 歙陞葬啪 嫦餌\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	              ( 縛攪 酈蒂 殮溘ж衛賊 5蟾 蘋遴お陛 衛濛腌棲棻. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   __ __	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / // /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 5 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   __ __	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / // /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 4 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   __ __	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / // /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 3 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   __ __	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / // /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 2 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   __ __	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / // /	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 1 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
		
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
		
		} catch (InterruptedException e) { System.out.println(" Stage4 螃盟 "); }
	}
	
	public void Stage_5() // Stage 5
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ 太");
			System.out.println("     太    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / 太");
			System.out.println("     太    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  太");
			System.out.println("     太  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   太");
			System.out.println("     太/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     太                                                                                                                                                                太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			TimeUnit.SECONDS.sleep(2); // 2蟾
			
			Sound("src\\Files\\click.wav"); // 模葬 ぎ晦
			clearScreen();
			System.out.println("    ≦ 夔樂 璽擊 譆渠и 豭薹縑 舒衛堅 螃艇薹擎 夥鰻�飛橉� 釭螃紫煙 п輿撮蹂 ! 螃艇薹縑 �飛橉� 釭褫棲棻. ≦\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天 Stage 5 天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	             ( Stage 5擎 紫塭縑跦擊 賅じ粽煎 虜萇 裘殮棲棻 ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   萄蛤橫 遙遙и ч撩縑 紫雜и 嶸翱и 諾濠朝 遙遙и 葆諾擊 虜陶棲棻.");
			System.out.println("	   遙遙и 葆諾擎 濠蘆 紫塭縑跦戲煎 碳葬堅 蕙縑 嶸翱и 奢輿陛 氈歷蝗棲棻.");
			System.out.println("	   憲堅爾棲 嶸翱и 奢輿陛 誧擊 澀 虜萄朝 匙擊 憲堅, 紫塭縑跦檜 謠嬴ж朝 ");
			System.out.println("	   欽に誧擊 裔陳 詳晦 嬪п 嶸翱и 奢輿蒂 陶纂и 匙檜艘蝗棲棻.");
			System.out.println("	   嶸翱и 諾濠朝 嶸翱и 奢輿蒂 腎瓊晦 嬪п 葆諾縑啪 諄遺擊 匏棲棻..  \n\n  ");
			System.out.println("	                     # Stage 5 縑 釭螃朝 瞳 薑爾 # \n");
			System.out.println("	 ≒ Doraemon            -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 奢問 樓紫 : 緒葷 ");
			System.out.println("	                      # ぬ衛粽 1: 紫塭縑跦 擅縑 紫塭縑跦 蔓萄陛 舒偃氈棻.");
			System.out.println("	                      # ぬ衛粽 2: 紫塭縑跦擎 嘐餌橾擊 撮 嫦噶 踢棻. \n");
			System.out.println("	 ≒ Nojingu             -STATUS-\n");
			System.out.println("	                      # 嘐餌橾 等嘐雖 : 羹溘 奩蘊");
			System.out.println("	                      # 檜翕 樓紫 : 緒葷 ");
			System.out.println("	                      # 奢問 樓紫 : 替葡 ");
			System.out.println("	                      # ぬ衛粽 : 喻霞掘曖 嘐餌橾擊 蜃戲賊 Ы溯檜橫曖 奢問樓紫 馬模\n\n");
			System.out.println("	天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天\n");
			System.out.println("	              ( 縛攪 酈蒂 殮溘ж衛賊 5蟾 蘋遴お陛 衛濛腌棲棻. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ______	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / ____/	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 5 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ______	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / ____/	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 4 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ______	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / ____/	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 3 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ______	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / ____/	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 2 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
			
			clearScreen();
			System.out.println("\n\n\n     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太  	    _____ ______ ___    ______ ______   ______	                                          太");
			System.out.println("     太	   / ___//_  __//   |  / ____// ____/  / ____/	                                          太");
			System.out.println("     太	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         太");
			System.out.println("     太	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         太");
			System.out.println("     太	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     太                                                                                        Start the game in 1 seconds. 太");
			System.out.println("     太                                                                                                                                                  太");
			System.out.println("     ≠天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天天≠");
			
			Sound("src\\Files\\CNT.wav"); // 模葬 ぎ晦
			TimeUnit.SECONDS.sleep(1); // 1蟾
		
		} catch (InterruptedException e) { System.out.println(" Stage5 螃盟 "); }
	}
	
	public static void clearScreen()  // 夔樂 璽 雖辦晦
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
}
