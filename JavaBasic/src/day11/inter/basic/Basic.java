package day11.inter.basic;


// 인터페이스를 상속 받을 때는 implements 키워드를 사용
public class Basic implements Inter1, Inter2{
	
	
	//인터페이스에 있는 추상메소드는 반드시 오버라이드 돼야 한다.
	//인터페이스는 다중상속이 가능.
	@Override
	public void method1() {
		System.out.println("재정의된 1번 메소드 사용");
		
	}
	
	@Override
	public void method2() {
		System.out.println("재정의된 2번 메소드 사용");
		
	}
	
	public void method3() {
		System.out.println("나의 3번 메소드 실행(오버라이드x)");
	}
}
