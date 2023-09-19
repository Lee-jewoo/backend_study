<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일업로드 화면</h2>
	<form action="upload" method="post" enctype="multipart/form-data">
		Comment:<input type="text" name="theText"><br>
		File:<input type="file" name="theFile"><br>
		<input type="submit" value="업로드">
	</form>
</body>
</html>