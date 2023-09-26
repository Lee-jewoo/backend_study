package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/main")
	public String main() {
		System.out.println("main");
		return "main";
	}
	
	@GetMapping("/login")
	public String login() {
		System.out.println("login");
		return "main";
	}

}
