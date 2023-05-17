package day11.trycatch;

import java.util.Scanner;

public class TryCatchEx3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("정수 > ");
		int num = sc.nextInt(); // => 엔터 기준 앞까지만 받음
		
		sc.nextLine();
		
		System.out.println("문자열 > ");
		String info = sc.nextLine(); //xxx~엔터 - 엔터를 포함해서 받음
				
		System.out.println(num);
		System.out.println(info);
		*/
		
		while(true) {
			
			
			try {
				System.out.println("");
				int num = sc.nextInt(); //문자 엔터값을 정상적으로 처리 못해서
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				sc.nextLine(); //문자 + 엔터값
			}
		}
		
		
		
	}
	
	
}













