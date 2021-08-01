<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<table>
   		<thead>
   			<tr>
	   			<th>Name</th>
	   			<th>Creator</th>
	   			<th>Version</th>
	   			<th>Action</th>
	   		</tr>
       </thead>
       <tbody>
       <c:forEach items = "${allLangauge}" var = "lang">
       	<tr>
	       	<td><a href="/languages/${lang.id}">${lang.name}</a></td>
	       	<td>${lang.creator}</td>
	       	<td>${lang.currentVersion}</td>
	       	<td>
	       		<a href="/languages/${lang.id}/edit"><button>Edit</button></a>
	       		<form method="POST" action="/languages/${lang.id}/delete">
	       		<input type="hidden" name="_method" value="delete">
	       		<button>Delete</button>
	       		</form>
            </td>
       	</tr>
       </c:forEach>
		</tbody>
	</table>
<form:form action = "/languages" method = "POST" modelAttribute = "languages">
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
	<div>
		<input type="submit" value="Submit">
	</div>
</form:form>
</body>
</html>






