package day14.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	public static void main(String[] args) {
		
		/*
		 * [0-9]{2,4} 0~9숫자 중 2~4개 연속된 형태
		 * [0-9]{3} 0~9숫자 중 3개 연속된 형태
		 * [A-Z]+ 대문자 한개이상
		 * [a-zA-Z]? 알파벳 0~1개 나오는 경우
		 * [가-힣]* 한글 0회 이상
		 * 
		 * 정규표현식에 속하지 않는 문자는 그냥 사용할 수 있다.
		 * ex) [0-9]{3}-[0-9]{4} 하이픈은 그냥 사용 가능
		 * 정규표현식에 포함되는 문자를 쓰고싶다면 
		 * ex) \\+ => \가 한 개 이상
		 * 		\?+ => ?가 한 개 이상 
		 * 정확히 일치하는 문자
		 *	\?. 정확히 ?에 일치하는
		 * [0-9]{3}원 => 900원 780원 460원 => nnn원 형식
		 * 
		 *	\\d [0-9]와 같은 의미
		 *	\\w [a-zA-Z_]와 같은 의미
		 *	\\s 공백을 나타냄
		 * 
		 */
		
		String info = "홍길동/주소/02-458-3247/aaa123@naver.com/";
		String info2 = "이순신/주소/010-1234-1234/bbb123@naver.com";

		
		//전화번호 형식
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		//이메일 형식
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.[a-z]+";
		
		Pattern p = Pattern.compile(pattern);
		Pattern p2 = Pattern.compile(pattern2);
		
		Matcher m = p.matcher(info);
		Matcher m2 = p2.matcher(info);
		
		//find() - 일치하는 부분이 있다면 true
		//start() 일치하는 부분의 첫번째 인덱스
		//end() 일치하는 부분의 마지막 인덱스
		//group() 일치하는 부분 추출
		
		while(m.find()) { //패턴이 여러번 나오면 순서대로 찾는다.
			System.out.println("첫번째 인덱스 : "+m.start());
			System.out.println("마지막 인덱스 : "+m.end());
			System.out.println(m.group());
		}
		
		while(m2.find()) {
			System.out.println("첫번째 인덱스 : "+m2.start());
			System.out.println("마지막 인덱스 : "+m2.end());
			System.out.println(m2.group());
		}
		
		System.out.println("---------------------------------------------------------------");
		//리스트 안에 요소들에서 순서대로 값을 찾는 형태
		List<String> list = Arrays.asList(info,info2);
		
		
		for (int i = 0; i < list.size(); i++) {
			String str= list.get(i);
			
			//패턴 생성
			//Pattern x = Pattern.compile(pattern);
			//Matcher y = x.matcher(str);
			Matcher x = Pattern.compile(pattern).matcher(str);
			Matcher y = Pattern.compile(pattern2).matcher(str);
			if(x.find() && y.find()) {
				System.out.println(x.group());
				System.out.println(y.group());
			}
		}
		
	}
}










