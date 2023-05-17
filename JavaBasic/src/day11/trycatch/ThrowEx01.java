package day11.trycatch;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		try {
			int re = sum(-10);
			System.out.println(re);
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); //예외 메세지를 문자열로 반환
		}
		
		
	}
	
	public static int sum(int n) throws Exception{
		
		//예외를 직접 생성해서 메소드를 종료할 때 사용할 수 있음.
		if(n<0) {
			throw new Exception("양의 정수를 입력바람"); //예외 생성할 때, 예외에서 사용되는 메세지를 전달 할 수 있다.
		}
		
		
		int sum =0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
}
