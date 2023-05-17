package day03;


public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10
		/*
		int a = 0;
		while(a < arr.length) {
			
			System.out.println("배열의 "+a+" 인덱스 "+arr[a]);
			
			a++;
		}
		*/
		
		//배열값들의 합
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];			
		}
		System.out.println(sum);
		sum = 0;
		
		for(int a : arr) {
			sum += a;
		}
		System.out.println(sum);
		
		
	}

}
















