<%@page import="java.util.List"%>
<%@page import="com.dto.PageDTO"%>
<%@page import="com.service.StudentService"%>
<%@page import="com.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String curPage = request.getParameter("curPage");
    	if(curPage == null){
    		curPage = "1";
    	}
    	
    	StudentService service = new StudentService();
    	PageDTO pDTO = service.selectAllPageStudent(Integer.parseInt(curPage));
    	
    	List<StudentDTO> list = pDTO.getList();
    	int perPage = pDTO.getPerPage();
    	int totalCount = pDTO.getTotalCount();
    	int totalPage = totalCount/perPage;
    	
    	if(totalCount%perPage != 0) totalPage++;
    	
    	System.out.println("총 레코드 수 -> " +totalCount+"개");
    	System.out.println("총 페이지 수 -> " +totalPage+"페이지");
    	
    	response.setContentType("text/html;charset=UTF-8");
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
			<th>학번</th>
			<th>이름</th>
			<th>주민번호</th>
			<th>주소</th>
			<th>입학년도</th>
			<th>후학여부</th>
		</tr>
		<%
			for(StudentDTO s:list){
		%>
		<tr>
		<td><%= s.getStuNo() %></td>
		<td><%= s.getStuName()%></td>
		<td><%= s.getStuSsn()%></td>
		<td><%= s.getStuAddress()%></td>
		<td><%= s.getEntDate()%></td>
		<td><%= s.getAbsYn()%></td>
		</tr>
		<% } %>
		<tr><td colspan="6">
		<%
			for(int i=1;i<=totalPage;i++){
				if(i==Integer.parseInt(curPage)){
		%>
			<span style="color:red"><%= i %></span>&nbsp;&nbsp;
		<% 
				} else {
		%>
			<a style="text-decoration:none" href="listPage.jsp?curPage=<%= i %>"><%= i %></a>&nbsp;&nbsp;
		<%			
				}
			}
		%>
		</td></tr>
	</table>
</body>
</html>