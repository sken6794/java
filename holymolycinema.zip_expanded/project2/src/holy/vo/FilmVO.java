package holy.vo;

public class FilmVO {
	
	
	private String filmNum;
	private String filmTitle;
	private String filmContent;
	private String filmRuntime;
	private int filmPrice;
	
	
	public FilmVO() {
		
	}


	public FilmVO(String filmNum, String filmTitle, String filmContent, String filmRuntime, int filmPrice) {
		super();
		this.filmNum = filmNum;
		this.filmTitle = filmTitle;
		this.filmContent = filmContent;
		this.filmRuntime = filmRuntime;
		this.filmPrice = filmPrice;
	}


	/**
	 * @return the filmNum
	 */
	public String getFilmNum() {
		return filmNum;
	}


	/**
	 * @param filmNum the filmNum to set
	 */
	public void setFilmNum(String filmNum) {
		this.filmNum = filmNum;
	}


	/**
	 * @return the filmTitle
	 */
	public String getFilmTitle() {
		return filmTitle;
	}


	/**
	 * @param filmTitle the filmTitle to set
	 */
	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}


	/**
	 * @return the filmContent
	 */
	public String getFilmContent() {
		return filmContent;
	}


	/**
	 * @param filmContent the filmContent to set
	 */
	public void setFilmContent(String filmContent) {
		this.filmContent = filmContent;
	}


	/**
	 * @return the filmRuntime
	 */
	public String getFilmRuntime() {
		return filmRuntime;
	}


	/**
	 * @param filmRuntime the filmRuntime to set
	 */
	public void setFilmRuntime(String filmRuntime) {
		this.filmRuntime = filmRuntime;
	}


	/**
	 * @return the filmPrice
	 */
	public int getFilmPrice() {
		return filmPrice;
	}


	/**
	 * @param filmPrice the filmPrice to set
	 */
	public void setFilmPrice(int filmPrice) {
		this.filmPrice = filmPrice;
	}


	
	
	
	

}
