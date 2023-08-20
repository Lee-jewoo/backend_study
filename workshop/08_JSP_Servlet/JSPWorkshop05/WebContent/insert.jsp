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
	<h2>[사원 등록]</h2>
	<form action="write" method="post">
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="empno" value="1000" readonly>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename">
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
				<td><input type="text" name="mgr" value="7962" readonly></td>
			</tr>
			<tr>
				<th>입사일</th>
				<td><input type="text" name="hiredate" value="sysdate" readonly></td>
			</tr>
			<tr>
				<th>급여</th>
				<td><input type="text" name="sal" value="1500" readonly></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="사원등록">
				<input type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="list">목록보기</a>
</body>
</html>