package Packages;

public class Buzz extends Enemy{
	
	int player_Speed; // �̵��ӵ�
	
	boolean P_MS = false; // �� �̻��� 
	
	Buzz(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 1; // �̻��� ������
		this.missile_Speed = 30; // ���ݼӵ�
		player_Speed = 3; // �̵��ӵ� 
	}

}
