<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<font color="green">${msg}</font>
	<h3> User Form </h3>
	<form action = "user" method = "POST">
	
		<table>
			<tr>
				<td>Name : </td>
				<td><input type="text" name = "name"> </td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><input type="email" name = "email"> </td>
			</tr>
			<tr>
				<td>Ph no : </td>
				<td><input type="number" name = "phno"> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value = "Save"> </td>
			</tr>
			
			
		</table>
	</form>
</body>
</html>