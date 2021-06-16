<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>


	<h1 align="center" style="font-style: italic;">Login here !!!</h1>

	<hr>

	<c:if test="${param.error != null}">
		<div class="alert alert-danger" role="alert">
			<i style="color: red;">Invalid UserName or Password. Please try
				again !!!</i>
		</div>
	</c:if>


	<c:if test="${param.logout != null}">
		<div class="alert alert-success" role="alert">
			<i style="color: green;">You are Successfully logged out. Sign in
				again !!!</i>
		</div>
	</c:if>

	<form:form action="process-login" method="POST">
		<div class="form-group">
			<label>UserName</label> <input type="text" class="form-control"
				name="username" placeholder="Enter username">
		</div>
		<div class="form-group">
			<label>Password</label> <input type="password" class="form-control"
				name="password" placeholder="Password">
		</div>
		<!-- <div class="form-group form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1">
			<label class="form-check-label" for="exampleCheck1">Check me
				out</label>
		</div> -->
		<button type="submit" class="btn btn-primary">Submit</button>
		<small class="form-text text-muted">We'll never share user
			information with anyone else.</small>
	</form:form>

</body>
</html>