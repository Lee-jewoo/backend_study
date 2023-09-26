package com.exam.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dto.DeptDTO;

@RestController
public class TestController {

	@GetMapping("/get")
	public String get() {
		System.out.println("@GetMapping : 조회");
		return "get";
	}

	@PostMapping("/post")
	public String post() {
		System.out.println("@PostMapping : 저장");
		return "post";
	}

	@PutMapping("/put")
	public String put() {
		System.out.println("@PutMapping : 수정");
		return "put";
	}

	@DeleteMapping("/delete")
	public String delete() {
		System.out.println("@DeleteMapping : 삭제");
		return "delete";
	}

	// DTO 반환 (JSON)
	@GetMapping(value = "/aaa")
	public DeptDTO aaa() {
		DeptDTO dto = new DeptDTO(99, "개발", "서울");
		return dto;
	}

	// List 반환 (JSON)
	@GetMapping(value = "/bbb")
	public ArrayList<DeptDTO> bbb() {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		list.add(new DeptDTO(10, "개발", "서울"));
		list.add(new DeptDTO(20, "연구", "성남"));
		list.add(new DeptDTO(30, "홍보", "하남"));
		return list;
	}

}
