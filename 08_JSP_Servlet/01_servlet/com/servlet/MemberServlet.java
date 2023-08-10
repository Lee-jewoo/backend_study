package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

	// 요청 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("LoginServlet.doGet");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String [] address = request.getParameterValues("address");
		System.out.println("아이디 : "+userid);
		System.out.println("비밀번호 : "+passwd);
		System.out.print("거주지 : ");
		for (String s : address) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
		// 응답 처리 (브라우저에 출력)
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
		out.print("<h3>회원 등록 정보</h3>");
		out.print("아이디 : "+userid+"<br>");
		out.print("비밀번호 : "+passwd+"<br>");
		out.print("거주지 : "+Arrays.toString(address)+"<br>");
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("LoginServlet.doPost");
		doGet(request, response); // post로 요청받으면 doGet으로 보내 처리
	}

}
