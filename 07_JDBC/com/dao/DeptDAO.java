package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.dto.DeptDTO;

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

}
