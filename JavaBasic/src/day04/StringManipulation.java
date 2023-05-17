package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		//문자열다루기
		//문자열은 사실 배열이다. 문자열은 인덱스가 존재함.

		String str = "안녕하세요~하";

		//문자열을 다루는 다양한 메소드를 제공

		//문자열 한 글자만 가져올 때
		// => String.charAt(int index)
		char c = str.charAt(0);
		System.out.println(c);

		//문자열의 위치 확인 
		// => String.indexOf(String str) - 반환값은 int
		// => 제일 처음 발견된 index를 반환
		// => 해당 문자열에 찾는 문자열이 없으면 -1을 반환
		int idx = str.indexOf("하");
		System.out.println(idx); // 2 

		// => String.lastIndexOf 
		// => 찾고자 하는 문자열을 뒤 index 부터 앞으로 찾는 방식
		// => 해당 문자열에 찾는 문자열이 없으면 -1을 반환
		int idx2 = str.lastIndexOf("하"); // 6
		System.out.println(idx2);

		//문자열 변환 
		// toUpperCase(), toLowerCase()
		// => 대문자로 변환, 소문자로 변환
		String s = "upperLOWER";

		//String u = s.toUpperCase(); //UPPERLOWER
		String u = s.toLowerCase(); //upperlower
		System.out.println(u);
		System.out.println(s); //upperLOWER 원본문자열은 유지 한다.

		System.out.println("==============================================");
		//문자열 변경
		// String.replace(String str1, String str2)
		s = "abcdefaaa";
		String re = s.replace("a", "x");
		System.out.println(re);

		//String.replaceFirst(String str1, String str2)
		// => str1 이 해당문자열에 여러개 있을 경우 첫번째 str1 만 str2로 변경
		String re2 = s.replaceFirst("a", "x");
		System.out.println(re2);
		System.out.println("==============================================");
		
		//공백제거 trim()
		// => 문자열의 앞, 뒤 공백을 제거해서 반환, 문자열 사이 공백은 제거되지 않는다.
		str = "  010-1111-2222   ";
		String re3 = str.trim();
		System.out.println(str);
		System.out.println(re3);
		
		str = " 안녕 하세요?  오늘은 4월 19일 입니다.   ";
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		str = str.replace(" ", "");
		System.out.println(str);
		System.out.println("==============================================");
		
		//문자열 자르기
		
		//substring(int index) - 인덱스 기준으로 자름
		str = "010-1234-5678";
		String re4 = str.substring(9); //인덱스 n번째 미만 절삭
		System.out.println(re4);
		
		//substring(int index1, int index2) => 1~2까지 잘라서 반환
		String re5 = str.substring(3,8);
		System.out.println(re5);
		
		
		//split() - 특정문자를 기준으로 자름. 제대로 사용하려면 정규표현식을 알아야 한다.
		
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		//
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2)); //String 배열

		//str.toCharArray() -한 글자씩 char형으로 자름
		char [] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3)); //char 배열
		
		System.out.println("==============================================");
		//문자열의 길이
		str = "안녕하세요";
		System.out.println(str.length());
		int len = str.length();
		System.out.println("문자열의 길이 : " + len);
		
		//문자열의 비교
		// String.equals(String str)
		if(str.equals("안녕하세요1")) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("달라");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("안녕")) {
			System.out.println("ㅇㅇ");
		} else {
			System.out.println("ㄴㄴ");
		}
	}

}













