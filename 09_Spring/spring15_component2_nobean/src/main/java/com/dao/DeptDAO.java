package com.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component("dao")
@Repository("dao")
public class DeptDAO {
	
	public List<String> list() {
		return Arrays.asList("춘식이", "라이언");
	}

}
