package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수 (parameter)
		 * 메소드가 전달 받는 매개값
		 * 여러개 받을 수도 있고, 받지 않을 수도 있다.
		 */
		
		System.out.println("1~30까지 합 = "+calSum(30));
		
		int result = calSum(100);
		System.out.println("1~100까지 합 = "+result);
		
		int result2 = calSum2(10, 100);
		System.out.println("10~100까지의 합 = "+result2);
		
		String result3 = calSum3(3, "나");
		System.out.println(result3);
		System.out.println(calSum3(5, "가"));
		
	}
	
	//1~매개변수 까지의 합계
	static int calSum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//매개변수를 2개 받음
	static int calSum2(int a, int b) {
		
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}

	//간단한 실습 - 정수, 문자열을 전달 받는 String calSum3() 생성
	static String calSum3(int a, String b) {
		
		String str = "";
		for (int i = 1; i <= a; i++) {
			str += b;
		}
		
		
		return str;
	}












}
