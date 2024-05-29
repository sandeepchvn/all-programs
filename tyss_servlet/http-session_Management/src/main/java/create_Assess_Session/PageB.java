package create_Assess_Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-b")
public class PageB extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1>hi i am page B</h1>");
		HttpSession session= req.getSession();
		String name=(String)session.getAttribute("userName");
		printWriter.print("<h1>User name is : "+name+"</h1>");
	}
}
