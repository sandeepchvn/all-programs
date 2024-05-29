package com.tyss.query_parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/page-a")
public class PageA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myId=req.getParameter("id");
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1>Hi i am in page A</h1>");
		printWriter.print("<h2>My Id is "+myId+"</h2>");
	}
}
