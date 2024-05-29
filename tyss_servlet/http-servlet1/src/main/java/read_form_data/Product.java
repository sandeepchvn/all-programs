package read_form_data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("product_name");
		String price=req.getParameter("product_price");
		String qua=req.getParameter("product_quantity");
		String des=req.getParameter("product_description");
		
	PrintWriter printWriter=	resp.getWriter();
	printWriter.print("<html><body>");
	printWriter.print("<h1>Name:"+name+"<h2>");
	printWriter.print("<h1>Price:"+price+"<h2>");
	printWriter.print("<h1>Quantity"+qua+"<h2>");
	printWriter.print("<h1>Description"+des+"<h2>");
	printWriter.print("</body></html>");
	}
}
