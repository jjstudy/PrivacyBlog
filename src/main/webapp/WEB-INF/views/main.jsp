<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %> 

	<section class="container">
		<c:if test="${sessionScope.userVO ne null}">
			<br>
			<!-- modal 구동 버튼 (trigger) -->
			<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
			  블로그 생성
			</button>
			<br>
			<br>
			<br>
			<!-- blog list space -->
			<div id="blogListSpace"></div>
			
			<!-- Modal -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">Blog 생성</h4>
			      </div>
			      <div class="modal-body">
			      		<form>
			        		<input type="text" id="blogName"  name="blogName" placeholder="Blog 명을  입력해주세요."/>
			        		<input type="button" value="중복확인"/><br>
			        		<input type="radio" name="type" value="0" checked="checked"/>
			        		<input type="radio" name="type" value="1"/>
			        		<input type="radio" name="type" value="2"/>
			        	</form>
			        	
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" onclick="fnSave()">저장</button>
			        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
			      </div>
			    </div>
			  </div>
			</div>
			
			
		</c:if>
		<c:if test="${sessionScope.userVO eq null}">
		  <br>
		  <br>
		  <br>
		  <br>
		  <br>
		  <br>
		  <br>
		  <form action="/login" method="post">
			  <div class="panel-group"  style="width: 40%;margin:0 auto;">
		    	<div class="panel panel-default">
				      <div class="panel-heading">Login</div>
				      <div class="panel-body">
				      	<div>
						    <div class="input-group">
						      <input id="id" type="text" class="form-control" name="id" placeholder="Id">
						      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>   
						    </div>
						    <div class="input-group">
						      <input id="password" type="password" class="form-control" name="password" placeholder="Password">
						      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
						    </div>
						    <br>
						    <input class="btn btn-default" type="submit"  value="login" style="width: 100%;">
					  	</div>
				      </div>
		    	</div>
		   	 </div>
		  </form>
			
		</c:if>

	</section>
	<script src="./resources/js/main.js"></script>
<%-- <%@include file="include/footer.jsp" %> --%>

