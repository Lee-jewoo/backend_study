package com.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository("dao")
public class DeptDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	// 전체 목록 + 검색
	public List<DeptDTO> findAll(Map<String, String> map){
		return session.selectList("DeptMapper.findAll", map);
	}
	
	// 부서 등록
	public int deptAdd(DeptDTO dto) {
		return session.insert("DeptMapper.deptAdd", dto);
	}
	
	// 부서 삭제
	public int deptDelete(int deptno) {
		return session.delete("DeptMapper.deptDelete", deptno);
	}
	
	// 상세 보기
	public DeptDTO deptRetrieve (int deptno) {
		return session.selectOne("DeptMapper.deptRetrieve", deptno);
	}
	
	// 부서 수정
	public int deptUpdate (DeptDTO dto) {
		return session.update("DeptMapper.deptUpdate", dto);
	}
	
}
