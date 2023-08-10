package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 요청 URL : http://localhost:8090/01_servlet/test2
@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {
	
	// 인스턴스 변수 생성 -> 공유
	int num;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int num2 = 0; // 로컬 변수 -> 나만 사용
		num++;
		num2++;
		System.out.println("thread-unsafe 인스턴스 변수 num : "+num);
		System.out.println("thread-safe 로컬 변수 num2 : "+num2);
		
	}

}
