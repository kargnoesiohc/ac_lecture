<%@page import="com.dto.ProductDTO"%>
<%@page import="com.service.ProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
     ProductService service = new ProductService();
     List<ProductDTO> list = service.selectList();

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="jquery-3.1.0.js"></script>
<script type="text/javascript"> -->


   <!--  $(document).ready(function(){
    	 $(".deleteProduct").on("click",function(event){
    		 event.preventDefault();
    		 console.log($(this).attr("id"));
    	      location.href="deleteProduct.jsp?prodId="+$(this).attr("id");
    	 }); 
 
    	 $("#delCheckAll").on("click",function(event){
   	         console.log(event.target.checked);
    	    $(".delCheck").each(function(idx,ele){
    		      $(this).prop("checked", event.target.checked);
    	    });	 
    		 
   	     }); 
    	 
    	 $("form").on("submit",function(event){
    		 this.action="deleteAllProduct.jsp";
    		 this.method="GET";
   	     });
    });  

</script>-->
<script type="text/javascript">
	function chk(n) {
		var lang= document.querySelectorAll(".delCheck");
		for(var i=0; i< lang.length; i++){
			lang[i].checked= n.checked;
		}
	}
	
	
	function delAll() {
		document.querySelector("#delForm").action='deleteAllProduct.jsp';
		document.querySelector("#delForm").submit;
	}
	function delProduct(n) {
		event.preventDefault();
		location.href="deleteProduct.jsp?prodId="+n;
		
	}
</script>
</head>
<body>
<form id="delForm">
<table border="1">
  <tr>
    <td><input type="checkbox" name="delCheckAll" id="delCheckAll" onclick="chk(this)">전체선택</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               </td>
    <td>상풍아이디</td>
    <td>상품명</td>
    <td>가격</td>
    <td>갯수</td>
    <td>삭제</td>
  </tr>
  
 <%
   for(ProductDTO dto: list){
 %> 
   <tr>
    <td><input type="checkbox" name="delCheck"  class="delCheck" value="<%= dto.getProdid()%>"></td>
    <td><%= dto.getProdid()%></td>
    <td><%= dto.getProdname()%></td>
    <td><%= dto.getPrice()%></td>
    <td><%= dto.getQuantity()%></td>
    <td><button onclick="delProduct(<%=dto.getProdid() %>)" >삭제</button></td>
  </tr>
 <%
   }
 %> 
</table>
<button id="deleteAllProduct" onclick="delAll()">선택된 항목 삭제</button>
</form>

</body>
</html>