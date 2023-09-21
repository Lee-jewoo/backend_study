package com.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	MemberService service;
	
//	@GetMapping("/LoginUIServlet")
//	public String loginUI() {
//		return "loginForm";
//	}
	
	@PostMapping("/login")
	public String login(@RequestParam HashMap<String, String> map, HttpSession session) {
		MemberDTO dto = service.login(map);
		String nextPage = null;
		if (dto != null) {
			// 로그인 성공 후 접속 정보를 세션에 저장
			session.setAttribute("login", dto);
			nextPage = "redirect:main";
		} else {
			nextPage = "member/loginFail";
		}
		return nextPage;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // 세션에서 로그인 정보 삭제
		return "redirect:main";
	}
	
	@GetMapping("/loginFail")
	public String loginFail() {
		return "member/checkLogin";
	}

}
