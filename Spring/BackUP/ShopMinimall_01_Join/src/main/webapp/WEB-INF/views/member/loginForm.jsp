<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
</head>
<body>
	<jsp:include page="../common/top.jsp" flush="false"></jsp:include><br>
	<jsp:include page="../common/menu.jsp" flush="false"></jsp:include><br>
	<h3>로그인 화면</h3>
	<form action="LoginServlet" method="get">
		아이디:<input type="text" name="userid" id="userid"><br>
		비밀번호:<input type="password" name="passwd" id="passwd"><br>
		<input type="submit" value="로그인"> 
		<input type="reset"value="취소"> 
		<a href="MemberIdSearchUIServlet">아이디 찾기</a>
	</form>
	<c:if test="${!empty str }">
		<script>
 		alert("${str}");
		</script>
		<c:remove var="str" scope="session"/>
	</c:if>
	<script type="text/javascript">
		$("#userid").focus();
		$("form").on("submit", function() {
			if ($("#userid").val().length == 0) {
				event.preventDefault();
				alert("아이디 입력 확인");
				$("#userid").focus();
			} else if ($("#passwd").val().length == 0) {
				event.preventDefault();
				alert("비밀번호 입력 확인");
				$("#passwd").focus();
			}
		})
	</script>
</body>
</html>