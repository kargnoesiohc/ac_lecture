<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>로그인 화면</b>

<form action="LoginServlet" method="post">
아이디: <input type="text" name="userid"><br>
비밀번호: <input type="password" name="passwd">
<button type="submit">로그인</button>
</form>
</body>
</html>