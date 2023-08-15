
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Product;

@WebServlet("/product")
public class ProductRegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	private HashMap<String, Product> products = new HashMap<String, Product>();

	// 문제8
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		
		if (products.containsKey(id)) {
			products.get(id).setQuantity(products.get(id).getQuantity()+quantity);
		} else {
			products.put(id, new Product(name, id, quantity));
		}
		
		out.print("<h3>상품입력 결과</h3>");
		out.print("<hr>");
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<th>상품명</th>");
		out.print("<th>상품아이디</th>");
		out.print("<th>수량</th>");
		out.print("</tr>");
		for (Product p : products.values()) {
			out.print("<tr>");
			out.print("<td>"+p.getName()+"</td>");
			out.print("<td>"+p.getId()+"</td>");
			out.print("<td>"+p.getQuantity()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("<a href='productForm.html'>상품 입력하기");
		
	}

}
