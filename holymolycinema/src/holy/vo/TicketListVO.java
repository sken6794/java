package holy.vo;

public class TicketListVO {
	/*
	 * FILMTITLE
	 * SCHEDATE
	 * THEANUM
	 * FILMRUNTIME
	 * SEATNUM
	 * TICKDATE
	 * TICKPRICE int 
	 * TICKCOUNT int
	 * MEMID 
	 */
	private String filmtitle;
	private String schedate;
	private String schetime;
	private String theanum;
	private String filmruntime;
	private String seatnum;
	private String tickdate;
	private int tickprice;
	private int tickcount;
	private String memid;
	private String tickno;
	private String paymethod;
	
	public String getPaymethod() {
		return paymethod;
	}



	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}



	public String getTickno() {
		return tickno;
	}



	public void setTickno(String tickno) {
		this.tickno = tickno;
	}



	public TicketListVO() {
		// TODO Auto-generated constructor stub
	}

	

	public String getSchetime() {
		return schetime;
	}



	public void setSchetime(String schetime) {
		this.schetime = schetime;
	}



	public TicketListVO(String filmtitle, String schedate, String schetime, String theanum, String filmruntime,
			String seatnum, String tickdate, int tickprice, int tickcount, String memid) {
		super();
		this.filmtitle = filmtitle;
		this.schedate = schedate;
		this.schetime = schetime;
		this.theanum = theanum;
		this.filmruntime = filmruntime;
		this.seatnum = seatnum;
		this.tickdate = tickdate;
		this.tickprice = tickprice;
		this.tickcount = tickcount;
		this.memid = memid;
	}



	public String getFilmtitle() {
		return filmtitle;
	}

	public void setFilmtitle(String filmtitle) {
		this.filmtitle = filmtitle;
	}

	public String getSchedate() {
		return schedate;
	}

	public void setSchedate(String schedate) {
		this.schedate = schedate;
	}

	public String getTheanum() {
		return theanum;
	}

	public void setTheanum(String theanum) {
		this.theanum = theanum;
	}

	public String getFilmruntime() {
		return filmruntime;
	}

	public void setFilmruntime(String filmruntime) {
		this.filmruntime = filmruntime;
	}

	public String getSeatnum() {
		return seatnum;
	}

	public void setSeatnum(String seatnum) {
		this.seatnum = seatnum;
	}

	public String getTickdate() {
		return tickdate;
	}

	public void setTickdate(String tickdate) {
		this.tickdate = tickdate;
	}

	public int getTickprice() {
		return tickprice;
	}

	public void setTickprice(int tickprice) {
		this.tickprice = tickprice;
	}

	public int getTickcount() {
		return tickcount;
	}

	public void setTickcount(int tickcount) {
		this.tickcount = tickcount;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}
	
	
	
}
