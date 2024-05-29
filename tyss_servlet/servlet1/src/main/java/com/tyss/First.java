package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet {
	
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("hii from First");

		PrintWriter printWriter = res.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h1>hii from servlet</h1>");
		printWriter.print("</body></html>");

	}

}
