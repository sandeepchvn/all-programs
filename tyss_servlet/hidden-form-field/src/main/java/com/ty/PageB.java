package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/page-b")

public class PageB extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String phone=req.getParameter("user_phone");
		printWriter.print("<h1>Name :"+name+"</h1>");
		printWriter.print("<h1>Email :"+email+"</h1>");
		printWriter.print("<h1>Phone :"+phone+"</h1>");
	}
}
