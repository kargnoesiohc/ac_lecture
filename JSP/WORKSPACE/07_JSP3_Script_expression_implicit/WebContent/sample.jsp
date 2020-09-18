<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
    //declaration
    //멤버 변수, 메소드 부분
   		int num=10; 
    	public void a(int aa) {
    		System.out.println("a======"+aa);
    	}
    %>
    
    <%
    	//scriptlet
    	//servlet의 doGet() doPost() 안으로 적용됨
    	Date d;
    	ArrayList x;
    	a(10);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	String str ="홍길동";
	System.out.println(str);
%>
</body>
</html>