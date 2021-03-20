<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW-STUDENTS-LIST</title>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>

<body class="container font-italic">
	<h1 align="center" >Student-Management</h1>
	<hr>
	<div >
		<form:form action="showStudentpage" method="GET">
			<button type="submit" class="btn btn-outline-success">Add</button>
		</form:form>
	</div>
	
	<div align="center" class="pt-2">
		<table border="1" class="table table-striped border border-5">
			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>MOBILE</th>
					<th>COUNTRY</th>
					<th></th>
					<th></th>
				</tr>
			</thead>

			<c:forEach var="student" items="${studentsList}">
				<tr >
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td ><a
						href="/student-management/updateStudent?id=${student.id}" class="stretched-link">Update</a></td>
					<td ><a
						href="/student-management/deleteStudent?id=${student.id}" class="stretched-link text-danger"
						onclick="if(!(confirm('Are you sure you want to delete this record?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>


</body>
</html>