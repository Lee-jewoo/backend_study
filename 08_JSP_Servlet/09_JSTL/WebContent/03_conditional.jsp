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
	<h2>conditional if 태그</h2>
	<c:set var="id" value="${userid}"/>
	<c:if test="${userid=='춘식이'}">춘식이다</c:if>
	<c:if test="${userid!='춘식이'}">춘식이 아니다</c:if>
	<hr>
	<h2>conditional choose 태그</h2>
	<c:choose>
		<c:when test="${userid=='춘식이'}">
			춘식이다
		</c:when>
		<c:when test="${userid=='라이언'}">
			라이언이다
		</c:when>
		<c:otherwise>
			누구냐
		</c:otherwise>
	</c:choose>
</body>
</html>