<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo !!!!!! from JSP</title>
</head>
<body>
<%
System.out.println(request.getParameter("name"));
java.util.Date date = new java.util.Date();
Date d = new Date();
%>
<div>Current date is : <%=date%></div>
	My First JSP ${name} and password ${password}
	
	<form action="/login.do" method="post">
	<p><font color="red">${errorMessage}</font><br>
	Enter your name : <input type="text" name="name"/>
	Password : <input type="password" name="password" value="Login"/>
	
	<input type="submit" value="Login"/>
	
	</form>
</body>
</html>