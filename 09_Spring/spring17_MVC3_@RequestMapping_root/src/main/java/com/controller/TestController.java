package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	// 중복되는 경로
	@RequestMapping(value="/member/add")
	public String add() {
		System.out.println("TestController.add");
		return "/WEB-INF/views/main.jsp";
	}
	
	@RequestMapping(value="/member/del")
	public String del() {
		System.out.println("TestController.del");
		return "/WEB-INF/views/main.jsp";
	}
	
}
