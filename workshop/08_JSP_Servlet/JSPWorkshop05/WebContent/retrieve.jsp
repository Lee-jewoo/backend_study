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
	<h2>[사원 정보 보기]</h2>
	<%
	EmpDTO dto = (EmpDTO)request.getAttribute("empdto");
	int empno = dto.getEmpno();
	String ename = dto.getEname();
	String job = dto.getJob();
	int mgr = dto.getMgr();
	String hiredate = dto.getHiredate();
	int sal = dto.getSal();
	%>
	<form action="update" method="post">
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="empno" value="<%= empno %>" readonly>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename" value="<%= ename %>">
			</tr>
			<tr>
				<th>직무</th>
				<td>
					<select name="job">
						<option value="CLERK">CLERK</option>
						<option value="MANAGER">MANAGER</option>
						<option value="ANALYST">ANALYST</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>관리자</th>
				<td><input type="text" name="mgr" value="<%= mgr %>" readonly></td>
			</tr>
			<tr>
				<th>입사일</th>
				<td><input type="text" name="hiredate" value="<%= hiredate %>" readonly></td>
			</tr>
			<tr>
				<th>급여</th>
				<td><input type="text" name="sal" value="<%= sal %>" readonly></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="사원수정"></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="list">목록보기</a>&nbsp;&nbsp;<a href="">삭제</a>
</body>
</html>