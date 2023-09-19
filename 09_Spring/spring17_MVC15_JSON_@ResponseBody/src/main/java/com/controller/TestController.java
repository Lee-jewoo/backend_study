package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/xxx")
	@ResponseBody
	public LoginDTO xxx() {
		LoginDTO dto = new LoginDTO();
		dto.setUserid("춘식이");
		dto.setPasswd("123");
		return dto;
	}

	@RequestMapping("/yyy")
	@ResponseBody
	public ArrayList<LoginDTO> yyy() {
		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();
		list.add(new LoginDTO("춘식이", "123"));
		list.add(new LoginDTO("라이언", "456"));
		list.add(new LoginDTO("죠르디", "789"));
		return list;
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
}
