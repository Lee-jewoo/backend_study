package com.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.PageDTO;
import com.service.BoardService;
import com.service.BoardServiceImpl;

@WebServlet("/list")
public class BoardListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// list.jsp에서 페이지 번호를 클릭할 때 전달되는 현재 페이지 번호 얻기
		String curPage = request.getParameter("curPage");
		if (curPage==null) {
			curPage = "1";
		}
		
		// 검색하기
		String searchName = request.getParameter("searchName");
		String searchValue = request.getParameter("searchValue");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("searchName", searchName);
		map.put("searchValue", searchValue);
		
		
		BoardService service = new BoardServiceImpl();
		PageDTO pageDTO = service.list(map, Integer.parseInt(curPage));
		
		// 목록보기는 request scope에 저장하는 것이 최적
		request.setAttribute("pageDTO", pageDTO);
		// 요청 위임
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
