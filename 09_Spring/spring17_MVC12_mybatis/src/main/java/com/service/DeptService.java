package com.service;

import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {
	
	// 전체 목록
	public List<DeptDTO> findAll();
	
	// 부서 등록
	public int deptAdd(DeptDTO dto);
	
	// 부서 삭제
	public int deptDelete(int deptno);

}
