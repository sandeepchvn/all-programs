package forword;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CalcuteBMI extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String height=req.getParameter("height");
		String weight=req.getParameter("weight");
		
		double h=Double.parseDouble(height);
		double w=Double.parseDouble(weight);
		
		double vl=w/(h*h);
		
		req.setAttribute("value", vl);
		req.setAttribute("weight", w);
		req.setAttribute("height", h);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("bmiresult");
		dispatcher.forward(req, resp);
	}
}

