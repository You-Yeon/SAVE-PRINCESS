package Packages;

public class Patrick_Star extends Enemy{
	
	int de_player_speed; // �÷��̾� ���ǵ� ������ �ϱ� �ּ� 2���� 
	
	Patrick_Star(int x, int y)
	{
		this.x = x; // ��ġ
		this.y = y;
		this.missile_Damage = 1; // �̻��� ������
		this.missile_Speed = 40; // ���ݼӵ�
		de_player_speed = 1; // 1�� ���
	}
}
