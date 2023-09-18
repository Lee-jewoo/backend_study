<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	<script> // 글 삭제하기
		$(document).ready(function(){
			$("button").on("click", function(){
				var num = $(this).attr("data-num");
				alert(num+"번 부서를 삭제하시겠습니까?");
				location.href="delete?deptno="+num;
			});
		});
	</script>
</head>
<body>
	<h3>Dept 목록</h3>
	<table border="1">
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<c:forEach var="dept" items="${list}">
		<tr>
			<td>${dept.deptno}</td>
			<td>${dept.dname}</td>
			<td>${dept.loc}</td>
			<td><button data-num="${dept.deptno}">삭제</button></td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<a href="deptAddForm">부서등록</a>
</body>
</html>