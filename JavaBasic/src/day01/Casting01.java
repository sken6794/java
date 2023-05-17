package day01;

public class Casting01 {

	public static void main(String[] args) {
		
		//작은 타입을 큰 타입에 저장할 때는 자동형변환이 일어난다.
		byte a = 10;
		
		
		short s = a; // byte -> short 자동형변환
		int i = a; // byte -> int 자동형변환
		long l = a; // byte -> long 자동형변환
		
		System.out.println(s+i+l); //30
		
		
		//문자와 숫자간에도 유효함
		char c = '가';
		int j = c; //char -> int형 형변환
		System.out.println(j); //44032
		
		int k = 1000;
		double d = k;
		System.out.println(d); //int -> double 형변환
		
		System.out.println(((Object)k).getClass().getName());
		System.out.println(((Object)d).getClass().getName());
	}

}
