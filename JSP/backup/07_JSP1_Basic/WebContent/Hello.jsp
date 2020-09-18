<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- directive tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Jsp 기본실습</h1>
	Hello Wordld<br>
	안녕하세요
	<% //Servlet의 doGet() 
		System.out.print("Hello World"); //콘솔 출력
		out.print("test"); //브라우저 출력
		int age = 20;
	%>
	<br>
	<b><%= age %></b> <!-- out.print(age); 와 동일 -->
</body>
</html>