package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	// 맵핑값 한 개
	@RequestMapping(value="/aaa")
	public String aaa() {
		System.out.println("TestController./aaa");
		return "/WEB-INF/views/main.jsp";
	}
	
	// 맵핑값 두 개
	@RequestMapping(value= {"/bbb", "/bbb2"})
	public String bbb() {
		System.out.println("TestController./bbb");
		return "/WEB-INF/views/main.jsp";
	}
	
	// 특정 값으로 시작하는 맵핑값
	@RequestMapping(value= "/ccc*")
	public String ccc() {
		System.out.println("TestController./ccc*");
		return "/WEB-INF/views/main.jsp";
	}
	
	// 특정 경로 이하의 하나인 모든 것
	@RequestMapping(value= "/ddd/*")
	public String ddd() {
		System.out.println("TestController./ddd/*");
		return "/WEB-INF/views/main.jsp";
	}
	
	// 특정 경로 이하의 둘 이상인 모든 것 (/eee 포함)
	@RequestMapping(value= "/eee/**")
	public String eee() {
		System.out.println("TestController./eee/**");
		return "/WEB-INF/views/main.jsp";
	}
	
	// 특정 경로 사이 하나
	@RequestMapping(value = "/fff/*/ggg")
	public String fff() {
		System.out.println("TestController./fff/*/ggg");
		return "/WEB-INF/views/main.jsp";
	}
	
	// 특정 경로 사이 둘 이상
	@RequestMapping(value = "/ggg/**/hhh")
	public String ggg() {
		System.out.println("TestController./ggg/**/hhh");
		return "/WEB-INF/views/main.jsp";
	}

}
