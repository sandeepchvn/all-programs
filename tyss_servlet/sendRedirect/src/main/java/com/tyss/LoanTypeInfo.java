package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoanTypeInfo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = req.getParameter("loan-type");
		if (type.equals("Home")) {
			PrintWriter printWriter=resp.getWriter();
			printWriter.print("<html><body>");
			printWriter.print("<h1>Home loan Info</h1>");
			printWriter.print("</body></html>");
		} else if (type.equals("Personal")) {
			PrintWriter printWriter=resp.getWriter();
			printWriter.print("<html><body>");
			printWriter.print("<h1>Personal loan Info</h1>");
			printWriter.print("</body></html>");
		} else {
			resp.sendRedirect("https://www.bankofbaroda.in/");
		}
	}
}
