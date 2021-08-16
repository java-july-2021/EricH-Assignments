<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question</title>
</head>
<body>
<h1>Questions Dashboard</h1>
<table>
	<thead>
		<tr>
			<th>Question</th>
			<th>Tags</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${allQuestions}" var = "question">
		<tr>
			<td><a href ="/questions/${question.id}">${question.questionText}</a></td>
			<td>
			<c:forEach items = "${question.tags}" var = "tag">
			${tag.subject}, 
			</c:forEach>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<a href = "/new">New Question</a>
</body>
</html>