package day13.generic.good;

public class MainClass {
	public static void main(String[] args) {
		
		
	 	//ABC abc = new ABC();
		ABC<String> abc = new ABC<String>();
		abc.setT("아 이렇게 쓰는거구나");
		abc.setT("원하는 타입을 적고 setT에 해당 데이터타입 저장");
		System.out.println(abc.getT());
		
		ABC<Person> abc2 = new ABC<>(); //생성자 꺽쇠는 생략가능
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		//제네릭타입에 원시타입은 지원하지 않음. wrapper클래스 사용
		//ABC<int> abc3 = new ABC<>();
		ABC<Integer> abc3 = new ABC<>();
		
		System.out.println("==============================================");
		//제네릭타입으로 멀티 가능
		DEF<String, Integer> def = new DEF<>();
		def.setKey("키의 자리");
		def.setValue(12345);
		System.out.println(def.toString());
		
	}
}












