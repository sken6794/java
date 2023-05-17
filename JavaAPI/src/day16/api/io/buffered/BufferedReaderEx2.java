package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		
		/*
		 * InputStreamReader 는 
		 * 1바이트 데이터를 2바이트 기반으로 변경
		 */
		
		
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(">");
			String name = br.readLine();
			
			System.out.println("name : "+name);
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
