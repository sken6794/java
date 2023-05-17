package day01;

public class Operator02 {

	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 / 3; // 몫
		System.out.println(i); // 2
		
		int j = 7 % 3;
		System.out.println(j); // 1
		
		int k = 7 * 3;
		System.out.println(k); // 21 
		
		
		//비교 연산 <, <=, ==, >=, >, !=
		System.out.println(i == j); //false
		System.out.println(i >= j); //true
		System.out.println(i < j);  //false
		System.out.println(i <= j); //false
		System.out.println(i != j); //true
		System.out.println(21!= k); //false
		System.out.println(k % 2 !=0); //true
		System.out.println(k % 2 ==1); //true
		
		//비트연산자 - 참고용
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); //두 비트가 1이면 1, 아니면 0 >> 0000 0001 = 1
		System.out.println(a | b); //두 비트중 하나만 1이어도 1, 아니면 0 >> 0000 0111 = 7
		System.out.println(a ^ b); //같으면 0 , 다르면 1 >> 0000 0110 = 6
		
		//비트 쉬프트 - 참고용
		int h = 100;
		System.out.println(h << 2); //400 
		
		
		
		
		
	}

}















