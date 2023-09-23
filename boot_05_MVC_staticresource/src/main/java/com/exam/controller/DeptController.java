package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeptController {
	
	@GetMapping("/main")
	public String main() {
		System.out.println("DeptController");
		return "hello";
	}

}
