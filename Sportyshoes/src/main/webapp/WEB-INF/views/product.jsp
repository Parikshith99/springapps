<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;">Product List</h1><br/>
<ul>	
		<c:forEach items="${Products}" var="product">
			<li><h3><a href="productdetails/${product.productid }" >${product.productname}</a></h3><br/></li>
		</c:forEach>
	</ul>
	<h3 style="text-align:center;"><a href="home">Logout</a></h3>
</body>
</html>