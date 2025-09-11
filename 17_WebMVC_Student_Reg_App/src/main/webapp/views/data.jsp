<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>View Students</h2>

	<a href="/"> Add New Student</a>
	<table border="">
		<thead>
			<tr>
				<th>Sr. No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Course</th>
				<th>Timings</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${students}" var="student" varStatus="index">

				<tr>
					<td>${index.count}</td>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.gender}</td>
					<td>${student.course}</td>
					<td>${student.timings}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>