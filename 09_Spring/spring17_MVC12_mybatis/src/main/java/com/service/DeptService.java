package com.service;

import java.util.List;
import java.util.Map;

import com.dto.DeptDTO;

public interface DeptService {
	
	// 전체 목록
	public List<DeptDTO> findAll(Map<String, String> map);
	
	// 부서 등록
	public int deptAdd(DeptDTO dto);
	
	// 부서 삭제
	public int deptDelete(int deptno);
	
	// 상세보기
	public DeptDTO deptRetrieve (int deptno);
	
	// 부서 수정
	public int deptUpdate (DeptDTO dto);
	
}
