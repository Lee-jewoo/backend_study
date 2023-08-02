package deptPractice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DeptServicePractice {
	
	// DB의 4가지 정보 저장
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";
	
	// 드라이버 로딩
	public DeptServicePractice () {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// select를 위한 메서드
	public List<DeptDTOPractice> select() {
		List<DeptDTOPractice> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAOPractice dao = new DeptDAOPractice();
			list = dao.select(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}

}
