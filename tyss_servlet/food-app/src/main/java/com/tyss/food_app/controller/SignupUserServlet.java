package com.tyss.food_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.food_app.entity.Users;
import com.tyss.food_app.service_impl.UserServiceImple;
import com.tyss.food_app.util.Role;
@WebServlet("/signup")
public class SignupUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String password=req.getParameter("user_password");
		Role  role=(Role.valueOf(req.getParameter("user_role")));
		
		UserServiceImple userServlet=new UserServiceImple();
		Users u=new Users();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setRole(role);
		userServlet.saveUser(u);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("login");
		dispatcher.include(req, resp);
	}
}
