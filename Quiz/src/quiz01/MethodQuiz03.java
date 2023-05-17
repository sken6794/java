package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','e'};
		System.out.println(method6(arr));
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(method7(arr2));
		
		System.out.println(Arrays.toString(method8("합", "체")));

	}
	
	static String method6(char[] a) {
		String str = "";
		for (int i = 0; i < a.length; i++) {
			str += a[i];
		}
		
		
		return str;
	}
	
	static int method7(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	
	static String[] method8(String s, String r) {
		String[] a = {s,r};
		return a; 
	}
	
}
