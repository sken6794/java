package day05;

public class PhoneMain {

	public static void main(String[] args) {
		Phone black = new Phone();
		black.info();
		
		Phone white = new Phone("아이폰");
		white.info();
		
		Phone gold = new Phone("아이폰", "로즈골드");
		gold.info();
		
		Phone blue = new Phone("아이폰", "Blue", 3500000);
		blue.info();
		
	
	}
}
