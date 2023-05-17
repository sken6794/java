package quiz18;

public class StringQuiz3_1 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 회문 판별 메소드
		 */
		System.out.println(palindrome("소주 만병만 주소"));
		System.out.println(palindrome("소주 만병만 주소 아 좋다 좋아 수박이박수"));
		System.out.println(palindrome("기러기"));
		System.out.println(palindrome("별똥별"));
		System.out.println(palindrome("역삼역"));
		System.out.println(palindrome("우영우"));
	}
	
	//새로 배운 StringBuilder를 사용한 경우
	public static String palindrome(String str) {
		
		str = str.replace(" ", "");
		StringBuilder sb = new StringBuilder(str);
		 //reverse하면 StringBuilder 타입으로 반환됨.
		
		
		return sb.reverse().toString().equals(str) ? "회문" : "회문아님";
	}
	
	//강사님 버전 - two pointer 알고리즘 활용
	/*
	public static String palindrome(String str) {
		str = str.replace(" ", "");
		
		for(int i = 0; i < str.length()/2; i++) { //전체 문자열의 절반까지만 돌면 됨 
			
			char a = str.charAt(i); //앞에서 출발하는 커서
			
			char b = str.charAt(str.length()-i-1); //뒤에서 출발하는 커서
			
			if(a != b) {
				return "회문 아님";
			}
			
		}
		
		
		return "회문임";
	}
	*/
	
	
}











