package quiz02;

public class Tv {
	
	String company = "LG"; //회사
	int channel; // 채널
	boolean power; //전원
	
	/*
	 * 메소드
	 * changeChannel : int - 매개변수 채널(int)을 받아서 채널을 변경, 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜는 기능
	 */
	
	int changeChannel(int ch) {
		if(ch > 0 ) {
			channel = ch;
			return channel;
		} else {
			System.out.println("채널은 양수만");
			return ch;
		}
	}
	
	void power() {
		
		power = power == false ? true : false; 
	}
	
}
