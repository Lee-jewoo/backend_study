package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {
	
	public List<EmpDTO> select(SqlSession session) {
		
		List<EmpDTO> list = session.selectList("EmpMapper.select");
		return list;
		
	}
	
	public int insert(SqlSession session, EmpDTO dto) {
		int n = session.insert("EmpMapper.insert", dto);
		return n;
	}

}