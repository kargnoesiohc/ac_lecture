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
	<h3>로그인</h3>
	<b>EL</b><br>
	안녕하세요. ${sessionScope.login.userid } 님 <br>
	비번은 ${sessionScope.login.passwd } 입니다.<br><br>
	
	<%LoginDTO dto = (LoginDTO) session.getAttribute("login");  %>
	<b>표준</b>
	안녕하세요.<%=dto.getUserid() %> 님 <br>
	비번은 <%=dto.getPasswd() %> 입니다.<br>
	
	<form action="logout">
		<input type="submit" value="로그아웃">
	</form>
	
	
	
	<%-- 아이디 : ${xxx.userid }<br>
	비번 : ${xxx.passwd }	<br><br>
	
	<% LoginDTO dto = (LoginDTO) request.getAttribute("xxx");%>
	<%= dto.getUserid() %><br>
	<%= dto.getPasswd() %><br> --%>
	
	<%-- ModelAndView<br>
	아이디: ${loginDTO.userid }<br>
	비번 : ${loginDTO.passwd } --%>
</body>
</html>