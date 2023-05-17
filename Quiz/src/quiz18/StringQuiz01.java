package quiz18;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너를 사용해서 id를 입력
		 * 아이디는 공백을 포함해서 받을 수 있다. nextLine() 사용
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받습니다.
		 * 5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
		 */
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("아이디 입력");
			String str = sc.nextLine();
			if(str.replaceAll(" ", "").length()<5) {
				System.out.println("다시 입력바람");
			} else {
				System.out.println("id 등록됨");
				break;
			}

		}
		
		
	}
}
