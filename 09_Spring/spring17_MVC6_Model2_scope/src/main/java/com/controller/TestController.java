package com.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;

@Controller
public class TestController implements ServletContextAware{
	
	// scope에 Model 저장
	
	ServletContext application;
	
	@RequestMapping("/aaa")
	public String aaa(Model m, HttpSession session) {
		m.addAttribute("request", "request");
		session.setAttribute("session", "session");
		application.setAttribute("application", "application");
		return "hello";
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.application = servletContext;
	}

	
}
