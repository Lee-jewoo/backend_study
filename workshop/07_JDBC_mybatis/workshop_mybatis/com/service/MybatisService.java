package com.service;

import java.util.HashMap;
import java.util.List;

import com.dto.StudentDTO;

public interface MybatisService {
	
	public List<StudentDTO> selectAll();

	public List<StudentDTO> selectByName(String stuName);
	
	public List<StudentDTO> selectByEntranceDate(HashMap<String, String> map);
}
