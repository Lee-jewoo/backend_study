package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

@WebServlet("/write")
public class DeptWriteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 부서 등록
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		DeptDTO dto = new DeptDTO(Integer.parseInt(deptno), dname, loc);
		DeptService service = new DeptServiceImpl();
		int n = service.addDept(dto);
		
		// 부서 등록에 성공하면 목록으로 이동 (위임)
		if (n==1) {
			response.sendRedirect("list");
		} else {
			response.sendRedirect("deptForm.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);

	}

}
