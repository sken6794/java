package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("ASD-123");
		
		s.takeOff();
		s.fly();
		System.out.println(s.info());
		s.changeMode();
		s.fly();
		s.land();
		System.out.println(s.info());
		
	}

}
