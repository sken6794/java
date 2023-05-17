package day13.collection.queue;

public class User implements Comparable<User>{
	
	private String name;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}




	@Override
	public int compareTo(User o) {
		//자신과 매개변수로 들어오는 User 객체의 멤버변수 값의 비교
		
		//return this.name.compareTo(o.getName());
		// 음수가 나오면 this.name이 사전적순으로 앞에 위치
		
		return Integer.compare(this.age, o.getAge()); //나이 오름차순
		
	}
	
	
	
}
