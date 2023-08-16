<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- 테이블에 부서 추가 -->
	<h2>부서입력</h2>
	<form action="write" method="post">
	부서번호 : <input type="text" name="deptno"><br>
	부서명 : <input type="text" name="dname"><br>
	부서위치 : <input type="text" name="loc"><br>
	<input type="submit" value="저장">
	</form>
	<a href="list">목록보기</a>
</body>
</html>