<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<style>
 form {margin:0px 49%;}
h1,p{
text-align: justify;
 text-align:center;
}
a{margin-left:45%;}

}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:green">${purchaseSuccess }</h2>
	<div>
		<h1>${fn:toUpperCase(product.productname) }</h1>
		<p>upper made of best quality leather as per is 5677 of thickness
			1.6-1.8mm (full chrome heavy duty leather) is marked steel toe cap
			conforming to is 5852 (to withstand minimum impact energy of 200
			joules). outer sole made of poly-urethene(pu), directly moulded,
			resistant to oil and acid with anti-skid design. good quality leather
			insole of minimum 2.0 mm thickness and lining leather conforming to
			is 3840. oxidized brass/ss eyelets, minimum three eyelets in each
			face. foam padded cushion for ankle protection.</p>
		<p>Cost: <strong>&#8377;${product.productprice }</strong></p>
		<p>Category Id: <strong>${product.categoryid }</strong></p>
		<p>Category Name: <strong>${product.categoryname }</strong></p>
		
		<form action="buyProduct">
			<table>
                <tr>
					<td />
					<td><input type="hidden" name="productid"
						value="${product.productid }" /></td>
				</tr>
				<tr>
					<td />
					<td><input type="hidden" name="productname"
						value="${product.productname }" /></td>
				</tr>
				<tr>
					<td />
					<td><input type="hidden" name="productprice"
						value="${product.productprice }" /></td>
				</tr>
				<tr>
					<td />
					<td><input type="hidden" name="categoryid"
						value="${product.categoryid }" /></td>
				</tr>
				<tr>
					<td />
					<td><input type="hidden" name="categoryname"
						value="${product.categoryname }" /></td>
				</tr>
				<tr>
					<td />
					<td><input type="submit" value="Buy" /></td>
				</tr>

			</table>
		</form>
		
		
		<h3><a href="${pageContext.request.contextPath }/productsList">Continue Shopping</a></h3>
	</div>
</body>
</html>