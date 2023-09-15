package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	// 리턴 타입 String : View 정보 O / Model 정보 X
	@RequestMapping("/aaa")
	public String aaa() {
		System.out.println("aaa 요청");
		return "hello";
	}
	
	// 리턴 타입 String : View 정보 O / Model 정보 O
	@RequestMapping("/bbb")
	public String bbb(Model m) {
		m.addAttribute("userid", "춘식이");
		System.out.println("bbb 요청");
		return "hello";
	}
	
	// 리턴타입 ModelAndView : View 정보 O / Model 정보 O
	@RequestMapping("/ccc")
	public ModelAndView ccc(Model m) {
		System.out.println("ccc 요청");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("userid", "춘식이");
		return mav;
	}
	
	// 리턴타입 DTO : View 정보 X (COC로 찾음 -> 요청맵핑값) / Model 정보 O
//	@RequestMapping("/hello")
	public @ModelAttribute("login") LoginDTO ddd() {
		System.out.println("hello DTO 요청");
		LoginDTO dto = new LoginDTO("춘식이", "123");
		return dto;
	}
	
	// 리턴타입 ArrayList : View 정보 X (COC로 찾음 -> 요청맵핑값) / Model 정보 O
//	@RequestMapping("/hello")
	public @ModelAttribute("loginList") ArrayList<LoginDTO> eee() {
		System.out.println("hello ArrayList 요청");
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("춘식이", "123"));
		list.add(new LoginDTO("라이언", "456"));
		return list;
	}
	
	// 리턴타입 void : View 정보 X (COC로 찾음 -> 요청맵핑값) / Model 정보 X
	@RequestMapping("/hello")
	public void fff() {
		System.out.println("hello void 요청");
	}

}
