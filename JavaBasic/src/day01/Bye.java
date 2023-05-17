package day01;

public class Bye {

	public static void main(String[] args) {
		//main 이라 쓰고 ctrl + space를 누르면 실행함수가 만들어진다.
		/*
		 * ctrl + F11 실행
		 * sysout ctrl + space 출력문 자동완성 
		 * 
		 * 코드이동 : Alt + 방향키
		 * 전체 정렬 : 전체 선택 후 ctrl + i
		 * 코드 복사 : ctrl + alt + 방향키
		 * 되돌리기 : ctrl + z
		 * 전체선택 : ctrl + a
		 * 한줄삭제 : ctrl + d   
		 * 행주석 - ctrl + /
		 */
		
		// 쌍따옴표 안에는 문자열 
		System.out.println("2일차");
		System.out.println(1);
		System.out.println("1");
		System.out.println("안녕하세요");
		
		// Java의 출력문의 종류 - 3가지 제공
		// 개행문자 \n 가 없는 출력 - System.out.print()
		// \\ 두개 입력 할 시 \ 다음 문자가 출력됨
		System.out.print("ㅇㅇㅇ");
		System.out.print("\\n\n");
		System.out.print("\\n\n");
		
		//개행문자를 마지막에 포함해주는 System.out.println() 
		System.out.println("맨 뒤에 줄바꿈이 자동");
		System.out.println("맨 뒤에 줄바꿈이 자동");
		
		//형식 지정 출력문 - System.out.printf(null, args)
		//내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/*
		 * %d - 정수를 대입할 수 있음
		 * %f - 실수를 대입할 수 있음 - %.nf = 소숫점 n자리까지 표기
		 * %s - 문자열을 대입할 수 있음
		 * 
		 * \n - 줄바꿈
		 * \t - 8칸 공백을 잡고 정렬(tab키랑 비슷한 역할)
		 * 
		 */
		System.out.printf("제 이름은 %s 입니다\n", "김자바");
		System.out.printf("원주율은 %.2f 입니다\n", 3.14);
		System.out.printf("오늘은 %d일 입니다\n", 7);
		
		//제 생일은 xxxx년 xx월 xx일 입니다. 
		//System.out.printf("제 생일은 \t%d년 %d월 %d일 입니다\n", 1994,10,31);		
		System.out.printf("제 생일은 %d년 %d월 %d일 입니다\n", 1994,10,31);		
		
		
		
	}

}
















