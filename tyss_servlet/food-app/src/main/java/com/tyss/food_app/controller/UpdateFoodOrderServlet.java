package com.tyss.food_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.food_app.entity.FoodOrder;
import com.tyss.food_app.service_impl.FoodOrderServiceImpl;

@WebServlet("/updateFO")
public class UpdateFoodOrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String phone = req.getParameter("PO_phone");
		String id = req.getParameter("PO_id");

		FoodOrderServiceImpl foodService = new FoodOrderServiceImpl();
		FoodOrder foodOrder = foodService.findFoodOrder(Integer.parseInt(id));
		if (foodOrder != null) {
			foodOrder.setContactNumber(Long.parseLong(phone));
			foodService.updaFoodOrder(foodOrder);
			PrintWriter writer = resp.getWriter();
			writer.print("<h1>updated---------!</h1>");
		} else {
			PrintWriter writer = resp.getWriter();
			writer.print("<h1>ID is Wrong</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("updateFO.jsp");
			dispatcher.include(req, resp);
		}
	}
}
