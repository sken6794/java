package day10.abstract_.good;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		 * 1. 추상메소드를 사용하면 오버라이딩이 강제화 되어서 프로그래머의 오버라이딩 실수를 줄일 수 있다.
		 * 
		 * 2. 객체의 추상화 == 다형성
		 * 		=> 추상클래스는 객체로 생성이 안되기 때문에 자식으로 생성해서 부모타입으로 구체화하여 사용
		 */
		
		//추상클래스는 객체로 생성이 안됨.
		//Store s = new Store();
		
		Store s1 = new SeoulStore();
		s1.apple();
		s1.melon();
		s1.grape();
		s1.orange();
		s1.newMenu();
		
		System.out.println("==================================");	
		
		Store s2 = new BusanStore();
		s2.apple();
		s2.melon();
		s2.grape();
		s2.orange();
		
		
	}

}
