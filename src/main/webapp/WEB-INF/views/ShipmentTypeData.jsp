<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h3>WELCOME TO SHIPMENT TYPE DATA PAGE</h3>
	<c:choose>
		<c:when test="${!empty list}">
		<table border="1">
			<tr>
				<th>ID</th>
				<th>CODE</th>
				<th>GRADE</th>
				<th>MODE</th>
				<th>ENABLE</th>
				<th>NOTE</th>
				<th colspan="3">OPERATION</th>
			</tr>
		<c:forEach items="${list}" var="ob">
			<tr>
				<td>${ob.shipId}</td>
				<td>${ob.shipMode}</td>
				<td>${ob.shipCode}</td>
				<td>${ob.enableShipment}</td>
				<td>${ob.shipGrade}</td>
				<td>${ob.description}</td>
				<td><a href="delete?sid=${ob.shipId}">DELETE</a></td>
				<td><a href="edit?sid=${ob.shipId}">EDIT</a></td>
				<td><a href="view?sid=${ob.shipId}">VIEW</a></td>
			</tr>
			
		</c:forEach>
		</table>	
		</c:when>
		
		<c:otherwise>
			<h4>NO DATA FOUND</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>