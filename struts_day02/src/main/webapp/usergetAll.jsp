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
 		/* $(function(){
			alert();
 		}); */
 		function edit(obj){
 			var inp = obj.getElementsByTagName("td");
 	        
 	        for (var i=0,len=inp.length-2;i<len;i++)
 	        {
 	        	inp[i].disabled=true;
 	            inp[i].readOnly=false;
 	        }
 	        var $name= document.getElementById('mytable').rows[1].childNodes[1].innerHTML;
 	        alert($name);
 	        var $password=document.getElementById('mytable').rows[1].childNodes[3].innerHTML;
 	        var $type= document.getElementById('mytable').rows[1].childNodes[5].innerHTML;
 	       $.post("./Test.action",{"name":$name},function(d){
 	        	alert(d);
 	        },"json");

 		}
 	</script>
  </head>
  <body>
    	<table class="table table-bordered" id="mytable">
			<tr>
				<th>用户姓名</th>
				<th>用户密码</th>
				<th>真实姓名</th>
				<th>电话号码</th>
				<th>办公地点</th>
				<th colspan="2">操作</th>
			</tr>
			<%-- <s:iterator value="userInfo" var="p" status="count">
				<tr>
					<td><s:property value="#p.userName" /></td>
					<td contentEditable="true"><s:property value="#p.passWord" /></td>
					<td contentEditable="true"><s:property value="#p.realName" /></td>
					<td><s:property value="#p.phoneNum" /></td>
					<td><s:property value="#p.office" /></td>
					<td><input type="button" value="修改" onclick="edit(this.parentNode.parentNode)" alt="<s:property value="#p.Id" />"/></td>
					<td><input type="button" value="删除"  alt="<s:property value="#p.Id" />"/></td>
				</tr>
			</s:iterator> --%>
			
			<c:forEach items="${userInfo}" var="p">
				<tr>
					<td contentEditable="true">${p.userName}</td>
					<td contentEditable="true">${p.passWord }</td>
					<td>${p.realName}</td>
					<td>${p.phoneNum }</td>
					<td>${p.office }</td>
					<td><input type="button" value="修改" onclick="edit(this.parentNode.parentNode)" alt="<s:property value="#p.Id" />"/></td>
					<td><input type="button" value="删除"  alt="<s:property value="#p.Id" />"/></td>
				<tr>
			</c:forEach>
		</table>
  </body>
</html>
