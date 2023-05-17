package day10.abstract_.bad;

public class Store {
	
	//자식 클래스에서 반드시 오버라이딩을 해야 하는데, 하지 않을 경우 잘못된 메소드가 실행됨
	
	//추상메소드가 없을 경우
	public void melon() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	public void orange() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	public void grape() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	public void apple() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
}
