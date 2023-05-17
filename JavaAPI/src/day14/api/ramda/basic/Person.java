package day14.api.ramda.basic;

public class Person {
	
	//일반클래스 - 고차함수를 가지고 있는 클래스
	
	public void greeting(Say01 say) {
		say.hello(); //대신 실행 (이미 만들어져 있음)
	}
	
	public void greeting(Say02 say) {
		
		String result = say.hello("greeting이 전달한 문자열", 1);
		System.out.println("greetin result : "+result);
	}
	
	public void greeting(Say03 say) {
		boolean re = say.bye(3);
		System.out.println(re);
	}
	
}
