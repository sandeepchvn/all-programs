package com.tyss.food_app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.food_app.entity.FoodProduct;
import com.tyss.food_app.entity.Menu;
import com.tyss.food_app.service_impl.FoodProducteServiceImpl;
import com.tyss.food_app.service_impl.MenuServiceImlp;
import com.tyss.food_app.util.Availability;
import com.tyss.food_app.util.Type;

@WebServlet("/add-menu")
public class AddMenuServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("food_product_name");
			Type type = (Type.valueOf(req.getParameter("type")));
			String about = req.getParameter("food_product_about");
			Availability availability = (Availability.valueOf(req.getParameter("av")));
			String price = req.getParameter("food_product_price");

			MenuServiceImlp menuService = new MenuServiceImlp();
			String id=req.getParameter("menu_id");
			Menu menu =menuService.findMenu(Integer.parseInt(id));
			
			
			FoodProducteServiceImpl fs = new FoodProducteServiceImpl();
			
			FoodProduct foodProduct = new FoodProduct();
			foodProduct.setName(name);
			foodProduct.setType(type);
			foodProduct.setAbout(about);
			foodProduct.setAvailability(availability);
			foodProduct.setPrice(Double.parseDouble(price));
			foodProduct.setMenu(menu);
			
			FoodProduct f1 = fs.saveFoodProduct(foodProduct);

			fs.saveFoodProduct(foodProduct);
//			List<FoodProduct> foodProducts = Arrays.asList(f1);
//			menu.setFoodProducts(foodProducts);
//			menuService.updateMenu(menu);
			//menuService.saveMenu(menu);

			while (!(req.getParameter("choice").equalsIgnoreCase("exit"))) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("AddMenu.jsp");
//			resp.sendRedirect("AddMenu.jsp");
			
				dispatcher.forward(req, resp);
				break;
			}
		} catch (Exception e) {
			PrintWriter writer = resp.getWriter();
			writer.print("<h1>exited</h1>");
		}
	}
}
