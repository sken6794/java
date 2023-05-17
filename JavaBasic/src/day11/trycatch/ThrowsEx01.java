package day11.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {
	
	private static String[] arr = {"hello", "bye", "say good bye"};
	
	public static void greeting(int index) throws Exception{
		
		System.out.println(arr[index]);
	}
	
	public static void main(String[] args) {
		
		/*
		 * throws => 메소드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드
		 * throws 구문이 붙어있는 생성자 or 메소드는 예외처리를 대신 진행해야 한다.
		 * 
		 *  즉, 예외처리를 강요할 때 사용된다.
		 */
		
		try {
			greeting(10);
			
		} catch (Exception e) {
			System.out.println("main에서 예외 캐치");
			e.printStackTrace();//에러가 발생했을 때 에러로그를 확인하기 위해서 많이 사용한다.
			System.out.println(e.getMessage());
			
		}
		
		//throws의 예시
		
		try {
			Class.forName("아무값이나");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//생성자에서도 throws를 사용할 수 있음 
		//생성자 쓸 때 try - catch 사용
		try {
			new FileInputStream("ddd");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 정상 종료");
		
		
		
		
	}
	
	
	
}
