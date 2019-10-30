package Packages;

public class Blue_Flight extends Flight{

	boolean Shield = false; // 스킬 사용 여부
	
	Blue_Flight()
	{
		
		this.player_Hitpoint = 6; // 최초 유닛 체력
		this.player_Speed = 5; // 플레이어 이동속도
		this.missile_Speed = 10; // 미사일 움직임 속도
	}
	
}
