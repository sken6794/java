package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedReader 는 입력에 대한 성능 향상 보조 스트림
		 * Reader클래스와 같이 사용
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\test2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			// readLine() 한줄 씩 읽어들임
			//System.out.println(br.readLine());
			String result;
			// readLine() 읽을게 없으면 null을 리턴
			while( (result = br.readLine()) !=null  ) {
				System.out.println(result);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("읽기 실패");
		}
		
	}
	
}
