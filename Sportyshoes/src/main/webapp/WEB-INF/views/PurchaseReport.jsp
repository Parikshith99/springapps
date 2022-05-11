<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style>
form {
	margin: 40px 470px;
}

a {
	margin-left: 45%;
}

td {
	padding: 2px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">Purchase Report</h1>

	<form action="FinalPurchaseReport" method="get">
		<table>

			<tr>
				<td>Select date of purchase</td>
				<td><select name="selectedDate">
						<c:forEach var="datePurchase" items="${datePurchases}">
							<option>${datePurchase}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Select product category</td>
				<td><select name="selectedCategory">
						<c:forEach var="categoryPurchaseName" items="${categoryPurchases}">
							<option>${categoryPurchaseName}</option>
						</c:forEach>

				</select></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>

	<table border="1" style="margin: 30px auto; width: 50%">
		<tr>
			<th>category Id</th>
			<th>category Name</th>
			<th>Purchase Date</th>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Quantity Sold</th>
		</tr>
		<c:forEach var="summaryReport" items="${summaryReport}">
			<tr>
				<td>${summaryReport[0] }</td>
				<td>${summaryReport[5] }</td>
				<td>${summaryReport[1] }</td>
				<td>${summaryReport[2] }</td>
				<td>${summaryReport[3] }</td>
				<td>&#8377;${summaryReport[4] }</td>
				<td>${summaryReport[6] }</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<table border="1" style="margin: 30px auto; width: 50%">
		<tr>
			<th>Purchase ID</th>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>category Id</th>
			<th>category Name</th>
			<th>Purchase Date</th>
		</tr>
		<c:forEach var="purchaseReport" items="${FinalReport}">
			<tr>
				<td>${purchaseReport.purchaseid }</td>
				<td>${purchaseReport.products.productid }</td>
				<td>${purchaseReport.products.productname }</td>
				<td>&#8377;${purchaseReport.products.productprice }</td>
				<td>${purchaseReport.products.categoryid }</td>
				<td>${purchaseReport.products.categoryname }</td>
				<td>${purchaseReport.date }</td>
			</tr>
		</c:forEach>
	</table>
	<h3>
		<a style="text-decoration: none;" href="AdminLoggin">Go to admin
			page</a>
	</h3>
</body>
</html>