package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return이란
		 * 1. 메소드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴 있는 메소드는 다른 메소드의 매개 값으로도 사용이 된다.
		 * 3. 반환 값은 없을 수도 있다. 이 경우 데이터타입 대신 void로 선언한다. 
		 *    => void형 메소드는 return값이 없기 때문에 단순히 호출만 가능하다.
		 * 4. void메소드도 return을 사용할 수 있다.
		 * 	  => 값을 돌려주지는 못하고, 종료의 의미.
		 */
		//System.out.println(add(1,2));
		
		System.out.println(add(add(1,2),add(2,3)));
		
		print();
		
		div(10,2);
		
		noReturn("hello");
		
	}

	static int add(int a, int b) {
		return a + b;
	}
	
	//반환, 매개변수 둘 다 없는 모형
	static void print() {
		System.out.println("반환 값 없이 실행됩니다");
	}
	
	//반환 x, 매개변수 o 인 경우
	static void div(int a, int b) {
		System.out.println(a+ " / "+b+" = " + (a/b));
	}
	
	//void메소드에서 return을 사용하는 경우
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("메소드를 종료합니다.");
			return;
		}
		
		System.out.println("hello를 전달해야 합니다.");
	}
	
	
	
}
