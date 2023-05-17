package day05;

public class Variable {
	
	//int a;
	//a= 10;
	//선언을 하고 따로 초기화 하는것은 안됨, 하지만 선언과 동시게 초기화는 가능함.
	int a = 1;
	String b;
	
	void printNum(int d) {
		
		int c = 1; //지역 변수
		//int c; //지역 변수는 초기화를 하지 않으면 사용할 수 없다 
		
		
		System.out.println("멤버 변수 : "+ a);
		System.out.println("멤버 변수 : "+ b);
		System.out.println("지역 변수 : "+ c);
		System.out.println("지역 변수(매개 변수) : "+ d);//매개 변수는 메소드 사용 시 반드시 전달 되기 때문에 초기화 할 필요가 없다.
	}
	
}
