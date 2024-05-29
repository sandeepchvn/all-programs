<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="signup">
<h1>User</h1>
Name: <input type="text" name="user_name"><br>
Email: <input type="text" name="user_email"><br>
password: <input type="text" name="user_password"><br>
Role <select name="user_role">
		<option value="BRANCHMANAGER">BranchManager</option>
		<option value="CUSTOMER">Customer</option>
		<option value="STAFF">Staff</option>
	</select><br>
	<input type="submit" value="Sign In">
	<a href="LogInUser.jsp">log in</a>
</form>

</body>
</html>