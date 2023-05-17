package day02;

public class EnhanceForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		//향상된 for문 - 배열같은 연속된 타입을 돌리기에 적합한 반복문
		for(int a : arr) {
			System.out.println(a);
		}
		
		for (String b : arr2) {
			System.out.println(b);
		}
		
		System.out.println("================================================");
		
		//이 값들의 합계와 평균(실수형)을 출력
		int[] score = {55, 47, 36, 23, 17};
		int sum = 0;
		//double avr = 0;
		for(int s : score) {
			sum+=s;
		}
		//avr = sum/5;
		//전체를 형변환 해주면 잘려나간다.
		//System.out.println("합계 = "+sum + " 평균 = "+(double)(sum/score.length));
		
		// double/ int => 데이터타입이 큰 쪽으로 형변환 되기 때문에 한쪽만 형변환 해주면 됨
		System.out.println("합계 = "+sum + " 평균 = "+(double)sum/score.length); 
		
		
		
		
	}

}
