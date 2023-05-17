package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		Radio r = new Radio();
		Computer com = new Computer();
		Tv tv = new Tv();
		System.out.println(r.getPrice());
		System.out.println(r.getName());
		
		System.out.println("==================================");
		
		MyCart mc = new MyCart(5000);
		mc.buy(r);
		mc.buy(com);
		mc.buy(tv);
		mc.buy(r);
		
		/*
		Product p = new Product(0, null);
		Tv tv2 = new Tv();
		tv2 = (Tv)p; 작성에는 문제 없지만 실행 시 형변환 오류 메세지가 나온다.
		*/
		
		// 한번 Promotion이 일어나야만 강제 타입 변환을 사용할 수 있음.
		Product p = new Tv();
		Tv s = (Tv)p; 
		
		
	}
}
