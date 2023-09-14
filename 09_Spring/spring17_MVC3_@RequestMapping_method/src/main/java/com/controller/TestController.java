package com.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	// GET
	@RequestMapping(value="/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm");
		return "/WEB-INF/views/loginForm.jsp";
	}
	
	@GetMapping("/loginForm2")
	public String loginForm2() {
		System.out.println("loginForm2");
		return "/WEB-INF/views/loginForm.jsp";
	}
	
	// POST
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login() {
		System.out.println("login");
		return "/WEB-INF/views/main.jsp";
	}
	
	@PostMapping("/login")
	public String login2() {
		System.out.println("login2");
		return "/WEB-INF/views/main.jsp";
	}
}
