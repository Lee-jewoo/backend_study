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
import com.service.MemberService;
import com.service.MemberServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		
		MemberService service = new MemberServiceImpl();
		MemberDTO dto = service.login(map);
		
		String nextPage = null;
		if (dto != null) {
			nextPage = "main";
			// 로그인 성공 후 접속 정보를 세션에 저장
			HttpSession session = request.getSession();
			session.setAttribute("login", dto);
			// session에 login키의 유무에 따라 로그인 여부를 알 수 있음
		} else {
			nextPage = "member/loginFail.jsp";
		}
		
		response.sendRedirect(nextPage);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
