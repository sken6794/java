package day09.poly.basic2;


//생성자 연결이 가능

public class Person {

	String name;
	int age;
	
	//this. 객체가 만들어진 주소 - 나 자신 
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
		//System.out.println(this.info());
		//System.out.println(this);
	}
	
	Person(String name){
		//this.name = name;
		//this.age = 1;
		//System.out.println(this);
		this(name, 1);
	}
	
	Person() {
		//this.name = "이름없음";
		//this.age = 1;
		//System.out.println(this);
		this("이름없음", 1);
	}
	
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
