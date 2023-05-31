package holy.vo;

public class TicketingVO {
	/*
	 *  TICKNO    NOT NULL VARCHAR2(100) 
		TICKDATE           DATE          
		TICKCOUNT          NUMBER(10)    
		TICKPRICE NOT NULL NUMBER(20)    
		PAYMEHOD           VARCHAR2(10)  
		SCHENUM            VARCHAR2(100) 
	 */
	private String tickno;
	private String tickdate;
	private int tickcount;
	private int tickprice;
	private String paymehod;
	private String schenum;
	private ScheduleVO scvo;
	
	
	
	public TicketingVO() {
		// TODO Auto-generated constructor stub
	}


	public TicketingVO(String tickno, String tickdate, int tickcount, int tickprice, String paymehod, String schenum) {
		super();
		this.tickno = tickno;
		this.tickdate = tickdate;
		this.tickcount = tickcount;
		this.tickprice = tickprice;
		this.paymehod = paymehod;
		this.schenum = schenum;
	}


	public String getTickno() {
		return tickno;
	}


	public void setTickno(String tickno) {
		this.tickno = tickno;
	}


	public String getTickdate() {
		return tickdate;
	}


	public void setTickdate(String tickdate) {
		this.tickdate = tickdate;
	}


	public int getTickcount() {
		return tickcount;
	}


	public void setTickcount(int tickcount) {
		this.tickcount = tickcount;
	}


	public int getTickprice() {
		return tickprice;
	}


	public void setTickprice(int tickprice) {
		this.tickprice = tickprice;
	}


	public String getPaymehod() {
		return paymehod;
	}


	public void setPaymehod(String paymehod) {
		this.paymehod = paymehod;
	}


	public ScheduleVO getScvo() {
		return scvo;
	}


	public void setScvo(ScheduleVO scvo) {
		this.scvo = scvo;
	}


	public String getSchenum() {
		return schenum;
	}


	public void setSchenum(String schenum) {
		this.schenum = schenum;
	}
	
	

	

	
	
	
}
