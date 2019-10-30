package Packages;

public class Clon extends Enemy{
	
	Clon(int x, int y)
	{
		this.x = x; // 좌표 
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 60; // 공격속도 
	}
}
