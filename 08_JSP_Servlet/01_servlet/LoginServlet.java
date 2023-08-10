package com.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 요청 URL : http://localhost:8090/01_servlet/login
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("LoginServlet.doGet");
		// 사용자 입력값 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println("아이디 : "+userid);
		System.out.println("비밀번호 : "+passwd);
		
		// tag의 name값 얻기
		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			System.out.println("Names "+enu.nextElement());
		}
		
		// <name, value>
		Map<String, String[]> map = request.getParameterMap();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("Map "+key);
			String [] value = map.get(key);
			System.out.println(key+"\t"+Arrays.toString(value));
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("LoginServlet.doPost");
		// 사용자 입력값 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println("아이디 : "+userid);
		System.out.println("비밀번호 : "+passwd);
		
	}

}
