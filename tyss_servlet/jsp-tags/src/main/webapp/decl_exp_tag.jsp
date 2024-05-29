<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!double pi = 3.142;

	double area(int r) {
		return pi * r * r;
	}%>
	<h1>
		pi is :<%=pi%></h1>
	<h1>
		Area of Circle is
		<%=area(5)%></h1>
</body>
</html>