package day09.poly.basic2;

public class Student extends Person {

	String studentId;
	
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info()+ " 아이디 : "+studentId;
	}
}
