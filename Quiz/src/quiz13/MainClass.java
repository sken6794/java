package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Shape c = new Circle("원", 2.5);
		Shape r = new Rect("사각", 3);
		
		System.out.println(c.getArea());
		System.out.println(r.getArea());
		System.out.println(c.getName());
		System.out.println(r.getName());
		
		
	}

}
