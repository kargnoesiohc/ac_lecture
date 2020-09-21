<%@page import="com.service.EmpService"%>
<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		request.setCharacterEncoding("utf-8");
		int empno = Integer.parseInt(request.getParameter("empno"));                                               
		String ename = request.getParameter("ename");                                               
		String job = request.getParameter("job");                                               
		int mgr = Integer.parseInt(request.getParameter("mgr"));                                               
		int sal = Integer.parseInt(request.getParameter("sal"));   
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(empno);
		dto.setEname(ename);
		dto.setJob(job);
		dto.setMgr(mgr);
		dto.setSal(sal);
		
		EmpService service = new EmpService();
		int insertCheck = service.insertEmp(dto);
%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	if(insertCheck != 0) {
%>
<b>회원가입 성공</b>	<br>
<a href="list.jsp">목록보기</a>
<% } else { %>
<b>회원가입 실패</b><br>
<b>입력 항목을 확인해주세요</b>
<a href="member.html">회원가입</a>
<% } %>
	
</body>
</html>