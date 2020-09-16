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
   String mesg = (String)request.getAttribute("request"); //request객체
   String mesg2 = (String)session.getAttribute("session"); //session객체
   String mesg3 = (String)application.getAttribute("application"); //context객체
%>
1>>>><%=mesg %><br>
2>>>><%=mesg2 %><br>
3>>>><%=mesg3 %><br>
hello~~
</body>
</html>