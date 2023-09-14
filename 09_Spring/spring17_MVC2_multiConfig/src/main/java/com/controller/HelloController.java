package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/xxx")
	public String aaa() {
		System.out.println("HelloController.aaa");
		return "/WEB-INF/views/aaa.jsp";
	}

}
