package object_passing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-d")
public class pageD extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		User user=(User)session.getAttribute("user_info");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1>use name:"+user.name+"</h1>");
		printWriter.print("<h1>user id:"+user.id+"</h1>");
		printWriter.print("<h1>user phone:"+user.phone+"</h1>");
	}
}
