package day13.api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {
	public static void main(String[] args) {
		
		//빠른 문자열 분리
		//split()
		//toCharArray()
		//하나 밖에 못자르는 단점
		
		String str = "오늘은 날씨가 맑고, 매우 시원하지 않아요";
		
		StringTokenizer token = new StringTokenizer(str);
		
		//countTokens() 나눠진 토큰 갯수
		System.out.println("나눠진 문자열 개수 : "+token.countTokens());
		
		//토큰의 여부 확인 - 있으면 t 없으면 f
		System.out.println(token.hasMoreTokens());
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
		//nextToken() 다음 토큰 확인
		// 후진 없음 전진만 있음
		//System.out.println(token.nextToken());
		//System.out.println(token.nextToken(","));
		//System.out.println(token.nextToken());
		
		System.out.println("===============================================");
		//다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		//여러구분자를 사용하여 문자열을 한번에 자를 수 있음
		StringTokenizer token2 = new StringTokenizer(str2, "/.-");
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		System.out.println("===============================================");
		
		//구분자를 토큰에 포함시킴
		StringTokenizer token3 = new StringTokenizer(str2,"/",true);
		for(int i = 1;token3.hasMoreTokens(); i++) {
			System.out.println(token3.nextToken());
			
		}
		
		
		
		
	}
}







