<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp here</title>
</head>
<body>

	<h1>SignUp here !!!</h1>

	<form:form action="process-signup" method="POST"
		modelAttribute="signupDTO">
	
	UserName : <form:input path="username" />
		<br>
	Password : <form:input path="password" />
		<br>
		<input type="submit" value="signup">

	</form:form>

</body>
</html>