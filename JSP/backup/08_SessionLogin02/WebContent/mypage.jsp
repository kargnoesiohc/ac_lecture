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
		String userid = (String)session.getAttribute("userid");
		String passwd = (String)session.getAttribute("passwd");
		if(userid!=null){
	%>
<h2>myPage</h2>
아이디 : <%= userid %>
비밀번호 : <%= passwd %><br>
<a href="LogoutServlet">로그아웃</a>
<%} else { %>
<h2>회원이 아닙니다.</h2>
<% } %>
</body>
</html>