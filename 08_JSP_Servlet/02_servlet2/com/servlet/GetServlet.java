package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/get")
public class GetServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("GetServlet");
		
		// request scope 데이터 조회
		String s = (String) request.getAttribute("request");
		
		// session scope 데이터 조회
		HttpSession session = request.getSession();
		String t = (String) session.getAttribute("session");
		
		// application scope 데이터 조회
		ServletContext ctx = getServletContext();
		String r = (String) ctx.getAttribute("application");
		
		System.out.println("request : "+s);
		System.out.println("session : "+t);
		System.out.println("application : "+r);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
