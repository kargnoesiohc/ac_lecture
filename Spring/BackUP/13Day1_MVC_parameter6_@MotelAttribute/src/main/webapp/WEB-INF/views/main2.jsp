<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	main2.jsp<br>
	<b>EL</b><br>
	${xxx }<br><br>
	
	<b>표준</b>
	<%ArrayList<String> list = (ArrayList) request.getAttribute("xxx"); %><br>
	<%= list.size() %>
</body>
</html>