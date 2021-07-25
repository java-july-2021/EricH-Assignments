<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<hr/>
	<div class = "body">
	<form action = "/dashboard" method = "POST">
		 <div>
		 	<label for = "name">Your Name</label>
		 	<input type="text" name="name"/>
		 </div>
		 <div>
		 	<label>Dojo Location:</label>
             	<select name="location">
                 	<option value="San Jose">San Jose</option>
                 	<option value="Oakland">Oakland</option>
                 	<option value="Seattle">Seattle</option>
                 	<option value="Dallas">Dallas</option>
             	</Select>
		 </div>
		 	<label>Favorite Language:</label> 
                <select name="language">
                    <option value="Java">Java</option>
                    <option value="Python">Python</option>
                    <option value="JavaScript">JavaScript</option>
                </Select>
          <div>
          	<label>Comments (Optional):</label>
          </div>
          <div>
          	<textarea name="comments" rows="10" cols="20"></textarea>
          </div>
          <div class="submit">
       		<input type="submit" value="Submit">
          </div>
	</form>
	</div>
</body>
</html>