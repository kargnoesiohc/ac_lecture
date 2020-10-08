<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jquery-3.5.1.min.js"></script>
</head>
<body>
	
	이미지 선택하기<br>
	<select>
		<option>a.jpg</option>
		<option>b.jpg</option>
		<option>c.jpg</option>
	</select>
	<img src="a.jpg" width="300px" height="300px">
</body>
<script>
	$("select").on("change", function () {
		$("img").attr("src",$(this).val());
	});
</script>
</html>