package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
		Marine mar = new Marine();
		mar.location();
		System.out.println("현재 체력 : "+mar.getHp());
		System.out.println("마린 아머 : "+mar.getArmor());
		System.out.println("마린 공격력 : "+mar.getAttack());
		mar.move(5, 5);
		mar.move(3, 4);
		mar.move(7, 8);
	}

}
