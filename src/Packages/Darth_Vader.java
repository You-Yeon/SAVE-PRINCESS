package Packages;

public class Darth_Vader extends Enemy{
	
	boolean Big_MS; // �Ŵ� �̻��� ��� ���� 
	
	Darth_Vader (int x, int y)
	{
		this.x = x; // ��ǥ
		this.y = y;
		this.missile_Damage = 1; // �̻��� ������
		this.missile_Speed = 60; // ���ݼӵ�
	}
	
}
