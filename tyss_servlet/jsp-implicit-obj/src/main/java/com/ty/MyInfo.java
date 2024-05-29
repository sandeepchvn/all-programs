package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/info")
public class MyInfo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student=new Student();
		student.setId(101);
		student.setName("sandeep");
		student.setEmail("sandy@gmail.com");
		
		req.setAttribute("my_student", student);
		RequestDispatcher dispatcher=req.getRequestDispatcher("studentInfo.jsp");
		dispatcher.forward(req, resp);
	}
}
