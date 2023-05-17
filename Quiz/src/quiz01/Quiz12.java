package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		//1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		int i = 0;
		int count = 0;
		while(i<1000) {
			if(i%4==0 && i%8!=0) {
				count ++;
			}
			i++;
		}
		System.out.println("count = "+count);
		
		int j = 50;
		int num = 0;
		while(j<=100) {
			num += j;
			j++;
		}
		
		System.out.println("50부터~100까지 총 합 = "+num);
	
		
	}

}
