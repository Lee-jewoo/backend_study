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
				var answer = confirm(num+"번 부서를 삭제하시겠습니까?");
				if (answer==true) {
					location.href="delete?deptno="+num;					
				}
			});
		});
	</script>
</head>
<body>
	<h3>Dept 목록</h3>
	<form action="findAll" method="get">
	<table border="1">
		<tr>
			<td><select name="searchName">
				<c:choose>
					<c:when test="${map.searchName=='deptno'||map.searchValue==null}">
						<option value="deptno" selected>부서번호</option>
						<option value="dname">부서이름</option>
						<option value="loc">부서위치</option>
					</c:when>
					<c:when test="${map.searchName=='dname'}">
						<option value="deptno">부서번호</option>
						<option value="dname" selected>부서이름</option>
						<option value="loc">부서위치</option>
					</c:when>
					<c:when test="${map.searchName=='loc'}">
						<option value="deptno">부서번호</option>
						<option value="dname">부서이름</option>
						<option value="loc" selected>부서위치</option>
					</c:when>
				</c:choose>
			</select></td>
			<td colspan="2"><input type="text" name="searchValue" value="${map.searchValue}"></td>
			<td><input type="submit" value="검색"></td>
		</tr>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<c:forEach var="dept" items="${list}">
		<tr>
			<td><a href="retrieve?deptno=${dept.deptno}">${dept.deptno}</a></td>
			<td>${dept.dname}</td>
			<td>${dept.loc}</td>
			<td><button id="delete" data-num="${dept.deptno}">삭제</button></td>
		</tr>
		</c:forEach>
	</table>
	</form>
	<hr>
	<a href="deptAddForm">부서등록</a>&nbsp;&nbsp;<a href="findAll">전체목록</a>
</body>
</html>