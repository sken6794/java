package day12.api.lang.object;

import java.io.PrintStream;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		Person p2 = new Person("홍길동");
		
		
		//equals
		//객체의 name변수가 같다면 true반환 하도록 오버라이드 한 것.
		System.out.println(p.equals(p2));
		
		//toString - 주소값을 문자열로 반환
		//오버라이드 해서 사용하는데 alt sh s 로 generate toString을 이용하여 자동 오버라이드해서 사용
		// => 필드값을 출력하도록 오버라이딩 하여 사용
		System.out.println(p.toString());
		
		try {
			//새로운 Person 객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();
			System.out.println(clonePeople.getName());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		//객체의 주소를 해시알고리즘을 통해 변경한 값을 변환
		System.out.println(p.hashCode());
		
		//PrintStream ps =  System.out;
		//ps.println("cnd");
		
		
		
		
	}

}
