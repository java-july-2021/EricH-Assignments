<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Language</title>
</head>
<a href="/languages"><button>Dashboard</button></a>

<body>
<p> <c:out value = "${language.name}"/></p>
<p> <c:out value="${language.creator}"/></p>
<p> <c:out value="${language.currentVersion}"/></p>

<a href="/languages/${language.id}/edit"><button>Edit</button></a>
<form method="POST" action="/languages/${language.id}/delete">
<input type="hidden" name="_method" value="delete">
<button>Delete</button>
</form>

</body>
</html>
