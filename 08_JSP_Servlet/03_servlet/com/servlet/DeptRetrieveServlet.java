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

@WebServlet("/retrieve")
public class DeptRetrieveServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String deptno = request.getParameter("deptno");
		DeptService service = new DeptServiceImpl();
		DeptDTO dto = service.findByDeptno(Integer.parseInt(deptno));
		
		// 응답 처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>Insert title here</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>선택한 Dept 목록</h1>");
		// 수정한 값 저장을 위한 form
		out.print("<form action='update' method='get'>");
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<th>부서번호</th>");
		out.print("<th>부서명</th>");
		out.print("<th>부서위치</th>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>"+dto.getDeptno()+"</td>");
		out.print("<td><input type='text' name='dname' value='"+dto.getDname()+"'></td>");
		out.print("<td><input type='text' name='loc' value='"+dto.getLoc()+"'></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<input type='hidden' name='deptno' value='"+dto.getDeptno()+"'>");
		out.print("<input type='submit' value='수정'>");
		out.print("</form>");
		
		out.print("<hr>");
		out.print("<a href='delete?deptno="+dto.getDeptno()+"'>삭제</a><br>");
		out.print("<a href='list'>목록보기</a><br>");
		out.print("</body></html>");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);

	}

}
