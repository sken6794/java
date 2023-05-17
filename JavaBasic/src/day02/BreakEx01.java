package day02;

public class BreakEx01 {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 10; i++) {
//			
//			if(i==5) break;
//			System.out.println(i);
//			
//				
//		}
		
		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를 때 사용
		 * - 자바 while(true) 문장을 주로 사용
		 * - 특정 조건에서 탈출하는 형식으로 사용 된다.
		 */
		
		int i =1; 
		while(true) {
			System.out.println(i);
			if(i==15) {
				System.out.println("멈춰!");
				break;
			}
			
			i++;
		}
		
		
	}

}
