package com.exam.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.dto.LoginDTO;

@Controller
public class TestController {
	
	@Autowired
	ServletContext application;
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/main2")
	public String main2(Model m, HttpSession session) {
		m.addAttribute("username", "춘식이");
		session.setAttribute("username", "라이언");
		application.setAttribute("username", "죠르디");
		return "main2";
	}
	
	@GetMapping("/main3")
	public String main3(Model m) {
		m.addAttribute("login", new LoginDTO("aaa", "123"));
		return "main3";
	}
	
	@GetMapping("/main4")
	public String main4(Model m) {
		m.addAttribute("login", new LoginDTO("aaa", "123"));
		m.addAttribute("login2", new LoginDTO(null, "123"));
		List<LoginDTO> list = Arrays.asList(new LoginDTO("aaa", "123"),
											new LoginDTO("bbb", "456"),
											new LoginDTO("ccc", "789"));
		m.addAttribute("loginList", list);
		return "main4";
	}
	
	@GetMapping("/main5")
	public String main5(Model m) {
		m.addAttribute("login", new LoginDTO("aaa", "123"));
		return "main5";
	}
	
	@GetMapping("/main5_1")
	public String main5_1(@RequestParam("id") String id,
						  @RequestParam("age") String age) {
		return "main5";
	}

	@GetMapping("/main6")
	public String main6() {
		return "main6";
	}
	
}
