package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//char[] arr = {'a','b','c'};
		//String str = new String(arr);
		//System.out.println(str); // abc char[]을 받아서 붙여서 만드는거였음 ...
		
		
		String str= "안녕";
		System.out.println(str);
		
		System.out.println(str.charAt(0));
		
		String str1 = "11322112348";
		System.out.println(str1.indexOf("3", 2));// 찾고싶은 시작위치를 조절 가능
		
		if(str.indexOf("안녕")!=-1) { // 찾고자하는 문자열의 존재 여부 확인
			System.out.println("문자에 값이 존재함");
		}
		
		//문자열 끝에서 부터 원하는 문자열을 검색
		System.out.println(str1.lastIndexOf("2"));
		
		//contains => 포함 여부를 boolean 값으로 반환
		System.out.println(str.contains("안"));
		
		//length => 문자열 길이 
		System.out.println("문자열 길이 : "+ str.length());
		
		System.out.println("==============================================");
		
		//문자열 변경 replace
		str = "자바의 기원은 자바 커피집에서 시작되었습니다.";
		System.out.println(str.replace("자바", "Java"));
		
		//앞에 것만 바뀜
		System.out.println(str.replaceFirst("자바", "java"));
		
		//공백제거도 가능
		System.out.println(str.replace(" ", ""));
		
		System.out.println("==============================================");
		
		//문자열 자르기 substring
		// => 0~n 까지 잘라서 반환
		// => n~m 까지 잘라서 반환
		System.out.println(str.substring(9)); // 바 커피집에서 시작되었습니다.
		System.out.println(str.substring(2,9)); //의 기원은 자 
		
		// 매개변수 기준으로 문자열을 잘라서 배열로 반환
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(" ",3); //최대 배열의 길이를 제시
		System.out.println(Arrays.toString(arr2));
		
		//문자열을 char 배열로 잘라서 반환 공백도 char배열에 포함
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("==============================================");
		
		//문자열의 비교 매개변수와 문자열을 비교하여 boolean 값으로 반환
		str = "홍길동";
		System.out.println(str.equals("홍길동"));
		
		//사전 등재순의 비교
		System.out.println(str.compareTo("홍길동")); // 0 - 같은문자
		System.out.println(str.compareTo("홍길자")); // 음수 - str이 "홍길자" 보다 사전등재순 앞에 위치함
		System.out.println(str.compareTo("홍길가")); //양수 - str이 "홍길가" 보다 사전등재순 뒤에 위치함
		str = "a";
		System.out.println(str.compareTo("b")); // -1
		
		
		//문자열을 특정 구분자로 연결하여 합쳐서 반환
		System.out.println(String.join("-", "hello","world","!!!","~~~"));//hello-world-!!!-~~~
		
		//기본타입을 문자열로 변경
		System.out.println(String.valueOf(1)+String.valueOf(2));
		System.out.println("" + (1 + 2) ); //3 =>int 합 먼저 실행, 문자열과 병합
		System.out.println("" + 1 + 2 ); //12 => 전부 문자열로 병합
		
		
		
		
	}

}






















