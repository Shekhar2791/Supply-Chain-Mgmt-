<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO SHIPMENT TYPE EDIT PAGE</h3>
	<form:form action="update" method="post" modelAttribute="ShipmentType">
		<pre>
		ShipmentID:<form:input path="shipId" readonly="true"/>
		
		Shipment Mode: <select name="shipMode">
							<option>--SELECT--</option>
							<option>Air</option>
							<option>Truck</option>
							<option>Ship</option>
							<option>Train</option>
						 </select>
						 
		Shipment Code: <input type="text" name="shipCode" />
		
		Enable Shipment: <select name="enableShipment">
							<option>--SELECT--</option>
							<option>Yes</option>
							<option>No</option>
						</select>
						 
		Shipment Grade: <input type="radio" name="shipGrade" value="A">A 
		                <input type="radio" name="shipGrade" value="B">B 
		                <input type="radio" name="shipGrade" value="C">C
						
		Description: <textarea name="Description"></textarea>
		
		<input type="submit" value="Update" />
		</pre>
	</form:form>
</body>
</html>