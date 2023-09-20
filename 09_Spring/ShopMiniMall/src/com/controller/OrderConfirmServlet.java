package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.OrderService;
import com.service.OrderServiceImpl;

@WebServlet("/OrderConfirmServlet")
public class OrderConfirmServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if (dto!=null) {
			String num = request.getParameter("num");
			OrderService service = new OrderServiceImpl();
			// num에 해당하는 CartDTO 얻기
			CartDTO cartDTO = service.cartByNum(Integer.parseInt(num));
			request.setAttribute("cartDTO", cartDTO);
			
			// userid에 해당하는 MemberDTO 얻기
			String userid = dto.getUserid();
			MemberDTO memberDTO = service.memberByOrder(userid);
			request.setAttribute("memberDTO", memberDTO);
			
			nextPage = "order/orderConfirm.jsp";
		} else {
			nextPage = "member/checkLogin.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
