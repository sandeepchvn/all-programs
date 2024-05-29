<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add-menu">
		<h1>Enter the Menu Id to Add Food Products<input type="text" name="menu_id"></h1> 
	
		<h2>Food Product Details</h2>
		Name:<input type="text" name="food_product_name"><br>
		Type:<select name="type">
			<option value="VEG">veg</option>
			<option value="NONVEG">nonveg</option>
			<option value="VEGAN">vegan</option>
		</select> <br> About:<input type="text" name="food_product_about"><br>
		Availability:<select name="av">
			<option value="AVAILABLE">available</option>
			<option value="NOT_AVAILABLE">not_available</option>
		</select> <br> Price:<input type="text" name="food_product_price"><br>
	
	type exit to stop adding<input type="text" name="choice"> 
		<input type="submit" value="Add To Menu"><br>
	</form>
	<a href="BranchManagerHomePage.jsp"><button>back</button></a>
</body>
</html>