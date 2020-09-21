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

<h2>choose</h2>
<c:choose>
	<c:when test="${xxx == '홍길동' }">
	홍길동이다
	</c:when>
	<c:when test="${xxx != '홍길동' }">
	홍길동이 아니다
	</c:when>
	</c:choose>


<h2>if</h2>
<c:if test="${xxx == '홍길동' }">
홍길동이다.
</c:if>
<c:if test="${xxx != '홍길동' }">
홍길동이 아니다.
</c:if>

</body>
</html>