package day08.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수가 public이면 누구나 다 사용할 수 있고, 잘못된 값이 저장될 수도 있다.
		MyDate md = new MyDate();
		
		md.day = 32;
		md.month = 130;
		md.year = 2022;
		md.ssn = "뭐입력하지";
		
		md.info();
		
	}

}
