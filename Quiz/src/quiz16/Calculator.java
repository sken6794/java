package quiz16;

import java.util.Scanner;

public class Calculator {
	
	 public int input() throws Exception{
		 /*
		  * 1. 스캐너로 정수 2개를 입력 받아서 두 수의 합을 반환하는 기능
		  * 2. 입력된 값이 정수라면 합계를 반환.
		  * 3. 예외가 발생하면 직접예외를 생성하고 예외 메세지를 외부로 전달하면 된다. 
		  * 4. scan.close() 은 finally에서 처리.
		  */
		 
		 Scanner sc = new Scanner(System.in);
		 try {
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 return a+b;
			
		} catch (Exception e) {
			throw new Exception("정수만 입력");
		}finally {
			sc.close();
		}
		 
		 
	 }
	
	 
	 
}
