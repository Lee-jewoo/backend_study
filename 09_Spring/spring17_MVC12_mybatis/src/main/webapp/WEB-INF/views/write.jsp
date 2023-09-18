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
	<h3>부서 등록 화면</h3>
	<form action="deptAdd" method="post">
	<table border="1">
		<tr>
			<th>부서번호</th>
			<td><input type="text" name="deptno"></td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td><input type="text" name="dname"></td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td><input type="text" name="loc"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="저장"></td>
		</tr>
	</table>
	</form>
	<hr>
	<a href="findAll">전체 목록</a>
</body>
</html>