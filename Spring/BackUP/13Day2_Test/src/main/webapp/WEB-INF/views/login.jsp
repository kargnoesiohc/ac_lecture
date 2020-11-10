<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>세션 로그인 정보</h3>
	아이디  : ${sessionScope.login.userid } <br>
	비번 : ${sessionScope.login.passwd }<br>
	
	<form action="logout">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>