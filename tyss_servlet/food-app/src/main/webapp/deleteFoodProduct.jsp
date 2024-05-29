<%@page import="com.tyss.food_app.service_impl.FoodProducteServiceImpl"%>
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

FoodProducteServiceImpl fsi=new FoodProducteServiceImpl();

String id=request.getParameter("id");
System.out.print(id);
fsi.deleteFoodProduct(Integer.parseInt(id));
RequestDispatcher dispatcher=request.getRequestDispatcher(path);
%>
</body>
</html>