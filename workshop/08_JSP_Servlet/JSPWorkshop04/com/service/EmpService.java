package com.service;

import java.util.List;

import com.dto.EmpDTO;

public interface EmpService {
	
	public List<EmpDTO> select();
	
	public int insert(EmpDTO dto);

}
