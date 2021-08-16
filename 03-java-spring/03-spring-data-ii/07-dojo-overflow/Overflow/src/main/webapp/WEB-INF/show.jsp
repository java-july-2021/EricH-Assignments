<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Question</title>
</head>
<body>
<h1><c:out value = "${question.questionText}"/></h1>
<div>
<p>Tags:
	<c:forEach items ="${question.tags}" var = "tag">
		${tag.subject}, 
	</c:forEach>
</p>
</div>
<div>
<table>
	<thead>
		<tr>
			<th>Answers</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${question.answers}" var = "answer">
		<tr>
			<td>${answer.qAnswer}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</div>
<p>Add your answer:</p>
<form:form action = "/answer " method = "POST" modelAttribute = "answer">
<div>
	<form:label path ="qAnswer">Answer:</form:label>
	<form:errors path ="qAnswer"/>
	<form:textarea path = "qAnswer"/>
	<form:hidden path="question" value ="${question.id}"/>
</div>
<div>
	<input type = "submit" value = "Answer it!">
</div>
</form:form>

</body>
</html>