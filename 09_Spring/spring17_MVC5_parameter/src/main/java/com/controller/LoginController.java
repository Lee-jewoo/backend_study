package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm"; // /WEB-INF/views/loginForm.jsp로 forword 요청
	}
	
	@GetMapping("/login")
	public String login(@RequestParam Map<String, String> map) {
		// 사용자 입력 데이터 얻기 : map으로 받기
		System.out.println(map);
		return "loginForm";
	}
	
	@GetMapping("/login1")
	public String login1(HttpServletRequest request) {
		// 사용자 입력 데이터 얻기 : request 사용
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid+" "+passwd);
		
		return "loginForm";
	}
	
	@GetMapping("/login2")
	public String login2(@RequestParam("userid") String userid, @RequestParam("passwd") String passwd) {
		// 사용자 입력 데이터 얻기 : @RequestParam 사용
		System.out.println(userid+" "+passwd);
		
		return "loginForm";
	}
	
	@GetMapping("/login3")
	public String login3(@RequestParam(value="userid2",
									   required = false,
									   defaultValue = "userid") String userid,
						@RequestParam("passwd") String passwd) {
		// 사용자 입력 데이터 얻기 : @RequestParam 사용 (속성 사용)
		System.out.println(userid+" "+passwd);
		return "loginForm";
	}
	
	@GetMapping("/login4")
	public String login4(@RequestParam String userid, @RequestParam String passwd) {
		// 사용자 입력 데이터 얻기 : @RequestParam의 name값과 변수명이 같을 때
		System.out.println(userid+" "+passwd);
		return "loginForm";
	}
	
	@GetMapping("/login5")
	public String login5(LoginDTO dto) {
		// 사용자 입력 데이터 얻기 : 파라미터에 클래스 작성
		System.out.println(dto.getUserid());
		System.out.println(dto.getPasswd());
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String login11(HttpServletRequest request) {
		// 사용자 입력 데이터 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid+" "+passwd);
		
		return "loginForm";
	}
	
}
