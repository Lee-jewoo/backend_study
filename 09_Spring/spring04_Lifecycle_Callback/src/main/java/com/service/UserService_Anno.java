package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserService_Anno {

	public UserService_Anno() {
		System.out.println("UserService 생성자");
	}

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct.init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("@PreDestroy.destroy");
	}

}
