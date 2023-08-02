package deptPractice1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOPractice {
	
	// DTO의 정보를 받는 리스트 메서드 생성
	public List<DeptDTOPractice> select (Connection con){
		List<DeptDTOPractice> list = new ArrayList<DeptDTOPractice>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// select
		try {
			String sql = "select deptno as 번호, dname as 이름, loc as 지역 from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt("번호");
				String dname = rs.getString("이름");
				String loc = rs.getString("지역");
				DeptDTOPractice dto = new DeptDTOPractice(deptno, dname, loc);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
