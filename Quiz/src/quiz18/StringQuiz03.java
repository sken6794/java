package quiz18;

public class StringQuiz03 {
	
	public static void main(String[] args) {
		
		
		/*
		 * 회문 판별 메소드
		 */
		System.out.println(palindrome("다시 합창 합시다"));
	}
	
	public static String palindrome(String str) {
		str = str.replace(" ", "");
		String d = "";
		
		for(int i = str.length(); i>0; i--) {
			d += str.charAt(i-1);
		}
		
		
		
		return str.equals(d) ? "회문임" : "회문아님";
	}
	
	
	
}
