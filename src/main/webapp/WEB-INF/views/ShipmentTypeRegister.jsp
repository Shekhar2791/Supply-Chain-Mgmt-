<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!--<title>ShipmentPage</title> -->
</head>
<body>

	<h3>Welcome to Shipment Type Register Page :</h3>
	<form action="save" method="POST" >
		<pre>
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
		
		<input type="submit" value="CREATE SHIPMENT" />
	</pre>
	</form>
	${message}
</body>
</html>