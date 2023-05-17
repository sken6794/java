package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamEx {
	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 2. io패키지 거의 모든 클래스들은 생성자에 throws가 있기 때문에
		 * 		반드시 예외처리 문장안에서 사용한다. 
		 */
		//FileOutputStream(String name) => 생성자 매개변수로 파일을 쓸 경로를 제시
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\example.txt";
		//FileOutputStream out =  new FileOutputStream(path);
		//부모 타입으로 객체 생성
		//왜 부모타입으로 ? => OOP 프로그램의 특징 중 하나의 추상화개념을 사용하기 위해 ( 나중에 더 자세히 )
		try {
			OutputStream out =  new FileOutputStream(path);
			// 1.
			//out.write(65); //한글자씩 입력
			
			// 2.
			//byte[] arr = {65, 66, 67, 68, 69}; 배열에 들어있는 데이터를 한번에. 
			//out.write(arr);
			
			// 3.
			String str = "한글~"; //한글은 1byte 로 쓰기엔 적합하지 않다.
			byte[] arr = str.getBytes(); //문자열을 바이트 배열로 반환
			out.write(arr);
			out.close(); //자원 해제
		} catch (Exception e) {

			e.printStackTrace();
		}
	
		
	}
}

























