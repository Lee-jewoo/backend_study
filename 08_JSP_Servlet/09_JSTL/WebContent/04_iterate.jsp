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
	<h2>iterate 반복문 태그</h2>
	<h3>range 반복</h3>
	<c:forEach begin="1" end="5">
		Hello<br>
	</c:forEach>
	<hr>
	<h3>range 반복2</h3>
	<c:forEach var="i" begin="1" end="5">
		${i} : Hello<br>
	</c:forEach>
	<hr>
	<h3>range 반복3</h3>
	<c:forEach var="i" begin="1" end="10" step="2">
		${i} : Hello<br>
	</c:forEach>
	<hr>
	<h3>List 반복</h3>
	<c:forEach var="dto" items="${list}" varStatus="status">
		${status.index+1} : ${dto.userid}&nbsp;${dto.passwd} / 개수 : ${status.count}<br>
	</c:forEach>
	<hr>
	<h3>List 반복2</h3>
	<c:forEach var="dto" items="${list}" varStatus="status">
		${status.index} : ${status.count} : ${status.first} : ${status.last}<br>
	</c:forEach>
	
</body>
</html>