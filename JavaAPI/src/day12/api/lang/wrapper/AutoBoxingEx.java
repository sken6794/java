package day12.api.lang.wrapper;

public class AutoBoxingEx {
	public static void main(String[] args) {
		
		//Autoboxing : 기본타입 ~ 클래스형 간의 자동형변환
		int a = 100;
		Integer var1 = a;
		
		int b = var1;
		
		Double var2 = 3.14;
		double c = var2;
		
		//래퍼클래스의 특별한 기능들
		// 문자열 => 기본형으로 변환
		int result = Integer.parseInt("10");
		double re2 = Double.parseDouble("3.14");
		long re3 = Long.parseLong("10");
		
		System.out.println(result+re2+re3);
		//Integer.compare(int a, int b)
		//a > b => 1
		//a = b => 0
		//a < b => -1
		System.out.println(Integer.compare(5, 5));
	}
}   
