<!-- import -->
<%@page import="com.dto.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.EmpService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//서비스를 통해 전체 emp리스트로 받아옴 
    EmpService service = new EmpService();
    ArrayList<EmpDTO> list = service.selectAllEmp();
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
    <th>사원번호</th>
    <th>사원이름</th>
    <th>월급</th>
    <th>입사일</th>
    <th>부서번호</th>
  </tr>
  
 <%
  for(EmpDTO e: list){
	  int empno = e.getEmpno();
	  String ename = e.getEname();
	  int sal = e.getSal();
	  String hiredate = e.getHiredate();
	  int deptno = e.getDeptno();
 %> 
   <tr>
    <td><%=empno %></td>
    <td><%=ename %></td>
    <td><%=sal %></td>
    <td><%=hiredate %></td>
    <td><%=deptno %></td>
  </tr>
 <% } %>
 
<!--for문 종료 --> 
  
</table>
</body>
</html>