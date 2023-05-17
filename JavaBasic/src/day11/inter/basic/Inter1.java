package day11.inter.basic;

public interface Inter1 {
	
	//public static final이 생략되어 있는 형태. => 자동 상수취급
	int A = 10;
	
	//public abstract 생략되어 있음  => 메소드를 선언하면 자동으로 추상메소드로 인식한다.
	void method1();
	
	//인터페이스에는 static, default메소드 선언도 가능하다.
	public static void method3() {
		System.out.println("Inter1의 static method");
	}
	
	public default void method4() {
		System.out.println("default method");
	}
	
	
	
}
