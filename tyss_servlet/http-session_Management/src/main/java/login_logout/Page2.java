package login_logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-2")
public class Page2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("userName");
		String password = (String) session.getAttribute("userName");
		if (name.equals("postgres") && password.equals("root")) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<h1>hi i am page 1</h1>");
		}
	}
}
