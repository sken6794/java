package jdbc.demo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptsDAO {
	//멤버변수
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;

	//생성자
	public DeptsDAO() { //생성자 호출이 되면 Class.forName도 실행될거임

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("CLASS FOR NAME ERR");
			e.printStackTrace();
		}
	}

	//메소드(데이터베이스 결과가 1행 => VO를 반환
	// 	   (데이터베이스 결과가 n행 => List<VO> 반환 
	public List<DeptsVO> getDepts(String name ){

		String sql ="select * from depts where department_name = ?";
		List<DeptsVO> deptlist = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		try {
			//conn
			con = DriverManager.getConnection(url, uid, upw);
			//pstmt
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);

			//rs
			rs = pstmt.executeQuery();


			while(rs.next()) {

				//DeptsVO dvo = new DeptsVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				int department_id = rs.getInt("department_id");
				String department_name = rs.getString("department_name");
				int manager_id = rs.getInt("manager_id");
				int location_id = rs.getInt("location_id");

				//1행에 대한 값 저장
				DeptsVO dvo = new DeptsVO(department_id, department_name, manager_id, location_id);
				//리스트에 vo를 추가
				deptlist.add(dvo);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {

			}
		}


		return deptlist;
	}

	//insert 메소드
	public int insertDepts(DeptsVO vo) {
		// 0 => 실패, 1 => 성공
		int result = 0; 
		
		String sql = "insert into depts values (depts_seq.nextval,?,?,?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			

			//2. 
			con = DriverManager.getConnection(url, uid, upw);

			//3.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getDepartment_name());
			pstmt.setInt(2, vo.getManager_id());
			pstmt.setInt(3, vo.getLocation_id());

			//4.
			result = pstmt.executeUpdate(); //성공 시  1반환, 실패시 0반환
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {

			}
		}

		return result;
	}

}
