<%@page import="com.dto.LeportsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
 <a href="#" value="서울">서울</a>
 <a href="#" value="울산">울산</a>
 <table border="1">
 <% 
 	List<LeportsDTO> list = (List<LeportsDTO>)request.getAttribute("leportsList");
 	System.out.println("jsp"+list.size());
 	String cityname = null;
 	for(int i=0; i<list.size(); i++) {
 		LeportsDTO dto = list.get(i);
 		cityname = dto.getCityname();
 		String category = dto.getCategory();	
 		String content = dto.getContent();
 		int price = dto.getPrice();
 		String address = dto.getAddress();
 		int leportsnum = dto.getLeportsnum();
 		
 %>
 			<tr>
 				<td><%=cityname %></td>
 				<td><%=category %></td>
 				<td><%=content %></td>
 				<td><%=price %></td>
 				<td><%=address %></td>
 				<td><%=leportsnum %></td>
 			</tr>
 		<% } //end for
 		System.out.println(cityname);
 		String lat = null;
 		String lon = null;
 			if(cityname.equals("서울")) {
 				lat = "37.56826";
 				lon = "126.977829";
 			} else if(cityname.equals("울산")) {
 				lat = "35.53722";
 				lon = "129.31666";
 				
 			}// end if~else if
 			
 			System.out.println(lat+"\t"+lon);
 		%>
 		</table>
 		
 		<script type="text/javascript">
 		$.getJSON('https://api.openweathermap.org/data/2.5/onecall?lat=<%=lat%>&lon=<%=lon%>&units=metric&appid=144272f181757812877b45c51ddea3c4&lang=kr',function(data){
 			//data로 할일
 			var cTemp=data.current.temp;
 			var cClouds=data.current.clouds;
 			var cHumidiy=data.current.humidity;
 			var cicon=data.current.weather[0].icon;
 			var cdescription=data.current.weather[0].description;
 			<%-- $(".city").append(<%=cityname%>); --%>
 			$(".cTemp").append(Math.round(cTemp));
 			$(".cClouds").append(Math.round(cClouds));
 			$(".cHumidiy").append(Math.round(cHumidiy));
 			$(".cicon").append("<img src='http://openweathermap.org/img/wn/"+cicon+".png'>");
 			$(".cdescription").prepend(cdescription);
 		});
 		
 		</script>
 		<h1>weather api</h1>
	<div class="city">도시이름: </div>
	<div class="cTemp">현재 온도: </div>
	<div class="cClouds">현재 날씨 : </div>
	<div class="cHumidiy">습도 : </div>
	<div class="cicon"><span class="cdescription"></span></div>
	
<script type="text/javascript">
 	$("a").on("click", function() {
 		const cityName = $(this).attr("value");
 		location.href="TestMainServlet?cityName="+cityName;
 	});
 	
 	
</script>
</body>
</html>