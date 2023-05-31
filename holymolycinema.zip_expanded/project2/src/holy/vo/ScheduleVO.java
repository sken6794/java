package holy.vo;

public class ScheduleVO {
	/*
	 * SCHNO    NOT NULL VARCHAR2(99) 
	SCHTIME  NOT NULL VARCHAR2(10) 
	MOVIENO           VARCHAR2(99) 
	TORDERNO          VARCHAR2(10) 
	 */
	
	private String scheNum;
	private String scheDate;
	private String scheTime;	
	private int leftSeat;
	private String theaNum;
	private String filmNum;
	private String filmContent;
	
	public ScheduleVO() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleVO(String scheNum, String scheDate, String scheTime, int leftSeat, String theaNum, String filmNum) {
		super();
		this.scheNum = scheNum;
		this.scheDate = scheDate;
		this.scheTime = scheTime;
		this.leftSeat = leftSeat;
		this.theaNum = theaNum;
		this.filmNum = filmNum;
	}
	public ScheduleVO(String scheDate, String filmContent) {
		super();
		
		this.scheDate = scheDate;
		this.filmContent = filmContent;
	}
	
	public ScheduleVO(String scheTime) {
		super();
		
		this.scheTime = scheTime;
	}

	public String getScheNum() {
		return scheNum;
	}

	public void setScheNum(String scheNum) {
		this.scheNum = scheNum;
	}

	public String getScheDate() {
		return scheDate;
	}

	public void setScheDate(String scheDate) {
		this.scheDate = scheDate;
	}

	public String getScheTime() {
		return scheTime;
	}

	public void setScheTime(String scheTime) {
		this.scheTime = scheTime;
	}

	public int getLeftSeat() {
		return leftSeat;
	}

	public void setLeftSeat(int leftSeat) {
		this.leftSeat = leftSeat;
	}

	public String getTheaNum() {
		return theaNum;
	}

	public void setTheaNum(String theaNum) {
		this.theaNum = theaNum;
	}

	public String getFilmNum() {
		return filmNum;
	}

	public void setFilmNum(String filmNum) {
		this.filmNum = filmNum;
	}

	public String getFilmContent() {
		return filmContent;
	}

	public void setFilmContent(String filmContent) {
		this.filmContent = filmContent;
	}
	
	
	
	
	
	
}
