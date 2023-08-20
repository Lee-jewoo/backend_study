package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class EmpWriteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		Integer comm = 0;
		Integer deptno = 0;
		EmpDTO dto = new EmpDTO(Integer.parseInt(empno), ename, job, Integer.parseInt(mgr), hiredate, Integer.parseInt(sal), comm, deptno);
		if (comm==0) {
			dto.setComm(null);
		}
		if (deptno==0) {
			dto.setDeptno(null);
		}
		EmpService service = new EmpServiceImpl();
		int n = service.insert(dto);
		response.sendRedirect("list");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
