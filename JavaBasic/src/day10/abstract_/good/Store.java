package day10.abstract_.good;

public abstract class Store {
	
	/*
	 * 1.메소드에 abstract를 붙이면 추상메소드가 된다. (오버라이딩을 강제화 하고 싶을 때)
	 * 2. 추상메소드는 몸체가 없는 메소드 선언이다.
	 * 3. 추상메소드를 사용하려면 추상클래스가 되어야 한다.
	 * 4. 추상클래스도 메소드, 생성자, 변수 전부다 가질 수 있다. 
	 */
	
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	public abstract void melon();
	
	public String name = "호식이";
	public Store() {
		System.out.println("추상 클래스 생성자 호출");
	}
	
	
	public void newMenu() {
		System.out.println("본점만 가지고 있는 신메뉴");
	}
	
	
}
