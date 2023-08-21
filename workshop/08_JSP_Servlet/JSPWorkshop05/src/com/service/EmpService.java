package com.service;

import java.util.List;

import com.dto.EmpDTO;

public interface EmpService {
	
	public List<EmpDTO> list ();
	
	public int insert (EmpDTO dto);
	
	public EmpDTO retrieve (int num);
	
	public int update (EmpDTO dto);
	
	public int delete (int num);

}
