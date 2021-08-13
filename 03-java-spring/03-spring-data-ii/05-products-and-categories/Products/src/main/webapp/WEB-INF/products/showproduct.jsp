<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Product</title>
</head>
<body>
<h1><c:out value="${product.name}"/></h1>
<div>
<h4>Categories:</h4>
</div>
<div>
<ul>
<c:forEach items="${product.categories}" var="category">
<li>${category.name}</li>
</c:forEach>
</ul>
</div>
<div>
<form action = "/product/${product.id}" method = "post">
<div>
	<select name = "category">
		<c:forEach items = "${notProducts}" var = "category">
			<option value = "${category.id}">${category.name}</option>
		</c:forEach>
	</select>
</div>
<button>Add</button>
</form>
</div>
</body>
</html>