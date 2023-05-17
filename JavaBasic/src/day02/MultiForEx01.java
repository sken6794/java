package day02;


public class MultiForEx01 {

	public static void main(String[] args) {
		
		//바깥 9, 안쪽 9
//		for (int i = 1; i <= 9; i++) { //다른 예제에서 행의 갯수를 센다고 생각하면 편함
//			System.out.println(i+"단");
//			for (int j = 1; j <= 9; j++) {
//				
//				System.out.println(i + "*" +j);
//			}
//			
//			System.out.println();
//		}
		
		//구구단 만들기
		for(int i = 2; i<10; i++) {
				System.out.println("구구단 : "+ i + "단");
			for(int j = 1; j<10; j++) {
				System.out.println(i + " x " + j +" = " + (i*j));
			}
			System.out.println("=========================");
			
			
		}
		
		
		 for(int i=1; i<=5; i++) {   
             for (int j=1; j<=5-i; j++) {
                 System.out.print("  "); //공백
             }
             for (int j=1; j<=i*2-1; j++) { //나머지 별 한방에채우기.
                 System.out.print("* "); 
             }
             System.out.println();
         }
		
		
	}

}
        
    