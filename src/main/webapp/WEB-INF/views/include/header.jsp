<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page session="true" %>
<%@ page buffer="none" autoFlush="true" %>
<%@ page import="ex.pb.user.vo.UserVO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<title>Privacy Blog</title>
	 <meta charset="utf-8">
 	 <meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="/resources/js/bootstrap_337/css/bootstrap.min.css">
	
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="/resources/js/bootstrap_337/css/bootstrap-theme.min.css">
	
    <script src="/resources/js/jquery/jquery-3.1.1.min.js"></script>
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="/resources/js/bootstrap_337/js/bootstrap.min.js"></script>
</head>
<header>
	<%
		UserVO userVO = (UserVO)session.getAttribute("userVO");
	%>
</header>