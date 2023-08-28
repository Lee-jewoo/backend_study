package com.service;

import java.util.List;

import com.dao.UserDAO;

public class UserService {
	
	int num;
	String name;
	UserDAO dao;

	public UserService() {
		System.out.println("UserService() 생성자");
	}

	public UserService(int num) {
		this.num = num;
		System.out.println("UserService(int num) 생성자");
	}
	
	public UserService(int num, String name) {
		this.num = num;
		this.name = name;
		System.out.println("UserService(int num, String name) 생성자");
	}
	
	public UserService(UserDAO dao) {
		this.dao = dao;
	}
	
	public UserService(UserDAO dao, int num) {
		this.dao = dao;
		this.num = num;
	}
	
	public List<String> list() {
		return dao.list();
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}

}
