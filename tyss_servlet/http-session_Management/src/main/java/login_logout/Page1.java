package login_logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-1")
public class Page1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("userName");
		String password = (String) session.getAttribute("userName");
		System.out.println(name);
		PrintWriter printWriter = resp.getWriter();
		if (name.equals("postgres")) {
			printWriter.print("<h1>hi i am page 1</h1>");
		}
		else {
			printWriter.print("<h1>You Have Not Loged In</h1>");
		}

	}
}
