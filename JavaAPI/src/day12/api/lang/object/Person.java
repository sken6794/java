package day12.api.lang.object;

public class Person implements Cloneable {
	
	 //모든 클래스는 Object를 상속받는다. => 따로 extends Object 안해줘도 됨
	
	private String name;
	private int age; 
	
	
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	//오버라이드 단축키(게터랑같음) => override
	@Override
	public boolean equals(Object obj) {
		
		//필드 name 값이 같다면 true 반환
		 
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName() != null) {
				if(p.getName().equals(this.name)) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		//객체가 사라지는 시점에서 자동으로 실행 
		System.out.println(this.name + "님이 소멸");
		super.finalize();
	}

	
	/*
	 * 객체 복사 메소드
	 * clone() 을 오버라이드 하면, 외부에서 사용이 가능
	 * 클래스는 Cloneable 인터페이스를 상속받아야 한다.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	

	
	
	
	

	
	
	
	
	
}
