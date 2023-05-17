package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열 정렬 - 정렬의 방법 7개 있음(Java)
		int[] arr = {5,23,1,43,200,100,40};
		// 1, 23, 5, 43, 200, 100, 40 - 1 회전
		// 1, 5, 23, 43, 200, 100, 40 - 2 회전
		// 1, 5, 23, 43, 200, 100, 40 - 3 회전
		// 1, 5, 23, 40, 200, 100, 43 - 4 회전
		// 1, 5, 23, 40, 43, 200, 100 - 5 회전
		// 1, 5, 23, 40, 43, 100, 200 - 6 회전
		//중첩 반복문을 사용해야 함
		
		//바깥 반복문은 회전 수
		//안쪽 반복문은 비교할 값
		for(int i =0; i< arr.length-1; i++) { //마지막 index 의 직전 index 까지 시도하면 됨 0~5까지 
			
			for(int j = i+1; j<arr.length; j++) { //i =0 일때 그 뒷자리부터 비교하기 때문에 i+1 부터 i+1 ~ 끝
				//System.out.println(i+" - "+j);
				if(arr[i] < arr[j]) { //비교 대상이 작다면 swap
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
					
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
