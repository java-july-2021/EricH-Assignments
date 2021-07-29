<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Code</title>
</head>
<body>
<h1>Code</h1>
<p>${errorMessage}</p>
	<form action = "/code" method = "POST">
	<label>What is the code?</label>
	<input type = "text" name = "code">
	<button>Try Code</button>
	</form>
</body>
</html>