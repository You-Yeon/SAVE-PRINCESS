package Packages;

public class Nojingu extends Enemy{

	int player_Speed; // �̵��ӵ�
	
	int de_player_speed; // �÷��̾� ���� �ӵ� ������ �ϱ� �ּ� 5����
	
	Nojingu(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 2; // �̻��� ������
		this.missile_Speed = 60; // ���ݼӵ�
		player_Speed = 5; // �̵��ӵ� 
		de_player_speed = 2; //2�� ���
	}
}
