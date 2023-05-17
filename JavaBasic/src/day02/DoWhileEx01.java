package day02;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		
		//do ~ while 문은 조건이 false여도 무조건 1번은 실행
		// 2번째 부터는 while문과 동일하게 진행
		
		int a = 11;
		do {
			System.out.println(a);
			a++;
		} while (a<=10);
		System.out.println(a);
		
	}

}
