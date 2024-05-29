package object_passing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-c")
public class pagec extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		User user=new User();
		user.name="XYZ";
		user.id=12;
		user.phone=45678;
		session.setAttribute("user_info", user);
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1>session created</h1>");
	}
}
