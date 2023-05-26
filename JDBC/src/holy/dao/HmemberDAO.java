package holy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import holy.vo.HmemberVO;
import jdbc.demo.mvc.DBProperties;

public class HmemberDAO {
	
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	
	public HmemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("CLASS FOR NAME ERR");
			e.printStackTrace();
		}
	}
	
	public List<HmemberVO> getMemberlist(){
		List<HmemberVO> list = new ArrayList<>();
		
		String sql = "select * from hmember";
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = DriverManager.getConnection(url, uid, upw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				HmemberVO member = new HmemberVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				list.add(member);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
}
