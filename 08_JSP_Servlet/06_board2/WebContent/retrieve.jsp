<%@page import="com.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 연습</title>
</head>
<body>
	<h2>게시글 보기</h2>
	<hr>
	<%
	BoardDTO dto = (BoardDTO)request.getAttribute("retrieve");
	int num = dto.getNum();
	String title = dto.getTitle();
	String author = dto.getAuthor();
	String content = dto.getContent();
	String writeday = dto.getWriteday();
	int readcnt = dto.getReadcnt();
	%>
	<form action="update" method="post">
	<input type="hidden" name="num" value="<%= num %>"><br>
	<table border="1">
		<tr>
			<th>제&nbsp;&nbsp;&nbsp;목</th>
			<td><input type="text" name="title" value="<%= title %>"></td>
			<th>글번호</th>
			<td><%= num %></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="author" value="<%= author %>" readonly></td>
			<th>조회수</th>
			<td><%= readcnt %></td>
		</tr>
		<tr>
			<th>내&nbsp;&nbsp;&nbsp;용</th>
			<td colspan="3"><textarea rows="10" cols="30" name="content"><%= content %></textarea></td>
		</tr>
		<tr>
			<th>작성일</th>
			<td colspan="3"><%= writeday %></td>
		</tr>
	</table>
	<hr>
	<input type="submit" value="수정">&nbsp;&nbsp;
	<a href="list">목록보기</a>
	</form>
</body>
</html>