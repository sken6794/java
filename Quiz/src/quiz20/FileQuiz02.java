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

public class FileQuiz02 {
	public static void main(String[] args) {
		
		/*
		 * 1.Date클래스를 이용해서 File경로에 하위폴더로 "날짜" file 폴더를 생성
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt 파일을 생성
		 * 3. "그만"을 입력받을 때 까지 엔터를 포함해서 입력 받는다.
		 * \r \n을 적절하게 이용해서 파일 출력 완료
		 * 4. 파일 다썼으면 아무 방법으로 읽어들여서 콘솔창에 출력
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		String now = sdf.format(new Date());
		System.out.println(now); // 20230504
		String dir = "C:\\Users\\user\\Desktop\\couse\\java\\file\\"+now;
		File f = new File(dir);
		if(f.mkdir()) {
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("폴더 생성 실패");
			
		}
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\"+now+"\\"+name+".txt";
		
		
		
		try ( BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			BufferedReader bfread = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String input = bfread.readLine();
				bw.write(input+"\n");
				if(input.equals("그만")) break;
			}
			
			bw.flush();
			
			String re;
			while((re =br.readLine()) != null) {
				System.out.println(re);
			}
			
			br.close();
			bw.close();
			//bfread.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
