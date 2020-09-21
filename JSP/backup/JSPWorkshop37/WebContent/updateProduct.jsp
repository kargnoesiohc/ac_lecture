<%@page import="java.util.HashMap"%>
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%//   /updateProduct.jsp?prodId=A1&quantity=3
    String prodId = request.getParameter("prodId"); //파싱 A1
    String quantity = request.getParameter("quantity");//3
    
     MyProductService service = new MyProductService();
     HashMap<String,Object> map = new HashMap<>();
     map.put("prodId", prodId );//A1
     map.put("quantity", Integer.parseInt(quantity) );//3
     int n = service.updateProduct(map);

%>    
