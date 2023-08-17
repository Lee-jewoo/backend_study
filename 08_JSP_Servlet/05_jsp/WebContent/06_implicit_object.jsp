<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>내장 객체 (내장 변수)</h2>
<% // scriptlet tag에서만 사용
	System.out.println("HttpServletRequest request : "+request);
	System.out.println("HttpServletResponse response : "+response);
	System.out.println("HttpSession session : "+session);
	System.out.println("ServletContext application : "+application);
	System.out.println("ServletConfig config : "+config);
	System.out.println("PrintWriter out : "+out);
%>
</body>
</html>