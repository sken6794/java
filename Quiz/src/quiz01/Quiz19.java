package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		//금액의 동전 - 나머지, 몫 활용 
		//어떤 금액 x가 주어졌을때, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력.
		//해결 못했음. 아예
		
		int[] arr = {1000,500,100,50,10};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("금액>");
		for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i] + "원 :" + num/arr[i]);
			 num %= arr[i];
		}
		
		sc.close();
		
	}

}
