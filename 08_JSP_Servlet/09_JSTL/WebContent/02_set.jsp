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
	<h2>set 태그</h2>
	<c:set var="id" value="${userid}"/>
	userid EL : ${userid}<br>
	userid JSTL out : <c:out value="${userid}"/><br>
	userid JSTL set : ${id}<br>
</body>
</html>