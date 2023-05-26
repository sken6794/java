package holy.vo;

public class TheaterVO extends MovieVO{
	/*
	 * THEATER_NUM  NOT NULL VARCHAR2(99) 
		THEATER_SEAT NOT NULL VARCHAR2(99) 
		MOVIENO               VARCHAR2(99)
	 */
	
	private String theater_num;
	private String theater_seat;
	
	public TheaterVO() {
		// TODO Auto-generated constructor stub
	}

	public TheaterVO(String theater_num, String theater_seat) {
		super();
		this.theater_num = theater_num;
		this.theater_seat = theater_seat;
	}

	public String getTheater_num() {
		return theater_num;
	}

	public void setTheater_num(String theater_num) {
		this.theater_num = theater_num;
	}

	public String getTheater_seat() {
		return theater_seat;
	}

	public void setTheater_seat(String theater_seat) {
		this.theater_seat = theater_seat;
	}
	
	
}
