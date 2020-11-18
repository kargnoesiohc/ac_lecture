<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:if test="${empty login}">
	<div class="topDiv">
		<a href="loginForm">로그인</a> <!-- servlet-context.xml에서 설정 -->
		<a href="memberForm">회원가입</a> <!-- servlet-context.xml에서 설정 -->
		<a href="loginCheck/myPage">MyPage</a> 
		<a href="loginCheck/cartList">장바구니</a>
	</div>
</c:if>
<c:if test="${!empty login }">
	<div class="topDiv">
		안녕하세요,
		${login.username}님<br>  
		<a href="loginCheck/logout">로그아웃</a> 
		<a href="loginCheck/cartList">장바구니</a> 
		<a href="loginCheck/myPage">MyPage</a>
	</div>
</c:if>