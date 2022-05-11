<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
form {
	margin: 20px 430px;
}

a {
	margin-left: 45%;
}

td {
	padding: 15px;
}


</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align:center">Search users</h1>
	<form action="searchUsers" method="post">
		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="name" required /></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</form>


	<c:if test="${userpresent}">
		<table border="1" style="margin: 5px auto; width: 50%">
			<tr>
				<th>User ID</th>
				<th>User Name</th>
				<th>User Email</th>
				<th>User Password</th>
			</tr>
			<c:forEach var="user" items="${result}">
				<tr>
					<td>${user.id }</td>
					<td>${fn:toUpperCase(user.name) }</td>
					<td>${user.email }</td>
					<td>${user.password }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	<c:if test="${!userpresent}">
		<h3 style="text-align:center">No users To show</h3>
	</c:if>
	<br/><br/>
<hr/>
<h2 style="text-align:center">List Of Users</h2>
	<table border="1" style="margin: 20px auto; width: 50%">
		<tr>
			<th>User ID</th>
			<th>User Name</th>
			<th>User Email</th>
			<th>User Password</th>
		</tr>
		<c:forEach var="user" items="${userslist}">
			<tr>
				<td>${user.id }</td>
				<td>${fn:toUpperCase(user.name) }</td>
				<td>${user.email }</td>
				<td>${user.password }</td>
			</tr>
		</c:forEach>
	</table>


	<h3>
		<a style="text-decoration: none;" href="AdminLoggin">Go to admin
			page</a>
	</h3>
</body>
</html>