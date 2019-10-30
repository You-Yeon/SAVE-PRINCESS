package Packages;

public class Goom_ba extends Enemy{
	
	int player_Speed; // 이동속도
	
	Goom_ba(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 60; // 공격속도
		player_Speed = 3; // 이동속도 
	}

}
