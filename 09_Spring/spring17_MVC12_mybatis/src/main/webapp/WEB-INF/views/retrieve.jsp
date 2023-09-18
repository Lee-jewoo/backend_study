<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>부서 상세 보기</h3>
	<form action="deptUpdate" method="post">
	<table border="1">
		<tr>
			<th>부서번호</th>
			<td><input type="text" name="deptno" value="${dto.deptno}" readonly></td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td><input type="text" name="dname" value="${dto.dname}"></td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td><input type="text" name="loc" value="${dto.loc}"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정"></td>
		</tr>
	</table>
	</form>
	<hr>
	<a href="findAll">전체 목록</a>
</body>
</html>