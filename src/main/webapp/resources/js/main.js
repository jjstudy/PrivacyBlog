$(function(){
	blogSelect();
});
function fnSave(){
	
	if($("#blogName").val() != '' && $("#user_no").val() != ''){
		
	var data = "blogName="+$("#blogName").val()+"&type="+$("input:radio[name=type]:checked").val()+"&user_no="+$("#user_no").val();
	$.ajax({
		url : "/blogInsert",
		type : "GET",
		data:data,
		success: function(data){
			$("#blogName").val('');
			$('#myModal').modal('hide');
			var html ="";
			html+="<div>"
				$.each(data, function(index, obj) {
					html+="<button id='blog"+index+"' type='button' class='btn btn-default' style='margin:40px;width:200px;height:80px;'>"+obj.blogName+"</button>"
				});
			html+="</div>"
			$("#blogListSpace").html(html);
		}
		
	});
	}else{
		alert("블로그명을 입력하세요.");
	}
};

function blogSelect() {
	if($("#user_no").val() != ''){
		$.ajax({
		url : "/blogSelect",
		success: function(data){
			$("#blogName").val('');
			$('#myModal').modal('hide');
			var html ="";
			html+="<div>"
				$.each(data, function(index, obj) {
					html+="<button id='blog"+index+"' type='button' class='btn btn-default' style='margin:40px;width:200px;height:80px;'>"+obj.blogName+"</button>"
				});
			html+="</div>"
			$("#blogListSpace").html(html);
			}
		});
	}else{
		alert("로그인을 해주세요.");
		location.href="/login";
	}
};
