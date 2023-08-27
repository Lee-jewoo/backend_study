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
	<h2>EMP 목록</h2>
	<table border="1">
	<form action="list" method="get">
		<tr>
			<td colspan="8">
				<select name="searchName" id="searchName">
					<c:choose>
					<c:when test="${map['searchName']=='ename' || map['searchName']==null}">
					<option id="ename" value="ename" selected>이름</option>
					<option id="hiredate" value="hiredate">입사일(연도만)</option>
					</c:when>
					<c:when test="${map['searchName']=='hiredate'}">
					<option id="ename" value="ename">이름</option>
					<option id="hiredate" value="hiredate" selected>입사일(연도만)</option>
					</c:when>
					</c:choose>
				</select>
				<input type="text" name="searchValue" value="${map['searchValue']}">
				<input type="submit" value="검색">
				<a href="list">초기화</a>
			</td>
		</tr>
		<tr>
			<th>정렬기준</th>
			<td colspan="7">
				<c:choose>
				<c:when test="${map['align']==null || map['align']=='salDesc'}">
				월급 높은 순 : <input type="radio" name="align" id="salDesc" value="salDesc" checked>
				월급 낮은 순 : <input type="radio" name="align" id="salAsc" value="salAsc">
				</c:when>
				<c:when test="${map['align']=='salAsc'}">
				월급 높은 순 : <input type="radio" name="align" id="salDesc" value="salDesc">
				월급 낮은 순 : <input type="radio" name="align" id="salAsc" value="salAsc" checked>
				</c:when>
				</c:choose>
				<input type="submit" value="정렬">
			</td>
		</tr>
		</form>
		<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>직무</th>
			<th>관리자번호</th>
			<th>입사일</th>
			<th>급여</th>
			<th>수수료</th>
			<th>부서번호</th>
		</tr>
		<c:forEach var="empDTO" items="${list}">
		<tr>
			<td><a href="retrieve?empno=${empDTO.empno}">${empDTO.empno}</a></td>
			<td>${empDTO.ename}</td>
			<td>${empDTO.job}</td>
			<td>${empDTO.mgr}</td>
			<td>${empDTO.hiredate}</td>
			<td>${empDTO.sal}</td>
			<td>${empDTO.comm}</td>
			<td>${empDTO.deptno}</td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<a href="insert.jsp">사원등록</a>
</body>
</html>