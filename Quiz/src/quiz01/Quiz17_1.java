package quiz01;

import java.util.Scanner;

public class Quiz17_1 { //강사님 버전
	
	//내가 if문으로 해결한 것을 삼항연산자로 한줄로 바꿈
	public static void main(String[] args) {
		
		// 난수 2개 발생 + 혹은 - 로 0 or 1 => 부호로 
		// 정답 횟수, 오답 횟수.
		
		Scanner sc = new Scanner(System.in);
		
		int count1 = 0; //정답 카운트
		int count2 = 0; //오답 카운트
		
		
		
		while(true) {
			int num1 = (int)(Math.random()*100)+1; //난수 2개
			int num2 = (int)(Math.random()*100)+1; 
			int oper = (int)((Math.random()*2)); // 0~1 부호
			
			System.out.println("=============================");
			System.out.println(num1 +(oper == 0 ? "+":"-") + num2 + " = ?");
			System.out.print("문제를 그만 푸시려면 0 을 입력하세요");
			System.out.print(">");
			int answer = sc.nextInt();
			
			int correct = oper == 0? num1+num2 : num1-num2; //정답
			
			if(answer == 0) {
				System.out.println("정답 횟수 : "+count1);
				System.out.println("오답 횟수 : "+count2);
				break;
			}
			
			
			
			if(answer == correct) { //입력받은 값이 정답
				System.out.println("<<<정답>>>");
				count1++;
			} else { //오답
				System.out.println("<<<오답>>>");
				count2++;
				
			}
			
		}
		sc.close();
		
		
		
		
		
		
	}

}
