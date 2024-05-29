package store_object;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-c")
public class PageC extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		Animal animal=new Animal();
		animal.name="dimple";
		animal.age=24;
		animal.height=5.2;
		context.setAttribute("myAnimal",animal );
		
		System.out.println("--------Page C executed-------");
	}
}
