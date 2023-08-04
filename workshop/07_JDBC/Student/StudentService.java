package workshop_jdbc;

import java.util.List;

public interface StudentService {
	
	// 문제1
	public List<StudentDTO> selectAll();
	
	// 문제2
	public List<StudentDTO> searchName(String scName);
	
	// 문제3
	public List<StudentDTO> stuEnt(int startYear, int endYear);
	
	// 문제4
	public List<StudentDTO> searchStuNo(String inputStuNo);

	// 문제5
	public int updateAbs(String updateStuNo);
	
	// 문제6
	public int inccapacity ();
	
	// 문제7
	public List<List<String>> grade(String inputStuNo);
}
