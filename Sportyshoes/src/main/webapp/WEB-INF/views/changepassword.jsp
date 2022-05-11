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
<h2 style="color:green;">${newpass }</h2>
<h2 style="color:red;">${passwordfailure }</h2>
<h1 style="text-align:center;">Change Password</h1>
<form action="newPassword" method="post">
		<table>
		<tr>
				<td>Admin Id: </td>
				<td><input type="text" name="adminid" required/></td>
			</tr>
			<tr>
				<td>UserName: </td>
				<td><input type="text" name="username" required/></td>
			</tr>
			<tr>
				<td>New Password:</td>
				<td><input type="password" name="password" required/></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="change Password"/></td>
			</tr>

		</table>
	</form>
	<h3><a href="adminlogin">Go to admin login</a></h3>
</body>
</html>