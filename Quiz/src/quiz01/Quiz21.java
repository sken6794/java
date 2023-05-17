package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자 중 절대 중복되지 않는 숫자 3개를 추출.
		 *  arr를 랜덤하게 10번 섞어줍니다.
		 *  0~2번째 값을 새로운 배열로 옮겨 담아보세요.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arrnew = new int[3];
		int temp = 0;
		
		for (int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*9); //0~8 까지
			int ran2 = (int)(Math.random()*9); //0~8 까지
			
			temp = arr[ran];
			arr[ran] = arr[ran2];
			arr[ran2] = temp;
		}
		
		for(int i = 0; i <3; i++) {
			arrnew[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arrnew));
		
		
		sc.close();
	}

}
