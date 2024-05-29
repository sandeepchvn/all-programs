<%@page import="com.tyss.food_app.service_impl.ItemServiceImple"%>
<%@page import="com.tyss.food_app.entity.FoodProduct"%>
<%@page import="com.tyss.food_app.service_impl.FoodProducteServiceImpl"%>
<%@page import="com.tyss.food_app.service_impl.FoodOrderServiceImpl"%>
<%@page import="com.tyss.food_app.entity.FoodOrder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tyss.food_app.entity.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String[] parameterValues = request.getParameterValues("itemId");
List<Item> items = new ArrayList<Item>();
FoodOrderServiceImpl fs=new FoodOrderServiceImpl();

FoodOrder foodOrder=new FoodOrder();
foodOrder.setCustomerName(request.getParameter("customer_name"));
String phone=request.getParameter("customer_phone");
foodOrder.setContactNumber(Long.parseLong(phone));
double totalprice=0;
for(String i:parameterValues){
	FoodProducteServiceImpl fs2 = new FoodProducteServiceImpl();
	FoodProduct foodProduct = fs2.findFoodProductById(Integer.parseInt(i));
	
	Item item=new Item(); 
	item.setName(foodProduct.getName());
	item.setProductId(foodProduct.getId());
	item.setType(foodProduct.getType());
	String quantity=request.getParameter("quantity");
	int qu=Integer.parseInt(quantity);
	item.setQuantity(qu);
	item.setPrice(foodProduct.getPrice());
	
	totalprice +=foodProduct.getPrice()*qu;
	items.add(item);
	ItemServiceImple is=new ItemServiceImple();
	is.saveItem(item);
}

foodOrder.setTotalPrice(totalprice);
foodOrder.setItems(items);


FoodOrder foodOrder_Toal_price=fs.saveFoodOrder(foodOrder);
request.setAttribute("order_info",foodOrder_Toal_price);

RequestDispatcher dispatcher = request.getRequestDispatcher("customer_order_info.jsp");
dispatcher.forward(request, response);
%>
</body>
</html>