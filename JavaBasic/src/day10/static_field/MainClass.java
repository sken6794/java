package day10.static_field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1 : "+ c1.a);
		System.out.println("c1 : "+ c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("c2의 a: "+ c2.a);
		System.out.println("c2의 b: "+ c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("c3의 a: "+ c3.a);
		System.out.println("c3의 b: "+ c3.b);
		
		//현재 c1.b 는 3;
		
		System.out.println("=========================================");
		/*
		 * static은 클래스 밖에 1개만 생성되기때문에 
		 * 객체 생성없이 클래스이름.변수명으로 사용
		 *  
		 */
		Count.b++;
		Count.b=100;
		System.out.println(Count.b);
		
		//여기서 c2의 b는 몇? => 100
		
		
	}

}



















