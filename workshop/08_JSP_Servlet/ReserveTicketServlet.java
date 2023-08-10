

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	// 문제7
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		String birthday = request.getParameter("birthday");
		String type = request.getParameter("type");
		int age = 2023-Integer.parseInt(birthday.substring(0, 4));
		String grade = null;
		int fee = Integer.parseInt(type);
		if (age<19) {
			grade = "미성년자";
			fee *= 0.6;
		} else if (age>=61) {
			grade = "경로자";
			fee *= 0.5;
		} else {
			grade = "성인";
			fee *= 0.9;
		}
		
		out.print("입력한 생년월일 : "+birthday+", 선택한 티켓 : "+type+"\n");
		out.print("나이 : "+age+"세, 등급 : "+grade+", 할인 적용 금액 : "+Math.round(fee));
		
	}

}
