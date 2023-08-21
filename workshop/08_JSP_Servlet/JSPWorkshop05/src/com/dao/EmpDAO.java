package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {
	
	public List<EmpDTO> list (SqlSession session) {
		List<EmpDTO> list = session.selectList("EmpMapper.list");
		return list;
	}
	
	public int insert (SqlSession session, EmpDTO dto) {
		int n = session.insert("EmpMapper.insert", dto);
		return n;
	}
	
	public EmpDTO retrieve (SqlSession session, int num) {
		EmpDTO dto = session.selectOne("EmpMapper.retrieve", num);
		return dto;
	}
	
	public int update (SqlSession session, EmpDTO dto) {
		int n = session.update("EmpMapper.update", dto);
		return n;
	}
	
	public int delete (SqlSession session, int num) {
		int n = session.delete("EmpMapper.delete", num);
		return n;
	}

}
