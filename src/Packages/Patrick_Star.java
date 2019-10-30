package Packages;

public class Patrick_Star extends Enemy{
	
	int de_player_speed; // 플레이어 스피드 느리게 하기 최소 2까지 
	
	Patrick_Star(int x, int y)
	{
		this.x = x; // 위치
		this.y = y;
		this.missile_Damage = 1; // 미사일 데미지
		this.missile_Speed = 40; // 공격속도
		de_player_speed = 1; // 1씩 깎기
	}
}
