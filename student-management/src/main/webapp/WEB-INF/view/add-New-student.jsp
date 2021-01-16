<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add-Student-Page</title>
</head>
<body>

<h3 align="center">Add-Student</h3>
<hr>
<div  align="center" >
<form:form action="addStudent" modelAttribute="student" method="GET">

<label>Name    : </label> <form:input path="name"/> 

<br>

<label>Mobile  : </label> <form:input path="mobile"/> 

<br>

<label>Country : </label> <form:input path="country"/> 

<br><br>

<button type="submit">ADD</button>

</form:form>
</div>
</body>
</html>