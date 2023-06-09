package day14.api.thread;

public class MainClass {
	public static void main(String[] args) {
		
		ThreadTest test = new ThreadTest();//runable 인터페이스를 상속받은 클래스의 객체 생성
		
		//2. 스레드 클래스를 사용해서 작업스레드 실행
		Thread thread = new Thread(test, "Thread A");
		
		thread.start();
		
		
		
		try {
			Thread.sleep(5000); //5초 멈춤
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}  
		
		
		System.out.println("메인스레드 종료");
		
		
		
	}
}
