<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h1>Register!</h1>
    
<%--     <p><form:errors path="user.*"/></p> --%>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="email">Email:</form:label>
            <form:errors path="email"/>
            <form:input type="email" path="email"/>
        </p>
        <p>
            <form:label path="password">Password:</form:label>
            <form:errors path="password"/>
            <form:password path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:errors path="passwordConfirmation"/>
            <form:password path="passwordConfirmation"/>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>
    
</body>
</html>