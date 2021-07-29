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
<h1>THE CODE</h1>
<ul>
<c:forEach items = "${codeDisplay}" var = "code">
<li>${code}</li>
</c:forEach>
</ul>
</body>
</html>