<%@page import="com.tyss.food_app.util.Type"%>
<%@page import="com.tyss.food_app.entity.Item"%>
<%@page import="com.tyss.food_app.service_impl.ItemServiceImple"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<h1>Item</h1>
		name:<input type="checkbox" name="item_name"> 
		Product Id:<input type="checkbox" name="item_productID"> 
		Type:<input type="text" name="item_type"> 
		Price:<input type="text" name="item_price">
		Quantity:<input type="text" name="item_quantity"> <input
			type="submit" name="add Item">
	</form>
	<%
		ItemServiceImple is = new ItemServiceImple();
		Item item = new Item();
		item.setName(request.getParameter("item_name"));
		item.setProductId(Integer.parseInt((request.getParameter("item_productID"))));
		item.setType(Type.valueOf(request.getParameter("item_type")));
		item.setQuantity(Integer.parseInt(request.getParameter("item_quantity")));
		item.setPrice(Double.parseDouble(request.getParameter("item_price")));
		is.saveItem(item);

		RequestDispatcher dispatcher = request.getRequestDispatcher("creteFood");
		request.setAttribute("item_details", item);
		dispatcher.forward(request, response);
	%>
</body>
</html>