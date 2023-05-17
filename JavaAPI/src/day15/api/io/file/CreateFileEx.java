package day15.api.io.file;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {
		
		/*
		 * File 클래스
		 * 외부 경로에 폴더 or 단순한 파일 생성이나 삭제를 할 수 있다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\couse\\java\\file\\20230504";
		
		try {
			File file = new File(path);
			//생성 
			if(!file.exists()) {//존재여부 확인
				
				//makedirectory
				file.mkdir();
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("이미 폴더가 존재합니다.");
				
			}
			
			//삭제
			if(file.exists()) {
				file.delete();
				System.out.println("폴더 or 파일 삭제완료");
			} else {
				System.out.println("삭제하고자 하는 폴더 or 파일이 존재하지 않음");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}





