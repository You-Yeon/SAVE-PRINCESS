package Packages;

class Missile // �̻��� ��ġ �� �̵��� ���� Ŭ����
{
	int x;
	int y;
	
	Missile(int x, int y) // �̻��� ��ǥ�� �Է� �޴� �޼ҵ�
	{
		this.x = x;
		this.y = y;
	}
	
	public void move() // �̻��� �̵��� ���� �޼ҵ�
	{
		y -= 20; // y��ǥ�� 20��ŭ �̻��� �̵�
	}
	
	public void e_move() // �� �̻��� �̵�
	{
		y += 20;
	}
}