package day02;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 while(true) {
			 System.out.println("4 x 3 = ?  ");
			 
			 System.out.print("정답 > ");
			 int answer = sc.nextInt();
			 
			 if(answer == 12) {
				 System.out.println("정답입니다.");
				 break;
			 } else {
				 System.out.println("오답임");
				 
			 }
			 
		 }
		sc.close();
		
	}

}
