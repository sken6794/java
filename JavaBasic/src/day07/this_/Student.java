package day07.this_;

public class Student extends Person {

	String studentId;
	
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age+ " 아이디 : "+studentId;
	}
}
