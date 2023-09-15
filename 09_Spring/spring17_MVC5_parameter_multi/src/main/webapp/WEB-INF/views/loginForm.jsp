<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>GET 로그인 화면</h1>
	<form action="login" method="get">
		아이디 : <input type="text" name="userid"><br>
		비밀번호 : <input type="text" name="passwd"><br>
		전화번호1 : <input type="text" name="phone"><br>
		전화번호2 : <input type="text" name="phone"><br>
		이메일1 : <input type="text" name="email"><br>
		이메일2 : <input type="text" name="email"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>