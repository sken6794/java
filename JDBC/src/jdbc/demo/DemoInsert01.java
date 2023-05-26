package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert01 {
	public static void main(String[] args) {
		
		//입력될 값은 콘솔로 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서이름 > ");
		String name = sc.nextLine();
		System.out.println("매니저아이디 > ");
		String mid = sc.nextLine();
		System.out.println("로케이션아이디 > ");
		String lid = sc.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		//inset, update, delete 는 ResultSet 객체가 필요없음
		
		String sql = "insert into depts values (depts_seq.nextval,?,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//1. 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 
			con = DriverManager.getConnection(url, uid, upw);
			
			//3.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(mid));
			pstmt.setInt(3, Integer.parseInt(lid));//오라클에서 문자형이여도 정수로 치환가능하면 자동형변환 해줌
			
			
			//4.
			int result = pstmt.executeUpdate();
			System.out.println("성공1 실패0 : "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
	}
}
