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
	// 제목
	
	
	
	
	// 예매내역확인
	public List<TicketListVO> getTicket(String id) {
		
		String sql = "select t.tickno, t.tickseat, t.tickdate, t.tickcount,\r\n"
				+ "    t.tickprice, t.paymehod, t.memid, s.schedate, s.schetime, s.theanum,\r\n"
				+ "    f.filmtitle, f.filmruntime\r\n"
				+ "from ticketing t\r\n"
				+ "join schedule s on t.schenum = s.schenum\r\n"
				+ "join film f on s.filmnum = f.filmnum\r\n"
				+ "where t.memid = ?";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TicketListVO> list = new ArrayList();
		TicketListVO tvo = null;
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				TicketingVO tickvo = new TicketingVO();
				ScheduleVO svo = new ScheduleVO();
				FilmVO fvo = new FilmVO();
				HmemberVO mvo = new HmemberVO();
				tvo = new TicketListVO();
				TheaterVO thvo = new TheaterVO();
				tickvo.setTickNo(rs.getString("tickno"));
				tickvo.setTickSeat(rs.getString("tickseat"));
				tickvo.setTickDate(rs.getString("tickdate"));
				tickvo.setTickCount(rs.getInt("tickcount"));
				tickvo.setTickPrice(rs.getInt("tickprice"));
				tickvo.setPayMethod(rs.getString("paymehod"));
				svo.setScheDate(rs.getString("schedate"));
				svo.setScheTime(rs.getString("schetime"));
				fvo.setFilmTitle(rs.getString("filmtitle"));
				fvo.setFilmRuntime(rs.getString("filmruntime"));
				mvo.setMemId(rs.getString("memid"));
				
				thvo.setTheaNum(rs.getString("theanum"));
				
				
				tvo.setFvo(fvo);
				tvo.setSvo(svo);
				tvo.setTickvo(tickvo);
				
				list.add(tvo);
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
	
	public int insertTicket(TicketingVO vo) {
		
		String sql = "insert into TICKETING values ('TICK'||LPAD(TICK_SEQ.NEXTVAL,4,0),?,?,?,?,?,?,?)";
		/*
		 *  TICKNO    NOT NULL VARCHAR2(100) 
			TICKSEAT  NOT NULL VARCHAR2(20)  
			TICKDATE           DATE          
			TICKCOUNT          NUMBER(10)    
			TICKPRICE NOT NULL NUMBER(20)    
			PAYMEHOD           VARCHAR2(10)  
			SCHENUM            VARCHAR2(100) 
			MEMID              VARCHAR2(35)  
		 */
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getTickseat());
			pstmt.setString(2, vo.getTickdate());
			pstmt.setInt(3, vo.getTickcount());
			pstmt.setInt(4, vo.getTickprice());
			pstmt.setString(5, vo.getPaymehod());
			pstmt.setString(6, vo.getScvo().getSchenum());
			pstmt.setString(7, vo.getMemvo().getMemid());
			
			
			
			
			result = pstmt.executeUpdate();
			
			if(result == 0) {
				System.out.println("정보가 없음");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insertTicket메소드 오류");
		}
		
		
		
		
		
		return result;
	}
}
