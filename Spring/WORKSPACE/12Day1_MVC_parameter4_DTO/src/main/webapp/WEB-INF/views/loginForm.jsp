<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
	<form action="login" method="post"> <!-- action 부분을 수정하여 파싱 방법을 다르게 해서 테스트 -->
		아이디: <input type="text" name="userid"><br>
		비번 : <input type="password" name="passwd"><br>
		<button type="submit">로그인</button>
	</form>
</body>
</html>