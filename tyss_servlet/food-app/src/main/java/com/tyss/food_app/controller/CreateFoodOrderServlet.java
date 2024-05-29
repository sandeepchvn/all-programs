package com.tyss.food_app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.food_app.entity.FoodOrder;
import com.tyss.food_app.entity.Item;
import com.tyss.food_app.service_impl.FoodOrderServiceImpl;
import com.tyss.food_app.service_impl.FoodProducteServiceImpl;
import com.tyss.food_app.service_impl.ItemServiceImple;
import com.tyss.food_app.util.Type;

@WebServlet("/creteFood")
public class CreateFoodOrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String status=req.getParameter("fo_staus");
		//String price=req.getParameter("fo_price");
		String name=req.getParameter("fo_Cu_name");
		String phone=req.getParameter("fo_Cu_phone");

//		ItemServiceImple is=new ItemServiceImple();
//		Item item=new Item();
//		item.setName(req.getParameter("item_name"));
//		item.setProductId(Integer.parseInt((req.getParameter("item_productID"))));
//		item.setType(Type.valueOf(req.getParameter("item_type")));
//		item.setQuantity(Integer.parseInt(req.getParameter("item_quantity")));
//		item.setPrice(Double.parseDouble(req.getParameter("item_price")));
//		is.saveItem(item);
//		
		
		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setStatus(status);
		//foodOrder.setTotalPrice(Double.parseDouble(price));
		foodOrder.setCustomerName(name);
		foodOrder.setContactNumber(Long.parseLong(phone));
		
//		List<Item> items=Arrays.
//		foodOrder.setItems(items);
//		
		
		FoodOrderServiceImpl foodServiceImpl=new FoodOrderServiceImpl();
		foodServiceImpl.saveFoodOrder(foodOrder);
		PrintWriter writer=resp.getWriter();
		writer.print("<h1>Food Order is created-------!</h1>");
	}
}
