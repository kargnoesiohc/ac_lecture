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
	<b>전체 출력(EL)</b><br>
	${xxx}<br>
	<b>반복문으로 출력(표준)</b><br>
	<%ArrayList<String> list = (ArrayList) request.getAttribute("xxx");
		for(int i=0;i<list.size();i++) {
	%>
		<%= list.get(i) %><br>
	<% } %>
	
	
</body>
</html>