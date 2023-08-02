package deptPractice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DeptServicePractice {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";
	
	// 드라이버 연동
	public DeptServicePractice () {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<DeptDTOPractice> select () {
		Connection con = null;
		List<DeptDTOPractice> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			DeptDAOPractice dao = new DeptDAOPractice();
			list = dao.select(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

}
