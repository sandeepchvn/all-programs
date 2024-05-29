<%@page import="com.tyss.food_app.entity.FoodOrder"%>
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
FoodOrder o=(FoodOrder)request.getAttribute("order_info");

%>
<h1>Customer Name : <%= o.getCustomerName() %></h1>
<h1>Customer Number : <%= o.getContactNumber() %></h1>
<h1>total price : <%= o.getTotalPrice() %></h1>
</body>
</html>