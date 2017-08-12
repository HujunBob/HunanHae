<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'demo3.jsp' starting page</title>
    
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
    <form action="<%=basePath%>/registerAction" method="post">
    	姓名:<input type="text" name="user.name" /><br>
    	密码:<input type="password" name="user.password" /><br>
    	年龄:<input type="text" name="user.age" /><br>
    	提交:<input type="submit">
    </form>
    <h3>模型驱动</h3>
    <form action="<%=basePath%>/register" method="post">
    	姓名:<input type="text" name="name" /><br>
    	密码:<input type="password" name="password" /><br>
    	年龄:<input type="text" name="age" /><br>
    	提交:<input type="submit">
    </form>
  </body>
</html>
