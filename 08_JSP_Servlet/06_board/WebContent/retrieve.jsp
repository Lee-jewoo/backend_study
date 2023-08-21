<%@page import="com.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 프로젝트</title>
</head>
<body>
	<h2>글 조회하기</h2>
	<!-- EL 적용 -->
	<form action="update" method="get">
	<!-- 해당하는 글번호를 특정하기 위해 hidden으로 parameter를 전달 -->
		<input type="hidden" name="num" value="${boardRetrieve.num}">
		글번호 : ${boardRetrieve.num}<br>
		작성일 : ${boardRetrieve.writeday}<br>
		조회수 : ${boardRetrieve.readcnt}<br>
		제&nbsp;&nbsp;&nbsp;목 : <input type="text" name="title" value="${boardRetrieve.title}"><br>
		작성자 : <input type="text" name="author" value="${boardRetrieve.author}"><br>
		내&nbsp;&nbsp;&nbsp;용<br><textarea rows="10" cols="30" name="content">${boardRetrieve.content}</textarea><br>
		<hr>
		<input type="submit" value="수정"><br>
	</form>
	<a href="list">목록보기</a>
</body>
</html>
