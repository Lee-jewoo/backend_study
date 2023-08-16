package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// session의 로그인 정보 얻기
		HttpSession session = request.getSession();
		System.out.println("세션의 id : "+session.getId());
		String id = (String)session.getAttribute("user");
		
		// session의 존재 유무 확인
		if(id!=null) { // id값이 있을 때 세션에서 로그인 정보 삭제
			session.invalidate();
			response.sendRedirect("loginForm.jsp");
		} else { // 로그인을 하지 않음 || 로그인 후 time-out
			response.sendRedirect("loginForm.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
