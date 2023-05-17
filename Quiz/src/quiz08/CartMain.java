package quiz08;

public class CartMain {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(10000);
		mc.buy("tv");
		mc.buy("com");
		mc.buy("radio");
		mc.buy("radio1");
		mc.buy("com");
		mc.buy("radio");
		
		
		mc.info();
		
		//수정이 필요함
		MyCart_1 mc1 = new MyCart_1(10000);
		mc1.buy("tv");
		mc1.buy("com");
		mc1.buy("radio");
		mc1.buy("radio1");
		mc1.buy("com");
		mc1.buy("radio");
		
		
		mc1.info();

	}

}
