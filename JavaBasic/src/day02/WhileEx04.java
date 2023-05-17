package day02;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		/*
		 * 입력을 받을 횟수를 지정
		 * 처음 5를 입력 받으면
		 * 5번 입력받을 수 있도록 처리
		 * 
		 * 입력 받은 값들의 합
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반복 수 >");
		int size = scan.nextInt();
		
		int a = 1;
		int sum = 0;
		while(a <= size) {
			
			System.out.print(">");
			int x = scan.nextInt();
			sum += x;
			
			a++;
		}
		
		System.out.println("입력 받은 수의 합계"+sum);
		//System.out.println(a);
		
	}

}
