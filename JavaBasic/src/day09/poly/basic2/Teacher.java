package day09.poly.basic2;

public class Teacher extends Person {

	String subject;
	
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	String info() {
		return super.info()+ " 과목 : "+subject;
	}
}
