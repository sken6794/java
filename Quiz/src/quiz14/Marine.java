package quiz14;

public class Marine extends Unit {

	private static int attack = 6;
	private static int armor = 0;
	/*
	마린은 attack = 6이고, armor가 0 입니다.
	단, 모든 마린은 똑같은 공격력과 똑같은 방어력을 가져요.

	*/
	
	/*
	마린은 생성될때 좌표는 0, 체력은 60은로 생성됩니다.
	*/	
	public Marine() {
		super(0, 0, 60);
		// TODO Auto-generated constructor stub
	}



	/*
	 * location()의 기능
	 * 마린의 현재위치 x, y의 출력
	 */
	@Override
	public void location() {
		System.out.println("현재 x : "+this.getX() + " 현재 y :"+this.getY());
		
	}

	
	/*
	 * move()의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구한다
	 *    루트 근사값은 Math.sqrt(제곱근)을 이용하면 됩니다
	 *    
	 * 2. 현재 좌표값을 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 * 4. location() 메서드를 호출   
	 */
	@Override
	public void move(int x, int y) {
		
		int re = (int)Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));
		this.setX(x);
		this.setY(y);
		
		System.out.println("이동한 거리: "+re);
		location();
		
	}



	public static int getAttack() {
		return attack;
	}



	public static int getArmor() {
		return armor;
	}
	
	
	
}
