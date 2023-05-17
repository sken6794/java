package day10.final_.basic;


public class Child extends Parent{ // final 클래스로 만들면 extends Parent 불가. 
	
	//final 클래스 - 상속 불가
	//final 메소드 - 오버라이드 불가
	
	
	
	
	public void method01() {
		this.method02();
	}
	
	//final method는 오버라이드 할 수 없다.
	//public void method02() {}
	
}
