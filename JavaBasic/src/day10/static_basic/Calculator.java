package day10.static_basic;

public class Calculator {
	
	
	/*
	 * 클래스 설계를 할 때, 적절한 곳에 static키워드를 사용
	 * 
	 *  객체마다 다른값을 가져야 하면 일반 변수, 
	 *  객체마다 동일한 값을 가져야 하면 static 변수가 된다.
	 */
	
	public String color; //객체마다 다른 색상을 가질수도 있음
	public static double pi; // 파이값을 사용하고자 하는데 파이 값은 고정값임 변하지 않는다.

	private String panton;
	
	/*
	 * 메소드
	 * 일반필드를 사용하는 메소드는 static 이면 안된다. ex) getter, setter
	 * 
	 * 일반 필드를 사용하지 않고,
	 * 외부에서 범용성있게 사용할 메소드는 static이면 좋다.
	 */
	
	public String getPanton() {
		return panton;
	}
	public void setPanton(String panton) {
		this.panton = panton;
	}
	
	//일반 필드를 사용하지 않고 매개변수를 전달 받으며, 메소드 내에 static 필드를 사용하고 있기에 static 키워드 사용 
	public static double circle(int r) {
		return r*r*Math.PI;
	}
}
