<%@page import="com.tyss.food_app.entity.Users"%>
<%@page import="com.tyss.food_app.service_impl.UserServiceImple"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input type="text" name="id">
	<%
		UserServiceImple userService = new UserServiceImple();
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		Users u=userService.getByUserId(id);
		String name=u.getName();
	%>
	<input type="text" value='${name }'>
</body> 
</html>