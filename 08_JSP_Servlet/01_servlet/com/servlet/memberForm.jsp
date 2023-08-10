<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member" method="get">
	아이디 : <input type="text" name="userid"><br>
	비밀번호 : <input type="text" name="passwd"><br>
	
	거주지<br>
	서울 <input type="checkbox" name="address" value="서울"><br>
	경기 <input type="checkbox" name="address" value="경기"><br>
	제주 <input type="checkbox" name="address" value="제주"><br>
	
	<input type="submit" value="회원등록">
	</form>
</body>
</html>