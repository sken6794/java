package day03;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr); //배열의 주소값
		
		System.out.println(Arrays.toString(arr));
		
		//배열의 값의 변경
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이
		System.out.println("배열의 길이 : "+arr.length);
		
		//배열을 선언하는 다양한 방법. (1,3번 방법 자주 사용)
		//하나
		int[] arr2 = new int[3];
		
		//둘 {}에 초기값을 지정
		int[] arr3 = new int[] {1,2,3};
		
		//셋 new int[] 를 작성하지 않고 바로 {}에 초기값을 지정
		int[] arr4 = {1,2,3};
		
		//배열은 초기값을 지정하지 않으면 기본값으로 자동 초기화
		//int는 0, double = 0.0 , String = null
		System.out.println(Arrays.toString(arr2));
	}

}
















