package com.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;

public class BoardListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("searchName", request.getParameter("searchName"));
		map.put("searchValue", request.getParameter("searchValue"));
		
		String curPage = request.getParameter("curPage"); 
		if (curPage == null) {
			curPage = "1";
		}
		
		BoardService service = new BoardServiceImpl();
		PageDTO pageDTO = service.pageDTO(map, Integer.parseInt(curPage));
		request.setAttribute("pageDTO", pageDTO);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
