<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" type="text/css" href="css/style2.css">
</head>
<h2>Submitted Info</h2>
<body>
<div class = "">
	<p>Name: <c:out value = "${name}"/></p>
	<p>Location: <c:out value = "${location}"/></p>
	<p>Language: <c:out value = "${language}"/></p>
	<p>Comments: <c:out value = "${comments}"/></p>
</div>
<a href = "/" class = "back"><button>Back</button></a>
</body>
</html>