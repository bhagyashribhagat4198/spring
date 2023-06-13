<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>registration Form</h1>
<form:form  action="submit"  modelAttribute="user">
First Name :<form:input path="firstName"/><br>

Last Name :<form:input path="lastname"/><br>

Gender :

Male <form:radiobutton path="gender" value="Male"/>
Female <form:radiobutton path="gender" Value="Female"/>
<br>
Course :
Core Java <form:checkbox path="course" value="Core java"/>
Adv Java <form:checkbox path="course" value="Adv java"/>
HTML <form:checkbox path="course" value="Html"/>
<br>

City :<form:select path="city">
<form:option value="Pune"> Pune</form:option>
<form:option value="Nagpur"> Nagpur</form:option>
<form:option value="Mumbai"> Mumbai</form:option>
<form:option value="Latur"> latur</form:option>
</form:select>
<br>
<input type="submit" value="Register"/>
</form:form>
</body>
</html>