package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.StudentDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		StudentService service = new StudentServiceImpl();
		List<StudentDTO> list = service.select();
		
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>Insert title here</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<th>학번</th>");		
		out.print("<th>학과번호</th>");		
		out.print("<th>이름</th>");		
		out.print("<th>주민번호</th>");		
		out.print("<th>주소</th>");		
		out.print("<th>입학년도</th>");		
		out.print("<th>휴학여부</th>");		
		for (StudentDTO dto : list) {
			out.print("</tr>");
			out.print("<td>"+dto.getStudent_no()+"</td>");		
			out.print("<td>"+dto.getDepartment_no()+"</td>");		
			out.print("<td>"+dto.getStudent_name()+"</td>");		
			out.print("<td>"+dto.getStudent_ssn()+"</td>");		
			out.print("<td>"+dto.getStudent_address()+"</td>");		
			out.print("<td>"+dto.getEntrance_date()+"</td>");		
			out.print("<td>"+dto.getAbsence_yn()+"</td>");		
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body></html>");
	}

}
