package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.DeptService;
import com.service.DeptServiceImpl;

@WebServlet("/update")
public class DeptUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("deptno", deptno);
		map.put("dname", dname);
		map.put("loc", loc);
		DeptService service = new DeptServiceImpl();
		int n = service.updateDept(map);
		
		// 부서 삭제에 성공하면 목록으로 이동 (위임)
		if (n==1) {
			response.sendRedirect("list");
		} else {
			response.sendRedirect("retrieve?deptno="+deptno);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);

	}

}
