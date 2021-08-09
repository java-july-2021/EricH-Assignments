<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New License</title>
</head>
<body>
<h1>New License</h1>
<form:form action = "/license/new" method = "POST" modelAttribute = "license">
<div>
	<form:label path = "person">Person:</form:label>
	<form:select path = "person">
		<c:forEach items = "${allPeople}" var = "person">
			<option value = "${person.id}"> ${person.firstName} ${person.lastName}</option>
		</c:forEach>
	</form:select>
</div>
<div>
	<form:label path = "state">State:</form:label>
	<form:errors path = "state"/>
	<form:input path = "state"/>
</div>
<div>
	<form:label path = "expiration_date">Expiration Date:</form:label>
	<form:errors path = "expiration_date"/>
	<form:input type = "date" path = "expiration_date"/>
</div>
<div>
	<input type="submit" value="Create">
</div>
</form:form>
</body>
</html>