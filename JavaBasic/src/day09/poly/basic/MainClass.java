package day09.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //상속받은
		c.method02(); //오버라이드 된 메소드
		c.method03(); // 자식 메소드
		
		System.out.println("===================다형성 적용(형변환)===================");
		
		//Parent 처럼 사용 된다
		Parent p = c;
		p.method01();
		//parent 객체가 가지는 필드와 메소드만 사용가능하지만 오버라이드된 메소드는 우선 실행된다.
		p.method02(); // => 자식의 오버라이드 된 2번 메소드 실행
		// p.method03(); 
		
		System.out.println(p); //parent타입
		System.out.println(c); //child타입
		System.out.println(p == c); //true. child로 생성된 자식은 원래의 객체를 유지한다.
		
		System.out.println("=================클래스 강제 형변환=====================");
		//원본이 child로 생성되었다면, 강제 형변환이 가능함
		Parent pp = new Child(); 
		pp.method01();
		pp.method02();
		Child cd = (Child)pp;
		cd.method01();
		cd.method02();
		cd.method03();
		
		//주의 할 점 => 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
		//Child ccc = (Child)obj; // runtime exception
		System.out.println("===============다형성의 또 다른 예시=================");
		
		String str = "홍길동";
		Object o = str;
		System.out.println(o);
		String result = (String)o;
		
		
		
	}

}















