package day07.override01;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child  c = new Child();
		p.method1();
		p.method2();
		
		c.method1(); //상속받은 부모 메소드
		c.method2(); //상속받았지만 오버라이드된 메소드
		
		
	}

}
