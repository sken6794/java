package day11.trycatch;

public class ThrowsEx02 {

	public ThrowsEx02() throws Exception{// 메소드를 사용하는 생성자에서도 예외 던지기 가능 => 객체를 생성을 할 때 예외가 발생하게 됨
		System.out.println("생성자 시작");
		aaa();
		System.out.println("생성자 종료");
	}

	public void aaa() throws Exception{ //에러가 발생하는 메소드를 실행하는 메소드에서도 한번 더 던지는거 가능
		System.out.println("aaa 시작");
		bbb();
		System.out.println("aaa 종료");
	}

	public void bbb() throws Exception { //메소드를 호출하는 부분으로 에러 던지기
		System.out.println("bbb시작");
		
		System.out.println(10/0);
		
		/* 에러가 발생하는 부분에 직접 try catch
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("예외처리");
		}
		*/
		
		System.out.println("bbb종료");
	}
	
	//main
	public static void main(String[] args) {
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
			
		} catch (Exception e) {
			//예외가 발생하는 부분에서 예외를 던지는 과정이 연쇄적으로 일어나서 메소드를 끝까지 실행하지 않고 예외를 연달아 받아옴
			System.out.println("예외처리 끝");
		}
		
	}
}















