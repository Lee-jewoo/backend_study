package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 쿠키 얻기
		Cookie[] cookies = request.getCookies();

		// 반복문으로 쿠키 조회
		String id = null;
		Cookie cookie = null;
		for (Cookie c : cookies) {
			if ("user".equals(c.getName())) {
				id = c.getValue();
				cookie = c;
			}
		}

		// cookie의 존재 유무 확인
		if (id != null) { // 쿠키 삭제
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			response.sendRedirect("loginForm.jsp");
		} else { // 로그인을 하지 않음 || 로그인 후 time-out
			response.sendRedirect("loginForm.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
