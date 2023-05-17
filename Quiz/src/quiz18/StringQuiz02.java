package quiz18;

import java.util.Arrays;

public class StringQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 주민번호 검증
		 *  "-" 이 없는 경우를 생각하지 않았음
		 *  강사님과 비교해서 생각해보기
		 */
		try {
			System.out.println(masking("9501031234567"));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
				
	}
	
	
	public static String masking(String rnn) throws Exception {
		
		if(rnn.replace("-", "").length()!=13) {
			throw new Exception("주민은 13자리");
		} else if(rnn.replace("-","").charAt(6)!='1' && rnn.replace("-","").charAt(6)!='2') {
			throw new Exception("예외");
			
		} 
		
		if(rnn.replace("-","").charAt(6)=='1') {
			System.out.println("남");
		} else if(rnn.replace("-","").charAt(6)=='2') {
			System.out.println("여");
		}
		
		
		
		String[] dd = rnn.split("-");
		String fdf = rnn.replace(dd[1], "*******");
		
		
		
		return fdf;
	}
	
}
