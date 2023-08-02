package com.service;

import java.util.List;

import com.dto.DeptDTO;
import com.exception.DuplicatedDeptnoException;

// dept 테이블의 데이터를 가공하는 역할 -> 비즈니스 로직과 트랜잭션 처리
public interface DeptService {
	// select를 위해 데이터를 리스트로 저장
	public List<DeptDTO> findAll();
	
	// insert를 위한 메서드
	public int insert(DeptDTO dto) throws DuplicatedDeptnoException;
	
	// update를 위한 메서드
	public int update(DeptDTO dto);
	

}
