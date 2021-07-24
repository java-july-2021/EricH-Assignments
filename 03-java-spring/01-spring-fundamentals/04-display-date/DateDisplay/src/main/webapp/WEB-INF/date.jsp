<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date</title>
<script src = "js/app.js"></script>
</head>
<body>
<script>alertDate()</script>
<fmt:formatDate pattern = "EEEE, 'the' dd 'of' MMMM, YYYY" value = "${date}"/>
</body>
</html>