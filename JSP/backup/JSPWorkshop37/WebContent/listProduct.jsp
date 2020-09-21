<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
     MyProductService service = new MyProductService();
     List<MyProductDTO> list = service.select();

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function chk(n) {
	var lang= document.querySelectorAll(".delCheck");
	for(var i=0; i< lang.length; i++){
		lang[i].checked= n.checked;
	}
}
function delAll() {
	document.querySelector("Form").action='deleteAllProduct.jsp';
	
}
function delProduct(n) {
	console.log(n);
	event.preventDefault();
	//location.href="test.html";
	location.href="deleteProduct.jsp?prodId="+n;	
}
function updateProduct(n){
	
	console.log("asfasfsfsfsa");
	var m = document.querySelector("#quantity"+n);//제품 번호에 해당하는 수량 태그 id지정
	var quantity = m.value;
	console.log(quantity);
	console.log(n);
	event.preventDefault();
	location.href="updateProduct.jsp?prodId="+ n+"&quantity="+quantity;
	//location.href = "updateProduct.jsp?prodId="+n+"&quantity="+quantity;
	
}

</script>
</head>
<body>
<form>
<table border="1">
  <tr>
    <td><input type="checkbox" name="delCheckAll" id="delCheckAll" onclick="chk(this)">전체선택</td>                                                                                                                   
    <td>상풍아이디</td>
    <td>상품명</td>
    <td>가격</td>
    <td>갯수</td>
    <td>삭제</td>
    <td>수정</td>
    <td>합계</td>
  </tr>
  
 <%
   for(MyProductDTO dto: list){
 %> 
   <tr>
    <td><input type="checkbox" name="delCheck"  class="delCheck" value="<%= dto.getProdId()%>"></td>
    <td><%= dto.getProdId() %></td>
    <td><%= dto.getProdName() %></td>
    <td><%= dto.getPrice() %></td>
    <td><input type="text" name="quantity" value="<%= dto.getQuantity() %>" id="quantity<%=dto.getProdId() %>"></td>
   
    <td><button onclick="delProduct('<%= dto.getProdId()%>')">삭제</button></td>
  
   
    <td><button onclick="updateProduct('<%=dto.getProdId()%>')">수정 </button></td>
    <td id="sum"></td>
  </tr>
 <%
   }
 %> 
</table>
<button id="deleteAllProduct" onclick="delAll()">선택된 항목 삭제</button>
</form>

</body>
</html>