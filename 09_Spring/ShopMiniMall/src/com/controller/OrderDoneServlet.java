package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.OrderService;
import com.service.OrderServiceImpl;

@WebServlet("/OrderDoneServlet")
public class OrderDoneServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if (dto!=null) {
			// 주문 정보
		    String userid = dto.getUserid();
		    String gCode = request.getParameter("gCode");
		    String gName = request.getParameter("gName");
		    String gPrice = request.getParameter("gPrice");
		    String gSize = request.getParameter("gSize");
		    String gColor = request.getParameter("gColor");
		    String gAmount = request.getParameter("gAmount");
		    String gImage = request.getParameter("gImage");
		    String orderName = request.getParameter("orderName");
		    String post = request.getParameter("post");
		    String addr1 = request.getParameter("addr1");
		    String addr2 = request.getParameter("addr2");
		    String phone = request.getParameter("phone");
		    String payMethod = request.getParameter("payMethod");
		    String cartNum = request.getParameter("cartNum");
		    
		    OrderDTO orderDTO = new OrderDTO();
		    orderDTO.setUserid(userid);
		    orderDTO.setgCode(gCode);
		    orderDTO.setgName(gName);
		    orderDTO.setgPrice(Integer.parseInt(gPrice));
		    orderDTO.setgSize(gSize);
		    orderDTO.setgColor(gColor);
		    orderDTO.setgAmount(Integer.parseInt(gAmount));
		    orderDTO.setgImage(gImage);
		    orderDTO.setOrderName(orderName);
		    orderDTO.setPost(post);
		    orderDTO.setAddr1(addr1);
		    orderDTO.setAddr2(addr2);
		    orderDTO.setPhone(phone);
		    orderDTO.setPayMethod(payMethod);
		    
		    OrderService service = new OrderServiceImpl();
		    int n = service.orderDone(orderDTO, Integer.parseInt(cartNum));
		    request.setAttribute("orderDTO", orderDTO);
		    
			nextPage = "orderDone.jsp";
		} else {
			nextPage = "member/checkLogin.jsp";
		}
		
		request.getRequestDispatcher(nextPage).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
