package login_logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		if (name.equals("postgres") && password.equals("root")) {
			printWriter.print("<h1>Login success</h1>");
			HttpSession session = req.getSession();
			session.setAttribute("userName", name);
			session.setAttribute("userPassword", password);
		} else {
			printWriter.print("<h1>Login failed</h1>");
		}
	}
}
