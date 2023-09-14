package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/xxx")
	public String home() {
		System.out.println("TestController.home");
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main");
		return "hello";
	}

}
