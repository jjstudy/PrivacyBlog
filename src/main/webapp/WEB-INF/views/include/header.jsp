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
<!--메뉴바 추가 부분-->
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">PrivacyBlog</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
      
    </ul>
	<ul class="nav navbar-nav navbar-right">
    	<c:if test="${sessionScope.userVO eq null}">
      		<li><a href="/signUp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      		<li><a href="/"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    	</c:if>
    	<c:if test="${sessionScope.userVO ne null}">
    		<li><a href="#">${sessionScope.userVO.id}님</a></li>
    		<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
    	</c:if>
    	
    </ul>
  </div>
</nav>
