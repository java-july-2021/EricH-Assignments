<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>
<form:form action = "/ninja/new" mathod = "post" modelAttribute = "ninja">
<div>
	<form:label path = "dojo">Dojo:</form:label>
	<form:select path = "dojo">
		<c:forEach items = "${allDojos}" var = "dojo">
			<option value = "${dojo.id}">${dojo.name}</option>
		</c:forEach>
	</form:select>
</div>
<div>
	<form:label path="firstName">First Name:</form:label>
	<form:errors path="firstName"/>
	<form:input path="firstName"/>
</div>
<div>
	<form:label path="lastName">Last Name:</form:label>
	<form:errors path="lastName"/>
	<form:input path="lastName"/>
</div>
<div>
	<form:label path="age">Age:</form:label>
	<form:errors path="age"/>
	<form:input path="age"/>
</div>
<div>
	<input type="submit" value="Create">
</div>
</form:form>
</body>
</html>