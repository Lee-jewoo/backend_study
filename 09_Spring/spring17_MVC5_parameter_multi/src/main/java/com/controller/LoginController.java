package com.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	// DTO에서 배열, List 사용
	@GetMapping("/login")
	public String login(LoginDTO dto) {
		System.out.println(dto);
		return "loginForm";
	}
	
	// getParameterValues
	@GetMapping("/login2")
	public String login2(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String [] phone = request.getParameterValues("phone");
		String [] email = request.getParameterValues("email");
		System.out.println(userid+" "+passwd);
		System.out.println(Arrays.toString(phone));
		System.out.println(Arrays.toString(email));
		return "loginForm";
	}
	
}
