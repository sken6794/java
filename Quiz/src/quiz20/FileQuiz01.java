package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해 파일명을 입력 받는다.
		 * 
		 * 2. 입력받은 파일을 filecopy폴더로 복사해서 옮겨주기.
		 * 
		 * 3. 자원 해제
		 */
		
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		String pathIn = "C:\\Users\\user\\Desktop\\couse\\java\\file\\"+fileName+".png";
		String pathOut = "C:\\Users\\user\\Desktop\\couse\\java\\filecopy\\"+fileName+"_copy.png";
		
		
		try(InputStream in = new FileInputStream(pathIn);
				OutputStream out = new FileOutputStream(pathOut)) {
			byte[] arr = new byte[2048];
			
			int result;
			while( (result = in.read(arr)) != -1 ) {
				out.write(arr, 0, result);;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		sc.close();
	}
}
