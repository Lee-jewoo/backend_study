package com.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.dao.DeptDAO;
import com.exam.dto.DeptDTO;

@Service("service")
public class DeptServiceImpl implements DeptService {
	
	// 생성자로 주입
	DeptDAO dao;
	public DeptServiceImpl(DeptDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<DeptDTO> deptList() {
		return dao.deptList();
	}

	@Override
	public int deptAdd(DeptDTO dto) {
		return dao.deptAdd(dto);
	}

	@Override
	public int deptUpdate(DeptDTO dto) {
		return dao.deptUpdate(dto);
	}

	@Override
	public int deptDelete(int deptno) {
		return dao.deptDelete(deptno);
	}
	

}
