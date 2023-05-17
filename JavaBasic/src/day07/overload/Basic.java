package day07.overload;

public class Basic {
	
	/*
	 * 오버로딩 - 같은 이름의 메소드를 여러개 생성하는 것
	 * 규칙
	 * 1. 메소드의 이름은 똑같다.
	 * 2. 매개변수를 다르게 해서 모형을 다르게 해야한다.
	 * 3. 반환 유형은 오버로딩에 영향을 미치지 않는다.
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력받음");
	}
	
	/* => 반환 유형은 오버로딩에 영향이 없음
	int input(int x) {
		return 0;
	}
	*/
	
	//매개변수의 타입이 다르기 때문에 오버로딩이 가능
	void input(String a) {
		System.out.println("문자열 1개 입력받음");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력받음");
	}
	
	//매개변수의 순서를 바꿔도 오버로딩이 가능
	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 입력받음");
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
	}
}












