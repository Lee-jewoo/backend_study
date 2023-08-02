package workshop_jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	// 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "workshop";
	String passwd = "workshop";
	
	
	// 드라이버 로딩
	public StudentServiceImpl () {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> list = null;
		Connection con = null;
		try {
			// Connection 연결
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO에 접근
			StudentDAO dao = new StudentDAO();
			list = dao.findAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
}
