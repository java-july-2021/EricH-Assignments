<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Question</title>
</head>
<body>
<h1>What is your Question</h1>
<form:form action = "/questions/new" method = "POST" modelAttribute = "newQuestion">
<div>
	<form:label path ="questionText">Question:</form:label>
	<form:errors path ="questionText"/>
	<form:textarea path = "questionText"/>
</div>
<div>
	<form:label path ="tagsFrontEnd">Tag: (separate by comma)</form:label>
	<form:errors path ="tagsFrontEnd"/>
	<form:input path = "tagsFrontEnd"/>
</div>
<div>
	<input type = "submit" value = "submit">
</div>
</form:form>
</body>
</html>