package day10.static_.singleton;

public class Singleton {
	//싱글톤 - 객체가 1개만 생성되도록 클래스를 설계하는 패턴 ( 디자인 패턴 중 하나)
	
	//1. 나자신의 객체를 1개 생성
	private static Singleton instance = new Singleton();
	
	//2. 객체를 직접 생성할 수 없도록 생성자를 private 선언
	private Singleton() {
		
	}

	
	//3. 외부에서 객체 생성을 요구할 때, getter를 통해서 instance 반환 시킴
	public static Singleton getInstance() {
		return instance;
	}
	
	private String domain = "www.abc.com";
	
	public String getDomain() {
		return domain;
	}
	
	
	
}
