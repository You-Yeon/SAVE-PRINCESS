package Packages;

public class Goom_ba extends Enemy{
	
	int player_Speed; // �̵��ӵ�
	
	Goom_ba(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 1; // �̻��� ������
		this.missile_Speed = 60; // ���ݼӵ�
		player_Speed = 3; // �̵��ӵ� 
	}

}
