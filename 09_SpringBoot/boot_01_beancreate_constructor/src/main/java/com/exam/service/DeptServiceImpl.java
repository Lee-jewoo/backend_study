package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.DeptDAO;

@Service("service")
public class DeptServiceImpl {
	
	DeptDAO dao;
	
	public DeptServiceImpl(DeptDAO dao) {
		this.dao = dao;
	}
	
	public List<String> list() {
		return dao.list();
	}

}
