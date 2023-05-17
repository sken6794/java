package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	
	//사용
	A a = new A(); // public, 다른 패키지에서도 사용 가능
	//A a2 = new A(1); // default, 같은 패지키에서만
	//A a3 = new A("홍길동"); //private

	public C() {
		a.var1 = 2;
		//a.var2 = 3; // default 접근제한자가 있어 다른 패키지에서 사용 불가
		//a.var3 => private 접근제한자를 사용했기에 다른 클래스에서 사용 불가
		a.method1();
		//a.method2(); // default 접근제한자가 있어 다른 패키지에서 사용 불가
		//a.method3(); => private 접근제한자를 사용했기에 다른 클래스에서 사용 불가
	}
}
