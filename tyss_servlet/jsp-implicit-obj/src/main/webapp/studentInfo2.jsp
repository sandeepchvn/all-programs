<%@page import="com.ty.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User who have loggen in is:<%=session.getAttribute("userName") %></h1>
<%
Student student=(Student)session.getAttribute("myStudent");
%>
<h1>Student information</h1>
<h3>ID is:<%=student.getId() %></h3>
<h3>Name is:<%=student.getName() %></h3>
<h3>Email is:<%=student.getEmail() %></h3>
</body>
</html>