<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	main1.jsp<br>
	<b>EL</b><br>
	${username }<br><br>
	
	<b>표준</b><br>
	<%=request.getAttribute("username") %>	
</body>
</html>