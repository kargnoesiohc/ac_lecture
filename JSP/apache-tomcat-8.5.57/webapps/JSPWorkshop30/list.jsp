<!-- import -->
<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//서비스를 통해 전체 emp리스트로 받아옴 
    List<EmpDTO> list = (List<EmpDTO>) request.getAttribute("list");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>[최 성 락]</b>
<table border="1">
  <tr>
    <th>사원번호</th>
    <th>사원이름</th>
    <th>직업</th>
    <th>입사일</th>
    <th>월급</th>
  </tr>
  
 <%
  for(EmpDTO e: list){
	  int empno = e.getEmpno();
	  String ename = e.getEname();
	  String job = e.getJob();
	  String hiredate = e.getHiredate();
	  int sal = e.getSal();
 %> 
   <tr>
    <td><%=empno %></td>
    <td><%=ename %></td>
    <td><%=job %></td>
    <td><%=hiredate %></td>
    <td><%=sal %></td>
  </tr>
 <% } %>
 
<!--for문 종료 --> 
</table>
<a href="">사원등록</a>
</body>
</html>