package day11.trycatch;

public class TryCatchEx2 {
	
	public static void main(String[] args) {
		
		String[] arr = {"김자바", "이순신","신용권"};
		
		int i = 0; 
		while(i<4) {
			
			try {
				
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println("배열의 범위를 벗어남");
			} finally {
				System.out.println("이 문장은 무조건 실행됨");
				
			}
			
			
			i++;
		}
		
		System.out.println("프로그램 정상종료");
	}
	
}
