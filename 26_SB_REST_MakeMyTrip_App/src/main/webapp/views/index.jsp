<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Passenger Details</h2>
	<form action="bookTicket" method="POST">
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>	
				<td>DOJ :</td>
				<td><input type="text" name="doj"></td>
			</tr>
			<tr>	
				<td>From :</td>
				<td><input type="text" name="from"></td>
			</tr>
			<tr>	
				<td>To :</td>
				<td><input type="text" name="to"></td>
			</tr>
			<tr>	
				<td>Train Number. :</td>
				<td><input type="text" name="trainNum"></td>
			</tr>
			<tr>	
				<td></td>
				<td><input type="Submit" Value="Book Ticket"></td>
			</tr>
		</table>
	</form>
<a href="search">Search Ticket</a>
</body>
</html>