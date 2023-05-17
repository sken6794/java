package day10.static_method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반 메소드 - 일반필드와 정적필드 모두 사용이 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	//정적 메소드 - 일반필드를 사용할 수 없음, 정적 필드는 사용이 가능
	public static int method02() {
		//사용안되는 이유 = static이 생성될 당시에 a변수는 없다
		//a = 10;
		
		//객체생성을 통해서 일반 필드 사용 가능
		Count c = new Count();
		c.a = 10;
		b++;
		return b;
	}
}
