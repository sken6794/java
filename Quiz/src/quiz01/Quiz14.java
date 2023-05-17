package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		/* => 문제 출처 : 
		 * 1. 가로, 세로길이를 입력 받음.
		 * 2. 가로, 세로길이만큼 사각형을 출력
		 * 3. 단, 윤곽만 나오게 출력.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //세로 i
		int b = sc.nextInt(); //가로 j
		
		
		for(int i = 1; i<= a; i++) {
			if(i==1 || i==a) {
				for(int j=1; j<=b; j++) {
					System.out.print("*");
				} 
			} else {
				for(int j=1; j<=b; j++) {
					if(j==1 || j==b) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			
			sc.close();
			
		}
		
		//강사님 버전 수정완료 println > print
		int h = 4; //세로
		int w = 5; //가로
		for(int i = 1; i<=h; i++) { // 세로
			
			for(int j = 1; j<=w; j++) { //가로
				
				if(i==1 || i==h) { //첫 행, 마지막 행 ( i ~ h 순으로 증가하기에 i = 1 , i = h 일 때가 첫행, 마지막행 )
					System.out.print("*");
				
				} else { //첫 행, 마지막 행 아닌 경우
					if(j==1 || j==w) { //첫 열, 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
