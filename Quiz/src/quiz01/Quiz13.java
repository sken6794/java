package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력.
		for (int i = 7; i <= 100; i++) {
			if(i%7==0) {
				System.out.print(i+" ");
			}
		}
		/*
		 * for (int i = 7; i <= 100; i+=7) { i를 7씩 증가 시켜도 7의 배수를 구할 수 있다
		 * 		System.out.print(i+" ");
		 * }
		 */
		
		System.out.println();
		
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if(i%9==0) {
				count ++;
			}
		}
		System.out.println("9의 배수 개수"+count);
		
		//3. 100~50사이의 두 수 사이의 합
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50~100까지 합 = "+ sum );
		
		//4. A~Z 까지 가로로 붙여서 출력, A=65, Z=90
		
		for (int i = 65; i <= 90; i++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
		
		//조건문에 char 값으로 넣어도 가능하다.
		for(char c = 'A'; c<= 'Z'; c++) {
			
		}
		
		//문자열에 char 형식을 붙여서 문자열로 변환된 char형을 출력할 수도 있다.
		String str = "";
		for (char i = 'A'; i <= 'Z'; i++) {
			str += i+" ";
		}
		System.out.println(str);
		
		
		
		
		//5. 입력받은 정수까지 팩토리얼 n! ex) n*n-1....* 1
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int d = 1;
		for (int i = 1; i <= num; i++) {
			d *= i;
		}
		System.out.println(num+"의 팩토리얼 = "+d);
		sc.close();
	}

}
