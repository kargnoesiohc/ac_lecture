<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String skyKey = (String) request.getAttribute("skyKey");
    	String tptKey = (String) request.getAttribute("tptKey");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>날씨</h2>
 <b><%=skyKey %></b>
 <b><%=tptKey %></b>

</body>
</html>