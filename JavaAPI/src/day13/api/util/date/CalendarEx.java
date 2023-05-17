package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		//static 메소드를 사용해서 객체를 반환하는 모형
		Calendar cal =  Calendar.getInstance();
		
		
		
		System.out.println(cal.getWeekYear());
		System.out.println(cal.get(cal.YEAR)+"년");
		System.out.println(cal.get(cal.MONTH)+1+"월"); //month 해당 월 보다 1 적게 나옴
		System.out.println(cal.get(cal.DATE)+"일");
		System.out.println(cal.get(cal.HOUR)+"시");
		System.out.println(cal.get(cal.MINUTE)+"분");
		System.out.println(cal.get(cal.SECOND)+"초");
		
		
		
		
		
	}
}
