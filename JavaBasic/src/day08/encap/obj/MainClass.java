package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		//Chef c = h.getChef(); //Hotel 안에 있는 Chef를 꺼냄
		
		
		Hotel h2 = new Hotel(new Chef());
		System.out.println(h2.getChef().getName());
		
		Chef c = new Chef();
		h.setChef(c);
		//Hotel이 Chef타입의 필드를 가지고 있기 때문에 set메소드로 chef타입의 변수를 저장할 수 있음
		// hotel.set 이후 hotel.getChef를 쓰면 생성된 chef 객체를 hotel에서부터 가져올 수 있음
		h.getChef().setName("백종원");
		//hotel에서 chef의 객체를 받아서 chef의 필드에 접근하여 필드를 조작할 수 있음
		
		
		
		System.out.println(h.getChef().getName());
		System.out.println(c.getName());
		
		
		//hotel의 기본생성자에서 chef의 객체를 생성하지 않은채 chef의 객체를 확인하면 null값이 들어가있음
		//System.out.println(h.getChef().getName());
		
		
		
		
		//Chef를 생성해서 Hotel한테 전달
		//Chef chef = new Chef();
		//h.getChef().setName("백종원");
		//h.getChef().cooking();
		//System.out.println(h.getChef().getName());
		
		
		
		
	}

}
