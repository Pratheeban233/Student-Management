<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Student-Page</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body class="container">

	<h3 align="center">Add-Student</h3>
	<hr>
	<div align="center" class=".me-3 ">
		<form:form action="save-Student" modelAttribute="student"
			method="POST">

			<form:hidden path="id" />

			<div class="mb-3 row">
				<label class="col-sm-3 col-form-label">Name : </label>
				<div class="col-sm-10">
					<form:input path="name" class="form-control" />
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-3 col-form-label">Mobile : </label>
				<div  class="col-sm-10">
					<form:input path="mobile" class="form-control" />
				</div>
			</div>
			<div class="mb-3 row">
				<label class="col-sm-3 col-form-label">Country : </label>
				<div  class="col-sm-10">
					<form:input path="country" class="form-control" />
				</div>

			</div>
			<button type="submit" value="submit" class="btn btn-outline-success">Submit</button>

		</form:form>
	</div>
</body>
</html>