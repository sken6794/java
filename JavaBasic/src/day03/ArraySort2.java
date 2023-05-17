package day03;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		
		//버블 정렬 - 가장 느림 (큰 값을 뒤로 보낸다) - 첫번째 인덱스부터 인접한 인덱스끼리만 비교
		// 첫 회전에 가장 큰 값이 제일 뒤로 간다.
		int[] arr = {5,23,1,43,200,100,40};
		//5 1 23 43 100 40 200 - 1회전
		//1 5 23 43 40 100 200 - 2회전
		//1 5 23 40 43 100 200 - 3회전 - 정렬 완성
		
		//바깥 반복문은 회전 횟수
		//안쪽 반복문은 비교 횟수
		
		/*
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = arr.length-i; j >=0; j--) {
				System.out.println(i+" "+j); 
			}
		}
		*/
		
		/*
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = 0; j < arr.length-i-1; j++) {
				//System.out.println(i+" "+j);
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		//퀵 정렬 - 가장 빠른 정렬 방법
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}












