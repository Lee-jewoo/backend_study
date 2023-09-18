package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.DeptDTO;
import com.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	DeptService service;
	
	// 전체 목록
	@GetMapping("/findAll")
	public String findAll(Model m) {
		// Model
		List<DeptDTO> list = service.findAll();
		m.addAttribute("list", list);
		
		return "list"; // View
	}
	
	// 부서 등록 화면
	@GetMapping("/deptAddForm")
	public String deptAddForm() {
		return "write";
	}
	
	// 부서 등록
	@PostMapping("/deptAdd")
	public String deptAdd(DeptDTO dto) {
		int n = service.deptAdd(dto);
		return "redirect:findAll";
	}
	
	// 부서 삭제
	@GetMapping("/delete")
	public String deptDelete(@RequestParam("deptno") int deptno) {
		int n = service.deptDelete(deptno);
		return "redirect:findAll";
	}

}
