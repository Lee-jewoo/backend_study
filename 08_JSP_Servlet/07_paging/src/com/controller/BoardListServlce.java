package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;

@WebServlet("/list")
public class BoardListServlce extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BoardService service = new BoardServiceImpl();
		String curPage = request.getParameter("curPage");
		if (curPage == null) {
			curPage = "1";
		}
		PageDTO pageDTO = service.list(Integer.parseInt(curPage));
		request.setAttribute("pageDTO", pageDTO);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
