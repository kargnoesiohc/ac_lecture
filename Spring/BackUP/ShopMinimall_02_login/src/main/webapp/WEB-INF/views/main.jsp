<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
</head>
<body>
<h3>main.jsp</h3>
<jsp:include page="common/top.jsp" flush="false"></jsp:include><br>
<jsp:include page="common/menu.jsp" flush="false"></jsp:include><br>
<c:if test="${!empty mesg }"> <!-- /memberAdd -->
	<script>alert("${mesg}")</script>
</c:if>
</body>
</html>
