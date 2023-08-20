<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 연습</title>
</head>
<body>
	<h2>게시글 작성</h2>
	<hr>
	<form action="write" method="post">
		제&nbsp;&nbsp;&nbsp;목 : <input type="text" name="title"><br>
		작성자 : <input type="text" name="author"><br>
		내&nbsp;&nbsp;&nbsp;용<br>
		<textarea rows="10" cols="30" name="content"></textarea><br>
		<hr>
		<input type="submit" value="완료">
	</form>
	<hr>
	<a href="list">목록 보기</a>
</body>
</html>