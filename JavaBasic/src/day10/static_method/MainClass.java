package day10.static_method;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01();
		c.method02(); //static
		
		//static메소드의 사용
		//객체를 생성하지 않아도 사용가능하다.
		Count.method02();
		
		//main과 연관지어 생각, main은 static
		//같은 클래스 내에 static을 붙이지않은 test() 는 MainClass의 객체를 생성해야 사용가능
		//static 키워드를 붙이면 객체를 생성하지 않아도 사용 가능
		MainClass mc = new MainClass();
		mc.test();
		
		
	}
	
	public void test() {
		
	}
	
	
}
