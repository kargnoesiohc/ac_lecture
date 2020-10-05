<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    MemberDTO member = (MemberDTO) session.getAttribute("login");
    if(member != null){ 
    	
    %>
    <a href="">로그아웃</a>
    <a href="">장바구니</a>
	<a href="">MyPage</a>
    <% } else { %>
<a href="loginForm.jsp">로그인</a>
<a href="MemberUIServlet">회원가입</a>
<% } %>
