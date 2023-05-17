package day01;

public class Variable {

	public static void main(String[] args) {
		
		/*
		 * 변수의 선언방법
		 * <데이터타입> 변수명;
		 * 
		 * int Integer의 약자로 정수를 저장하는 타입
		 */
		
		int num; //선언
		num = 1; //초기화
		System.out.println(num);
		
		//선언과 초기화를 동시에
		int num2 = 20;
		System.out.println(num2);
		
		//같은 이름으로 변수를 생성할 수 없음(고유함)
		//int num2 = 230;
		
		
		//언제든지 값을 바꿀 수 있음
		num = 2;
		System.out.println(num); //2
		num = 24;
		System.out.println(num); //24
		
		//변수에는 다른 변수의 값 또는 연산한 결과도 저장할 수 있습니다.
		int result = num + num2;
		System.out.println(result); //44
		result = num;
		System.out.println(result); // 24
		
		//문자열 저장
		//int s = "홍길동"; int 는 정수만 가능
		//String 타입 - 문자열을 저장하기 위한 데이터 타입
		String name = "홍길동";
		
		int result2 = num + 20;
		result2 = 100;
		result2 = 10 + result2;
		System.out.println(result2); //110
		
		//변수의 사용 범위(scope)
		//변수는 중괄호 {} 안에서 선언되고 사용된다
		//변수는 선언된 블록 내에서만 사용 가능
		// 블록이 끝나면 메모리상에서 제거 된다
	}

}

















