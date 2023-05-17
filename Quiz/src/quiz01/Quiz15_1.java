package quiz01;

import java.util.Scanner;

public class Quiz15_1 { //강사님 버전

	public static void main(String[] args) {
		
		/*
		 * 1. 입력받은 수까지의 소수들의 합 (약수의 개수가 2개인 수) 
		 * 입력 7
		 * => 바깥 반복문은 7까지는 회전
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 > ");
		int num = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			
			count = 0; //초기화 작업
			
			for(int j = 1; j <= i; j++) {
				
				//System.out.println(i + " - "+j);
				//각각의 i값이 소수인지 판별해서 소수라면, sum에 누적하는 코드
				//적절한 시점 초기화...			
				if(i % j == 0) {
					count ++;
				}
			}
			if(count == 2) { //소수를 sum에 누적 
				sum +=i;
			}
			 
			
			
			
		}
		System.out.println(sum);
		
		sc.close();
		
	}
}
