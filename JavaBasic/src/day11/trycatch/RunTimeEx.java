package day11.trycatch;

public class RunTimeEx {
	
	public static void main(String[] args) {
		
		//실행 에러들
		
		//배열 인덱스 관련
		// Index 5 out of bounds for length 에러 발생
		//int[] arr=  {1,2,3,4,5};
		//System.out.println(arr[5]);
		
		
		// 클래스 타입 변환 에러
		// cannot be cast to class 
		//String s = (String)new Object();
		
		//문자열 -> 숫자로 변경
		// 문자열 속에 숫자 외의 문자가 섞여 일어나는 에러
		// java.lang.NumberFormatException
		//String str = "10a";
		//int a = Integer.parseInt(str);
		
		//NullPointerException
		//객체에 null값이 있는 경우
		String str = null;
		str.charAt(0);
		
		
	}
	
	
}












