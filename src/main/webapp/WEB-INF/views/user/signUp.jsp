<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %> 
<script type="text/javascript">
<!--signUp
//-->
function signUp() {
	if($("#id").val() == ''){
		alert("id를 입력하세요.");
		return false;
	}	
	if($("#nickname").val() == ''){
		alert("nickname을 입력하세요.");
		return false;
	}	
	
	if($("#password").val() == ''){
		alert("비밀번호를 입력하세요.");
		return false;
	}	
	if($("#email").val() == ''){
		alert("이메일을 입력하세요.");
		return false;
	}	
	
	if($("#address").val() == ''){
		alert("주소를 입력하세요.");
		return false;
	}	
	$("#signUpForm").submit();
	
}
</script>
<section class="content">
 	<form id="signUpForm" action="signUp" method="post" enctype="multipart/form-data">
 	  <div class="panel-group"  style="width: 40%;margin:0 auto;">
		    	<div class="panel panel-default">
				      <div class="panel-heading">Login</div>
				      <div class="panel-body">
				      	<div>
							아이디
							<input type="text" id="id" name="id"  class="form-control"/><br>
							닉네임
							<input type="text" id="nickname" name="nickName"  class="form-control"/><br>
							비밀번호
							<input type="text" id="password" name="password" class="form-control"/><br>
							이메일
							<input type="text" id="email" name="email"  class="form-control"/><br>
							주소
							<input type="text" id="address" name="address"  class="form-control"/><br>
							프로필 
							<input type="file" id="profile" name="profile"/><br>
							<input type="button" value="가입" style="width: 50%;" class="btn btn-default" onclick="signUp()">
							<a href="/"><input type="reset" value="취소" style="width: 50%;float: right;" class="btn btn-default"></a>
						</div>	

				      </div>
		    	</div>
		   	 </div>

	</form>
</section>

