<%@page import="com.dto.OrderDTO"%>
<%@page import="com.dto.MemberDTO"%>
<%@page import="com.dto.CartDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<table width="70%" cellspacing="0" cellpadding="0">

	<tr>
		<td height="30">
	</tr>

	<tr>
		<td><b>주문완료</b></td>
	</tr>

	<tr>
		<td height="30">
	</tr>

	<tr>
		<td align="center"><b>주문해주셔서 감사합니다.</b></td>
	</tr>

	<tr>
		<td height="7">
	</tr>

	<tr>
		<td class="td_default" align="center"><b>${dto.userid}</b> 님의 주문이
			안전하게 처리되었습니다.</td>
	</tr>

	<tr>
		<td height="40">
	</tr>

	<tr>
		<td class="td_default"><b>상품 및 배송정보</b>
		</td>
	</tr>

	<tr>
		<td height="15">
	</tr>

	<tr>
		<td>
			<table width="100%" border="1" style="border-collapse: collapse" bordercolor="#CCCCCC">
				<tr>
					<td class="td_default" width="150" height="35"> 받으시는 분</td>
					<td class="td_default" height="35">${dto.orderName}</td>
				</tr>
				<tr>
					<td class="td_default" height="35"> 주소</td>
					<td class="td_default" height="35">(${dto.post})<br>
						${dto.addr1}
					</td>
				</tr>
				
				<tr>
					<td class="td_default" height="35"> 휴대전화</td>
					<td class="td_default" height="35">${dto.phone}</td>
				</tr>
			</table>
	</tr>
	</td>

	<tr>
		<td height="20">
	</tr>

	<tr>
		<td>
			<table width="100%" border="1" style="border-collapse: collapse"
				bordercolor="#CCCCCC">
				<tr>
					<td width="250" class="td_default" height="35" align="center"><strong>상품명</strong></td>
					<td width="100" class="td_default" height="35" align="center"><strong>판매가</strong></td>
					<td class="td_default" width="50" height="35" align="center"><strong>수량</strong></td>
					<td class="td_default" width="100" height="35" align="center"><strong>합계</strong></td>
				</tr>

				
				
				<tr>
					<td height="35" class="td_default">
						<span class="a_default">${dto.GName}</span>
					</td>
					<td height="35" class="td_default" align="center">
						<span  id = "price1">${dto.GPrice }</span>원
					</td>
					<td height="35" class="td_default" align="center">
						<span id = "num1">${dto.GAmount }</span> 개
					</td>
					<td height="35" class="td_default" align="center">
						<span>${dto.GAmount * dto.GPrice}</span>원
					</td>
				</tr>
				
				

			</table>
		</td>
	</tr>

	<tr>
		<td height="40">
	</tr>

	<tr>
		<td class="td_default"><b>결제정보</b></td>
	</tr>

	<tr>
		<td height="15">
	</tr>

	<tr>
		<td>
			<table width="100%" border="1" style="border-collapse: collapse"
				bordercolor="#CCCCCC">
				<tr>
					<td class="td_default" width="150" height="35"> 결제금액</td>
					<td class="td_default" height="35" align = 'right'> 
					<input type = 'text' id = 'total' value = '${dto.GAmount * dto.GPrice}' readonly>원
					</td>
				</tr>
				<tr>
					<td class="td_default" width="150" height="35"> 결제수단</td>
					<td class="td_default" height="35" align = 'right'> 
					<span>${dto.payMethod}</span>
					</td>
				</tr>
			</table>
		</td>
	</tr>

	<tr>
		<td height="40">
	</tr>

	

	<tr>
		<td height="40">
	</tr>

	<tr>
		<!-- <td class="td_default" align="center"><a class="a_default"
			href="OrderListDetailServlet?mem_id=guest">주문조회 페이지로 이동</a></td> -->
		<td class="td_default" align="center"><a class="a_default"
			href="loginCheck/cartList">주문조회 페이지로 이동</a></td>
	</tr>

	<tr>
		<td height="30">
	</tr>

</table>
</body>
</html>