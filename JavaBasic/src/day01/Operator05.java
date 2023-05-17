package day01;

public class Operator05 {

	public static void main(String[] args) {
		
		//프로그램에서 랜덤한 값을 발생시키는 기능
		//System.out.println( Math.random() ); // 1미만의 랜덤한 double 값
		
		//1~10까지 랜덤한 값
		double d = Math.random() * 10;
		//int i = (int)d; // 0~9
		int i = (int)d + 1; // 1~10
		System.out.println(i);
		
		//연산자 우선순위에 의해 Math.random()*10의 int 형변환이 일어나서 0 + 1 으로 계산된다.
		// (int)(형변환 할 식 전체)
		int result = (int)(Math.random() * 10 +1) ;
		System.out.println(result);
		
		//삼항연산식
		// 조건 ? 연산1 : 연산2 
		String s = result % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result+ " 은(는) " + s);
		
		
		
	}

}
