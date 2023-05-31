package holy.vo;

public class HmemberVO {

	/*
	 * HID       NOT NULL VARCHAR2(100) 
		HNAME     NOT NULL VARCHAR2(100) 
		HPHONE    NOT NULL VARCHAR2(100) 
		HPASSWORD NOT NULL VARCHAR2(100) 
	 */
	
	private String memId;
	private String memPw;
	private String memName;
	private String memPhone;
	
	public HmemberVO() {
		// TODO Auto-generated constructor stub
	}

	public HmemberVO(String memId, String memPw, String memName, String memPhone) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.memPhone = memPhone;
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

	/**
	 * @return the memPw
	 */
	public String getMemPw() {
		return memPw;
	}

	/**
	 * @param memPw the memPw to set
	 */
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	/**
	 * @return the memName
	 */
	public String getMemName() {
		return memName;
	}

	/**
	 * @param memName the memName to set
	 */
	public void setMemName(String memName) {
		this.memName = memName;
	}

	/**
	 * @return the memPhone
	 */
	public String getMemPhone() {
		return memPhone;
	}

	/**
	 * @param memPhone the memPhone to set
	 */
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	
	
	
}
