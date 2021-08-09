<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
<h1>${person.firstName} ${person.lastName}</h1>
<p> License Number: ${person.license.getNumberAsString()}</p>
<p> State: ${person.license.state}</p>
<p> Expiration Date: ${person.license.expiration_date}</p>
</body>
</html>