package Packages;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.*;

public class Intro_Frame { // ��Ʈ�� Ŭ����
	
	Scanner scan = new Scanner(System.in); // ��ĵ Ŭ����
	String Answer; // �Է� ��
		
	public void Intro() // ��Ʈ�� ȭ��
	{
		
		System.out.println("\n\n\n     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��           _____    ___    _    __    ______           ____     ____     ____    _   __   ______    ______   _____   _____  ��");
		System.out.println("     ��         / ___/   /   |  | |  / /   / ____/          / __ \\   / __ \\   /  _/   / | / /  / ____/   / ____/  / ___/  / ___/  ��");
		System.out.println("     ��         \\__ \\   / /| |  | | / /   / __/            / /_/ /  / /_/ /   / /    /  |/ /  / /       / __/     \\__ \\   \\__ \\   ��");
		System.out.println("     ��       ___/ /  / ___ |  | |/ /   / /___           / ____/  / _, _/  _/ /    / /|  /  / /___    / /___    ___/ /  ___/ /   ��");
		System.out.println("     ��     /____/  /_/  |_|  |___/   /_____/          /_/      /_/ |_|  /___/   /_/ |_/   \\____/   /_____/   /____/  /____/    ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                         1.���� ����                                                                                                                    ��");
		System.out.println("     ��                                                                                                         2.���� ���                                                                                                                    ��");
		System.out.println("     ��                                                                                                         3.���� ����                                                                                                                    ��");
		System.out.println("     ��                                                                                                         4.���� ����                                                                                                                    ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     ��                                                                                                                                                                                                                                              ��");
		System.out.println("     �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ� \n\n\n");
		
		System.out.print("                                           (  1, 2, 3, 4  �߿��� ���� ���ּ���. )\n\n -   ");
		
		Answer = scan.nextLine();

		if (Answer.equals("1")) // ���� ����
		{
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			
			try { // ���� ����
				System.out.println("\n\n                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                      ��                                             1. ���� ������ �����ϼ̽��ϴ�.                          ��");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // �ܼ� â �����
				
				Loading();
				
				clearScreen();
				
				Game_Description(); // ���� ����
				
			} catch (InterruptedException e) {	System.out.println(" ���� ���� ���� "); }
		}
		
		else if (Answer.equals("2")) // ���� ���
		{
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�

			try { // ���� ����
				System.out.println("\n\n                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                      ��                                             2. ���� ����� �����ϼ̽��ϴ�.                          ��");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // �ܼ� â �����
				
				Loading();
				
				clearScreen();
				
				Game_Rules(); // ���� ���
				
			} catch (InterruptedException e) {	System.out.println(" ���� ��� ���� "); }
		}
		
		else if (Answer.equals("3")) // ���� ����
		{
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� 

			try { // ���� ����
				System.out.println("\n\n                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                      ��                                             3. ���� ������ �����ϼ̽��ϴ�.                          ��");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // �ܼ� â �����
				
				Loading();
				
				clearScreen();
				
				Game_Start(); // ���� ����
				
			} catch (InterruptedException e) {	System.out.println(" ���� ���� ���� "); }
		}
		
		else if (Answer.equals("4")) // ���� ����
		{
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ� 

			try { // ���� ����
				System.out.println("\n\n                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                      ��                                             4. ���� ���Ḧ �����ϼ̽��ϴ�.                          ��");
				System.out.println("                      ��                                                                                                                                               ��");
				System.out.println("                           �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
				
				TimeUnit.SECONDS.sleep(2);
				clearScreen(); // �ܼ� â �����
				
				Game_End(); // ���� ����
				
			} catch (InterruptedException e) {	System.out.println(" ���� ���� ���� "); }
		}
		
		else // �׿��� �Է� ���� ���� �Ǵ�
		{
			try {
				
				clearScreen();
				
				System.out.println("�ڡڡ�													�ڡڡ�");
				System.out.println("�ڡڡ�			 �����������									�ڡڡ�");
				System.out.println("�ڡڡ�			�������������	     ______ ____   ____   ____   ____				�ڡڡ�");
				System.out.println("�ڡڡ�			�������������	    / ____// __ \\ / __ \\ / __ \\ / __ \\				�ڡڡ�");
				System.out.println("�ڡڡ�			�������������	   / __/  / /_/ // /_/ // / / // /_/ /				�ڡڡ�");
				System.out.println("�ڡڡ�			�������������	  / /___ / _, _// _, _// /_/ // _, _/ 				�ڡڡ�");
				System.out.println("�ڡڡ�			�������������	 /_____//_/ |_|/_/ |_| \\____//_/ |_|  				�ڡڡ�");
				System.out.println("�ڡڡ�			 ����������� 									�ڡڡ�");
				System.out.println("�ڡڡ�													�ڡڡ�\n\n");
				
				System.out.println("					��  ERROR : �ٽ� �Է��� �ּ���. �� ");
				
				TimeUnit.SECONDS.sleep(3); // 3��
				
				System.out.println("\n\n        3 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1��
				
				System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1��
				
				System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
				TimeUnit.SECONDS.sleep(1); // 1��
	
				clearScreen(); // �ܼ� â �����
			    Intro(); // ��Ʈ�� ȭ�� �ݹ�
		    
			} catch (InterruptedException e) {	System.out.println(" ���� ȭ�� ���� "); }
		}
		
	}
	
	public void Loading() // �ε� ȭ�� �޼ҵ�.
	{
		try {
			String Loading[] = {" ���� ���� �˻� �� .. ", " ���� ���� �˻� �� ... ", " ���� ���� �˻� �� .... ", " ���� ���� �˻� �� . ", " ���� ���� �˻� �� .. ", 
					" ������ �༺ �̼����� ���� .. ", " ������ �༺ �̼����� ���� ... ", " ������ �༺ �̼����� ���� .... ", " ������ �༺ �̼����� ���� . ", " ������ �༺ �̼����� ���� .. ", 
					" �ֹε鿡�� ����ũ �����ϴ� �� .. ", " �ֹε鿡�� ����ũ �����ϴ� �� ... ", " �ֹε鿡�� ����ũ �����ϴ� �� .... ", " �ֹε鿡�� ����ũ �����ϴ� �� . ", " �ֹε鿡�� ����ũ �����ϴ� �� .. ", 
					" �༺ ���� û���� ���� �� .. ", " �༺ ���� û���� ���� �� ... ", " �༺ ���� û���� ���� �� .... ", " �༺ ���� û���� ���� �� . ", " �༺ ���� û���� ���� �� .. ", 
					" �ΰ����� ��ȣ ���� �� .. ", " �ΰ����� ��ȣ ���� �� ... ", " �ΰ����� ��ȣ ���� �� .... ", " �ΰ����� ��ȣ ���� �� . ", " �ΰ����� ��ȣ ���� �� .. "};
			
			String Stars[] = {" �ڡ١١١� �١١١١� �١١١١� �١١١١� �١١١١� ", " �ڡڡ١١� �١١١١� �١١١١� �١١١١� �١١١١� ", " �ڡڡڡ١� �١١١١� �١١١١� �١١١١� �١١١١�", " �ڡڡڡڡ� �١١١١� �١١١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �١١١١� �١١١١� �١١١١� �١١١١� ",  
			        " �ڡڡڡڡ� �ڡ١١١� �١١١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡ١١� �١١١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡ١� �١١١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �١١١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �١١١١� �١١١١� �١١١١� ", 
					" �ڡڡڡڡ� �ڡڡڡڡ� �ڡ١١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡ١١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡ١� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �١١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �١١١١� �١١١١� ", 
			        " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡ١١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡ١١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡ١� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �١١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �١١١١� ",
			        " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡ١١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡ١١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡ١� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� ", " �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� �ڡڡڡڡ� ",};
			
			for ( int i = 0; i < 25 ; i++) // �ε�ȭ�� ����� 
			{
				clearScreen();
				
				System.out.println("	*** *** *** *** *** *** *** *** *** *** *** *** *** \n\n");
				
				System.out.format("	    -*---*--   %s   --*---*-      %n%n%n", Loading[i]);
				System.out.format("		   %s %n%n%n", Stars[i]);
				
				System.out.println("	*** *** *** *** *** *** *** *** *** *** *** *** *** ");
				
				TimeUnit.NANOSECONDS.sleep(200000000); // 0.2��
			}
		
		} catch (InterruptedException e) {	System.out.println(" Loading() ���� "); }
	}
	
	public void Game_Description() // ���� ���� �޼ҵ�.
	{
		try 
		{            
			
			String Story[] = {"	BC ", "87���� ", "CODE ", "- 2000", "0607 ", ": ������ ","�༺��", " ������ ", "���ڿ� ", "������ ", "���ְ�", " �ູ�ϰ� ","��� ", "�־����ϴ�. \n\n",
					"	�׷��� ", "����� ", "CODE ", "- 99999", "999 ", ": ", "������ ", "�༺�� ", "���� ", "������ ", "������ ", "������ ", "���ָ� ", "��ġ�� ", "�����ϴ�.\n\n" ,
					"	�̸� ", "�� ", "������ ", "���ڴ� ", "������ ", "���ָ� ", "��������", "���� ", "���༱�� ", "������ ", "������ ", "�༺���� ", "�����ϴ�.\n\n\n"};
			
		
			System.out.println("			    _____  __                     ");
			System.out.println("			   / ___/ / /_ ____   _____ __  __");
			System.out.println("			   \\__ \\ / __// __ \\ / ___// / / /");
			System.out.println("			  ___/ // /_ / /_/ // /   / /_/ / ");
			System.out.println("			 /____/ \\__/ \\____//_/    \\__, /  ");
			System.out.println("			                         /____/  \n");
			System.out.println("	�ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n\n");
			
			Sound("src\\Files\\write.wav"); // Ŭ�� �Ҹ�
			
			for (int i = 0; i < Story.length; i++) // Ÿ���� ����� �ؽ�Ʈ ���� ���
			{
				TimeUnit.NANOSECONDS.sleep(200000000); // 0.2�� 
				System.out.print(Story[i]);
				if ( i % 15 == 0 )
				{
					Sound("src\\Files\\write.wav"); // Ŭ�� �Ҹ� Ʋ��
				}
			}

			System.out.println("	�ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n");
			
			TimeUnit.SECONDS.sleep(5); // 5��
			
			System.out.println("\n\n        3 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1��
			
			System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1��
			
			System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen(); // �ܼ� â �����
		    Intro(); // ��Ʈ�� ȭ�� �ݹ�
		     
		} catch (InterruptedException e) {	System.out.println(" Game_Description() ���� "); }
	}
	
	public void Game_Rules() // ���� ��� �޼ҵ�.
	{
		try 
		{            
		                                
			System.out.println("			    ____   __  __ __     ______ _____");
			System.out.println("			   / __ \\ / / / // /    / ____// ___/");
			System.out.println("			  / /_/ // / / // /    / __/   \\__ \\ ");
			System.out.println("			 / _, _// /_/ // /___ / /___  ___/ / ");
			System.out.println("			/_/ |_| \\____//_____//_____/ /____/  \n");
			
			System.out.println("	�ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n\n");
			System.out.println("			* ������ �����ϸ� ���༱�� ���ϴ�. *                          \n");
			System.out.println("	  �� Blue Flight         -STATUS-                       \n");
			System.out.println("				������ �ӵ� : ����");
			System.out.println("				��ü�� ��Ʈ : 3��");
			System.out.println("				���̵� �ӵ� : ����");
			System.out.println("				���нú� : 10�ʸ��� ��ȣ ���� ���� (���ӽð� 2��)");
			System.out.println("\n");
			System.out.println("	  �� Green Flight        -STATUS-                       \n");
			System.out.println("				������ �ӵ� : ����");
			System.out.println("				��ü�� ��Ʈ : 2��");
			System.out.println("				���̵� �ӵ� : ����");
			System.out.println("				���нú� : 3�ʸ��� �Ŵ� �̻��� �߻�");
			System.out.println("\n");
			System.out.println("	  �� Pink Flight         -STATUS-                       \n");
			System.out.println("				������ �ӵ� : ����");
			System.out.println("				��ü�� ��Ʈ : 5��");
			System.out.println("				���̵� �ӵ� : ����");
			System.out.println("				���нú� : 5�ʸ��� ü�� ��ĭ�� ȸ�� (�ִ� ��Ʈ 5��)");
			System.out.println("\n");
			System.out.println("	  �� Yellow Flight       -STATUS-                       \n");
			System.out.println("				������ �ӵ� : ����");
			System.out.println("				��ü�� ��Ʈ : 3��");
			System.out.println("				�� �̵� �ӵ� : ����");
			System.out.println("				���нú� : 10�ʸ��� �̻����� �ι߾� �߻� (���ӽð� 3��)");
			System.out.println("\n\n ");
			System.out.println("	�ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n\n");
			TimeUnit.SECONDS.sleep(5); 
			
			System.out.println("      			    			* �̵� *                           \n");
			System.out.println("	  _______ 	         _______ 		 _______ 	         _______");
			System.out.println("	 |\\     /| 	        |\\     /|		|\\     /| 	        |\\     /|");
			System.out.println("	 | +---+ |  	        | +---+ |		| +---+ |  	        | +---+ |");
			System.out.println("	 | | �� | |   	        | | �� | |		| | �� | |   	        | | �� | |");
			System.out.println("	 | +---+ |   	        | +---+ |		| +---+ |   	        | +---+ |");
			System.out.println("	 |/_____\\|  ������ ����Ű 	|/_____\\|  �������� ����Ű   |/_____\\|  ������ ����Ű 	|/_____\\|  ���Ʒ��� ����Ű\n\n");
			System.out.println("				    * ���� *                           \n");
			System.out.println("		 _________________________________________________ ");
			System.out.println("		|\\                                               /|");
			System.out.println("		| +---------------------------------------------+ |");
			System.out.println("		| |                 Space bar                   | |");
			System.out.println("		| +---------------------------------------------+ |");
			System.out.println("		|/_______________________________________________\\|\n");
			System.out.println("				     �� �����̽� ��\n\n");
			System.out.println("		   �� �� 5������������ �ֽ��ϴ�. ���� �����Ͽ� ������ ���ָ� ���ϼ���. ��\n");
			System.out.println("	�ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n");
			
			TimeUnit.SECONDS.sleep(5); // 5��
			
			System.out.println("\n\n        3 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1��
			
			System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1��
			
			System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
			TimeUnit.SECONDS.sleep(1); // 1��
			
			clearScreen(); // �ܼ� â �����
		    Intro(); // ��Ʈ�� ȭ�� �ݹ�
			
		} catch (InterruptedException e) {	System.out.println(" Game_Rules() ���� "); }
	}
	
	public void Game_Start() // ���� ���� �޼ҵ�.
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
		System.out.println("  �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�");
		System.out.println("  ");
		System.out.println("  			���� :  �ȳ��ϼ���.. ������ �༺���� ���ϰ� �ִ� �����Ͼ� �����Դϴ� ! ");
		System.out.println("  				���ڴ��� ž���Ͻ� ����⿡ ���� ������ �Ұ��� �帮�ڽ��ϴ�. ( Enter Ű�� �������� ! )");
		System.out.println("");
		Answer = scan.nextLine();
		
		if (Answer.equals("Boss_is_Doraemon")) // ������ ��� ����. ( * ���κ��� ����� ��� )
		{
			System.out.println("\n\n\n			*** ������ ��带 �����մϴ�. ***\n\n\n");
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			scan.nextLine();
			
			System.out.println("			���� : ��..! �����ڴ��̼̱��� ! �׷��ٸ� Rainbow ����⸦ �帳�ϴ� !\n ");
			System.out.println("				Rainbow ����� : ü�� ��Ʈ�� 5���� ���ݼӵ��� ������ �̵��ӵ��� �����ϴ�. ");
			System.out.println("					              �̻����� ���߾� ��� Ư¡�� �ֽ��ϴ� ! ");
			System.out.println("");
			System.out.println("			                   ���� : ������ �� �����̴ٸ�  ������ �غ��ϼ��� !  :D ");
			System.out.println("");
			System.out.println("");
			System.out.println("  �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n\n");
			
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			scan.nextLine(); 
			
			Stage_Change_Frame frm2 = new Stage_Change_Frame(); // ž���� ������� ������ �������� 1�� ���ڴٴ� ���.
			frm2.Stage_Setting("Rainbow", 1); // ����⸦ �����ְ� ������ �������� �˷��ֱ�.
		}
		else // �Ϲ� ���
		{
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			
			System.out.println("");
			System.out.println("  			Blue ����� : �̵� �ӵ� �߰�, ���� �ӵ� ����, ü�� ��Ʈ�� 3���� ����Ʈ ������Դϴ� !");
			System.out.println("					�׷����� 10�ʸ��� ����Ⱑ �����̵˴ϴ� ! (���ӽð� 2��)");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			
			System.out.println("");
			System.out.println("			Green ����� : �̵� �ӵ��� ������ ü�� ��Ʈ�� 2������ ���� �ӵ��� ���� ���� ������Դϴ� !");
			System.out.println("					���� 3�ʸ��� �Ŵ� �̻����� �߻��ϴ� Ư¡�� �ֽ��ϴ� !");
			System.out.println("");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			
			System.out.println("			Pink ����� : �̵� �ӵ��� ������ ���� �ӵ� ���������� ü�� ��Ʈ�� ���� 5���� ����� �Դϴ� !");
			System.out.println("					�׸��� 5�ʸ��� ü�� ��ĭ�� �ö󰩴ϴ� !");
			System.out.println("");
			scan.nextLine();
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			
			System.out.println("			Yellow ����� : ü�� ��Ʈ�� 3���� ���� �ӵ��� �������� �̵� �ӵ��� ���� ���� ������Դϴ� !");
			System.out.println("					���� 10�ʸ��� �̻����� �ι߾� ��� Ư¡�� �ֽ��ϴ� ! (���ӽð� 3��)");
			System.out.println("");

			scan.nextLine();
			System.out.println("			                   ���� : ������ �� �����̴ٸ�  ������ �غ��ϼ��� !  :D ");
			System.out.println("");
			System.out.println("");
			System.out.println("  �ڤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѡ�\n\n");
			
			Sound("src\\Files\\click.wav"); // Ŭ�� �Ҹ�
			
			System.out.print("                                 ������ ���ڴ�! ž���Ͻ� ����⸦ �������ּ���. (Blue, Green, Pink, Yellow)\n\n -   ");

			Answer = scan.nextLine();
			
			if (Answer.equals("Blue") || Answer.equals("Green") || Answer.equals("Pink") || Answer.equals("Yellow")) 
			{
				Stage_Change_Frame frm2 = new Stage_Change_Frame(); // ž���� ������� ������ �������� 1�� ���ڴٴ� ���.
				frm2.Stage_Setting(Answer, 1); // ����� �� �����ְ� ������ �������� �˷��ֱ�.
			}
			else // ���� ó��
			{
				try {
					
					clearScreen(); // �ܼ� â �����
					
					System.out.println("�ڡڡ�													�ڡڡ�");
					System.out.println("�ڡڡ�			 �����������									�ڡڡ�");
					System.out.println("�ڡڡ�			�������������	     ______ ____   ____   ____   ____				�ڡڡ�");
					System.out.println("�ڡڡ�			�������������	    / ____// __ \\ / __ \\ / __ \\ / __ \\				�ڡڡ�");
					System.out.println("�ڡڡ�			�������������	   / __/  / /_/ // /_/ // / / // /_/ /				�ڡڡ�");
					System.out.println("�ڡڡ�			�������������	  / /___ / _, _// _, _// /_/ // _, _/ 				�ڡڡ�");
					System.out.println("�ڡڡ�			�������������	 /_____//_/ |_|/_/ |_| \\____//_/ |_|  				�ڡڡ�");
					System.out.println("�ڡڡ�			 ����������� 									�ڡڡ�");
					System.out.println("�ڡڡ�													�ڡڡ�\n\n");
					
					System.out.println("					��  ERROR : �ٽ� �Է��� �ּ���. �� ");
					
					TimeUnit.SECONDS.sleep(3); // 3��
					System.out.println("\n\n        3 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1��
					System.out.println("\n\n\n\n        2 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1��
					System.out.println("\n\n\n\n        1 seconds later Returns to the main screen....");
					TimeUnit.SECONDS.sleep(1); // 1��
		
					clearScreen(); // �ܼ� â �����
				    Intro(); // ��Ʈ�� ȭ�� �ݹ�
				    
				} catch (InterruptedException e) {	System.out.println(" ���� ó�� ���� "); }
			
			}
		}
		
	}
	
	public void Game_End() // ���� ����  �޼ҵ�.
	{
   
		System.out.println("�ڡڡ�													�ڡڡ�");
		System.out.println("�ڡڡ�			 �����������	    _____                                    			�ڡڡ�");
		System.out.println("�ڡڡ�			�������������	   / ___/ ___   ___     __  __ ____   __  __ 			�ڡڡ�");
		System.out.println("�ڡڡ�			�������������	   \\__ \\ / _ \\ / _ \\   / / / // __ \\ / / / / 			�ڡڡ�");
		System.out.println("�ڡڡ�			�������������	  ___/ //  __//  __/  / /_/ // /_/ // /_/ /_ 			�ڡڡ�");
		System.out.println("�ڡڡ�			�������������	 /____/ \\___/ \\___/   \\__, / \\____/ \\__,_/(_)			�ڡڡ�");
		System.out.println("�ڡڡ�			�������������	                     /____/                  			�ڡڡ�");
		System.out.println("�ڡڡ�			 ����������� 									�ڡڡ�");
		System.out.println("�ڡڡ�													�ڡڡ�");
		
		System.exit(0); // ���α׷� ����
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
	    	 System.out.println(" Sound(String file) ���� ");
	    }
		
	}
	
	public static void clearScreen()  // �ܼ� â ����� �޼ҵ�
	{
	    for (int i = 0; i < 80; i++)
	      System.out.println("");
	}
	
}
