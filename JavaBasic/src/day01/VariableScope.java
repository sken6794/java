package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		//변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효합니다.
		
		int num1 = 10;
		int num2 = 20;
		//int num1 = 10, int num2 = 20; 한줄로도 표현 가능하지만 위와 같은 방법으로 작성을 권함
		int num4 = 0; // 변수의 선언부
		if(true) {
			int num3 = num1 + num2; //30
			
			//if{} 안에서 num4의 값을 변경을 하고, 바깥에서 사용하고 싶을 때
			//변수의 선언을 if {} 안이 아닌 if {} 밖에서 선언
			// 선언을 밖에서 하고 변수 변경은 {}안에서 가능
			//int num4 = 0;
			num4 = 1000;
			
		}
		
		int num3 = 100; // num3 은 if 문장을 벗어나면서 사라졌기 때문에, 동일한 이름 선언 가능
		//System.out.println(num3); num3은 if {} 안에서 선언되었기 때문에 밖에서는 유효하지 않음
		
		System.out.println(num4); //1000
		
	}

}


















