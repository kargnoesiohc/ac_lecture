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
	String username = (String) session.getAttribute("username");
	String passwd = (String) session.getAttribute("passwd");
%>

<h1>info2 세션정보</h1>
이름 : <%= username %>
비번 : <%= passwd %>
</body>
</html>