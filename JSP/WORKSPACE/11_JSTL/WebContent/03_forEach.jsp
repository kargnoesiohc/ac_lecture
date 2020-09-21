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
<h2>forTokens</h2>
<c:forTokens var="z" items="${yyy }" delims="/">
${z }<br>
</c:forTokens>

<h2>forEach1</h2>
<c:forEach var="person" items="${xxx }">
${person.username }
${person.age }<br>
</c:forEach>

<h2>forEach2:status</h2>
<c:forEach var="person" items="${xxx }" varStatus="status">
</c:forEach>
</body>
</html>