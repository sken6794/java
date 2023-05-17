package day10.final_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "발베르데");
		// final 변수는 수정 불가
		//p1.nation = "브라질";
		
		//final 변수는 수정 불가능 하지만 객체마다 다른값으로 초기화 할 수는 있다. => 생성자를 통해
		Person p2 = new Person("234234", "호드리구");
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
		
		//상수의 사용
		System.out.println(Constant.EARTH_RADIUS); 
		
		
		
		
	}

}
