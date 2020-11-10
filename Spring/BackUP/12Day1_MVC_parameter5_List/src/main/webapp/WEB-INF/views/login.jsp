<%@page import="java.util.ArrayList"%>
<%@page import="com.dto.LoginDTO"%>
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
	LoginDTO dto = (LoginDTO) request.getAttribute("loginDTO");
%>
	<b>login.jsp</b><br>
	<h3>로그인 성공 화면</h3><br>
	<b>표준 데이터 파싱</b><br>
	<b><%=dto.getUserid() %></b>님 환영합니다.<br>
	비밀번호는 <%=dto.getPasswd() %>입니다.<br><br>
	
	<b>EL</b><br>
	<b>${loginDTO.userid}</b>님 환영합니다.<br>
	비밀번호는 ${loginDTO.passwd}입니다.<br>
	<a href="loginForm">로그인 페이지</a>
</body>
</html>