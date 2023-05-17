package quiz16;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * updown 게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성. (반복문 밖)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도 횟수: x 회 를 출력하고 종료
		 * 
		 * 에러가 발생하면 시도 횟수는 증가하고 다시 입력받을 수 있도록.
		 * 
		 */
		
		
		
		
		int a = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		//System.out.println(a);
		while(true) {
			System.out.print("정답(1~100) > ");
			
			try {
				int x = sc.nextInt();
				if(x > 100 || x < 0) {
					System.out.println("정답은 1~100사이의 정수");
				} else if(a > x) {
					System.out.println("더 큰 수를 입력");				
				} else if( a < x) {
					System.out.println("더 작은 수를 입력");
				} else {
					System.out.println("정답");
					System.out.println("시도 횟수 : "+ count);
					break;
				}
				count ++;
				
			} catch (Exception e) {
				System.out.println("숫자로 입력바람");
				sc.nextLine();
				count++;
			}
			
			
			
		}
		sc.close(); 

	}

}
