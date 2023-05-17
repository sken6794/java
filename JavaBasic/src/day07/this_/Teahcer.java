package day07.this_;

public class Teahcer extends Person {

	String subject;
	
	public Teahcer(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + " 과목 : "+subject;
	}
}
