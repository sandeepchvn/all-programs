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
String name=request.getParameter("user_name");
%>
<h1>Name is:<%= name %></h1>
<h1>Email is:<%=request.getParameter("user_email") %></h1>
<h1>Phone is:<%=request.getParameter("user_phone") %></h1>
</body>
</html>