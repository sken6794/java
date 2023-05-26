package jdbc.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DemoSelect01 {
	public static void main(String[] args) {
		
		
		//데이터베이스 연결정보
		//jdbc:oracle:thin:DB의 설치된주소(호스트이름):포트번호:DB이름
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		//String sql = "SELECT * FROM EMPLOYEES WHERE SALARY > 5000";
		String sql = "SELECT * FROM EMPLOYEES WHERE SALARY > ?";
		//모든 데이터베이스 연결은 try ~ catch 문 안에 작성이 되어야함.
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			//1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 커넥션 객체 생성
			//Connection con = DriverManager.getConnection(url, uid, upw);
			con = DriverManager.getConnection(url, uid, upw);
			//3. 커넥션 객체에서 state 객체 생성
			pstmt = con.prepareStatement(sql);
			
			//3-2 SQL 문에 전달할 값이 있다면 ?로 처리하고 순서대로 1번부터 시작
			// ? 에 전달될 값은 set메소드를 이용해서 채웁니다.
			//setString, setInt, setDouble, setDate, setTimestamp
			pstmt.setInt(1, 7000); // 첫번째 ? 에 5000 삽입
			
			//4. sql문의 실행
			//select 는 executeQuery()
			//update, insert, delete 문장은 executeUpdate()
			 rs =  pstmt.executeQuery();
			
			//5. rs.next() 다음행이 있으면 다음행에 접근
			while(rs.next()) { // 한 행에서 처리할 작업을 while문 안에 넣으면 된다.
				//getString, getInt, getDouble, getDate, getTimestamp
				
				String first_name = rs.getString("first_name");
				int salary = rs.getInt("salary");
				double commission = rs.getDouble("commission_pct");
				Date date = rs.getDate("hire_date");
				Timestamp  date2 = rs.getTimestamp("hire_date"); 
				System.out.println(first_name);
				System.out.println(salary);
				System.out.println(commission);
				System.out.println(date);
				System.out.println(date2);
				System.out.println("----------------------------");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
