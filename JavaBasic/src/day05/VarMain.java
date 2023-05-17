package day05;

public class VarMain {

	public static void main(String[] args) {
		
		//멤버 변수는 접근해서 값 변경이 가능하다.
		//지역 변수는 직접적으로 접근해서 변경이 불가능하다.
		Variable var = new Variable();
		var.a = 3;
		var.b = "ㅎㅇ";
		var.printNum(10);
		
		
	}

}
