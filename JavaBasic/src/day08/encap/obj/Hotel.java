package day08.encap.obj;

public class Hotel {
	
	
	//private Chef chef = new Chef();
	private Chef chef;
	
	//Hotel 클래스가 Chef 타입의 필드를 가짐.
	//기본생성자에 this.chef = new Chef(); 를 넣게되면 메인클래스에서 호텔 객체를 생성할 때
	// 호텔이 가지고 있는 chef 필드에 Chef 객체를 생성하고 저장한다.
	
	
	public Hotel() {
		//this.chef = new Chef();
	}
	
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	
	//chef의 getter setter
	//객체를 매개변수로 받는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
	
}
