<%@page import="com.dto.PageDTO"%>
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
	<h2>게시판 목록</h2>
	<hr>
	<%
		PageDTO pageDTO = (PageDTO)request.getAttribute("pageDTO");
		List<BoardDTO> list = pageDTO.getList();
	%>
	<table border="1">
		<tr>
			<td colspan="6">
				<form action="list">
					<select name="searchName">
						<option value="title">제목</option>
						<option value="author"></option>
					</select>
					<input type="text" name="searchValue">
					<input type="submit" value="검색">
				</form>
			</td>
		</tr>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
			<th>삭제</th>
		</tr>
		<%
			for (BoardDTO dto : list) {
			int num = dto.getNum();
			String title = dto.getTitle();
			String author = dto.getAuthor();
			String writeday = dto.getWriteday();
			int readcnt = dto.getReadcnt();
		%>
		<tr>
			<td><%=num%></td>
			<td><a href="retrieve?num=<%=num%>"><%=title%></a></td>
			<td><%=author%></td>
			<td><%=writeday%></td>
			<td><%=readcnt%></td>
			<td><a href="delete?num=<%=num%>"
				onclick="return confirm('<%=num%>번 글을 삭제하시겠습니까?');">삭제</a>
		</tr>
		<%
			}
		%>
	</table>
	<%
	int perPage = pageDTO.getPerPage();
	int curPage = pageDTO.getCurPage();
	int totalRow = pageDTO.getTotalRow();
	int totalNum = totalRow / perPage;
	if (totalRow % perPage != 0) totalNum++;
	String searchName = pageDTO.getSearchName();
	String searchValue = pageDTO.getSearchValue();
	for (int i=1; i<=totalNum; i++){
		if (curPage == i) {
			%>
			<%= i %>
		<%
		} else {
			%>
			<a href="list?curPage=<%= i %>&searchName=<%= searchName %>&searchValue=<%= searchValue %>"><%= i %></a>
		<%	
		}
		%>
	<%
	}
	%>
	<hr>
	<a href="writeui">게시글 작성하기</a>&nbsp;&nbsp;<a href="list">목록 보기</a>
</body>
</html>
