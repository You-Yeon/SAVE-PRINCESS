package Packages;

public class Sponge_bob extends Enemy{
	
	int player_Speed; // 이동속도
	
	Sponge_bob(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 40; // 공격속도
		player_Speed = 3; // 이동속도 
	}

}
