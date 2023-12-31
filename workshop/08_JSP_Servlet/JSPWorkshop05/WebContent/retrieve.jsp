<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPWorkshop05</title>
</head>
<body>
	<h2>[사원 정보 보기]</h2>
	<c:set var="dto" value="${empdto}"/>
	<form action="update" method="post">
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="empno" value="${dto.empno}" readonly>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename" value="${dto.ename}">
			</tr>
			<tr>
				<th>직무</th>
				<td>
					<c:if test="${dto.job=='CLERK'}">
						<select name="job">
							<option value="CLERK" selected>CLERK</option>
							<option value="MANAGER">MANAGER</option>
							<option value="ANALYST">ANALYST</option>
						</select>
					</c:if>
					<c:if test="${dto.job=='MANAGER'}">
						<select name="job">
							<option value="CLERK">CLERK</option>
							<option value="MANAGER" selected>MANAGER</option>
							<option value="ANALYST">ANALYST</option>
						</select>
					</c:if>
					<c:if test="${dto.job=='ANALYST'}">
						<select name="job">
							<option value="CLERK">CLERK</option>
							<option value="MANAGER">MANAGER</option>
							<option value="ANALYST" selected>ANALYST</option>
						</select>
					</c:if>
				</td>
			</tr>
			<tr>
				<th>관리자</th>
				<td><input type="text" name="mgr" value="${dto.mgr}" readonly></td>
			</tr>
			<tr>
				<th>입사일</th>
				<td><input type="text" name="hiredate" value="${dto.hiredate}" readonly></td>
			</tr>
			<tr>
				<th>급여</th>
				<td><input type="text" name="sal" value="${dto.sal}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="사원수정"></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="list">목록보기</a>&nbsp;&nbsp;<a href="delete?empno=${dto.empno}">삭제</a>
</body>
</html>