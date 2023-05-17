package day01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//자바의 입력
		//1. 스캐너 객체 필요
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음.
		System.out.print("이름을 입력하세요 > ");
		String name = scan.next(); //문자열을 받음  //입력을 받을 수 있는 상태
		
		System.out.print("나이 입력 > ");
		int age = scan.nextInt(); //정수를 받음
		
		System.out.print("신장 입력 > ");
		double height = scan.nextDouble(); //실수를 받음
		
		
		//3. 자원해제
		scan.close();
		
		System.out.println("이름 : " + name);
		System.out.println("나이이름 : " + age);
		System.out.println("신장 : " + height);
		
		
		
		
	}

}
