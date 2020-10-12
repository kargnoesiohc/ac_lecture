<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
    
    <%
    	String code = (String)request.getAttribute("code");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script>
	$.getJSON('http://api.openweathermap.org/data/2.5/forecast?id=<%=code%>&APPID=bd02c76f16582e206bd47b147fccf409&units=metric',function(data){
		//data로 할일
		var cityName=data.city.name;
		var ctempt=data.list[0].main.temp;
		var clowtemp=data.list[0].main.temp_min;
		var chightemp=data.list[0].main.temp_max;
		var cicon=data.list[0].weather[0].icon;
		$(".city").append(cityName);
		$(".ctempt").append(ctempt);
		$(".clowtemp").append(clowtemp);
		$(".chightemp").append(chightemp);
		$(".cicon").append("<img src='http://openweathermap.org/img/wn/"+cicon+".png'>");
	});
</script>
</head>
<body>
	<h1>weather api</h1>
	<div class="city">도시이름: </div>
	<div class="ctempt">현재 온도: </div>
	<div class="clowtemp">최저 온도: </div>
	<div class="chightemp">최고 온도: </div>
	<div class="cicon">아이콘:</div>
	
</body>
