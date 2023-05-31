package holy.vo;

public class TicketingVO {
	/*
	 * TORDERNO   NOT NULL VARCHAR2(99) 
	HID                 VARCHAR2(99) 
	PAYNUM              NUMBER(15)   
	TORDERSEAT          VARCHAR2(99) 
	 */
	
	private String tickNo;
	private String tickSeat;
	private String tickDate;
	private int tickCount;
	private int tickPrice;
	private String payMethod;
	private String scheNum;
	private String memId;
	
	public TicketingVO() {
		// TODO Auto-generated constructor stub
	}

	public TicketingVO(String tickNo, String tickSeat, String tickDate, int tickCount, int tickPrice, String payMethod,
			String scheNum, String memId) {
		super();
		this.tickNo = tickNo;
		this.tickSeat = tickSeat;
		this.tickDate = tickDate;
		this.tickCount = tickCount;
		this.tickPrice = tickPrice;
		this.payMethod = payMethod;
		this.scheNum = scheNum;
		this.memId = memId;
	}

	/**
	 * @return the tickNo
	 */
	public String getTickNo() {
		return tickNo;
	}

	/**
	 * @param tickNo the tickNo to set
	 */
	public void setTickNo(String tickNo) {
		this.tickNo = tickNo;
	}

	/**
	 * @return the tickSeat
	 */
	public String getTickSeat() {
		return tickSeat;
	}

	/**
	 * @param tickSeat the tickSeat to set
	 */
	public void setTickSeat(String tickSeat) {
		this.tickSeat = tickSeat;
	}

	/**
	 * @return the tickDate
	 */
	public String getTickDate() {
		return tickDate;
	}

	/**
	 * @param tickDate the tickDate to set
	 */
	public void setTickDate(String tickDate) {
		this.tickDate = tickDate;
	}

	/**
	 * @return the tickCount
	 */
	public int getTickCount() {
		return tickCount;
	}

	/**
	 * @param tickCount the tickCount to set
	 */
	public void setTickCount(int tickCount) {
		this.tickCount = tickCount;
	}

	/**
	 * @return the tickPrice
	 */
	public int getTickPrice() {
		return tickPrice;
	}

	/**
	 * @param tickPrice the tickPrice to set
	 */
	public void setTickPrice(int tickPrice) {
		this.tickPrice = tickPrice;
	}

	/**
	 * @return the payMethod
	 */
	public String getPayMethod() {
		return payMethod;
	}

	/**
	 * @param payMethod the payMethod to set
	 */
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	/**
	 * @return the scheNum
	 */
	public String getScheNum() {
		return scheNum;
	}

	/**
	 * @param scheNum the scheNum to set
	 */
	public void setScheNum(String scheNum) {
		this.scheNum = scheNum;
	}

	/**
	 * @return the memId
	 */
	public String getMemId() {
		return memId;
	}

	/**
	 * @param memId the memId to set
	 */
	public void setMemId(String memId) {
		this.memId = memId;
	}

	
	

	
	
	
	
}
