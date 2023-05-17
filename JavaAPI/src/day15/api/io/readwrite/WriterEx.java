package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
	
	 public static void main(String[] args) {
		
		 /*
		  * 문자를 써서 저장할 때는 2byte 기반 클래스 FileWriter() 를 사용
		  */
		 
		 String paht = "C:\\Users\\user\\Desktop\\couse\\java\\file\\text.txt";
		 
		 try ( Writer wr = new FileWriter(paht)) {
			 // \n 줄바꿈, \r 캐리지 리턴(맨앞으로 당기기) 
			String str = "그만좀 자 \n\r줄바꾸기 성공 \n3\r번째줄도 성공";
			 
			 wr.write(str);
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 
		 
	}
	
	
}
