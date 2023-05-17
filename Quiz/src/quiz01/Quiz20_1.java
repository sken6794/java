package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20_1 {

	public static void main(String[] args) { //강사님 버전
		
		//백준 - 1차원 배열 - 10818번
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int i = 0;
		while(i < arr.length) {
			
			arr[i] = sc.nextInt();
			
			i++;
		}
		
		//최소, 최대 결정
		int min = arr[0];
		int max = arr[0];
		
		i = 0;
		while(i < arr.length) {
			
			if(min > arr[i]) {
				min = arr[i];
			}
			//나는 else if 썼지만 강사님은 안쓴다고 함
			if(max < arr[i]) {
				max = arr[i];
			}
			
			i++;
		}
		
		sc.close();
	}

}









