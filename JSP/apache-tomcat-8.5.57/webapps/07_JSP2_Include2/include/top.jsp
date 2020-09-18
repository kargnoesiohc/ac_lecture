<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%! int num=10; %>
    <%
    	String mesg = (String)request.getAttribute("xxx");
    %>
    <h1>top.jsp<br>
    mesg -> <%= mesg %><br>
    num -> <%= num %></h1>