package workshop_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	// 문제1
	public List<StudentDTO> selectAll(Connection con) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no as 학번, department_no as 학과번호, "
					+ " student_name as 이름, substr(student_ssn, 1, 8)||'******' as 주민번호, "
					+ " substr(student_address, 1, 10)||'...' as 주소, to_char(entrance_date, 'YYYY/MM/DD') as 입학년도, "
					+ " absence_yn as 휴학여부, coach_professor_no as 지도교수번호 "
					+ " from tb_student order by 1 asc";
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
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	
	// 문제2
	public List<StudentDTO> searchName(Connection con, String scName) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no as 학번, department_no as 학과번호, "
					+ " student_name as 이름, substr(student_ssn, 1, 8)||'******' as 주민번호, "
					+ " case when student_address is null then '*****주소 미상*****' else substr(student_address, 1, 10)||'...' end"
					+ " as 주소, to_char(entrance_date, 'YYYY/MM/DD') as 입학년도, "
					+ " absence_yn as 휴학여부, coach_professor_no as 지도교수번호 "
					+ " from tb_student where student_name like ? order by 1";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+scName+"%");
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
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	// 문제3
	public List<StudentDTO> stuEnt(Connection con, int startYear, int endYear) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select student_no as 학번, department_no as 학과번호, "
					+ " student_name as 이름, substr(student_ssn, 1, 8)||'******' as 주민번호, "
					+ " case when student_address is null then '*****주소 미상*****' else substr(student_address, 1, 10)||'...' end"
					+ " as 주소, to_char(entrance_date, 'YYYY/MM/DD') as 입학년도, "
					+ " absence_yn as 휴학여부, coach_professor_no as 지도교수번호 "
					+ " from tb_student where to_number(substr(to_char(entrance_date, 'YYYY/MM/DD'), 1, 4)) between ? and ? "
					+ " order by 6 desc";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startYear);
			pstmt.setInt(2, endYear);
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
			
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
	// 문제4
	public List<StudentDTO> searchStuNo(Connection con, String inputStuNo) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		try {
			String sql = "select student_no as 학번, department_no as 학과번호, "
					+ " student_name as 이름, substr(student_ssn, 1, 8)||'******' as 주민번호, "
					+ " case when student_address is null then '*****주소 미상*****' else substr(student_address, 1, 10)||'...' end"
					+ " as 주소, to_char(entrance_date, 'YYYY/MM/DD') as 입학년도, "
					+ " absence_yn as 휴학여부, coach_professor_no as 지도교수번호 "
					+ " from tb_student where student_no in ( ";
			String [] inputStuNo_arr = inputStuNo.split(",");
			for (int i=0; i<inputStuNo_arr.length; i++) {
				sql += "?";
				if (i!=inputStuNo_arr.length-1) {
					sql += ",";
				}
			}
			sql += " ) order by 1 asc";
			pstmt = con.prepareStatement(sql);
			for (int i=0; i<inputStuNo_arr.length; i++) {
				pstmt.setString(i+1, inputStuNo_arr[i]);
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String stuNo = rs.getString("학번");
				String departNo = rs.getString("학과번호");
				String stuName = rs.getString("이름");
				String stuSsn = rs.getString("주민번호");
				String stuAddress = rs.getString("주소");
				String entDate = rs.getString("입학년도");
				char absYn = rs.getString("휴학여부").charAt(0);
				String coachProfessorNo = rs.getString("지도교수번호");
				StudentDTO dto = new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, entDate, absYn, coachProfessorNo);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	
	// 문제5
	public int updateAbs(Connection con, String updateStuNo) {
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			String sql = "update tb_student set absence_yn = 'Y' "
					+ "where student_no in ( ";
			String [] yn = updateStuNo.split(",");
			for (int i=0; i<yn.length; i++) {
				sql += "?";
				if (i != yn.length-1) {
					sql += ",";
				}
			}
			sql += ")";
			pstmt = con.prepareStatement(sql);
			for (int i=0; i<yn.length; i++) {
				pstmt.setString(i+1, yn[i]);
			}
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return num;
	}
	
	// 문제6
	public int inccapacity(Connection con) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "update tb_department set capacity = "
					+ " case when capacity between 0 and 20 then capacity+5 "
					+ " when capacity between 21 and 25 then capacity+4 "
					+ " when capacity between 26 and 30 then capacity+3 "
					+ " else capacity end";
			pstmt = con.prepareStatement(sql);
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return num;
	}
	
	// 문제7
	public List<List<String>> grade(Connection con, String inputStuNo) {
		List<List<String>> list = new ArrayList<List<String>>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select term_no, s.student_no, "
					   + " student_name, class_name, "
					   + " point, "
					   + " case when point >= 4.0 then 'A학점' when point >= 3.5 then 'B학점' "
					   + " when point >= 3.0 then 'C학점' when point >= 2.0 then 'D학점' "
				       + " else 'F학점' end as grade"
					   + " from tb_student s"
					   + " join tb_grade g on s.student_no = g.student_no"
					   + " join tb_class c on g.class_no = c.class_no"
					   + " where s.student_no = ? order by 1 asc";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputStuNo);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				List<String> sqllist = new ArrayList<>();
				sqllist.add(rs.getString("term_no"));
				sqllist.add(rs.getString("student_no"));
				sqllist.add(rs.getString("student_name"));
				sqllist.add(rs.getString("class_name"));
				sqllist.add(rs.getString("point"));
				sqllist.add(rs.getString("grade"));
				list.add(sqllist);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}

}
