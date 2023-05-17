package day08.encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn; //주민번호
	
	
	/*
	 * 은닉된 변수에 접근할 때 미리 생성해 놓은 
	 * getter, setter 메소드 사용
	 * 
	 * setter메소드
	 * 1. 값을 저장하는 용도의 메소드
	 * 2. 접근제어자는 public으로 선언하고 이름은 set+필드명으로 지정
	 */
	
	public void setYear(int year) {
		
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력");
			return;
		} else {
			this.year = year;
		}
	}
	
	/*
	 * getter메소드
	 * 1. 은닉변수의 값을 조회하는 메소드
	 * 2. 접근제어는 public, 반환유형이 있음. 이름은 get+필드명
	 */
	
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("1~12사이의 숫자만");
			return;
		}
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("1~31사이의 숫자만");
			return;
		}
		this.day = day;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		
		ssn = ssn.replaceAll("-", ""); 
		if(ssn.length()!=13) {
			System.out.println("13자리 까지만 입력가능");
			return;
		} else {
			this.ssn = ssn;
		}
		
	}
	
	
	
	
	
}









