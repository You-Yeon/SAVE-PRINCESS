package Packages;

public class Woody extends Enemy{
	
	Woody(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 2; // 미사일 데미지
		this.missile_Speed = 40; // 공격속도
	}

}
