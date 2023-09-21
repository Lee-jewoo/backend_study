package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@GetMapping("/memberUI")
	public String memberUI() {
		return "memberForm";
	}
	
	@PostMapping("/memberAdd")
	public String memberAdd(MemberDTO dto) {
		int n = service.memberAdd(dto);
		return "redirect:loginUI";
	}
	
	@GetMapping("/mypage")
	public String mypage(HttpSession session) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		// 로그인 여부 확인 -> Interceptor
		MemberDTO mypage = service.mypage(dto.getUserid());
		session.setAttribute("login", mypage);
		return "mypage";
	}
	
	// Ajax 연동
	@GetMapping(value="/memberIdCheck", produces="text/plain;charset=utf-8")
	@ResponseBody
	public String memberIdCheck(@RequestParam("userid") String userid) {
		MemberDTO dto = service.idCheck(userid);
		
		String mesg = "사용 가능";
		if (dto != null) {
			mesg = "사용할 수 없는 아이디";
		}
		return mesg;
	}

}
