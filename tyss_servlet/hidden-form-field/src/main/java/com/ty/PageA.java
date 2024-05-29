package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/page-a")
public class PageA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1>hi i am in page A</h1>");
		String name=req.getParameter("user_name");
		printWriter.print("<form action='page-b'>");
		printWriter.print("<input type='hidden' name='user_name' value="+name+">");
		printWriter.print("Email:<input type='text' name='user_email'>");
		printWriter.print("Phone:<input type='text' name='user_phone'>");
		printWriter.print("<input type='submit' value='next'>");
		printWriter.print("</form>");
	}
}
