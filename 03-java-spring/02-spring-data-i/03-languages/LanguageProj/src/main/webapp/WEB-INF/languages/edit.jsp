<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
<div>
<a href="/languages"><button>Dashboard</button></a>
</div>
<div>
<form method="POST" action="/languages/${language.id}/delete">
<input type="hidden" name="_method" value="delete">
<button>Delete</button>
</form>
</div>
<form:form action = "/languages/${language.id}/edit" method = "POST" modelAttribute = "language">

		<div>
			<form:label path = "name">Name</form:label>
			<form:errors path = "name"/>
			<form:input path = "name"/>
		</div>
		<div>
			<form:label path = "creator">Creator</form:label>
			<form:errors path = "creator"/>
			<form:input path = "creator"/>
		</div>
		<div>
			<form:label path = "currentVersion">Version</form:label>
			<form:errors path = "currentVersion"/>
			<form:input path = "currentVersion"/>
		</div>
		<input type="hidden" name="_method" value="PUT">
		<div>
			<button>Edit</button>
		</div>
	</form:form>
</body>
</html>