package day04;

import java.util.Arrays;

public class MethodEx06 {
	
		static int[] arr = {1,2,3};
		
		
	public static void main(String[] args) {
		//Queue 
		//제일 먼저 들어간 값이 제일 먼저 나옴
		push(4);
		System.out.println(Arrays.toString(arr));
		push(5);
		System.out.println(Arrays.toString(arr));
		push(6);
		System.out.println(Arrays.toString(arr));
		pop();
		System.out.println(Arrays.toString(arr));
		pop();
		System.out.println(Arrays.toString(arr));
		pop();
		System.out.println(Arrays.toString(arr));
	}
	static void push(int a) {
		int[] temp = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];					
		}
		temp[temp.length-1] = a;
		arr = temp;
		temp = null; //temp는 삭제
	}
	
	
	static void pop() {
		
		if(arr.length > 0) {
			
			int[] temp = new int[arr.length-1]; 
			
			for (int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			
			arr = temp;
			temp = null;
			
		}
		
		
	}
	
}
















