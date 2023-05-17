package day12.api.lang.system;

import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		
		
		//System 클래스는 전부 static 메소드로 선언되어 있다.
		
		//System.exit(0); - 시스템 강제 종료
		
		
		//UTC - 세계 기준치 영국기준 시간 => 1970년 1월 1일 자정
		// 1970년 1월 1일 ~ 현재 까지 시간을 밀리초 반환
		// 간단한 프로그램 시간 체크
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i = 0; i<100000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)*0.001);
		
	}
}
