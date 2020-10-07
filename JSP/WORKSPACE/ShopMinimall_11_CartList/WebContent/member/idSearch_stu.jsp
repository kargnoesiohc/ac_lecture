<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
    	$("#username").focus();
      	//이메일 선택 입력
      	$("#emailSelect").on("change", function() {
      		$("#email2").val($("#emailSelect").val());
      	}); //end
 });
</script>  

<% 
	String str = (String)request.getAttribute("str");
	System.out.println(str);
	if(str!=null){
%>
	<script>
		alert("<%= str%>");
	</script>
<%
	session.removeAttribute("str");
	} 
%>
<form action="MemberIdSearchServlet" method="post">
이름<input type="text" name="username" id="username"><br>
휴대폰<select name="phone1">
	<option value="010">010</option>
	<option value="011">011</option>
	<option value="017">017</option>
</select>-
	<input type="text" name="phone2">-
	<input type="text" name="phone3"><br>
이메일<input type="text"name="email1">@
       <input type="text" name="email2" id="email2" placeholder="직접입력">
       <select  id="emailSelect">
        <option value="daum.net">daum.net</option>
        <option value="naver.com">naver.com</option>
       </select><br>
       <input type="submit" value="메일로 보내기">
</form>