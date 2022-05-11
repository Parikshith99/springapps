<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
 form {margin:40px 460px;}
 a{margin-left:45%;}
 td {
  padding: 15px;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:green;">${addedproduct }</h3>
<h3  style="color:red;">${failProduct }</h3>
<h1 style="text-align:center;">Add Products</h1>
<form action="addProduct" method="post">
		<table>
		<tr>
				<td>Product Id</td>
				<td><input type="text" name="productid" required/></td>
			</tr>
			<tr>
				<td>ProductName:</td>
				<td><input type="text" name="productname" required/></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><input type="text" name="productprice" required/></td>
			</tr>
			<tr>
				<td>category ID:</td>
				<td><input type="text" name="categoryid" required/></td>
			</tr>
			<tr>
				<td>category:</td>
				<td><input type="text" name="categoryname" required/></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Add product" /></td>
			</tr>

		</table>
	</form>
	<h3><a style="text-decoration: none;" href="AdminLoggin">Go to admin page</a></h3>
</body>
</html>