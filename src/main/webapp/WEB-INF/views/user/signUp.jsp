<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %> 
<style>
	*{marign:0;}
	.content{marign:auto; width: 50%;display:block;}
</style>
<section class="content">
 	<form id="signUpForm" action="signUp" method="post">
	<div>
		아이디
		<input type="text" id="id" name="id"/><br>
		닉네임
		<input type="text" id="nickname" name="nickName" /><br>
		비밀번호
		<input type="text" id="password" name="password"/><br>
		
		이메일
		<input type="text" id="email" name="email"/><br>
		
		주소
		<input type="text" id="address" name="address" /><br>
		<input type="submit" value="전송">
	</div>	
	</form>
</section>