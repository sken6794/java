package day06.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info());
		
		Teahcer t = new Teahcer();
		t.age = 30;
		t.name = "아무개";
		t.subject = "과학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 40;
		e.name = "콩고물";
		e.department = "개발";
		System.out.println(e.info());
		
	}
}
