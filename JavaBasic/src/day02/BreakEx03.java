package day02;

public class BreakEx03 {

	public static void main(String[] args) {
		
		// 변수를 사용하는 방법(고전적인 방법)
//		boolean flag = false; //탈출을 위한 변수
//		
//		for(char c = 'A'; c <= 'Z'; c++) {
//			
//			for(char l = 'a'; l <= 'z'; l++) {
//				System.out.println(c+" - "+l);
//				
//				if(l == 'f') {
//					flag = true; //탈출을 위해 true로 변경
//					break;
//				}
//			}
//			
//			if(flag) break; // 속 반복문에서 원하는 조건에서 break가 발생할 경우 탈출을 위한 변수를 변경함으로서 겉 for문에 조건을 걸고 탈출
//		}
		
		//라벨링 탈출문
		
		x:for(char c = 'A'; c <= 'Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c+" - "+l);

				if(l == 'f') {
					break x; //해당 이름이 적혀있는 반복문을 탈출
				}
			}

		}
		
	}

}
