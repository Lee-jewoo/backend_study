package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mypage")
public class MyPageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 이후 화면에서는 필수
		// 쿠키 얻기 
		Cookie [] cookies = request.getCookies();
		
		// 반복문으로 쿠키 조회
		String id = null;
		for (Cookie c : cookies) {
			if ("user".equals(c.getName())) {
				id = c.getValue();
			}
		}
		
		// cookie의 존재 유무 확인
		if(id!=null) { // 로그인했을 때 응답 처리
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<html><head>");
			out.print("<meta charset=\"UTF-8\">");
			out.print("<title>Insert title here</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>Mypage</h1>");
			out.print("안녕하세요. "+id+"님");
			out.print("<hr>");
			out.print("<a href='logout'>로그아웃</a>");
			out.print("</body></html>");
		} else { // 로그인을 하지 않음 || 로그인 후 time-out
			response.sendRedirect("loginForm.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
