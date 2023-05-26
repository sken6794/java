package holy.vo;

public class TicketorderVO {
	/*
	 * TORDERNO   NOT NULL VARCHAR2(99) 
	HID                 VARCHAR2(99) 
	PAYNUM              NUMBER(15)   
	TORDERSEAT          VARCHAR2(99) 
	 */
	
	private String torderNo;
	private String torderSeat;
	private int paynum;
	private String hid;
	
	public TicketorderVO() {
		// TODO Auto-generated constructor stub
	}

	public TicketorderVO(String torderNo, String torderSeat, int paynum, String hid) {
		super();
		this.torderNo = torderNo;
		this.torderSeat = torderSeat;
		this.paynum = paynum;
		this.hid = hid;
	}

	public String getTorderNo() {
		return torderNo;
	}

	public void setTorderNo(String torderNo) {
		this.torderNo = torderNo;
	}

	public String getTorderSeat() {
		return torderSeat;
	}

	public void setTorderSeat(String torderSeat) {
		this.torderSeat = torderSeat;
	}

	public int getPaynum() {
		return paynum;
	}

	public void setPaynum(int paynum) {
		this.paynum = paynum;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}
	
	
	
}
