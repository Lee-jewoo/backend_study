package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa 호출");
		return "main";
	}
	
	// flash scope
	@RequestMapping("/bbb")
	public String bbb(RedirectAttributes m) {
		System.out.println("bbb 호출");
		m.addFlashAttribute("userid", "춘식이");
		return "redirect:aaa";
	}

}
