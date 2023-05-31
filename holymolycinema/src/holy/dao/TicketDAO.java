package holy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import holy.main.MovieDBProperties;
import holy.vo.FilmVO;
import holy.vo.HmemberVO;
import holy.vo.ScheduleVO;
import holy.vo.TheaterVO;
import holy.vo.TicketListVO;
import holy.vo.TicketingVO;


public class TicketDAO {
		
	private String url = MovieDBProperties.URL;
	private String uid = MovieDBProperties.UID;
	private String upw = MovieDBProperties.UPW;
	
	
	public TicketDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}	
	}
	// 삽입하기
	//INTO TICKETING VALUES ('TICK'||LPAD(TICK_SEQ.NEXTVAL,4,0),'2023-06-01',2,24000,'카드','SCH0001');
	 
	
	public int insertTicket(TicketingVO tv) {
		String sql = "insert into ticketing values ('TICK'||LPAD(TICK_SEQ.NEXTVAL,4,0),?,?,?,?,?)";
		Connection conn =null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			
			
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1,tv.getTickdate() );
			pstmt.setInt(2, tv.getTickcount());
			pstmt.setInt(3, tv.getTickprice());
			pstmt.setString(4, tv.getPaymehod());
			pstmt.setString(5, tv.getSchenum());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insertTicket메소드 오류");
		}
		return result;
		
	}
	
	
	//INSERT INTO TICKETLIST VALUES (TICKLIST_SEQ.NEXTVAL, 'TICK0006', 'werty1212','D-7');
	public int insertTicketList(TicketListVO lvo) {
		
		String sql = "insert into TICKETLIST values (TICKLIST_SEQ.NEXTVAL,?,?,?)";
		Connection conn =null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			
			
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1,lvo.getTickno() );
			pstmt.setString(2, lvo.getMemid());
			pstmt.setString(3, lvo.getSeatnum());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("insertTicketList메소드 오류");
		}
		return result;
		
	}
	
	
	// 예매내역확인
	public List<TicketListVO> getTicket(String id) {
		
		String sql = "SELECT FILMTITLE, SCHEDATE, SCHETIME, THEANUM, PAYMEHOD,FILMRUNTIME, SEATNUM, TICKDATE, TICKPRICE, TICKCOUNT, MEMID\n"
				+ "FROM TICKETLIST L JOIN TICKETING T ON L.TICKNO = T.TICKNO\n"
				+ "JOIN SCHEDULE S ON T.SCHENUM = S.SCHENUM\n"
				+ "JOIN FILM F ON F.FILMNUM = S.FILMNUM\n"
				+ "WHERE MEMID = ?\n"
				+ "order by schedate desc";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TicketListVO> list = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				TicketListVO listvo = new TicketListVO();
				listvo.setFilmtitle(rs.getString("filmtitle"));				
				listvo.setFilmruntime(rs.getString("filmruntime"));				
				listvo.setTheanum(rs.getString("theanum"));			
				listvo.setSchedate(rs.getString("schedate"));				
				listvo.setSeatnum(rs.getString("seatnum"));
				listvo.setSchetime(rs.getString("schetime"));
				listvo.setTickcount(rs.getInt("tickcount"));				
				listvo.setTickdate(rs.getString("tickdate"));				
				listvo.setTickprice(rs.getInt("tickprice"));				
				listvo.setMemid(rs.getString("memid"));
				listvo.setPaymethod(rs.getString("paymehod"));
				list.add(listvo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("getTicket메소드 오류");
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list; 
	}
	
	public String getTickno() {
	      String sql = "select * from ticketing order by tickno desc";
	      Connection conn =null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String tickno = "";
	      try {
	         conn = DriverManager.getConnection(url, uid, upw);
	         pstmt = conn.prepareStatement(sql);         
	         rs = pstmt.executeQuery();
	         if(rs.next()) {
	            tickno = rs.getString(1);
	         }
	         
	         
	         
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.out.println("insertTicketList메소드 오류");
	      }
	      return tickno;
	      
	   }
	

}
