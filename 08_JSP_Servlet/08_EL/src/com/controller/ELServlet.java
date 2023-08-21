package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.LoginDTO;

@WebServlet("/ELServlet")
public class ELServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("userid", "춘식이");
		
		HttpSession session = request.getSession();
		session.setAttribute("userid", "라이언");
		
		ServletContext application = getServletContext();
		application.setAttribute("userid", "죠르디");
		
		LoginDTO dto = new LoginDTO("aaa", "123");
		request.setAttribute("dto", dto);
		
		List<LoginDTO> list = Arrays.asList(new LoginDTO("aaa", "123"),
											new LoginDTO("bbb", "456"));
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("el2.jsp").forward(request, response);;
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
