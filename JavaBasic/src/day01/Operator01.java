package day01;

public class Operator01 {

	public static void main(String[] args) {
		
		//부호연산자 +,-
		int i = -3;
		int j = -i; 
		System.out.println(j); //3
		
		
		//증감연산자 ++, --
		int k = 1;
		int h = ++k; //전위연산 - 먼저 값을 증가시키고, 마지막에 대입
		System.out.println("k는 : "+k); //2
		System.out.println("h는 : "+h ); //2
		
		int x = 1;
		int y = x++; //후위연산 - 대입을 먼저하고, 자신을 증가
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		//일반적인 표현
		x = 1;
		x++;
		
		x = 1;
		System.out.println(++x); //2 증가하고 x값 출력
		System.out.println(x++); //2 이전 x값 출력하고 증가
		System.out.println(x++); //3 앞에서 2출력하고 증가됐기에 3 출력, 현재값은 4
		
		// ~ 연산자
		byte b = 10; // 0000 1010
		System.out.println(b);
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1 ); //10(b)의 보수값이 나옴 = -10 
		
		System.out.println("-----------------------------------------------------------------");
		
		//! 논리연산자 - 부정의 의미
		boolean bool = !true;
		System.out.println(bool); //false
		System.out.println(!bool); //true
		
		
		
	}

}













