<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    MemberDTO member = (MemberDTO) session.getAttribute("login");
    if(member != null){ 
    	
    %>
    <div class="topDiv">
        <a class="topA" href="LogoutServlet">로그아웃</a>
        <a class="topA" href="">장바구니</a>
        <a class="topA" href="">MyPage</a>
    </div>
    <% } else { %>
    <div class="topDiv">
        <a class="topA" href="loginForm.jsp">로그인</a>
        <a class="topA" href="MemberUIServlet">회원가입</a>
    </div>
<% } %>
