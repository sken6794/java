package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {
	public static void main(String[] args) {
		
		
		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸 때 사용.
		 */
		
		String readPath = "C:\\Users\\user\\Desktop\\couse\\java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\couse\\java\\filecopy\\메서드1_copy.mp4";
		
		//향상된 try ~ catch문
		// closeable 인터페이스를 상속받는 클래스의 메소드만
		// close작업을 대신 함
		
		//try( closeable인터페이스를 상속받는 클래스 객체 )
		try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)) {
			
			//읽음
			byte[] arr = new byte[2048]; //2kb
			/*
			while(true) {
				int result = is.read(arr);
				System.out.println(result);
				if(result == -1) break;
			}
			*/
			int result;
			while((result =is.read(arr))!=-1) { //읽은 값이 -1 이 아닐 때 까지 
				
				out.write(arr, 0, result); //arr데이터를 0에서 byte배열의 result까지 쓴다. 
				
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		//finally { 향상된 try ~ catch 문을 쓰면 finally구문 생략 가능
			//file 이 제대로 전송되지 않는 경우 통로가 닫혀야 하기 때문에 finally 구문안에서 닫아준다.
			/*
			try {
				//is.close();
				//out.close();
			} catch (Exception e) {
				System.out.println("파일 close에러");
				e.printStackTrace();
			}
			*/
		//}
		
		
		
		
		
	}
}
