package com.exam.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/board/{num}")
	public String get(@PathVariable("num") String num) {
		System.out.println("@GetMapping : 조회 " + num);
		return "get";
	}

	@PostMapping("/board2/{num}/{username}")
	public String post(@PathVariable("num") String num,
					   @PathVariable("username") String username) {
		System.out.println("@PostMapping : 저장 " + num + username);
		return "post";
	}

	@PutMapping("/board2/{num}/{username}")
	public String put(@PathVariable("num") String num,
			   		  @PathVariable("username") String username) {
		System.out.println("@PutMapping : 수정 " + num + username);
		return "put";
	}

	@DeleteMapping("/board/{num}")
	public String delete(@PathVariable("num") String num) {
		System.out.println("@DeleteMapping : 삭제 " + num);
		return "delete";
	}

}
