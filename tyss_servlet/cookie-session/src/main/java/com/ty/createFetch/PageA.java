package com.ty.createFetch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/page-a")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie cookie1 = new Cookie("pi", "3.14");
		resp.addCookie(cookie1);
		Cookie cookie2 = new Cookie("userName", "priya");
		resp.addCookie(cookie2);
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h1>Cookies are and added on response</h1>");
		printWriter.print("</body></html>");

	}
}
