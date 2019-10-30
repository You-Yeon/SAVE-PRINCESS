package Packages;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Stage_Change_Frame extends Default_Frame{
	
	Scanner scan = new Scanner(System.in); // ��ĵ Ŭ����
	
	Stage_1 st1 = new Stage_1(); // �������� 1
	Stage_2 st2 = new Stage_2(); // �������� 2
	Stage_3 st3 = new Stage_3(); // �������� 3
	Stage_4 st4 = new Stage_4(); // �������� 4
	Stage_5 st5 = new Stage_5(); // �������� 5
	
	int player_Hitpoint; // ���� ���� ü��
	int player_Speed; // �÷��̾� �̵��ӵ�
	int missile_Speed; // �̻��� ������ �ӵ�
	
	public void Stage_Setting(String Flight , int Stage_num)
	{
		// ����� ����
		
		if (Flight.equals("Blue")) // �Ķ�
		{
			Blue_Flight BF = new Blue_Flight();
				
			player_Hitpoint = BF.player_Hitpoint;
			player_Speed = BF.player_Speed;
			missile_Speed = BF.missile_Speed;
		}
		else if (Flight.equals("Green")) // �ʷ�
		{
			Green_Flight GF = new Green_Flight();
			
			player_Hitpoint = GF.player_Hitpoint; 
			player_Speed = GF.player_Speed;
			missile_Speed = GF.missile_Speed;				
		}
		else if (Flight.equals("Pink")) // ��ũ
		{
			Pink_Flight PF = new Pink_Flight();
			
			player_Hitpoint = PF.player_Hitpoint; 
			player_Speed = PF.player_Speed;
			missile_Speed = PF.missile_Speed;				
		}
		else if (Flight.equals("Yellow"))// ���ο�
		{
			Yellow_Flight YF = new Yellow_Flight();
				
			player_Hitpoint = YF.player_Hitpoint; 
			player_Speed = YF.player_Speed;
			missile_Speed = YF.missile_Speed;				
			
		}
		else // ���κ��� �����
		{
			player_Hitpoint = 10;
			player_Speed = 10;
			missile_Speed = 5;
		}
		
		
		// �������� ����
		
		if (Stage_num == 1) // �������� 1
		{
			Stage_1(); // Stage1 ����
			st1.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage1 Start
		}
		else if (Stage_num == 2) // �������� 2
		{
			Stage_2(); // Stage2 ����
			st2.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage2 Start
		}
		else if (Stage_num == 3) // �������� 3
		{
			Stage_3(); // Stage3 ����
			st3.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage3 Start
		}
		else if (Stage_num == 4) //�������� 4
		{
			Stage_4(); // Stage4 ����
			st4.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage4 Start
		}
		else if (Stage_num == 5)// �������� 5
		{
			Stage_5(); // Stage5 ����
			st5.Game_Start(Flight, player_Hitpoint, player_Speed, missile_Speed); // Stage5 Start
		}
		else // ���� 
		{
			try {
				Sound("src\\Files\\finish.wav"); // �Ҹ� Ʋ��
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
				
				System.out.println("��***************************************************************************��\n\n\n");
				System.out.println("	                                                             __");
				System.out.println("  Story..	                                             _     /_ `\\");
				System.out.println("                                                  	   /`_`\\  |/ `-.|");
				System.out.println("  ������ ���ڴ� ������ ������ ����ġ�� ������ ���ָ� ������ ���ؿɴϴ�.	  ( / \\ )  \\^_^/");
				System.out.println("  �׸��� ������ �༺���� ���ư��� ���ϻ��� ������ �ູ�ϰ� ��ư��ϴ� !	  )\\^_^/( __> <__");
				System.out.println("	                                                 (_.> <._)  '-'  `\\");
				System.out.println("                                                     	/   \\_/   \\        \\");
				System.out.println("");
				System.out.println("     �÷��� ���ּż� �����մϴ� ! ������ �� ���ּ��� !  :D \n");
				System.out.println("     ( 5�� �ڿ� ���α׷��� �ڵ� ���ᰡ �˴ϴ�. )\n\n\n");
				System.out.println("��***************************************************************************��");
				TimeUnit.SECONDS.sleep(5); // 5��
				
				System.exit(0); // ���α׷� ����
			} catch (InterruptedException e) { System.out.println(" ���� ���� ���� "); }
		}
	}
	
	public void Stage_1() // Stage 1
	{
		try {
			
			Sound("src\\Files\\click.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("    �� �ܼ� â�� �ִ��� ���ʿ� �νð� �������� ����ȭ���� �������� ���ּ��� ! �����ʿ� ȭ���� ���ɴϴ�. ��\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� Stage 1 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	             ( Stage 1�� ��Ÿ��� ��Ƽ��� ���� ���Դϴ� ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   ������ �༺���� ������ �ִ� ������ ���ڴ� �ٽ����̴��� Ŭ�� Ʈ����� ������.");
			System.out.println("	   �ڽ��� �Ƶ� ��ũ ��ī�̿�Ŀ�� �ɺθ��� ���Ѽ� ���۸��Ͽ� ���� �ִ� �ٽ� ���̴���");
			System.out.println("	   ���� ���ϵ��� ¥���� ������ �������� ������ ���ڸ� �����ϰ� ���µ�.. \n\n  ");
			System.out.println("	                     # Stage 1 �� ������ �� ���� # \n");
			System.out.println("	 �� Darth_Vader         -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : 5�ʸ��� �Ŵ� �̻��� �߻�  (���� �ð� 3��)\n");
			System.out.println("	 �� Clon                -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # ���� �ӵ� : ���� \n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	              ( ���� Ű�� �Է��Ͻø� 5�� ī��Ʈ�� ���۵˴ϴ�. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  <  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     / /                           ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 5 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��

			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  <  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     / /                           ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 4 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  <  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     / /                           ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 3 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  <  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     / /                           ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 2 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  <  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     / /                           ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / /                            ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /_/                             ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 1 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
		
		} catch (InterruptedException e) { System.out.println(" Stage1 ���� "); }
	}
	
	public void Stage_2() // Stage 2
	{
		try {
			dispose();
			Sound("src\\Files\\Yeah.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ��");
			System.out.println("     ��    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ��");
			System.out.println("     ��    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ��");
			System.out.println("     ��  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ��");
			System.out.println("     ��/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			TimeUnit.SECONDS.sleep(2); // 2��
			
			Sound("src\\Files\\click.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("    �� �ܼ� â�� �ִ��� ���ʿ� �νð� �������� ����ȭ���� �������� ���ּ��� ! �����ʿ� ȭ���� ���ɴϴ�. ��\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� Stage 2 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	             ( Stage 2�� ���� �������� ��Ƽ��� ���� ���Դϴ� ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   ������� ���ᰡ ������ ������ ���ڴ� ��ó �༺�� ���� �༺���� ���Եȴ�.");
			System.out.println("	   ������ �ֱ� �������� �ο���� ���� �༺�� ���ᰡ ���������־���... �׷��� ������ ���ڰ�");
			System.out.println("	   ���Ḧ ���� ì�ܰ��� ���� ���� ȭ���� ���Ŀ� ���ٴ� ������ ���ڿ��� �ο��� �ɾ�´�. \n\n  ");
			System.out.println("	                     # Stage 2 �� ������ �� ���� # \n");
			System.out.println("	 �� Goom_ba               -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # �̵� �ӵ� : ���� ");
			System.out.println("	                      # ���� �ӵ� : ���� \n");
			System.out.println("	 �� Koo_pa                -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # �̵� �ӵ� : ���� ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : 3�ʸ��� �Ŵ� �̻��� �߻�  (���� �ð� 2��)\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	              ( ���� Ű�� �Է��Ͻø� 5�� ī��Ʈ�� ���۵˴ϴ�. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 5 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 4 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 3 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 2 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ___	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__ \\	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/     __/ /                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    / __/                          ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 1 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
		
		} catch (InterruptedException e) { System.out.println(" Stage2 ���� "); }
	}
	
	public void Stage_3() // Stage 3
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ��");
			System.out.println("     ��    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ��");
			System.out.println("     ��    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ��");
			System.out.println("     ��  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ��");
			System.out.println("     ��/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			TimeUnit.SECONDS.sleep(2); // 2��
			
			Sound("src\\Files\\click.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("    �� �ܼ� â�� �ִ��� ���ʿ� �νð� �������� ����ȭ���� �������� ���ּ��� ! �����ʿ� ȭ���� ���ɴϴ�. ��\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� Stage 3 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	             ( Stage 3�� ���������� ��Ƽ��� ���� ���Դϴ� ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   �ٶ����� ���ּ��� ��ģ ��������� ���̴� ��̰� ���� ������ �ϰ� �־���.");
			System.out.println("	   ��ġ�� ���ֿ����� ������ 23�ϸ��� �ķ��� ���� �������� ��������� ���̴� ��¿�� �����Ͽ���.");
			System.out.println("	   ��ħ �������� ������ ���ڸ� ���� �������� �ϱ����� ��������� ���̴� ������ ���ڿ��� �ٰ����ϴ�. \n\n  ");
			System.out.println("	                     # Stage 3 �� ������ �� ���� # \n");
			System.out.println("	 �� Sponge_bob          -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # �̵� �ӵ� : ���� ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : �������� �̻����� �Ŵ� ��\n");
			System.out.println("	 �� Patrick_Star        -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : ���� �̻����� ������ �÷��̾� �̵� �ӵ� ����\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	              ( ���� Ű�� �Է��Ͻø� 5�� ī��Ʈ�� ���۵˴ϴ�. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   _____	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 5 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   _____	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 4 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   _____	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 3 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   _____	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 2 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   _____	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  |__  /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/      /_ <                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___    ___/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/   /____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 1 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
		
		} catch (InterruptedException e) { System.out.println(" Stage3 ���� "); }
	}
	
	public void Stage_4() // Stage 4
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ��");
			System.out.println("     ��    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ��");
			System.out.println("     ��    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ��");
			System.out.println("     ��  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ��");
			System.out.println("     ��/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			TimeUnit.SECONDS.sleep(2); // 2��
			
			Sound("src\\Files\\click.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("    �� �ܼ� â�� �ִ��� ���ʿ� �νð� �������� ����ȭ���� �������� ���ּ��� ! �����ʿ� ȭ���� ���ɴϴ�. ��\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� Stage 4 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	             ( Stage 4�� ���̽��丮�� ��Ƽ��� ���� ���Դϴ� ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   �����༺������ ũ����������� ��簡 �־���. �׷��� ���� ������ ");
			System.out.println("	   ������ �ص� ������ ������ ���� ��� ���ַ� ������ �����־���.");
			System.out.println("	   ���� ����� ���� ��������� �������� ������ ���ڿ��� ���� ������.");
			System.out.println("	   �׷��� �Ǽ��� ������ ���ڰ� ������ ���ֺ� ����� ������ȴ�.");
			System.out.println("	   ȭ���� ����� ���� ������ ���ڸ� ������ �����ϴµ�.. \n\n  ");
			System.out.println("	                     # Stage 4 �� ������ �� ���� # \n");
			System.out.println("	 �� Buzz                 -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # �̵� �ӵ� : ���� ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : 5�ʸ��� �� �̻��� �߻�  (���� �ð� 3��)\n");
			System.out.println("	 �� Woody                -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : ��� �̻����� �������� �߻�\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	              ( ���� Ű�� �Է��Ͻø� 5�� ī��Ʈ�� ���۵˴ϴ�. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   __ __	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / // /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 5 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   __ __	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / // /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 4 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   __ __	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / // /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 3 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   __ __	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / // /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 2 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   __ __	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / // /	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    / // /_                        ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   /__  __/                        ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/     /_/                           ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 1 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
		
		} catch (InterruptedException e) { System.out.println(" Stage4 ���� "); }
	}
	
	public void Stage_5() // Stage 5
	{
		try {
			
			dispose();
			Sound("src\\Files\\Yeah.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��      _____ ______ ___    ______ ______   ______ __     ______ ___     ____     __ ��");
			System.out.println("     ��    / ___//_  __//   |  / ____// ____/  / ____// /    / ____//   |   / __ \\   / / ��");
			System.out.println("     ��    \\__ \\  / /  / /| | / / __ / __/    / /    / /    / __/  / /| |  / /_/ /  / /  ��");
			System.out.println("     ��  ___/ / / /  / ___ |/ /_/ // /___   / /___ / /___ / /___ / ___ | / _, _/  /_/   ��");
			System.out.println("     ��/____/ /_/  /_/  |_|\\____//_____/   \\____//_____//_____//_/  |_|/_/ |_|  (_)    ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     ��                                                                                                                                                                ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			TimeUnit.SECONDS.sleep(2); // 2��
			
			Sound("src\\Files\\click.wav"); // �Ҹ� Ʋ��
			clearScreen();
			System.out.println("    �� �ܼ� â�� �ִ��� ���ʿ� �νð� �������� ����ȭ���� �������� ���ּ��� ! �����ʿ� ȭ���� ���ɴϴ�. ��\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� Stage 5 �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	             ( Stage 5�� ���󿡸��� ��Ƽ��� ���� ���Դϴ� ! )\n");
			System.out.println("	 Story.. \n");
			System.out.println("	   ���� ������ �༺�� ������ ������ ���ڴ� ������ ������ �����ϴ�.");
			System.out.println("	   ������ ������ ��Ī ���󿡸����� �Ҹ��� ���� ������ ���ְ� �־����ϴ�.");
			System.out.println("	   �˰��� ������ ���ְ� ���� �� ����� ���� �˰�, ���󿡸��� �����ϴ� ");
			System.out.println("	   ���ϻ��� �ǳ� �Ա� ���� ������ ���ָ� ��ġ�� ���̿����ϴ�.");
			System.out.println("	   ������ ���ڴ� ������ ���ָ� ��ã�� ���� ���տ��� �ο��� �̴ϴ�..  \n\n  ");
			System.out.println("	                     # Stage 5 �� ������ �� ���� # \n");
			System.out.println("	 �� Doraemon            -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� 1: ���󿡸� �տ� ���󿡸� ���尡 �ΰ��ִ�.");
			System.out.println("	                      # �нú� 2: ���󿡸��� �̻����� �� �߾� ���. \n");
			System.out.println("	 �� Nojingu             -STATUS-\n");
			System.out.println("	                      # �̻��� ������ : ü�� ��ĭ");
			System.out.println("	                      # �̵� �ӵ� : ���� ");
			System.out.println("	                      # ���� �ӵ� : ���� ");
			System.out.println("	                      # �нú� : �������� �̻����� ������ �÷��̾��� ���ݼӵ� ����\n\n");
			System.out.println("	�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�\n");
			System.out.println("	              ( ���� Ű�� �Է��Ͻø� 5�� ī��Ʈ�� ���۵˴ϴ�. )");
			scan.nextLine();
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ______	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 5 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ______	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 4 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ______	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 3 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ______	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 2 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen();
			System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��  	    _____ ______ ___    ______ ______   ______	                                          ��");
			System.out.println("     ��	   / ___//_  __//   |  / ____// ____/  / ____/	                                          ��");
			System.out.println("     ��	   \\__ \\  / /  / /| | / / __ / __/    /___ \\                         ��");
			System.out.println("     ��	  ___/ / / /  / ___ |/ /_/ // /___   ____/ /                         ��");
			System.out.println("     ��	 /____/ /_/  /_/  |_|\\____//_____/  /_____/                          ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     ��                                                                                        Start the game in 1 seconds. ��");
			System.out.println("     ��                                                                                                                                                  ��");
			System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
			
			Sound("src\\Files\\CNT.wav"); // �Ҹ� Ʋ��
			TimeUnit.SECONDS.sleep(1); // 1��
		
		} catch (InterruptedException e) { System.out.println(" Stage5 ���� "); }
	}
	
	public static void clearScreen()  // �ܼ� â �����
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
}
