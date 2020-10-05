<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    MemberDTO member = (MemberDTO) session.getAttribute("login");
    if(member != null){ 
    	
    %>
    <div class="topDiv">
        <a href="LogoutServlet">로그아웃</a>
        <a href="">장바구니</a>
        <a href="MyPageServlet">MyPage</a>
    </div>
    <% } else { %>
    <div class="topDiv">
        <a href="loginForm.jsp">로그인</a>
        <a href="MemberUIServlet">회원가입</a>
    </div>
<% } %>
