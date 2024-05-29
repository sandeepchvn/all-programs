package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/info-2")
public class MyInfo2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		Student student=new Student();
		student.setId(102);
		student.setName("chavan");
		student.setEmail("ch@gmail.com");
		
		session.setAttribute("myStudent", student);
		session.setAttribute("userName", "Vikas");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("studentInfo2.jsp");
		dispatcher.forward(req, resp);
	}
}
