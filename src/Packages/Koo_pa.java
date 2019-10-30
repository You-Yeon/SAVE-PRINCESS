package Packages;

public class Koo_pa extends Enemy{

	int player_Speed; // 이동속도
	boolean Big_MS; // 미사일 사용 여부
	
	Koo_pa(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 40; // 공격속도
		player_Speed = 3; // 이동속도 
	}
	
}
