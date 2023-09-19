<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		// xxx 이벤트 처리
		$("#xxx").on("click", function() {
			// ajax
			$.ajax({
				url : "xxx",
				type : "post",
				dataType : "text", // 응답 받을 데이터타입
				headers:{ // 요청하는 데이터타입
					"Content-Type":"application/json"
				},
				data:JSON.stringify({
					userid:"춘식이",
					passwd:"123"
				}),// 요청하는 데이터
				success : function(data, status, xhr) {
				},
				error : function(xhr, status, error) {
				}

			});
		});
		
		// yyy 이벤트 처리
		$("#yyy").on("click", function() {
			// ajax
			$.ajax({
				url : "yyy",
				type : "post",
				dataType : "text", // 응답 받을 데이터타입
				headers:{ // 요청하는 데이터타입
					"Content-Type":"application/json"
				},
				data:JSON.stringify([
					{userid:"춘식이", passwd:"123"},
					{userid:"라이언", passwd:"456"}]),// 요청하는 데이터
				success : function(data, status, xhr) {
				},
				error : function(xhr, status, error) {
				}

			});
		});
	});
</script>
</head>
<body>
	<button id="xxx">xxx</button>
	<button id="yyy">yyy</button>
</body>
</html>