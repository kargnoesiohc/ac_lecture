<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    
 <!-- id, 패스워드 입력 검사 후 진행하도록  작성  -->
 <% 
 	String str = (String) session.getAttribute("str");
 	if(str!= null){
 %>
 <script>
 	alert("<%= str%>");
 </script>
 <% 
 		System.out.println(str);
 	}
 	 	session.removeAttribute("str");
	
 %>
<script type="text/javascript">
	$(document).ready(function(){
		$("#userid").focus();
		$("form").on("submit", function () {
				if($("#userid").val().length == 0) {
	                 event.preventDefault();
	                 alert("아이디 입력 확인");
	                 $("#userid").focus();
	             } else if ($("#passwd").val().length == 0){
	                 event.preventDefault();
	                 alert("비밀번호 입력 확인");
	                 $("#passwd").focus();
			}
		})
	});
</script>

<form action="LoginServlet" method="get">
아이디:<input type="text" name="userid" id="userid"><br>
비밀번호:<input type="password" name="passwd" id="passwd"><br> 
<input type="submit" value="로그인">
<input type="reset" value="취소">
</form>
