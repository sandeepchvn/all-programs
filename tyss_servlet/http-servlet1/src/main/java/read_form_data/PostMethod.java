package read_form_data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostMethod extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String un=req.getParameter("user_name");
		String em=req.getParameter("user_email");
		String ag=req.getParameter("user_age");
		
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.print("<html><body>");
		printWriter.print("<h1>Name:"+un+"</h1>");
		printWriter.print("<h1>Email:"+em+"</h1>");
		printWriter.print("<h1>Age:"+ag+"</h1>");
		printWriter.print("</html></body>");
	}
}
