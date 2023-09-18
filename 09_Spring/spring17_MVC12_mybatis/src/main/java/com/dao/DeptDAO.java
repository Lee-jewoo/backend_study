package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository("dao")
public class DeptDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	// 전체 목록
	public List<DeptDTO> findAll(){
		return session.selectList("DeptMapper.findAll");
	}
	
	// 부서 등록
	public int deptAdd(DeptDTO dto) {
		return session.insert("DeptMapper.deptAdd", dto);
	}
	
	// 부서 삭제
	public int deptDelete(int deptno) {
		return session.delete("DeptMapper.deptDelete", deptno);
	}

}
