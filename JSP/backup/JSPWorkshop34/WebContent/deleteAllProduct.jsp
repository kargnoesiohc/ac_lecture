<%@page import="java.util.Arrays"%>
<%@page import="com.service.ProductService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String [] prodIds = request.getParameterValues("delCheck");
    	List<String> x = Arrays.asList(prodIds);
    	ProductService service = new ProductService();
    	int n = service.deleteAll(x);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>상품 삭제 성공</b>
	<a href="listProduct.jsp">목록보기</a> 
</body>
</html>