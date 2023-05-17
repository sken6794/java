package day04;


public class MethodEx07 {
		
	public static void main(String[] args) {
		
		//메소드의 연쇄 호출 (동기적 방식)
		//메소드 안에서 메소드를 호출할 수 있음.
		//test01();
		
		//메소드의 재귀
		recursive(1);
		
		System.out.println(fac(5));
		
	}
	
	static void test01() {
		System.out.println("1번 메소드 실행");
		test02();
		System.out.println("1번 메소드 종료");
	}	
	
	static void test02() {

		System.out.println("2번 메소드 실행");

		System.out.println("2번 메소드 종료");
	}

	static void recursive(int a) {
		//함수의 재귀는 반드시 탈출의 조건이 있어야 한다.
		System.out.println("함수 호출 횟수"+ a);
		if(a==10) return; //함수 종료
		System.out.println(a + " 호출");
		a++;
		
		recursive(a);
		
	}

	static int fac(int a) {
		
		if(a == 1) return 1; 
		
		return a * fac(a-1);
	}






}
















