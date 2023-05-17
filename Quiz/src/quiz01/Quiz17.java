package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		// 난수 2개 발생 + 혹은 - 로 0 or 1 => 부호로 
		// 정답 횟수, 오답 횟수.
		
		Scanner sc = new Scanner(System.in);
		
		int count1 = 0; //정답 카운트
		int count2 = 0; //오답 카운트
		
		
		//System.out.println(a);
		
		String i = "";
		
		
		while(true) {
			int a = (int)((Math.random()*2)); // 0~1 부호
			int b = (int)((Math.random()*100)+1); //앞 
			int c = (int)((Math.random()*100)+1); //뒤
			
			if(a == 0) {
				i = "+";
			} else {
				i = "-";
			}
			
			System.out.println("종료를 원하면 0을 입력");
			System.out.println(b + i + c);
			System.out.print("정답은? > ");
			int answer = sc.nextInt();
			if(answer == 0) {
				System.out.println("정답 횟수"+ count1);
				System.out.println("오답 횟수"+ count2);
				break;
			}
			if(a == 0) { // + 
				
				if(answer == (b+c)) {
					System.out.println("***정답***");
					count1 ++;
				} else {
					System.out.println("***오답***");
					count2 ++;
					
				}
				
			} else if (a == 1) {// -
				
				if(answer == (b-c)) {
					System.out.println("정답");
					count1 ++;
				} else {
					System.out.println("오답");
					count2 ++;
				}
				
			} 
			
		}
		sc.close();
		
		
		
	}

}
