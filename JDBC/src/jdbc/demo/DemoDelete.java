package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서 아이디 >");
		String id = sc.nextLine();
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "delete from depts where department_id = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, uid, upw);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			int re = pstmt.executeUpdate();
			System.out.println("성공하면 1 : "+re);
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
