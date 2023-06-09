package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02_1 { //강사님 버전
	public static void main(String[] args) {
		
		/*
		 * 1.Date클래스를 이용해서 File경로에 하위폴더로 "날짜" file 폴더를 생성
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt 파일을 생성
		 * 3. "그만"을 입력받을 때 까지 엔터를 포함해서 입력 받는다.
		 * \r \n을 적절하게 이용해서 파일 출력 완료
		 * 4. 파일 다썼으면 아무 방법으로 읽어들여서 콘솔창에 출력
		 */
		
		//버퍼리더로 입력 받을 때
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		 */
		
		//스캐너로 입력 받을 때
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 > ");
		String fileName = sc.nextLine();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		String filepath = "C:\\Users\\user\\Desktop\\couse\\java\\file\\"+now+"file";
		String path = filepath + "\\" + fileName + ".txt";
		
		File file = new File(filepath);
		if(file.exists()==false) {
			file.mkdir();
			System.out.println("폴더생성완료");
		} else {
			System.out.println("이미 존재");
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path));
				BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			//쓰기 작업
			while(true) {
				
				System.out.print(">");
				String str = sc.nextLine();
				
				if(str.equals("그만")) break;
				
				bw.write(str+"\n");
			}
			
			bw.flush();
			
			String result;
			while((result = br.readLine())!=null) {
				System.out.println(result);
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
