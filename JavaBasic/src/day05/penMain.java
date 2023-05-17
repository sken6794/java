package day05;

public class penMain {

	public static void main(String[] args) {
		
		//펜을 사용하려면 객체로 생성 해야한다.
		Pen pen = new Pen();
		pen.company = "모나미";
		pen.ink = "빨강색";
		pen.price = 500;
		pen.info();
		pen.write();
		
		Pen black = new Pen();
		black.company = "모나미";
		black.ink = "검정색";
		black.price = 1500;
		black.info();
		
		
		
	}

}
