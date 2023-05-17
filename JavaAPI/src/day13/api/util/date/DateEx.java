package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getYear()+1900);
		
		//1970년 1/1 00:00 기준으로 밀리세컨으로 변경 => 날짜연산에 사용
		long millis = date.getTime();
		System.out.println(millis);
		
		Date date2 = new Date(System.currentTimeMillis()+1000); //현재시간 +1초
		System.out.println(date2);
		
		long mi = date2.getTime();
		System.out.println(mi - millis);
		
		System.out.println("==================================================");
		
		//사람이 보기 편한 날짜로 변환 (생성자에 날짜 패턴을 입력할 수 있음)
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 hh시:mm분:ss초");
		String now = df.format(date);
		System.out.println(now);
		
		
		
		
		
		
		
	}
}











