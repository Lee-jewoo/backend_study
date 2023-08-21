<%@page import="com.dto.PageDTO"%>
<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 프로젝트</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	<script> // 글 삭제하기
		$(document).ready(function(){
			$("button").on("click", function(){
				var num = $(this).attr("data-num");
				alert(num+"번 글을 삭제하시겠습니까?");
				location.href="delete?num="+num;
			});
		});
	</script>
</head>
<body>
	<h2>게시판 목록 보기</h2>
	<c:set var="pageDTO" value="${pageDTO}"/>
	<c:set var="list" value="${pageDTO.list}"/>
	<table border='1'>
		<tr> <!-- 검색하기 -->
			<td colspan="6">
				<form action="list">
					<select name="searchName">
						<option value="title">제목</option>
						<option value="author">작성자</option>
					</select>
					<input type="text" name="searchValue">
					<input type="submit" value="검색">
				</form>
			</td>
		</tr>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.num}</td>
				<td><a href="<c:url value='/retrieve?num=${dto.num}'/>">${dto.title}</a></td>
				<td>${dto.author}</td>
				<td>${dto.writeday}</td>
				<td>${dto.readcnt}</td>
				<td><button data-num="${dto.num}">삭제</button></td>
			</tr>
		</c:forEach>

		<!-- 페이지 번호 출력 -->
		<c:set var="perPage" value="${pageDTO.perPage}"/>
		<c:set var="curPage" value="${pageDTO.curPage}"/>
		<c:set var="totalCount" value="${pageDTO.totalCount}"/>
		<c:set var="searchName" value="${pageDTO.searchName}"/>
		<c:set var="searchValue" value="${pageDTO.searchValue}"/>
		<c:set var="totalNum" value="${totalCount/perPage}"/>
		<c:if test="${totalCount%perPage!=0}">
			<c:set var="totalNum" value="${totalNum+1}"/>
		</c:if>
		<tr>
			<td colspan="6">
				<c:forEach var="i" begin="1" end="${totalNum}">
					<c:if test="${curPage == i}">
						${i}
					</c:if>
					<c:if test="${curPage!=i}">
						<a href="list?curPage=${i}&searchName=${searchName}&searchValue=${searchValue}">${i}</a>
					</c:if>
				</c:forEach>
			</td>
		</tr>
	</table>
	<hr>
	<a href="writeui">작성하기</a>&nbsp;&nbsp;<a href="list">처음으로</a>

</body>
</html>
