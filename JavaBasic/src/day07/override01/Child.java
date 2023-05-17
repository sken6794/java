package day07.override01;

public class Child extends Parent {
	
	/*
	 * 오버라이딩 규칙
	 * 1. 상속관계를 지녀야 한다.
	 * 2. 부모 메소드와 모형이 같아야 한다.
	 */
	
	void method2() {
		System.out.println("자식의 오버라이드 2번 메소드");
	}
	
}
