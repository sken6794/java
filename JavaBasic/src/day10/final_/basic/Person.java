package day10.final_.basic;

public class Person {
	
	//final 변수는 반드시 초기화가 되어야 한다.
	// 생성자를 통한 초기화 or 직접 초기화
	public final String nation = "한국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
