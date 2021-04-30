<%@ page import="java.util.*, com.shiwang.main.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Home page</title>
</head>
<body>
	<h2>User Details</h2>
	Your name : ${param.Username}
	<br> Your name in UpperCase : ${convertedName}
	<br></br>

	<table>
		<tr>
			<th>ItemName</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>

		<c:forEach var="list" items="${shoppingCart}">
			<td>${list }</td>

		</c:forEach>

	</table>
</body>
</html>