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
		//서블릿
		String userid2 = getServletContext().getInitParameter("userid");
		
		//jsp에서 파라미터 얻기
		String userid = application.getInitParameter("userid");
		String email = application.getInitParameter("email");
	%>
	
	서블릿 :<%= userid2 %><br>
	jsp :<%= userid %><br>
	jsp :<%= email %><br>
	EL : ${initParam.userid}<br>
	EL : ${initParam.email}<br>
</body>
</html>