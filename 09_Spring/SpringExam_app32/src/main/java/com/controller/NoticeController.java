package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.NoticeDTO;
import com.dto.PageDTO;
import com.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	NoticeService service;
	
	// 목록 보기 + 페이징
	@GetMapping("/list")
	public String list(Model m, @RequestParam(defaultValue = "1") int curPage) {
		PageDTO pagedto = service.list(curPage);
		m.addAttribute("pagedto", pagedto);
		return "list";
	}
	
	// 글 작성 화면
	@GetMapping("/write")
	public String writeForm() {
		return "writeForm";
	}
	
	// 글 작성
	@PostMapping("/write")
	public String write(NoticeDTO dto) {
		int n = service.write(dto);
		return "redirect:list";
	}
	
	// 상세 보기
	@GetMapping("/retrieve")
	public String retrieve(int no, Model m) {
		NoticeDTO dto = service.retrieve(no);
		m.addAttribute("dto", dto);
		return "retrieve";
	}
	
	// 글 수정
	@PostMapping("/update")
	public String update(NoticeDTO dto) {
		int n = service.update(dto);
		return "redirect:list";
	}
	
	// 글 삭제
	@GetMapping("/delete")
	public String delete(int no) {
		int n = service.delete(no);
		return "redirect:list";
	}

}
