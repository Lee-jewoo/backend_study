package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@PostMapping("/xxx")
	public String xxx(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		return "main";
	}
	
	@PostMapping("/yyy")
	public String yyy(@RequestBody ArrayList<LoginDTO> list) {
		System.out.println(list);
		return "main";
	}
	
}
