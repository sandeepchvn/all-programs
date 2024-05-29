package servlet_context;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ServletContext context=req.getServletContext();
//		ServletConfig config=getServletConfig();
//		ServletContext context=config.getServletContext();
		ServletContext context = getServletContext();
		String URL = context.getInitParameter("url");
		String name = context.getInitParameter("name");

		System.out.println("user name " + name);
		System.out.println("url  " + URL);
	}
}