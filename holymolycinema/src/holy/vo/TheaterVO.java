package holy.vo;

public class TheaterVO extends FilmVO{
	/*
	 * THEATER_NUM  NOT NULL VARCHAR2(99) 
		THEATER_SEAT NOT NULL VARCHAR2(99) 
		MOVIENO               VARCHAR2(99)
	 */
	
	private String theaNum;
	private int theaSeat;
	
	public TheaterVO() {
		// TODO Auto-generated constructor stub
	}

	public TheaterVO(String theaNum, int theaSeat) {
		super();
		this.theaNum = theaNum;
		this.theaSeat = theaSeat;
	}

	/**
	 * @return the theaNum
	 */
	public String getTheaNum() {
		return theaNum;
	}

	/**
	 * @param theaNum the theaNum to set
	 */
	public void setTheaNum(String theaNum) {
		this.theaNum = theaNum;
	}

	/**
	 * @return the theaSeat
	 */
	public int getTheaSeat() {
		return theaSeat;
	}

	/**
	 * @param theaSeat the theaSeat to set
	 */
	public void setTheaSeat(int theaSeat) {
		this.theaSeat = theaSeat;
	}

	
	
	
}
