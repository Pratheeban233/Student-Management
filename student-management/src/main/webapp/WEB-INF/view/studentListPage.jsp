<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW-STUDENTS-LIST</title>
</head>

<body>
	<h1 align="center">Student-Management</h1>
	<hr>
	<div>
		<form:form action="showStudentpage" method="GET">
			<button type="submit">Add</button>
		</form:form>
	</div>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<td>ID</td>
					<td>NAME</td>
					<td>MOBILE</td>
					<td>COUNTRY</td>
				</tr>
			</thead>

			<c:forEach var="student" items="${studentsList}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a href="/student-management/updateStudent?id=${student.id}">Update</a></td>
					<td><a href="/student-management/deleteStudent?id=${student.id}">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>


</body>
</html>