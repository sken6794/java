package day01;

public class Casting03 {

	public static void main(String[] args) {
		
		char c = 'c';
		int i = 2;
		
		//1. 서로 다른 타입의 연산에서 큰 타입에 맞춰서 형 변환이 일어난다
		char cc = (char) (c + i); // (c+i) = int 형
		
		System.out.println(cc);
		System.out.println("-----------------------------------------------------------------");
		//2. int 형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 100;
		//byte b3 = (b1 + b2); cpu가 8비트 연산을 하지 못해서 int 값으로 변환해서 연산을 하기 때문에 결과값이 int 로 형변환 되어 나온다
		byte b3 = (byte) (b1 + b2);
		
		System.out.println(b3);
		
		System.out.println(((Object)b3).getClass().getName());

		System.out.println("-----------------------------------------------------------------");
		short s1 = 100;
		byte b = 10;
		//int s2 = s1+b; // int 값으로 변수를 받거나 아래 처럼 형변환을 해야함
		short s2 = (short) (s1+b);
		System.out.println(((Object)s2).getClass().getName());
	}

}
