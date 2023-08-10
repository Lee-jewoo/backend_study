import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class LoginServlet extends HttpServlet {
	// 문제3
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		out.print("이름은 "+userid+"이고 비밀번호는 "+passwd);
	}
	// 문제4
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		out.print("이름은 "+userid+"이고 비밀번호는 "+passwd);
		
	}

}
