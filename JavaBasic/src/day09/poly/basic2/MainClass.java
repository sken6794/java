package day09.poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("이순신",20);
		
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("홍길자", 30, "123533");
		
		Teacher t1 = new Teacher("박찬호", 40, "야구");
		Teacher t2 = new Teacher("손흥민", 40, "축구");
		
		Employee e1 = new Employee("김자바", 30, "역사부");
		
		//Student[] arr = {s1, s2};
		//Teacher[] arr2 = {t1, t2};
		//부모 타입을 활용한 배열의 다형성
		//부모타입으로 배열객체를 만들면 자식 객체들이 배열의 요소로 들어갈 수 있음. (부모타입으로 자동 형변환이 일어나서 들어가게 됨)
		Person[] prr = {p, s1, s2, t1, t2, e1};
		
		for(Person per : prr) {
			System.out.println(per.info());
		}
		System.out.println("====================================================");
		
		//House객체의 inHouse메소드를 실행
		
		House h = new House();
		h.inHouse(p);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		
		h.printHouse();
		
		h.whoAreYou(p);
		h.whoAreYou(t1);
		h.whoAreYou(s1);
		h.whoAreYou(e1);
		
		
		method();
	}
	
	public static void method() {
		
	}
	
	
	
}











