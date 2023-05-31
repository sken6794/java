package holy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import holy.main.MovieDBProperties;
import holy.vo.FilmVO;
import holy.vo.HmemberVO;
import holy.vo.ScheduleVO;
import holy.vo.TheaterVO;

public class ScheduleDAO {
	
	
	private String url = MovieDBProperties.URL;
	private String uid = MovieDBProperties.UID;
	private String upw = MovieDBProperties.UPW;
	ScheduleVO sv;
	
	
	public ScheduleDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}		
		
	}
	
	public List<ScheduleVO> getDetail (String title) { // 날짜 꺼내기
		String sql = "SELECT S.SCHEDATE ,F.FILMCONTENT FROM SCHEDULE S LEFT JOIN FILM F ON S.FILMNUM = F.FILMNUM\n"
				+ "WHERE FILMTITLE = ?";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ScheduleVO> sv = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String scheDate = rs.getString("schedate");
				String filmContent = rs.getString("filmcontent");
				ScheduleVO sv2 = new ScheduleVO(scheDate,filmContent);
				sv.add(sv2);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sv;
	}
	
	
	public List<ScheduleVO> getDetail (String title , String date) { // 시간 꺼내기
		String sql = "SELECT S.SCHETIME ,F.FILMCONTENT FROM SCHEDULE S LEFT JOIN FILM F ON S.FILMNUM = F.FILMNUM\n"
				+ "WHERE F.FILMTITLE = ?  AND S.SCHEDATE = ?";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ScheduleVO> sv = new ArrayList<>();
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, date);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {

				String scheTime = rs.getString("schetime");
				ScheduleVO sv2 = new ScheduleVO(scheTime);
				sv.add(sv2);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sv;
	}
	
	public ScheduleVO getDetail (String title , String date,String time) { // 상영번호
		String sql = "SELECT * FROM SCHEDULE S LEFT JOIN FILM F ON S.FILMNUM = F.FILMNUM\n"
				+ "WHERE F.FILMTITLE = ?  AND S.SCHEDATE = ? AND S.SCHETIME = ?";
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, date);
			pstmt.setString(3, time);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				String schenum = rs.getString("schenum");
				String schedate = rs.getString("schedate");
				String schetime = rs.getString("schetime");
				String theanum = rs.getString("theanum");
				String filmnum = rs.getString("filmnum");
				String filmtitle = rs.getString("filmtitle");
				
				
				
				sv = new ScheduleVO(schenum,schedate,schetime,theanum,filmnum,filmtitle);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sv;
	}
	
	
	
	

	

}
