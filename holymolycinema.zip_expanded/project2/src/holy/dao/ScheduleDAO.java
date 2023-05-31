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
			// TODO: handle exception
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
			// TODO: handle exception
		}
		return sv;
	}
	
	
	
	
	public List<ScheduleVO> getSche(){
		String sql = "SELECT * FROM SCHEDULE";
		List<ScheduleVO> list = new ArrayList<>(); 
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {			
			//conn , pstmt ,resultset	
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);

			// 매개변수로 받아온 값

			rs= pstmt.executeQuery();

			while(rs.next()) {
				//String scheNum, String scheTime, int leftSeat, String theaNum, String filmNum
				String schenum = rs.getString(1);
				String schedate = rs.getString(2);
				String schetime = rs.getString(3);
				int leftseat = rs.getInt(4);
				TheaterVO thenum = new TheaterVO();
				thenum.setTheaNum(rs.getString(5));
				String thenum2 = rs.getString(5);
				String filmnum = rs.getString(6);
				FilmVO filmvo = new FilmVO();
				filmvo.setFilmNum(filmnum);
				
				//1행에 대한 값을 저장
				ScheduleVO vo = new ScheduleVO(schenum, schedate, schetime, leftseat,thenum2,filmnum);

				//리스트에 vo를 추가
				list.add(vo);				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}


		return list;
	}
		
		public int insertSche(ScheduleVO vo){
			String sql = "insert into schedule values(?,?,?,?,?,?)";
			int result = 0;
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			
			try {			
				//conn , pstmt ,resultset	
				conn = DriverManager.getConnection(url, uid, upw);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, vo.getScheNum());
				pstmt.setString(2, vo.getScheDate());
				pstmt.setString(3, vo.getScheTime());
				pstmt.setInt(4, vo.getLeftSeat());
				pstmt.setString(5, vo.getTheaNum());
				pstmt.setString(6, vo.getFilmNum());
				
				
				// 매개변수로 받아온 값
			
				result = pstmt.executeUpdate();

				

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
					pstmt.close();
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}

			}


			return result;
	}
	

}
