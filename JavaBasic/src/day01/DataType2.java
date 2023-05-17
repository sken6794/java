package day01;

public class DataType2 {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 char = 2byte 
		char c1 = 'A';
		char c2 = 65;
		
		//아스키코드 - 미국에서 문자들에 숫자값을 붙임(1byte)
		//유니코드 - 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된 산업 표준(2 byte 부호없는 비트 체계)
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		
		
		char c3 = '가';
		char c4 = 44032; //유니코드 10진수 
		char c5 = '\uAC00'; //유니코드
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		//문자열을 저장할 수 있는 String
		String s1 = "가  "; //공백도 포함된다
		String s2 = "나";
		
		//문자열을 붙일 때 '+' 를 사용
		System.out.println(s1+s2);
		
		//문자와 다른 값에 + 연산 사용 가능
		System.out.println(100+100); //200
		
		System.out.println("100"+100); //문자열에 다른값이 붙으면 문자열이 된다
		System.out.println(100+100+"100"); // 200100
		System.out.println("100"+100+100); // 100100100 문자열이 먼저 나오면 뒤 숫자는 문자열로 취급
		System.out.println(100+100+"100"+100+100); //200100100100 숫자로 취급하다가 문자열 뒤부터는 문자열로 취급
		
		
		//
		System.out.println("A"+10); //A10
		System.out.println('A'+10); //75
		
		
		//형변환 
		//크기가 작은 데이터 타입을 크기가 큰 데이터 타입으로 변환할 때는 
		// 캐스트 연산자를 사용하지 않아도 컴파일러에 의해 자동으로 형 변환이 일어난다
		byte a = 100;
		int b = 1000000;
		System.out.println(a+b);
		
		a = (byte) b;
		System.out.println(a); //64
		
	}

}








