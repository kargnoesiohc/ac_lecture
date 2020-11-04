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
	LoginDTO dto = (LoginDTO) request.getAttribute("xxx");
%>
	<b>login.jsp</b><br>
	<h3>로그인 성공 화면</h3><br>
	<b>표준 데이터 파싱</b><br>
	아이디: <%=dto.getUserid() %><br>
	비번 : <%=dto.getPasswd() %><br><br>
	
	<b>EL태그 사용</b><br>
	아이디:${xxx.userid}<br>
	비번 : ${xxx.passwd}<br>
	<a href="loginForm">로그인 페이지</a>
</body>
</html>