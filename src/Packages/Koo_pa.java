package Packages;

public class Koo_pa extends Enemy{

	int player_Speed; // �̵��ӵ�
	boolean Big_MS; // �̻��� ��� ����
	
	Koo_pa(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 1; // �̻��� ������
		this.missile_Speed = 40; // ���ݼӵ�
		player_Speed = 3; // �̵��ӵ� 
	}
	
}
