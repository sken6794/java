package day10.static_basic;

public class Init {
	
	public static int price;
	
	static {
		System.out.println("단 한번 실행됨");
		price = 1000;
	}
	
}
