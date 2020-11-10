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
	${username }<br>
	${address }<br>
	list.size() : ${list.size() }<br><br>
	
	<b>표준</b><br>
	<%= request.getAttribute("username") %><br> <!-- 형 변환 필요없이 바로 쓸 수 있음 -->
	<%= request.getAttribute("address") %><br>
	<% ArrayList<String> list = (ArrayList) request.getAttribute("list"); %>
	list.size() : <%= list.size() %>
</body>
</html>