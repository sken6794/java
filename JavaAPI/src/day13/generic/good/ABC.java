package day13.generic.good;

public class ABC<T> {
	
	//클래스 or 인터페이스의 매개변수 <>
	//T는 미정, 객체를 생성할 때 결정하게 된다.
	
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}
