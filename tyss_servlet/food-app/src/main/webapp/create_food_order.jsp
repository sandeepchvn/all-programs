<%@page import="com.tyss.food_app.entity.FoodProduct"%>
<%@page import="java.util.List"%>
<%@page import="com.tyss.food_app.entity.Menu"%>
<%@page import="com.tyss.food_app.service_impl.MenuServiceImlp"%>
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
MenuServiceImlp menuService=new MenuServiceImlp();
/* String id=request.getParameter("2"); */
Menu menu=menuService.findMenu(Integer.parseInt("2"));
List<FoodProduct> foodProducts =menu.getFoodProducts();

%>
<form action="fetch_item_add_order.jsp">
<h1>MENU DETAILS</h1>
<h3>Select Items to order Food:</h3>
  <table border="1" cellpadding="10" cellspacing="1"
   style="text-align: center;">

   <tr>
    <th>id</th>
    <th>name</th>
    <th>type</th>
    <th>about</th>
    <th>availability</th>
    <th>price</th>
    <th>Quantity<th>
   </tr>

   <%
   for (FoodProduct foodProduct : foodProducts) {
   %>

   <tr>
    <td><%=foodProduct.getId()%></td>
    <td><%=foodProduct.getName()%></td>
    <td><%=foodProduct.getType()%></td>
    <td><%=foodProduct.getAbout()%></td>
    <td><%=foodProduct.getAvailability()%></td>
    <td><%=foodProduct.getPrice()%></td>
   <td><input type="number" name="quantity" ></td>
    <td><input type="checkbox" name="itemId"
     value="<%=foodProduct.getId()%>"></td>
   </tr>
   <%
   }
   %>
  </table>
  Customer Name<input type="text" name="customer_name">
  Customer Phone<input type="text" name="customer_phone">
  <input type="submit" name="oreder">
</form>

</body>
</html>