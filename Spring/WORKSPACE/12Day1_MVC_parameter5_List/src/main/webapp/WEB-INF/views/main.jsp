<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	main.jsp<br>
	<b>전체 출력</b><br>
	${list }<br>
	<b>개별 출력</b><br>
	${list.get(0)}<br>
	${list.get(2)}
</body>
</html>