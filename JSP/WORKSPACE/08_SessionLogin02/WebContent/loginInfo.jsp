<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userid = (String) session.getAttribute("userid");
	%>
	
	<h2>Login info</h2>
아이디 : <%= userid %>
<a href="LoginInfoServlet">LoginInfoServlet</a>
</body>
</html>