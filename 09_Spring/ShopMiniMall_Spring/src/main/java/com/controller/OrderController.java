package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;
	
	@GetMapping("/orderConfirm")
	public ModelAndView orderConfirm(@RequestParam("num") int num, HttpSession session) {
		CartDTO cartDTO = service.cartByNum(num);
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("login");
		memberDTO = service.memberByOrder(memberDTO.getUserid());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartDTO", cartDTO);
		mav.addObject("memberDTO", memberDTO);
		mav.setViewName("orderConfirm");
		return mav;
	}
	
	@GetMapping("/orderDone")
	public String orderDone(HttpSession session, OrderDTO orderDTO,
							@RequestParam("cartNum") int cartNum) {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("login");
		orderDTO.setUserid(memberDTO.getUserid());
		int n = service.orderDone(orderDTO, cartNum);
		return "orderDone";
	}

}
