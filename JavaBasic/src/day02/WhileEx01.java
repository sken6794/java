package day02;

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		
		while(a<= 10) {
			//sum = sum + a; 다음과 같이 요약할 수 있다.
			sum += a;
			a++; //제어 변수를 증가해서 언젠가는 조건이 false되도록 처리한다.
		}
		System.out.println("1~10까지 합 "+sum);
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		
		int tot = 0;
		int i = 1;
		while(i <= size) { //n회 회전
			if(i % 2 == 0) {
				tot += i;
			}
			i++;
		}
		System.out.println(size + " 짝수 합 "+tot);
		scan.close();
	}

}
