package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.StudentDTO;

public class StudentDAO {
	
	public List<StudentDTO> select(SqlSession session) {
		
		List<StudentDTO> list = session.selectList("StudentMapper.select");
		return list;
		
	}

}
