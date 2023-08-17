<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>02_include_derictive.jsp</h2>
	<hr>
	정적 include
	<%@ include file="common/top.jsp" %>
	동적 include
	<jsp:include page="common/top2.jsp" flush="true"/>
</body>
</html>