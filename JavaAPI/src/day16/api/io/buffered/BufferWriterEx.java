package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능 향상 스트림 (보조)
		 * 
		 * 보조스트림 이라 부르고 Reader, Writer, InputStream, OuterStream
		 * 과 같이 사용된다.
		 */
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\test.txt";
		
		//Writer wr = new FileWriter(path);
		//BufferedWriter bw  = new BufferedWriter(new FileWriter(path));
		
		//Wirter객체 두번째 매개변수에 true를 주면 기존 파일에 추가하는 형태가 된다. 없으면 덮어쓰기
		// new FileWriter(path, true)
		try (BufferedWriter bw  = new BufferedWriter(new FileWriter(path, true))){
			
			String str = "오늘 날씨 좋네~\n내일 쉬는날.\n";
			bw.write(str);
			
			System.out.println("파일 쓰기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
