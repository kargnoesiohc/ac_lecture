<%@page import="com.service.ProductService"%>
<%@page import="com.dto.ProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	ProductService service = new ProductService();
    	List<ProductDTO> list = service.selectList();
    	
    	session.setAttribute("userid", request.getParameter("userid"));
    	session.setAttribute("passwd", request.getParameter("passwd"));
    	
    	String userid = (String) session.getAttribute("userid");
    	String passwd = (String) session.getAttribute("passwd");
    	
    	System.out.println(userid);
    	System.out.println(passwd);
    	
    	if(userid != null && passwd != null){
    %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>상품아이디</th>
			<th>상품명</th>
			<th>가격</th>
			<th>갯수</th>
			<th>삭제</th>
		</tr>
		<%
		for(ProductDTO dto:list){
		%>
		<tr>
		<td><%= dto.getProdid() %></td>
		<td><%= dto.getProdname() %></td>
		<td><%= dto.getPrice() %></td>
		<td><%= dto.getQuantity()%></td>
		<td><button type="button" onClick="location.href='deleteProduct.jsp?prodid=<%= dto.getProdid() %>'">삭제</button></td>
		</tr>
		<%
		}
    } else {
		%>
		<b>잘못된 접근<br>
		<a href="loginForm.html">로그인 페이지로 이동</a></b>
		<% } %>
		
	</table>
</body>
</html>