<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
  <h3>EL</h3>
  	<%=basePath %>
  <h3>OGNL表达式</h3>
    <a href="./helloAction">Say Hello</a><br>
    <a href="./vs.action">valueStack</a><br>
    <a href="./showAll.action">展現所有</a><br>
    <a href="./Ajax.jsp">Ajax请求所有数据</a><br>
 	<a href="./User_getAll.action">展示所有的用户</a><br>
 	<a href="./Station_getAll.action">展示所有电站</a><br>
  </body>
</html>
