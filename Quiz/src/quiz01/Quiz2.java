package quiz01;

public class Quiz2 {

	public static void main(String[] args) {
		
		//1~100까지의 랜덤한 정수를 생성
		int i = (int)(Math.random()*100+1);
		System.out.println(i);
		
		
		//랜덤하게 나온 수가 3의 배수인지, 3의 배수가 아닌지 3항연산식으로 결과 출력.
		String result = i % 3 == 0 ? "3의 배수" : "3의 배수X";
		System.out.println(result);
		
	}
}

