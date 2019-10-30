package Packages;

public class Doraemon extends Enemy{

	int player_Speed; // 이동속도
	
	Doraemon(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 2; // 미사일 데미지
		this.missile_Speed = 30; // 공격속도
		player_Speed = 3; // 이동속도 
	}

}
