package day09.poly.basic2;

public class Employee extends Person {

	String department;
	
	Employee(String name, int age, String department) {
		//this.name = name;
		//this.age = age;
		super(name, age); //부모생성자와 연결
		this.department = department;
	}
	
	
	
	String info() {
		//super.info(); //super. 을 사용하여 부모클래스에 있는 메소드에 접근할 수 있다.
		//return "이름:" + name + ", 나이:" + age+" 부서 : "+department;
		return super.info()+", 부서 : "+department;
	}
	
	static void method2() {
		
	}
}
