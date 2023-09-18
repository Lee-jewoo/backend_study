package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/login")
	public String login(LoginDTO dto, HttpSession session) {
		// 저장된 데이터를  DB연동해 검증
		session.setAttribute("login", dto);
		return "login";
	}
	
	@GetMapping("/loginCheck/logout")
	public String logout(HttpSession session) {
			session.invalidate();
			return "main";
	}
	
	@GetMapping("/loginCheck/mypage")
	public String mypage() {
		return "main";
	}

}
