package Packages;

public class Darth_Vader extends Enemy{
	
	boolean Big_MS; // 거대 미사일 사용 여부 
	
	Darth_Vader (int x, int y)
	{
		this.x = x; // 좌표
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 60; // 공격속도
	}
	
}
