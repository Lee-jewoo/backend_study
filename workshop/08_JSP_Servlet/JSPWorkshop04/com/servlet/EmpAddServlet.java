package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;
import com.service.EmpServiceImpl;

public class EmpAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 정보 등록
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		Integer comm = 0;
		Integer deptno = 0;
		// 연동
		EmpDTO dto = new EmpDTO(Integer.parseInt(empno), ename, job, Integer.parseInt(mgr), hiredate, Integer.parseInt(sal), comm, deptno);
		if (comm==0) {
			dto.setComm(null);
		}
		if (deptno==0) {
			dto.setDeptno(null);
		}
		EmpService service = new EmpServiceImpl();
		int n = service.insert(dto);
		// 응답 처리
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>Insert title here</title>");
		out.print("</head>");
		out.print("<body>");
		if (n==1) {
			out.print("회원가입성공<br>");
			out.print("<a href='emplist'>목록보기</a>");
		} else {
			out.print("회원가입실패<br>");
			out.print("<a href='member.html'>다시 입력하기</a>");
		}
		out.print("</body></html>");
	}

}
