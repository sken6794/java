package day02;

public class CaseEx01 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()*4) + 8; // 8<= time <=11 사이 정수
		
		System.out.println("현재 시간 "+ time + "시");
		
		switch (time) {
		case 8: 
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의");
			break;
		case 10:
			System.out.println("업무");
			break;

		default:
			System.out.println("외근");
		}
	}

}
