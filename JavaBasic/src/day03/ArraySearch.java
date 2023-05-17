package day03;

public class ArraySearch {

	public static void main(String[] args) {
		
		//큰 값 찾기
		int[] arr = {54,23,12,76,99,1,2,3};
		
		int max = 0; //큰 값을 저장할 변수
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 = "+max);
	}

}
