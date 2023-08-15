

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 문제 6
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String [] hobby = request.getParameterValues("hobby");
		String married = request.getParameter("married");
		if (ssn.charAt(7)=='1') {
			ssn = "남자";
		} else if (ssn.charAt(7)=='2') {
			ssn = "여자";
		}
		out.println("이름은 "+name);
		out.println("성별은 "+ssn);
		out.print("취미는 ");
		for (String s : hobby) {
			out.print(s+" ");
		}
		out.println();
		out.println("결혼 상태는 "+married+"입니다.");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
