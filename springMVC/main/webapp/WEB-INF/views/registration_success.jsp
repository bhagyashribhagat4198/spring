<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>registration Successfull Please check the details</p>

First Name :${user.firstName }<br>
Last Name :${user.lastname}<br>
Gender :${user.gender}<br>
Courses :
<ul>
<c:forEach var="course" items="${user.course}">
<li>${course}</li>
</c:forEach>
</ul>
<br>
City :${user.city }
</body>
</html>