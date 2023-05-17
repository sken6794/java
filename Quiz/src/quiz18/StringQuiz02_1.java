package quiz18;

//강사님

public class StringQuiz02_1 {
	
	public static void main(String[] args) {
		
		/*
		 * 주민번호 검증
		 */
		try {
			System.out.println(masking("101010-1234567"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
				
	}
	
	
	public static String masking(String ssn) throws Exception {
		
		ssn = ssn.replace("-", "");
		if(ssn.length() == 13) { //길이 13자리 제대로 들어왔을때
			
			switch (ssn.charAt(6)){
				//문자열의 인덱스 6번 자리
			case '1' :
			case '3': 
				System.out.println("남자");
				break;
			
			case '2' :
			case '4' : 
				System.out.println("여자");
			
			default:
				System.out.println("잘못 입력");
				throw new Exception();
			}
			
		} else {
			System.out.println("주민번호는 숫자 13자리");
			throw new Exception();
		}
		
		//return ssn.substring(0,6)+"-*******";
		return ssn.substring(0,6)+"-"+"*".repeat(7);
	}
	
}
