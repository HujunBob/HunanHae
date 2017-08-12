<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  		<%-- <s:property value="#request.user.username" /><br>
  		<s:property value="#session.user2.password" /><br>
  		<s:property value="#parameters.id" />
    	<s:debug></s:debug> --%>
    	<table border="solid 0px red" >
    		<tr>
    			<th>姓名</th>
    			<th>密碼</th>
    		</tr>
    		<c:forEach items="${user}" var="p" >
    			<tr>
    			<td>${p.username}</td>
    			<td>${p.password}</td>
    			</tr>
    		</c:forEach>
    	</table>
    	<s:checkbox name="age" id="12" label="百度" />
    	
    	
  </body>
</html>
