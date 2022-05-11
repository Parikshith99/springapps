<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

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
	<h2 style="color:red;">${failure }</h2>
	<h1 style="text-align:center;">User Login</h1>
	<form action="loginuser" method="post">
		<table>

			<tr>
				<td>UserName:</td>
				<td><input type="text" name="name" required/></td>
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
	<h3><a href="home">Go to main menu</a></h3>
</body>
</html>