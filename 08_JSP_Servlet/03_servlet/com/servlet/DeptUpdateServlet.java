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
		
		// 응답 처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if (n==1) {
			out.print("수정 성공<br>");
			out.print("<a href='list'>목록보기</a>");
		} else {
			out.print("수정 실패<br>");
			out.print("<a href='retrieve?deptno="+deptno+"'>목록보기</a>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);

	}

}
