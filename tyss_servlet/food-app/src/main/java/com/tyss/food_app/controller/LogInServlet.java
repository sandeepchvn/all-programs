package com.tyss.food_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.food_app.entity.Users;
import com.tyss.food_app.service_impl.UserServiceImple;
import com.tyss.food_app.util.Role;

@WebServlet("/login")
public class LogInServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");

		UserServiceImple userServlet = new UserServiceImple();
		Users user = userServlet.loginUser(email, password);
		if (user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("userEmail", email);
			session.setAttribute("userPassword", password);
			if (user.getRole().equals(Role.BRANCHMANAGER)) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("BranchManagerHomePage.jsp");
				dispatcher.forward(req, resp);
			}
			else if (user.getRole().equals(Role.CUSTOMER)) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("Customer.jsp");
				session.setAttribute("customer_session", user);
				dispatcher.forward(req, resp);
			}
			else if (user.getRole().equals(Role.STAFF)) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("StaffHomePage.jsp");
				dispatcher.forward(req, resp);
			}
		} else {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<h1 style='color:red'>Invalid Credential</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("LogInUser.jsp");
			dispatcher.include(req, resp);
		}
	}
}
