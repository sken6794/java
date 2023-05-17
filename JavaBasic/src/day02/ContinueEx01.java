package day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue는 반복문을 건너뜀
		//for문에서는 증감식으로 이동
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		//while문에서는 continue 아래 문장으로 이동하지 않고 조건식으로 이동
		int i = 1;
		while(i <= 10) {
			
			if(i == 5) {
				i++;
				continue;
			}
			
			
			System.out.println(i);
			i++;
		}
		
	}

}
