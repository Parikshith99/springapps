<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
 form {margin:40px 430px;}
 a{margin-left:45%;}
 td {
  padding: 15px;
}
h3{
 color:green;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>${result}</h3>
	<h3 style="color:red;">${failure}</h3>
	<h1 style="text-align:center;">User Registration</h1>
	<form action="registeruser" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" required/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" required/></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="password" required/></td>
			</tr>
			<tr>
				<td>verify Password:</td>
				<td><input type="password" name="verifypassword" required/></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
	
	<c:if test = "${login}">
         <h3><a style="margin-left:47%;" href="login">Login</a></h3>
      </c:if>
<h3><a href="home">Go to main menu</a></h3>
</body>
</html>