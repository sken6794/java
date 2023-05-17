package day08.super_;

public class Child extends Parent{
	

	String me;
	
	//부모님의 기본생성자가 없을 때 해결 2가지 방안
	// 1. 부모님의 기본생성자를 만든다. - 비선호
	// 2. 자식에서 super() 통해서 부모님의 생성자와 강제 연결한다.
	
	Child(String me) {
		super("김자바", "신용권"); //부모 클래스에 있는 생성자를 super를 이용하여 강제 연결
		this.me = me;
	}
}
