package include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("user_name");
		String password = req.getParameter("user_password");

		if (userName.equals("admin") && password.equals("admin")) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body>");
			printWriter.print("<h1>Successfully logged in</h1>");
			printWriter.print("</body></html>");
		} else {
			
		
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body>");
			printWriter.print("<h1>User name or password is wrong</h1>");
			printWriter.print("</body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}
