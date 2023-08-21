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

@WebServlet("/JSTLServlet4")
public class JSTLServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("userid", "춘식이");
		List<LoginDTO> list = Arrays.asList(new LoginDTO("aaa", "123"), 
											new LoginDTO("bbb", "234"),
											new LoginDTO("ccc", "345"),
											new LoginDTO("ddd", "456"),
											new LoginDTO("eee", "567"));
		request.setAttribute("list", list);
		request.getRequestDispatcher("04_iterate.jsp").forward(request, response);
		;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
