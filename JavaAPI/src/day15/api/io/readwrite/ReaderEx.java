package day15.api.io.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) {
		
		/*
		 * 	문자 기반 파일을 읽어서 사용할 때는 FileReader 클래스를 사용한다.
		 *  2byte 기반
		 */
		
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\text.txt";
		
		try (Reader read = new FileReader(path)){
			
			//int result = read.read();
			//System.out.println((char)read.read());
			
			int result;
			while( (result = read.read())!=-1 ) { //더 이상 읽을 값이 없으면 -1 반환
				System.out.print((char)result);
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
