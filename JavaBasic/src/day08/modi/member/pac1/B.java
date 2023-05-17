package day08.modi.member.pac1;

public class B {

	//사용
	A a = new A(); // public
	A a2 = new A(1); // default
	//A a3 = new A("홍길동"); //private, 외부클래스에서 사용 불가 
	
	public B() {
		a.var1 = 2;
		a.var2 = 3;
		//a.var3 => private 접근제한자를 사용했기에 다른 클래스에서 사용 불가
		a.method1();
		a.method2();
		//a.method3(); => private 접근제한자를 사용했기에 다른 클래스에서 사용 불가
	}
	
}
