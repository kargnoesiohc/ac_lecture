<%@page import="com.dto.MemberDTO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
</head>
<body>
<h1>Main</h1>
<jsp:include page="common/top.jsp" flush="true"></jsp:include><br>
<jsp:include page="common/menu.jsp" flush="true"></jsp:include><br>
<jsp:include page="goods/goodsList_stu.jsp" flush="true"></jsp:include><br>

<% 
	String mesg = (String) session.getAttribute("memberAdd"); 
	
	if(mesg!=null) {
%>
<script type="text/javascript">
	alert('<%=mesg%>');
</script>
<% } %>
	
</body>
</html>