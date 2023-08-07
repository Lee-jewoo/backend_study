package workshop_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService{
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "workshop";
	String passwd = "workshop";
	
	public StudentServiceImpl () {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 문제1
	public List<StudentDTO> selectAll () {
		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.selectAll(con);
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

	// 문제2
	@Override
	public List<StudentDTO> searchName(String scName) {
		List<StudentDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.searchName(con, scName);
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

	// 문제3
	@Override
	public List<StudentDTO> stuEnt(int startYear, int endYear) {
		Connection con = null;
		List<StudentDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.stuEnt(con, startYear, endYear);
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

	// 문제4
	@Override
	public List<StudentDTO> searchStuNo(String inputStuNo) {
		Connection con = null;
		List<StudentDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.searchStuNo(con, inputStuNo);
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

	// 문제5
	@Override
	public int updateAbs(String updateStuNo) {
		Connection con = null;
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			num = dao.updateAbs(con, updateStuNo);
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
		
		return num;
	}

	// 문제6
	@Override
	public int inccapacity() {
		Connection con = null;
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			num = dao.inccapacity(con);
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
		
		return num;
	}

	// 문제7
	@Override
	public List<List<String>> grade(String inputStuNo) {
		List<List<String>> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			StudentDAO dao = new StudentDAO();
			list = dao.grade(con, inputStuNo);
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
