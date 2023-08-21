<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.dto.PageDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시판 목록</h2>
	<%
	PageDTO pageDTO = (PageDTO)request.getAttribute("pageDTO");
	List<BoardDTO> list = pageDTO.getList();
	int curPage = pageDTO.getCurPage();
	int perPage = pageDTO.getPerPage();
	int totalCount = pageDTO.getTotalCount();
	int totalPage = totalCount/perPage;
	if (totalCount%perPage != 0) totalPage++;
	%>
	
	<%
	for (BoardDTO dto : list) {
		int num = dto.getNum();
		String title = dto.getTitle();
	%>
	<%= num %>. <%= title %><br>
	<%	
	}
	%>
	<hr>
	<%
	for (int i=1; i<=totalPage; i++) {
		if (curPage == i) {
	%>
		<%= i %>
		<%	
		} else {
		%>
		<a href="list?curPage=<%= i %>"><%= i %></a>
	<%
	}
	%>
	<%
	}
	%>

</body>
</html>