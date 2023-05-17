package day02;


public class MultiForEx02 {

	public static void main(String[] args) {
		
		//회전수가 변경되는 중천반복문
		// i값에 따라서 j의 값을 변경
		// 1-1
		// 2-1
		// 2-2
		// 3-1
		// 3-2
		// 3-3
		
		for (int i = 0; i < 11; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.println(i + " - "+ j);
			}
		}
		
		//별 출력하기
		//*
		//**
		//***
		//****
		//*****
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		//별 출력하기
		//    *
		//   **
		//  ***
		// ****
		//*****
		for (int i = 0; i < 5; i++) {
			for(int j = 4; j>=0; j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
					
				}
			}
			System.out.println();			
		}
		//나중에 수정하기 틀렸음 (6:27 수정완료)
		int n = 5;
		System.out.println("===백준 풀이====");
		for (int i = 1; i <= n; i++) {
			
			//공백 => 틀렸던 부분 int j = i 로 설정하지 않고 1로 설정해서 똑같은 갯수의 공백 생성
			// j= i 로 설정함으로써 다음 반복이 실행 될 때마다 적어지는 공백 생성 수
			for (int j = i; j <= n-1; j++) {
				System.out.print(" ");
				
			}
			//별
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			
			
			
			System.out.println();
			
		}
		
		
		
		
		
		
		//    *   
		//   ***
		//  *****
		// *******
		//*********
		
		int star = 4;
		
		for (int i = 0; i <= star; i++) {
			//공백을 먼저 찍는 반복문
			for(int j = 1; j<=star-i; j++) {
				System.out.print(" ");
			}
			//별 출력하는 반복문
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
        
    






