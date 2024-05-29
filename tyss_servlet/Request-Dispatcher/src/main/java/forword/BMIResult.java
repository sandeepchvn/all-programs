package forword;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMIResult extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double val = (Double) req.getAttribute("value");
		double weg = (Double) req.getAttribute("weight");
		double heg = (Double) req.getAttribute("height");
		String result = "";
		if (val < 18) {
			result = "Under weight";
		} else if (val >= 18 && val < 25) {
			result = "normal";
		} else if (val >= 25 && val < 30) {
			result = "over weight";
		} else
			result = "obese";

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h1>Weight is " + weg + "<h1>");
		printWriter.print("<h1>Height is " + heg + "<h1>");
		printWriter.print("<h1>Calculated BMI value is " + val + "<h1>");
		printWriter.print("<h1>BMI result is " + result + "<h1>");
		printWriter.print("</body></html>");
	}
}