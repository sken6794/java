package holy.vo;

public class HmemberVO {

	/*
	 * HID       NOT NULL VARCHAR2(100) 
		HNAME     NOT NULL VARCHAR2(100) 
		HPHONE    NOT NULL VARCHAR2(100) 
		HPASSWORD NOT NULL VARCHAR2(100) 
	 */
	
	private String hid;
	private String hname;
	private String hphone;
	private String hpassword;
	
	public HmemberVO() {
		// TODO Auto-generated constructor stub
	}

	public HmemberVO(String hid, String hname, String hphone, String hpassword) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hphone = hphone;
		this.hpassword = hpassword;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHphone() {
		return hphone;
	}

	public void setHphone(String hphone) {
		this.hphone = hphone;
	}

	public String getHpassword() {
		return hpassword;
	}

	public void setHpassword(String hpassword) {
		this.hpassword = hpassword;
	}
	
	
}
