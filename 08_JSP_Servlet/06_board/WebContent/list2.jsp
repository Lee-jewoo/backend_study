<%@page import="com.dto.PageDTO"%>
<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 프로젝트</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
	<script> // 글 삭제하기
		$(document).ready(function(){
			$("button").on("click", function(){
				var num = $(this).attr("data-num");
				alert(num+"번 글을 삭제하시겠습니까?");
				location.href="delete?num="+num;
			});
		});
	</script>
</head>
<body>
	<h2>게시판 목록 보기</h2>
	<%
	PageDTO pageDTO = (PageDTO)request.getAttribute("pageDTO");
	List<BoardDTO> list = pageDTO.getList();
	%>
	<table border='1'>
		<tr> <!-- 검색하기 -->
			<td colspan="6">
				<form action="list">
					<select name="searchName">
						<option value="title">제목</option>
						<option value="author">작성자</option>
					</select>
					<input type="text" name="searchValue">
					<input type="submit" value="검색">
				</form>
			</td>
		</tr>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
			<th>삭제</th>
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
			<td><a href="retrieve?num=<%= n %>"><%= title %></a></td>
			<td><%= author %></td>
			<td><%= writeday %></td>
			<td><%= readcnt %></td>
			<td><button data-num="<%= n %>">삭제</button></td>
		</tr>
		<%
		}
		%>
		<!-- 페이지 번호 출력 -->
		<%
		int perPage = pageDTO.getPerPage();
		int curPage = pageDTO.getCurPage();
		int totalCount = pageDTO.getTotalCount();
		int totalNum = totalCount / perPage;
		if (totalCount%perPage != 0) totalNum++;
		String searchName = pageDTO.getSearchName();
		String searchValue = pageDTO.getSearchValue();
		%>
		<tr>
			<td colspan="6">
				<%
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
			</td>
		</tr>
	</table>
	<hr>
	<a href="writeui">작성하기</a>&nbsp;&nbsp;<a href="list">처음으로</a>

</body>
</html>
