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

@WebServlet("/delete")
public class DeptDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String deptno = request.getParameter("deptno");
		DeptService service = new DeptServiceImpl();
		int n = service.deleteDept(Integer.parseInt(deptno));
		
		// 응답 처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// 삭제 성공 여부
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>Insert title here</title>");
		out.print("</head>");
		out.print("<body>");
		if (n==1) {
			out.print("삭제 성공<br>");
			out.print("<a href='list'>목록보기</a>");
		} else {
			out.print("삭제 실패<br>");
			out.print("<td><a href='retrieve?deptno="+deptno+"'>돌아가기</a></td>");
		}
		out.print("</body></html>");


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);

	}

}
