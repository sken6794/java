package day01;

public class DataType {

	public static void main(String[] args) {
		
		//정수형 타입 (기본형은 int)
		byte a = 127; //최대크기		
		byte a1 = -128; //최소크기
		System.out.println(a+a1);
		
		short b = 32767; //최대
		short b1 = -32768; //최소
		System.out.println(b+b1);
		
		int c = 2147483647; //최대
		int c1 = -2147483648; //최소
		System.out.println(c+c1);
		
		long d = 1231568432168138475L; // L을 붙여서 롱타입임을 확인
		System.out.println(d);
		//System.out.println(d);
		
		//2진수, 8진수, 16진수
		int bin = 010; //8진수는 앞에 0을 붙임
		System.out.println("8진수 010은 : "+bin + "입니다");
		
		int bin2 = 0b111; //2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은 : "+bin2);
		
		int hexa = 0xa9; //16진수는 앞에 0x를 붙임
		System.out.println("16진수 A9는 : "+hexa);
		
		System.out.println("-------------------------------------------------------------");
		
		//실수형 타입 (기본형은 double)
		float f1 =  3.14F; //F를 붙여 float 임을 구분
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415921581884F; //7자리까지 유효
		double d2 = 3.1415921581884; //15자리까지 유효
		
		System.out.println(f2);
		System.out.println(d2);
		System.out.println("-------------------------------------------------------------");
		
		//논리형 데이터 타입 boolean
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	
	}

}






















