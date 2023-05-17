package day08.super_2;

public class Teahcer extends Person {

	String subject;
	
	public Teahcer(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	String info() {
		return super.info()+ " 과목 : "+subject;
	}
}
