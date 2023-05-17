package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {
	public static void main(String[] args) {
		
		
		//arr, arr2 는 길이차이 1 
		//arr 마라톤 참가자
		//arr2 마라톤 완주자
		//완주하지 못한 사람을 리턴하는 메소드
		
		String[] arr = {"홍길동","홍길자","이순신","신사임당"};
		String[] arr2 = {"홍길동","신사임당","홍길자"};
		
		System.out.println(test(arr, arr2));
		System.out.println(test2(arr, arr2));
	}
	
	public static String test(String[] arr, String[] arr2) {
		
		String answer = "";
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(String s : arr) {
			if(Arrays.binarySearch(arr2, s)<0) {
				answer = s;
			}
		}
		
		
		return answer;		
	}
	
	//강사님 버전
	public static String test2(String[] arr, String[] arr2) {
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i = 0; i<arr2.length; i++) {
			if(!arr[i].equals(arr2[i])) {
				return arr[i];
			}
		}
		return arr[arr.length-1];
	}
	
}
