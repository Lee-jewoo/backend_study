package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import com.dao.DeptDAO;
import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

public class DeptServiceImpl implements DeptService {
	// 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";

	// 드라이버 로딩
	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// select 기능을 수행하는 method
	// Connection 까지 얻기 -> 이후 작업은 DAO에서 수행
	@Override
	public List<DeptDTO> findAll() {
		List<DeptDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO에 접근
			DeptDAO dao = new DeptDAO();
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
	
	// insert 기능을 수행하는 method
	// Connection 까지 얻기 -> 이후 작업은 DAO에서 수행
	@Override
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException{
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 연동
			DeptDAO dao = new DeptDAO();
			n = dao.insert(con, dto);
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
		return n;
	}
	
	// update 기능을 수행하는 method
	// Connection 까지 얻기 -> 이후 작업은 DAO에서 수행
	@Override
	public int update(DeptDTO dto){
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 연동
			DeptDAO dao = new DeptDAO();
			n = dao.update(con, dto);
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
		return n;
	}
	
	// delete 기능을 수행하는 method
	// Connection 까지 얻기 -> 이후 작업은 DAO에서 수행
	@Override
	public int delete(int deptno){
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			// DAO 연동
			DeptDAO dao = new DeptDAO();
			n = dao.delete(con, deptno);
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
		return n;
	}

	@Override
	public int update_delete(DeptDTO dto, int deptno) {
		int n = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			con.setAutoCommit(false);
			DeptDAO dao = new DeptDAO();
			// 트랜잭션 : 여러 작업을 동시에 처리, 커밋
			// 하나라도 실패하면 롤백 -> 오토커밋 비활성화 필요
			n = dao.update(con, dto);
			n = dao.delete(con, deptno);
			con.commit();
		} catch (SQLException e) {
			try {
				if (con != null) {
					con.rollback();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
		return n;
	}
	
}
