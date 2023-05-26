package holy.vo;

public class ScheduleVO {
	/*
	 * SCHNO    NOT NULL VARCHAR2(99) 
	SCHTIME  NOT NULL VARCHAR2(10) 
	MOVIENO           VARCHAR2(99) 
	TORDERNO          VARCHAR2(10) 
	 */
	
	private String schno;
	private String schtime;
	private String movieno;
	private String torderno;
	
	public ScheduleVO() {
		// TODO Auto-generated constructor stub
	}

	public ScheduleVO(String schno, String schtime, String movieno, String torderno) {
		super();
		this.schno = schno;
		this.schtime = schtime;
		this.movieno = movieno;
		this.torderno = torderno;
	}

	public String getSchno() {
		return schno;
	}

	public void setSchno(String schno) {
		this.schno = schno;
	}

	public String getSchtime() {
		return schtime;
	}

	public void setSchtime(String schtime) {
		this.schtime = schtime;
	}

	public String getMovieno() {
		return movieno;
	}

	public void setMovieno(String movieno) {
		this.movieno = movieno;
	}

	public String getTorderno() {
		return torderno;
	}

	public void setTorderno(String torderno) {
		this.torderno = torderno;
	}
	
}
