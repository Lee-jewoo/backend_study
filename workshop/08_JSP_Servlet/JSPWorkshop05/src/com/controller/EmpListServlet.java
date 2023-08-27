package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String searchName = request.getParameter("searchName");
		String searchValue = request.getParameter("searchValue");
		String align = request.getParameter("align");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("searchName", searchName);
		map.put("searchValue", searchValue);
		map.put("align", align);
		
		EmpService service = new EmpServiceImpl();
		List<EmpDTO> list = service.list(map);
		request.setAttribute("list", list);
		request.setAttribute("map", map);
		request.getRequestDispatcher("list.jsp").forward(request, response);;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
