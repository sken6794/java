package day09.poly.basic2;

public class House {
	
	/*
	private Student[] student = new Student[100];
	private Employee[] employee = new Employee[100];
	private Teacher[] teacher = new Teacher[100];
	private int index1;
	private int index2;
	private int index3;
	
	
	public void inHouse(Student s) {
		student[index1] = s;
		index1++;
	}
	
	public void inHouse(Employee e) {
		employee[index2] = e;
		index2++;
	}
	public void inHouse(Teacher t) {
		teacher[index3] = t;
		index3++;
	}
	*/

	private Person[] person = new Person[100];
	private int index;
	
	public void inHouse(Person p) {
		person[index] = p;
		index++;
	}

	public Person[] getPerson() {
		return person;
	}

	public void setPerson(Person[] person) {
		this.person = person;
	}
	
	
	// => 배열 안에 들어있는 객체의 타입에 따라 출력
	public void printHouse() {
		
		for(int i = 0; i < index; i++) {
			if(person[i] instanceof Student) {
				System.out.println("학생");
			} else if (person[i] instanceof Employee) {
				System.out.println("직원");
			} else if (person[i] instanceof Teacher) {
				System.out.println("선생");
			} else {
				System.out.println("일반인");
				
			}
			
		}
		
	}
	
	public void whoAreYou(Person p) {
		
		if(p instanceof Student) { //Student 라면 true
			System.out.println("학생임");
			
			Student s = (Student)p; //형변환이 되는 조건을 알아보자 어느때 에러가 나고 어느때 형변환이 되는지?
			
		} else if(p instanceof Teacher) {
			System.out.println("선생임");
		} else if(p instanceof Employee) {
			System.out.println("직원임");
			
		} else {
			System.out.println("걍 사람");
		}
		
	}
	
	
	
	
}











