package Packages;

public class Doraemon extends Enemy{

	int player_Speed; // �̵��ӵ�
	
	Doraemon(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 2; // �̻��� ������
		this.missile_Speed = 30; // ���ݼӵ�
		player_Speed = 3; // �̵��ӵ� 
	}

}
