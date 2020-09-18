<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
redirect 되어서 옴<br>
<% 
request.setCharacterEncoding("utf-8");
String userid = request.getParameter("userid");
String passwd = request.getParameter("passwd");
String xxx = (String) request.getAttribute("xxx");
%>
사용자 id: <%= userid %><br>
패스워드 : <%= passwd %>
xxx -> <%= xxx %>
</body>
</html>