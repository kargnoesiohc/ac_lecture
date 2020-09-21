<%@page import="com.sun.xml.internal.bind.v2.runtime.Location"%>
<%@page import="com.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   
    /* String userid = (String)session.getAttribute("userid");
    String passwd = (String)session.getAttribute("passwd"); */
    
    String prodid = request.getParameter("prodid");
    ProductService service = new ProductService();
		int num = service.deleteProduct(prodid);    	
		
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b><%=prodid %> 상품 삭제 성공</b>
	<a href="listProduct.jsp">목록보기</a> 
</body>
</html>