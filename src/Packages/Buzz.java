package Packages;

public class Buzz extends Enemy{
	
	int player_Speed; // 이동속도
	
	boolean P_MS = false; // 독 미사일 
	
	Buzz(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 30; // 공격속도
		player_Speed = 3; // 이동속도 
	}

}
