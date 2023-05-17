package day14.api.thread.ex02;

public class MainClass {
	public static void main(String[] args) {
		
		
		//1개의 객체를 N개의 스레드로
		//하나의 필드를 참조하면서 침법하기 때문에 좋지 못한 방법이다.
		
		ThreadTest thread = new ThreadTest();
		
		Thread th1 = new Thread(thread,"Thread_A");
		Thread th2 = new Thread(thread,"Thread_B");
		th1.start();
		th2.start();
		
		
		
		//2개의 객체를 각각 돌리는 경우
		//필드에 영향을 주진 않지만 실행순서가 보장되지 않기때문에 좋지 못한 결과를 출력
		/*
		ThreadTest thread = new ThreadTest();
		ThreadTest thread2 = new ThreadTest();
		Thread th1 = new Thread(thread, "Thread_A");
		Thread th2 = new Thread(thread2, "Thread_B");
		th1.start();
		th2.start();
		*/
		
		
	}
}






