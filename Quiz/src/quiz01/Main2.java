package quiz01;

import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] ary = new int[n]; 
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			for(int j = a-1; j<b; j++) {
				ary[j] = c;
			}
			
		}
		//이 차이 때문에 다른 값이 나옴
//		for(int k : ary) { 순서대로 인덱스를 불러오는게 아니라 배열에 저장된 값을 k에 저장해서
		// 불러오는 거임
//			System.out.print(ary[k]+" ");
//		}
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
			
		}
		
		
		
		
		
		scan.close();
	}

}
