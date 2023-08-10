package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 요청 URL : http://localhost:8090/01_servlet/test3
@WebServlet("/test3")
public class TestServlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 응답 처리
		// MIME 타입 지정
		// response.setContentType("text/plain");
		response.setContentType("text/html;charset=utf-8");
		
		// java i/o 얻기
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>Insert title here</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Hello Servlet 안녕 서블릿</h1>");
		out.print("</body></html>");
		
	}

}
