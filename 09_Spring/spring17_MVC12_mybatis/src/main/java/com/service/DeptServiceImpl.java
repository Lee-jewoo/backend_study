package com.service;

import java.util.List;

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
	public List<DeptDTO> findAll() {
		return dao.findAll();
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

}
