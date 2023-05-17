package day04;

public class MethodEx01 {
	//메서드 안에서는 메서드를 못 만든다. <클래스 안 메서드 밖>,{중괄호 범위 신경 잘 쓰기.}
	
	public static void main(String[] args) { //main 메서드
		
		
		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드안에서 생성 할 수 없습니다.
		 */
		System.out.println("1~10까지의 합 : "+calSum());
		
		int result = calSum();
		System.out.println("1~10까지의 합 : "+ result);
		
		
		String result1 = calSum2();
		System.out.println(calSum2());
		System.out.println(result1);
		
	}
	
	//반환유형 이름()
	static int calSum() { 

		//여기 싹 사용가능
		//1~10까지의 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum; //합계를 반환한다!
		
	}
	
	static String calSum2() {
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
	}
	
	
	
	
	
	
}//

