package workshop_jdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Oracle의 TB_STUDENT 테이블을 연동하는 클래스
public class StudentDAO {
	
	// select 기능을 하는 method
	public List<StudentDTO> findAll(Connection con) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no as 학번, department_no as 학과번호, "
					+ " student_name as 이름, substr(student_ssn, 1, 8)||'******' as 주민번호, "
					+ " substr(student_address, 1, 10)||'...' as 주소, to_char(entrance_date, 'YYYY/MM/DD') as 입학년도, "
					+ " absence_yn as 휴학여부, coach_professor_no as 지도교수번호 "
					+ " from tb_student";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNO = rs.getString("학번");
				String departNo = rs.getString("학과번호");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAddress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				char absYn = rs.getString("휴학여부").charAt(0);
				String coachProfessorNo = rs.getString("지도교수번호");
				StudentDTO dto = new StudentDTO(stuNO, departNo, stuName, stuSsn, stuAddress, entDate, absYn, coachProfessorNo);
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
