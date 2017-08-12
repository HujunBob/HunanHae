<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'userManage.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 	<script type="text/javascript">
 		 $(function(){
			$("input").click(function(obj){
 					var $obj=$(this);
 					if($obj.prop("value")=="修改"){
 						var $table=$("table").get(0).rows[$obj.attr("alt")];
 						var json={
 							"Id":$obj.attr("name"),
 							"userName":$table.cells[0].innerHTML,
 							"passWord":$table.cells[1].innerHTML,
 							"realName":$table.cells[2].innerHTML,
 							"userTypeId":$table.cells[3].innerHTML,
 							"phoneNum":$table.cells[4].innerHTML,
 							"office":$table.cells[5].innerHTML
 							};
 						$.post("./Json_userInfo_edit.action",json,function(data){

 							},"json");
 					}
 					if($obj.prop("value")=="删除"){
 						var json={
 								"Id":$obj.attr("name")
 							}
 						$.post("./Json_userInfo_delete.action",json,function(data){

 							},"json");
 					}
 				});	
 		});
 		
 	</script>
  </head>
  <body>
    	<table class="table table-bordered" >
			<tr>
				<th>用户姓名</th>
				<th>用户密码</th>
				<th>用户类型</th>
				<th>真实姓名</th>
				<th>电话号码</th>
				<th>办公地点</th>
				<th colspan="2">操作</th>
			</tr>
			<c:forEach items="${userInfo}" var="p" varStatus="count">
				<tr>
					<td >${p.userName}</td>
					<td contentEditable="true">${p.passWord }</td>
					<td contentEditable="true">${p.realName}</td>
					<td contentEditable="true">${p.userTypeId}</td>
					<td contentEditable="true">${p.phoneNum }</td>
					<td contentEditable="true">${p.office }</td>
					<td><input type="button" value="修改"  alt="${count.index+1}" name="${p.id}"/></td>
					<td><input type="button" value="删除"  alt="${count.index+1}" name="${p.id}"/></td>
				</tr>
			</c:forEach>
		</table>
  </body>
</html>
