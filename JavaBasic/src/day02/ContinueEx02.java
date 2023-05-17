package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		//continue의 활용?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 > ");
		int num = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		x:for(int i = 1; i <= num; i++) {
			
			count = 0; //초기화 작업
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count ++;
				}
				
				if(count > 2) continue x; //약수 개수가 2개 초과라면 다음 수 확인
				
			}
			
			if(count == 2) {  
				sum +=i;
			}
			 
			
			
			
		}
		System.out.println(sum);
		sc.close();
		
		
		
		
	}

}
