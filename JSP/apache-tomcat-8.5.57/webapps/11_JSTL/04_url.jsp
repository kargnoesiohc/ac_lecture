<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>url: 상대경로</h2>
<a href="target.jsp">A</a><br>
<a href="<c:url value='target.jsp'/>">A2</a><br>
<a href="/target.jsp">B</a><br> <!-- 에러 -->
<a href="<c:url value='/target.jsp'/>">B2</a> <!-- 에러X  -->
</body>
</html>