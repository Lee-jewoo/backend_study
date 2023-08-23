package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;
import com.service.MemberServiceImpl;

@WebServlet("/MypageServlet")
public class MypageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if (dto!=null) {
			nextPage = "mypage.jsp";
			String userid = dto.getUserid();
			MemberService service = new MemberServiceImpl();
			MemberDTO mypage = service.mypage(userid);
			session.setAttribute("login", mypage);
		} else {
			nextPage = "member/checkLogin.jsp";
		}
		response.sendRedirect(nextPage);
	}

}
