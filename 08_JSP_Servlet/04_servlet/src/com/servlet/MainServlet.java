package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 요청 서블릿
@WebServlet("/main")
public class MainServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("MainServlet");
		// scope에 저장
		request.setAttribute("request", "request"); // request scope
		HttpSession session = request.getSession();
		session.setAttribute("session", "session"); // session scope
		ServletContext application = getServletContext();
		application.setAttribute("application", "application"); // application scope
		
		// 요청 위임 : forward
		request.getRequestDispatcher("response").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
