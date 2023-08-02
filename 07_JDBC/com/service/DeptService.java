package com.service;

import java.util.List;

import com.dto.DeptDTO;

// dept 테이블의 데이터를 가공하는 역할 -> 비즈니스 로직과 트랜잭션 처리
public interface DeptService {

	public List<DeptDTO> findAll();

}
