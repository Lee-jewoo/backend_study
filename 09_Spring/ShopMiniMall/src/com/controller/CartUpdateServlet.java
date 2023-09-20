package com.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;
import com.service.CartServiceImpl;

@WebServlet("/CartUpdateServlet")
public class CartUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if (dto!=null) {
			String num = request.getParameter("num");
			String gAmount = request.getParameter("gAmount");
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("num", Integer.parseInt(num));
			map.put("gAmount", Integer.parseInt(gAmount));
			CartService service = new CartServiceImpl();
			int n = service.cartUpdate(map);
			// ajax로 처리 -> 화면처리를 하지 않아도 됨
		} else {
			response.sendRedirect("member/checkLogin.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
