package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) {
	
		/*
		 * 1. 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 2. 생성자 매개변수에 읽을 파일의 경로
		 */
		
		String path ="C:\\Users\\user\\Desktop\\couse\\java\\file\\example.txt";
		try {
			InputStream in = new FileInputStream(path);
			//System.out.println((char)in.read());
			
			// 1st
			// read는 하나씩 읽고 읽을 값이 없으면 -1 반환
			//System.out.println(in.read());
			/*
			while(true) {
				int re = in.read();
				if(re == -1) break;
				System.out.println((char)re);
			}
			*/
			
			//2. 
			//read 배열
			byte[] arr = new byte[100];
			int result = in.read(arr);
			System.out.println(result);
			System.out.println(Arrays.toString(arr));
			int i = 0;
			while(true) {
				
				if(arr[i]==0) break;
				System.out.println((char)arr[i]);
				i++;
				
				
			}
			
			int result2 = in.read(arr); //더 읽을 값이 없으면 -1 반환
			System.out.println(result2);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
