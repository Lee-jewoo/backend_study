package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	DeptDAO dao;
	
	// 전체 목록
	@Override
	public List<DeptDTO> findAll(Map<String, String> map) {
		return dao.findAll(map);
	}

	// 부서 등록
	@Override
	public int deptAdd(DeptDTO dto) {
		return dao.deptAdd(dto);
	}

	// 부서 삭제
	@Override
	public int deptDelete(int deptno) {
		return dao.deptDelete(deptno);
	}

	// 부서 상세 보기
	@Override
	public DeptDTO deptRetrieve(int deptno) {
		return dao.deptRetrieve(deptno);
	}
	
	// 부서 수정
	@Override
	public int deptUpdate(DeptDTO dto) {
		return dao.deptUpdate(dto);
	}

}
