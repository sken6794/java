package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {
	public static void main(String[] args) {

		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶을 때 사용
		 * 
		 * bufferedwrite가 끝나면 자동으로 flush() 가 실행 된다.
		 */
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\test2.txt";

		Scanner sc = new Scanner(System.in);


		try ( BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)) ){

			System.out.print(">");
			String word1 = sc.next();
			bw.write(word1+"\n");
			//버퍼를 비우는 작업을 해줘야 한다.
			//중간중간에 넣어도 되고 마지막에 해도 됨.
			bw.flush(); //버퍼 있는 내용을 내보낸다.
			
			
			System.out.print(">");
			String word2 = sc.next();
			bw.write(word2+"\n");

			System.out.println("파일출력 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
