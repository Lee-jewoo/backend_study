package com.controller;

import java.util.List;
import java.util.Map;

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
	public String findAll(Model m, @RequestParam Map<String, String> map) {
		// Model
		List<DeptDTO> list = service.findAll(map);
		m.addAttribute("list", list);
		m.addAttribute("map", map);
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
	
	// 부서 상세 보기
	@GetMapping("/retrieve")
	public String deptRetrieve(@RequestParam("deptno") int deptno, Model m) {
		DeptDTO dto = service.deptRetrieve(deptno);
		m.addAttribute("dto", dto);
		return "retrieve";
	}
	
	// 부서 수정
	@PostMapping("/deptUpdate")
	public String deptUpdate(DeptDTO dto) {
		int n = service.deptUpdate(dto);
		return "redirect:findAll";
	}

}
