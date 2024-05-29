<%@page import="com.tyss.food_app.entity.Users"%>
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
Users u=(Users)session.getAttribute("customer_session");

%>
<h1>Customer Name : <%=u.getName() %></h1>
<h1>Customer Email : <%=u.getEmail() %></h1>
<h1>Customer Password : <%=u.getPassword() %></h1>

</body>
</html>