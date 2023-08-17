<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 프로젝트</title>
</head>
<body>
	<h2>게시판 목록 보기</h2>
	<%
	List<BoardDTO> list = (List<BoardDTO>)request.getAttribute("boardList");
	%>
	<table border='1'>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<%
		for (BoardDTO dto : list) {
			int n = dto.getNum();
			String title = dto.getTitle();
			String author = dto.getAuthor();
			String writeday = dto.getWriteday();
			int readcnt = dto.getReadcnt();
		%>
		<tr>
			<td><%= n %></td>
			<td><%= title %></td>
			<td><%= author %></td>
			<td><%= writeday %></td>
			<td><%= readcnt %></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>