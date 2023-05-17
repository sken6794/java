package day11.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		
		System.out.println("===============================================");
		
		//인터페이스도 데이터타입이 될 수 있다.
		//Inter1 의 기능만
		Inter1 in = new Basic();
		
		System.out.println("===============================================");
		//Inter2 의 기능만
		Inter2 ter = new Basic();
		
		System.out.println("===============================================");
		//인터페이스에서도 클래스 캐스팅을 사용할 수 있다.
		Basic b2 = (Basic)in;
		b2.method1();
		b2.method2();
		b2.method3();
				
		//static 메소드의 사용
		Inter1.method3();
		
		//default 메소드 - 인터페이스에 미리 만들어진 몸체를 가지고 있는 메소드
		b2.method4();
		
	}

}
