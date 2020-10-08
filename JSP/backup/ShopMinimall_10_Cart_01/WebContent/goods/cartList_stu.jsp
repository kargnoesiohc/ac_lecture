<%@page import="com.dto.CartDTO"%>
<%@page import="com.dto.GoodsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>

<script type="text/javascript">
    $(document).ready(function(){
    	//전체 선택
    	$("#allCheck").on("click", function() {
    		const result = this.checked;
    		$(".check").each(function() {
    			this.checked = result;
    		});
    	});
    	
    	//삭제 버튼
    	$(".delBtn").on("click", function() {
    		const num = $(this).attr("data-xxx");
    		location.href="CartDelServlet?num="+num;
    		
    	});
    	
    	//수량 수정 버튼
    	$(".updateBtn").on("click", function() {
    		const num = $(this).attr("data-xxx");
    		const gAmount = $("#cartAmount"+num).val();
            const gPrice = $(this).attr("data-price");
           	
            if(gAmount > 10) {
            	alert("수량을 10개 이하로 입력하세요.");
            } else {
            	$.ajax({
            		url:'CartUpdateServlet',
            		type: 'get',
            		dataType: 'text',
            		data: {
            			num,
            			gAmount,
            		},
            		success:function(data, status, xhr){
            			let sum = gAmount*gPrice;
            			$("#sum"+num).text(sum); //span태그에 sum값 수정
            		},
            		error:function(xhr,status,error){
            			console.log("error");
            		} 
            	}); //end ajax
            }// end if~else
        });// end event
        
        //전체 장바구니 삭제 1 
        $("#delAllCart1").on("click", () => {
        	let num = [];
        	$("input:checkbox[name='check']:checked").each((i,elem) => {
        		num[i] = $(elem).val();
        	});
        	location.href = "CartDelAllServlet?data="+num; //삭제 할 상품의 num을 url로 전송
        }); //end 전체 삭제1

    	//전체 장바구니 삭제 2
    	$("#delAllCart2").on("click", () => {
    		$("form").attr("action", "CartDelAllServlet2");
    		$("form").submit(); //trigger (강제실행)
    	}); //end 전체 삭제2
    });
</script>


<table width="90%" cellspacing="0" cellpadding="0" border="0">

	<tr>
		<td height="30">
	</tr>

	<tr>
		<td colspan="5" class="td_default">&nbsp;&nbsp;&nbsp; 
		<font size="5"><b>- 장바구니-</b></font> &nbsp;
		</td>
	</tr>

	<tr>
		<td height="15">
	</tr>

	<tr>
		<td colspan="10">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>

	<tr>
		<td height="7">
	</tr>

	<tr>
		<td class="td_default" align="center">
		<input type="checkbox" name="allCheck" id="allCheck"> <strong>전체선택</strong>
		</td>
		<td class="td_default" align="center"><strong>주문번호</strong></td>
		<td class="td_default" align="center" colspan="2"><strong>상품정보</strong></td>
		<td class="td_default" align="center"><strong>판매가</strong></td>
		<td class="td_default" align="center" colspan="2"><strong>수량</strong></td>
		<td class="td_default" align="center"><strong>합계</strong></td>
		<td></td>
	</tr>

	<tr>
		<td height="7">
	</tr>
	<tr>
		<td colspan="10">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>


	<form name="myForm">
<%
   //데이터 가져오기 //for문 작성 
   List<CartDTO> list = (List<CartDTO>)request.getAttribute("cartList");
	for(int i=0;i<list.size();i++){
		CartDTO dto = list.get(i);
		int num = dto.getNum();
		String userid = dto.getUserid();
		String gCode = dto.getgCode();
		String gName = dto.getgName();
		int gPrice = dto.getgPrice();
		String gSize = dto.getgSize();
		String gColor = dto.getgColor();
		int gAmount = dto.getgAmount();
		String gImage = dto.getgImage();
		
%>

		<tr>
			<td class="td_default" width="80">
				<!-- checkbox는 체크된 값만 서블릿으로 넘어간다. 따라서 value에 삭제할 num값을 설정한다. --> 
				<input type="checkbox" name="check" class="check" value="<%=num%>">
			</td>
			<td class="td_default" width="80"><%=num %></td>
			<td class="td_default" width="80">
				<img src="images/items/<%=gImage %>.gif" border="0" align="center" width="80" />
			</td>
			<td class="td_default" width="300" style='padding-left: 30px'><br>
				<font size="2" color="#665b5f">[옵션 : 사이즈(<%= gSize%>) , 색상(<%= gColor %>)] </font>
			</td>
			<td class="td_default" align="center" width="110"><%=gPrice %></td>
			<td class="td_default" align="center" width="90">
				<input class="input_default" type="text" name="cartAmount" id="cartAmount<%=num %>"
				style="text-align: right" maxlength="3" size="2" value="<%=gAmount%>"></input>
			</td>
			<td><input type="button" value="수정" class="updateBtn" data-xxx="<%=num%>" data-price="<%=gPrice%>"/></td>
			<td class="td_default" align="center" width="80" style='padding-left: 5px'>
			<span id="sum<%=num%>"><%=gPrice*gAmount %></span>
			</td>
			<td>
			<input type="button" value="주문" class="orderBtn" data-xxx="<%=num%>">
			</td>
			<td class="td_default" align="center" width="30" style='padding-left: 10px'>
			<input type="button" value="삭제" id="xx<%=i%>" class="delBtn" data-xxx="<%=num%>">
			</td>
			<td height="10"></td>
		</tr>
<% } %>

	</form>
	<tr>
		<td colspan="10">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td height="30">
	</tr>

	<tr>
		<td align="center" colspan="5">
		<a class="a_black" href="#" id="orderAllConfirm"> 선택 항목 주문하기 </a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a class="a_black" href="#" id="delAllCart1"> 선택 항목 삭제하기</a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a class="a_black" href="#" id="delAllCart2"> 선택 항목 삭제하기</a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a class="a_black" href="main"> 계속쇼핑하기 </a>&nbsp;&nbsp;&nbsp;&nbsp;</td>
	</tr>
	<tr>
		<td height="20">
	</tr>

</table>
