<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Category</title>
</head>
<body>
<h1><c:out value="${category.name}"/></h1>
<div>
<h4>Products:</h4>
</div>
<div>
<ul>
<c:forEach items="${category.products}" var="product">
<li>${product.name}</li>
</c:forEach>
</ul>
</div>
<div>
<form action = "/category/${category.id}" method = "post">
<div>
	<select name = "product">
		<c:forEach items = "${notCategories}" var = "product">
			<option value = "${product.id}">${product.name}</option>
		</c:forEach>
	</select>
</div>
<button>Add</button>
</form>
</div>
</body>
</html>