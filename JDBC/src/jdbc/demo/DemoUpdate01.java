package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoUpdate01 {
	public static void main(String[] args) {

		//부서아이디, 부서이름을 입력받아서 해당 부서의 이름을 변경하는 update 구문
		Scanner sc = new Scanner(System.in);

		System.out.println("변경하고자 하는 부서아이디 > ");
		String id = sc.nextLine();
		System.out.println("변경할 부서이름 > ");
		String name = sc.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "update depts set department_name = ? where department_id = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			
			con = DriverManager.getConnection(url, uid, upw);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(id));
			
			int result = pstmt.executeUpdate();
			System.out.println("성공 1 , 실패 0 : "+result);
		} catch (Exception e) {
			
		} finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
