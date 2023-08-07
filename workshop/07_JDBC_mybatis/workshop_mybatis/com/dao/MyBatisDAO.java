package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.StudentDTO;

public class MyBatisDAO {
	
	public List<StudentDTO> selectAll(SqlSession session) {
		List<StudentDTO> list = session.selectList("StudentMapper.selectAll");
		return list;
	}
	
	public List<StudentDTO> selectByName(SqlSession session, String stuName) {
		List<StudentDTO> list = session.selectList("StudentMapper.selectByName", stuName);
		return list;
	}
	
	public List<StudentDTO> selectByEntranceDate(SqlSession session, HashMap<String, String> map) {
		List<StudentDTO> list = session.selectList("StudentMapper.selectByEntranceDate", map);
		return list;
	}

}
