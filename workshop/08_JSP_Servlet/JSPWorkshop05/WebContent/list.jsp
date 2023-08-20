<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPWorkshop05</title>
</head>
<body>
	<h2>EMP 목록</h2>
	<%
	List<EmpDTO> list = (List<EmpDTO>)request.getAttribute("list");
	%>
	<table border="1">
		<tr>
			<th>사원번호</th>
			<th>이름</th>
			<th>직무</th>
			<th>관리자번호</th>
			<th>입사일</th>
			<th>급여</th>
			<th>수수료</th>
			<th>부서번호</th>
		</tr>
		<%
		for (EmpDTO dto : list) {
			int empno = dto.getEmpno();
			String ename = dto.getEname();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			int sal = dto.getSal();
			Integer comm = dto.getComm();
			Integer deptno = dto.getDeptno();
		%>
		<tr>
			<td><a href="retrieve?empno=<%= empno %>"><%= empno %></a></td>
			<td><%= ename %></td>
			<td><%= job %></td>
			<td><%= mgr %></td>
			<td><%= hiredate %></td>
			<td><%= sal %></td>
			<td><%= comm %></td>
			<td><%= deptno %></td>
		</tr>
		<%
		}
		%>
	</table>
	<hr>
	<a href="insert.jsp">사원등록</a>
</body>
</html>