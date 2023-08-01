package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept (deptno, dname, loc) "
					+ " values(?, ?, ?)"; // ? = 바인딩변수 / 나중에 값 설정
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 11);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");
			int num = pstmt.executeUpdate();
			System.out.println("레코드생성개수 : "+num);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
