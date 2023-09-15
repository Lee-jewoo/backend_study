package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa 호출");
		return "main";
	}
	
	// redirect 요청 : URL 변경됨 / request scope를 받지 못함
	@RequestMapping("/bbb")
	public String bbb(Model m) {
		System.out.println("bbb 호출");
		m.addAttribute("userid", "춘식이");
		return "redirect:aaa";
	}
	
	// forward 요청 : URL 변경되지 않음 / request scope를 받음
	@RequestMapping("/ccc")
	public String ccc(Model m) {
		System.out.println("ccc 호출");
		m.addAttribute("userid", "라이언");
		return "forward:aaa";
	}

}
