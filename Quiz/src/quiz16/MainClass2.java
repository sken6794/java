package quiz16;


public class MainClass2 {

	public static void main(String[] args) {
		
		Calculator ca = new Calculator();
		
		try {
			System.out.println(ca.input());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

}
