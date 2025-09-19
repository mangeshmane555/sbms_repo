<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Get Your Ticket Details</h2>
	<form action="searchTicket" method="POST">
		<table>
			<tr>
				<td>Ticket ID :</td>
				<td><input type="Submit" value="Search"></td>
			</tr>
			
		</table>
		<hr>
		<h1>Ticket Data </h1>
		<table>
			<tr>
				<td>Ticket Id :</td>
				<td>${ticket.ticketId}</td>
			</tr>
			<tr>
				<td>Ticket Status :</td>
				<td>${ticket.ticketStatus}</td>
			</tr>
			<tr>	
				<td> Ticket Cost :</td>
				<td>${ticket.ticketCost}</td>
			</tr>
			<tr>	
				<td>From :</td>
				<td>${ticket.from}</td>
			</tr>
			<tr>	
				<td>To :</td>
				<td>${ticket.to}</td>
			</tr>
			<tr>	
				<td>Train Number. :</td>
				<td>${ticket.trainNum}</td>
			</tr>
			
		</table>
		
	<a href="/" > GO Back</a>	
	</form>
	
</body>
</html>