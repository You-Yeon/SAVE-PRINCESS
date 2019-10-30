package Packages;

public class Nojingu extends Enemy{

	int player_Speed; // 이동속도
	
	int de_player_speed; // 플레이어 공격 속도 느리게 하기 최소 5까지
	
	Nojingu(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 2; // 미사일 데미지
		this.missile_Speed = 60; // 공격속도
		player_Speed = 5; // 이동속도 
		de_player_speed = 2; //2씩 깎기
	}
}
