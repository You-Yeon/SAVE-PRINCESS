package Packages;

public class Sponge_bob extends Enemy{
	
	int player_Speed; // �̵��ӵ�
	
	Sponge_bob(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 1; // �̻��� ������
		this.missile_Speed = 40; // ���ݼӵ�
		player_Speed = 3; // �̵��ӵ� 
	}

}
