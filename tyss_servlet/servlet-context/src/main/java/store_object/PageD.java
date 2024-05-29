package store_object;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-d")
public class PageD extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		Animal animal=(Animal)context.getAttribute("myAnimal");
		System.out.println("---------Page D---------");
		System.out.println("name is "+animal.name);
		System.out.println("age is "+animal.age);
		System.out.println("height is "+animal.height);
	}
}
