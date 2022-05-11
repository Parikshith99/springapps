<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
 form {margin:40px 470px;}
 a{margin-left:45%;}
 td {
  padding: 15px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 style="color:red;">${fail }</h2>
	<h1 style="text-align:center;">Admin login</h1>
	<form action="adminloggedin" method="post">
		<table>
		<tr>
				<td>Admin Id:</td>
				<td><input type="text" name="adminid" required/></td>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" required/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" required/></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Login" /></td>
			</tr>

		</table>
	</form>


	<h3><a href="changepassword">change password:</a></h3>
	
	<h3><a href="home">Go to main menu</a></h3>
</body>
</html>