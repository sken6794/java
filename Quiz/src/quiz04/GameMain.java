package quiz04;

public class GameMain {

	public static void main(String[] args) {
		
		Warrior war = new Warrior("김자바");
		Wizard wiz = new Wizard("김덕배");
		war.info();
		wiz.info();
		war.bash();
		wiz.iceArrow();
		war.info();
		wiz.info();
		
		
		
	}

}
