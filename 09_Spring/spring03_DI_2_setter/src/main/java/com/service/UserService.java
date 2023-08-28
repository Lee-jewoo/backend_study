package com.service;

import java.util.List;

import com.dao.UserDAO;

public class UserService {
	
	int num;
	String name;
	UserDAO dao;
	
	public List<String> list() {
		return dao.list();
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

}
