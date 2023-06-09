package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderUTF8 {
	public static void main(String[] args) {
		
		/*
		 * 인코딩 => 파일, 텍스트문서가 저장될 때 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 * 디코딩 => 컴퓨터가 아는 이진수 형태의 데이터를 사람이 알아볼 수 있는 문자형식으로 변경
		 * 
		 * 인코딩 대표형식
		 * 문자 인코딩 => 일반적으로 UTF-8(유니코드), EUC-KR
		 * 파일인코딩 Base64 (아스키코드)
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\example.txt";
		/*
		InputStream fis = new FileInputStream(path); // 1바이트 기반
		//InputStreamReader(InputStream타입, 인코딩타입 문자열)
		 * 
		 *   2가지 방법 
		 * 1. 원본파일의 인코딩을 UTF-8로 변경
		   2. 파일의 인코딩형식이 다르면 (한글) 깨지게 되는데 인코딩을 동일한 형태로 맞춰서 가지고 오면 된다.
		Reader rd = new InputStreamReader(fis, "UTF-8"); //1바이트 기반 => 2바이트 형식으로 변경
		BufferedReader br = new BufferedReader(rd); //2바이트 기반 빠른 읽기
		*/
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))){
			
			String str;
			while( (str = br.readLine()) != null){
				
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
	}
}
