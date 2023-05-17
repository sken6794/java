package day10.abstract_.bad;

public class SeoultStore extends Store {

	@Override
	public void apple() {
		System.out.println("서울지점 사과는 500원 겁나싸다");
	}
	
	@Override
	public void grape() {
		System.out.println("서울지점 포도는 600원 겁나싸다");
		
	}
	
	public void orange() {
		System.out.println("서울지점 오렌지는 700원 겁나싸다");
	}
	
	@Override
	public void melon() {
		System.out.println("서울지점 메론는 1000원 겁나싸다");
	}
		
}
