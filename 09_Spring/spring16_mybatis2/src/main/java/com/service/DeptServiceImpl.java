package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	DeptDAO dao;

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
