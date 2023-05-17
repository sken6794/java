package day13.generic.bad;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 해당 값을 사용할 때 알맞은 타입으로 반드시 형변환을 해야 한다.
		 * 잘못 형변환 하면 예외를 발생시킨다. 
		 */
		
		
		ABC abc = new ABC();
		abc.setObj("문자열");
		//abc.setObj(1); 오류없이 다른 타입의 매개변수가 객체 필드에 저장이 될 수 있다.
		
		//Integer name = (Integer)abc.getObj(); 안에 들어있는 값의 데이터 타입을 알 수 없어서 캐스팅 시에 어려움
		String name = (String)abc.getObj();
		System.out.println(name);
		
		
		ABC abc2 = new ABC();
		
		abc2.setObj(new Person());
		//객체타입으로 전달했을 경우 해당 객체의 데이터타입을 정확히 알고 있어야 캐스팅이 가능하다.
		 Person p = (Person)abc2.getObj();
		
		
		
	}
}









