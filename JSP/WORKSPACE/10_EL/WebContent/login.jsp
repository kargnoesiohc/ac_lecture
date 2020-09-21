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
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
	%>
	
	userid:<%=userid %><br>
	passwd:<%=passwd %><br>
	EL:${param.userid }<br> <!-- 위에 파싱 필요 x -->
	EL:${param.passwd }<br>
</body>
</html>