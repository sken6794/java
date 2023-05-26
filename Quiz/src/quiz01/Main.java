package quiz01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		int[] arr = {0,1,1,1,1};
		int k = 4;
		int[] answer = new int[k];
		int[] temp;
		for (int i : arr) {
			list.add(i);
		}
		temp = list.stream().distinct().mapToInt(Integer::intValue).toArray();
		for (int i = 0; i < answer.length; i++) {
			if(i<temp.length) {
				answer[i] = temp[i];
			} else {
				answer[i] = -1;
			}
				
		}
		System.out.println(Arrays.toString(answer));
		
		
	}
}





