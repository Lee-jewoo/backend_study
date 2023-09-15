package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	// HttpServletRequest
	@RequestMapping("/aaa")
	public String aaa(HttpServletRequest request) {
		request.setAttribute("userid", "춘식이");
		return "hello";
	}

	// Model
	@RequestMapping("/bbb")
	public String bbb(Model m) {
		m.addAttribute("userid", "춘식이");
		return "hello"; 
	}
	
	// Map
	@RequestMapping("/ccc")
	public String ccc(Map<String, String> map) {
		map.put("userid", "춘식이");
		return "hello"; 
	}
	
	// DTO
	@RequestMapping("/ddd")
	public String ddd(@ModelAttribute("login") LoginDTO dto) {
		dto.setUserid("chunsik");
		dto.setPasswd("123");
		return "hello"; 
	}
	
	// ArrayList
	@RequestMapping("/eee")
	public String eee(@ModelAttribute("list") ArrayList<LoginDTO> xxx) {
		xxx.add(new LoginDTO("chunsik", "123"));
		xxx.add(new LoginDTO("rion", "456"));
		return "hello"; 
	}
	
	// ModelAndView
	@RequestMapping("/fff")
	public ModelAndView fff() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("userid", "춘식이");
		return mav; 
	}
	
}
