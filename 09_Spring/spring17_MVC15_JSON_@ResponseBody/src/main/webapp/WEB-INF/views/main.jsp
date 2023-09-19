<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		// xxx 이벤트 처리
		$("#xxx").on("click", function(){
			// ajax
			$.ajax({
                url:"xxx",
                type:"get",
                dataType:"json", // 응답 받을 데이터타입
                success:function(data, status, xhr){
                	console.log(data);
                	console.log(data.userid);
                	var str = JSON.stringify(data);
                	console.log(str);
                },
                error:function(xhr, status, error){
                }

             });
		});
		
		// yyy 이벤트 처리
		$("#yyy").on("click", function(){
			// ajax
			$.ajax({
                url:"yyy",
                type:"get",
                dataType:"json", // 응답 받을 데이터타입
                success:function(data, status, xhr){
                	console.log(data);
                	$.each(data, function(idx, ele){
                		console.log(ele);
                		console.log(ele.userid);
                	})
                },
                error:function(xhr, status, error){
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