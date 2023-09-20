<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty login}">
	<a href="<c:url value='LoginUIServlet'/>">로그인</a>
	<a href="<c:url value='MemberUIServlet'/>">회원가입</a>
</c:if>

<c:if test="${! empty login}">
	안녕하세요. ${login.username}님<br>
	<a href="<c:url value='LogoutServlet'/>">로그아웃</a>
	<a href="<c:url value='MypageServlet'/>">Mypage</a>
	<a href="<c:url value='CartListServlet'/>">장바구니</a>
</c:if>