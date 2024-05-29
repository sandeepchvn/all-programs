package com.tyss.food_app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.food_app.entity.FoodOrder;
import com.tyss.food_app.entity.FoodProduct;
import com.tyss.food_app.entity.Item;
import com.tyss.food_app.service_impl.FoodOrderServiceImpl;
import com.tyss.food_app.service_impl.FoodProducteServiceImpl;

@WebServlet("/fectchproduct")
public class FetchProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] parameterValues = req.getParameterValues("itemId");
		List<Item> items = new ArrayList<Item>();
		String v1=req.getParameter("oreder");
		String v2=req.getParameter("delete");
		if(v1.equals("order")) {
		double totalPrice = 0;
		for (String id : parameterValues) {
			FoodProducteServiceImpl fs = new FoodProducteServiceImpl();
			FoodProduct foodProduct = fs.findFoodProductById(Integer.parseInt(id));
			Item item = new Item();
			item.setProductId(foodProduct.getId());
			item.setName(foodProduct.getName());
			item.setPrice(foodProduct.getPrice());
			String qu = req.getParameter("quantity");
			item.setQuantity(Integer.parseInt(qu));
			item.setType(foodProduct.getType());
			totalPrice += item.getPrice();
			items.add(item);

		}
		req.setAttribute("total_price",totalPrice);

		RequestDispatcher dispatcher = req.getRequestDispatcher("order_info.jsp");
		dispatcher.forward(req, resp);
		}
		else if(v1.equals("delete_FO")) {
			
			for (String id : parameterValues) {
				FoodProducteServiceImpl fs = new FoodProducteServiceImpl();
				fs.deleteFoodProduct(Integer.parseInt(id));

			}
			//FoodProducteServiceImpl fsi=new FoodProducteServiceImpl();

			//String id=req.getParameter("item");

			//fsi.deleteFoodProduct(Integer.parseInt(id));
		}
		// PrintWriter writer=resp.getWriter();
//		writer.print("<html><body>");
//		writer.print("<h1></h1>");
//		writer.print("</body></html>");
	}
}
