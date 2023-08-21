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
	<h2>URL 태그</h2>
	a태그 : <a href="JSTLServlet">상대경로 : JSTLServlet</a><br>
	a태그 : <a href="/09_JSTL/JSTLServlet">절대경로 : JSTLServlet</a><br>
	url태그 : <a href="<c:url value='JSTLServlet'/>">상대경로 : JSTLServlet</a><br>
	url태그 : <a href="<c:url value='/JSTLServlet'/>">절대경로 : JSTLServlet</a><br>
</body>
</html>