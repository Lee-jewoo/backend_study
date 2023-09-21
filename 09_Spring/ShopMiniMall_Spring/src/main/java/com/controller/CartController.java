package com.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.GoodsService;

@Controller
public class CartController {
	
	@Autowired
	CartService service;
	
	@Autowired
	GoodsService gservice;
	
	@GetMapping("/goodsRetrieve")
	@ModelAttribute("goodsRetrieve")
	public GoodsDTO goodsRetrieve(Model m, @RequestParam("gCode") String gCode) {
		GoodsDTO dto = gservice.goodsRetrieve(gCode);
		return dto;
	}
	
	@GetMapping("/cartAdd")
	public String cartAdd(HttpSession session, CartDTO cartDTO) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserid();
		cartDTO.setUserid(userid);
		int n = service.cartAdd(cartDTO);
		return "goods/cartAddSuccess";
	}
	
	@GetMapping("/cartList")
	public ModelAndView cartList(HttpSession session, CartDTO cartDTO) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserid();
		List<CartDTO> list = service.cartList(userid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartList", list);
		mav.setViewName("cartList");
		return mav;
	}
	
	@ResponseBody
	@GetMapping("/cartUpdate")
	public void cartUpdate(@RequestParam HashMap<String, Integer> map) {
		int n = service.cartUpdate(map);
	}
	
	@GetMapping("/cartDelete")
	public String cartDelete(@RequestParam("num") int num) {
		int n = service.cartDelete(num);
		return "redirect:cartList";
	}
	
	@GetMapping("/cartDeleteAll")
	public String cartDeleteAll(@RequestParam("check") List<String> checkList) {
		int n = service.cartDeleteAll(checkList);
		return "redirect:cartList";
	}

}
