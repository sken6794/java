package day05;

public class Phone {
	
	String model;
	String color;
	int price;
	
	//생성자를 프로그래머가 직접 생성하게 되면, JVM이 기본 생성자를 자동 생성하지 않는다.
	//생성자는 반환 유형이 없다.
	//역할 - 멤버변수를 초기화하는 용도로 일반적으로 사용
	Phone(){
		System.out.println("생성자 호출됨");
		model = "아이폰";
		color = "Gold";
		price = 10;
	}
	
	
	
	//생성자는 여러 개 선언할 수 있다.
	//단, 매개변수의 종류 혹은 갯수를 달리 해야 한다.
	Phone(String a){
		model = a;
		color = "화이트";
		price = 20000;
	}
	
	Phone(String a, String b){
		model = a;
		color = b;
		price = 20000;
	}
	
	Phone(String a, String b, int c){
		model = a;
		color = b;
		price = c;
	}
	
	void info() {
		System.out.println("===폰 정보===");
		System.out.println("모델 : "+ model);
		System.out.println("색상 : "+ color);
		System.out.println("가격 : "+ price);
	}
	
}
