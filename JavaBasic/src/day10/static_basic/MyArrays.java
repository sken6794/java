package day10.static_basic;

public class MyArrays {
	
	/*
	 * Arrays클래스의 toString메소드 똑같이 만들기
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙인다.
	 * 2. printArray() 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴되도록
	 * 		메소드 오버로딩 (String, int, char)
	 */
	
	private MyArrays() {
		
	}
	
	public static String printArray(String[] s) {
		String start = "[";
		for (int i = 0; i < s.length; i++) {
			if(i == s.length-1) {
				start += s[i];
			} else {
				start += s[i]+", ";
			}
		}
		start += "]";
		
		return start;
				
	}
	
	public static String printArray(int[] s) {
		String start = "[";
		for (int i = 0; i < s.length; i++) {
			if(i == s.length-1) {
				start += s[i];
			} else {
				start += s[i]+", ";
			}
		}
		start += "]";
		return start;
	}
	
	public static String printArray(char[] s) {
		String start = "[";
		for (int i = 0; i < s.length; i++) {
			if(i == s.length-1) {
				start += s[i];
			} else {
				start += s[i]+", ";
			}
		}
		start += "]";
		return start;
	}
	
}
