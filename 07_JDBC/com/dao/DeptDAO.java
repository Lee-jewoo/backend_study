package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

// Oracle의 dept 테이블을 연동하는 클래스
public class DeptDAO {

	// select 기능을 하는 method
	public List<DeptDTO> findAll(Connection con) {
		// DeptDTO를 누적하는 리스트
		List<DeptDTO> list = new ArrayList<DeptDTO>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select deptno as no, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt("no");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// insert 기능을 하는 method
	public int insert(Connection con, DeptDTO dto) throws DuplicatedDeptnoException{
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into dept (deptno, dname, loc) "
					+ " values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new DuplicatedDeptnoException("deptno 중복 : "+dto.getDeptno());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}
	// update 기능을 하는 method
	public int update(Connection con, DeptDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, dto.getDeptno());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}
	
	// delete 기능을 하는 method
	public int delete(Connection con, int deptno) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}
	

}
