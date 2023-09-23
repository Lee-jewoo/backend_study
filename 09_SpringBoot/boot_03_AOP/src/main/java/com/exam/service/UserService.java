package com.exam.service;

import org.springframework.stereotype.Service;

@Service("service")
public class UserService {
	
	// 핵심 기능
	public String sayEcho() {
		System.out.println("sayEcho");
		return "hello";
	}

}
