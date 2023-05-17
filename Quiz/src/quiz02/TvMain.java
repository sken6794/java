package quiz02;

public class TvMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		
		tv.changeChannel(5);
		System.out.println(tv.power);
		tv.power();
		System.out.println(tv.power);
		tv.power();
		System.out.println(tv.power);
	}

}
