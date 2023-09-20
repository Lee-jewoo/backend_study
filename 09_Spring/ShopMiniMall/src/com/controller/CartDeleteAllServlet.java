package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;
import com.service.CartServiceImpl;

@WebServlet("/CartDeleteAllServlet")
public class CartDeleteAllServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if (dto!=null) {
			String [] check = request.getParameterValues("check");
			List<String> checkList = Arrays.asList(check);
			CartService service = new CartServiceImpl();
			int n = service.cartDeleteAll(checkList);
			nextPage = "CartListServlet";
		} else {
			nextPage = "member/checkLogin.jsp";
		}
		response.sendRedirect(nextPage);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
