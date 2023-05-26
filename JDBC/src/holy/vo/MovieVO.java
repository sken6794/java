package holy.vo;

public class MovieVO {
	/*
	 * MOVIENO    NOT NULL VARCHAR2(99) 
	MOVIENAME  NOT NULL VARCHAR2(99) 
	MOVIERUN   NOT NULL VARCHAR2(99) 
	MOVIEPRICE NOT NULL NUMBER(5) 
	 */
	private String movieno;
	private String moviename;
	private String movierun;
	private int movieprice;
	
	public MovieVO() {
		// TODO Auto-generated constructor stub
	}

	public MovieVO(String movieno, String moviename, String movierun, int movieprice) {
		super();
		this.movieno = movieno;
		this.moviename = moviename;
		this.movierun = movierun;
		this.movieprice = movieprice;
	}

	public String getMovieno() {
		return movieno;
	}

	public void setMovieno(String movieno) {
		this.movieno = movieno;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMovierun() {
		return movierun;
	}

	public void setMovierun(String movierun) {
		this.movierun = movierun;
	}

	public int getMovieprice() {
		return movieprice;
	}

	public void setMovieprice(int movieprice) {
		this.movieprice = movieprice;
	}
	
	
}
