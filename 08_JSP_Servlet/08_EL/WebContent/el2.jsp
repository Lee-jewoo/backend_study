<%@page import="java.util.List"%>
<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>기존에 사용하던 방법</h1>
	<% String userid = (String)request.getAttribute("userid");
	   String xxx = (String)request.getAttribute("xxx"); 
	   String userid2 = (String)session.getAttribute("userid");
	   String userid3 = (String)application.getAttribute("userid");
	   LoginDTO dto = (LoginDTO)request.getAttribute("dto");
	   List<LoginDTO> list = (List<LoginDTO>)request.getAttribute("list");
	 %>
	이름 : <%= userid %><br> <!-- 춘식이 -->
	null값 처리 : <%= xxx %><br> <!--null -->
	null 여부 : <%= xxx==null %><br> <!-- true -->
	request : <%= userid %><br> <!-- 춘식이 -->
	session : <%= userid2 %><br> <!-- 라이언 -->
	application : <%= userid3 %><br> <!-- 죠르디 -->
	dto id : <%= dto.getUserid() %><br> <!-- aaa -->
	dto pw : <%= dto.getPasswd() %><br> <!-- 123 -->
	list1 : <%= list.get(0).getUserid() %><%= list.get(0).getPasswd() %><br> <!-- aaa123 -->
	list2 : <%= list.get(1).getUserid() %><%= list.get(1).getPasswd() %><br> <!-- bbb456 -->
	<hr>
	<h1>EL</h1>
	이름 : ${userid}<br> <!-- 춘식이 -->
	null값 처리 : ${xxx}<br> <!--  -->
	null 여부 : ${empty xxx}<br> <!-- true -->
	request : ${userid}<br> <!-- 춘식이 -->
	session : ${sessionScope.userid}<br> <!-- 라이언 -->
	application : ${applicationScope.userid}<br> <!-- 죠르디 -->
	dto id : ${dto.userid}<br> <!-- aaa -->
	dto pw : ${dto.passwd}<br> <!-- 123 -->
	list1 : ${list[0].userid}${list[0].passwd}<br> <!-- aaa123 -->
	list2 : ${list[1].userid}${list[1].passwd}<br> <!-- bbb456 -->
</body>
</html>