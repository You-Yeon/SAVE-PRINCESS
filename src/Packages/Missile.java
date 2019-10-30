package Packages;

class Missile // 미사일 위치 및 이동을 위한 클래스
{
	int x;
	int y;
	
	Missile(int x, int y) // 미사일 좌표를 입력 받는 메소드
	{
		this.x = x;
		this.y = y;
	}
	
	public void move() // 미사일 이동을 위한 메소드
	{
		y -= 20; // y좌표에 20만큼 미사일 이동
	}
	
	public void e_move() // 적 미사일 이동
	{
		y += 20;
	}
}