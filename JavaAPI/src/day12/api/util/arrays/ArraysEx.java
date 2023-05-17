package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
			
		int[] arr = {3,1,2,5,6,7};
		int[] arr2 = {3,1,2,5,6,7};
		//정렬
		Arrays.sort(arr);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr));
		
		//탐색 - 선행조건으로 정렬이 필히 되어 있어야 한다.
		int a = Arrays.binarySearch(arr, 0); //배열명, 찾을 값
		System.out.println(a); //음수가 나오면 해당 값이 없음
		
		int v= Arrays.binarySearch(arr, 2);
		System.out.println(v); //음수가 나오면 해당 값이 없음
		
		//배열 복사
		int[] newArr = Arrays.copyOf(arr, arr.length*2); //복사할 배열, 새로운 배열의 길이
		System.out.println(Arrays.toString(newArr)); //깊은 복사(완전히 새로운 배열 생성)
		
		//배열 크기 지정 복사
		int[] newArr2 = Arrays.copyOfRange(newArr, 2, 6);
		System.out.println(Arrays.toString(newArr2));
		
		//배열의 원소비교
		//배열의 크기와 순서, 값이 동일한지 비교
		if(Arrays.equals(arr, arr2)) {
			System.out.println("배열 원소 정확히 일치 크기, 순서, 값");
		}
		
		
		
		
		
		
		
	}
	
}
