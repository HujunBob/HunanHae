<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showAllStation.jsp' starting page</title>
   	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
    	<table class="table table-bordered">
			<tr>
				<th>电站名</th>
				<th>调节类型</th>
				<th>正常蓄水位</th>
				<th>死水位</th>
				<th>最大下泄流量</th>
				<th>最大发电流量</th>
				<th>最小发电流量</th>
				<th>额定出力</th>
				<th>保证出力</th>
				<th>K值</th>
				<th>限制洪水位</th>
				<th>最大洪水位</th>
				<th>设计洪水位</th>
				<th>校核洪水位</th>
				<th>死水位</th>
				<th>总库容</th>
			</tr>
			<s:iterator value="stationInfoList" var="station">
				<tr>
					<td><s:property value="#station.stationName" /></td>
					<td><s:property value="#station.adjustType" /></td>
					<td><s:property value="#station.normalZ" /></td>
					<td><s:property value="#station.deadZ" /></td>
					<td><s:property value="#station.plantsMaxQ" /></td>
					<td><s:property value="#station.stationMaxR" /></td>
					<td><s:property value="#station.stationMinR" /></td>
					<td><s:property value="#station.ratedN" /></td>
					<td><s:property value="#station.guaranteedN" /></td>
					<td><s:property value="#station.KValue" /></td>
					<td><s:property value="#station.floodLimitZ" /></td>
					<td><s:property value="#station.floodMaxZ" /></td>
					<td><s:property value="#station.DesignFloodZ" /></td>
					<td><s:property value="#station.checkFloodZ" /></td>
					<td><s:property value="#station.deadV" /></td>
					<td><s:property value="#station.totalV" /></td>
				</tr>
			</s:iterator>	
		</table>
		<a href="./Station_getNextPage?stationId=${stationInfoList[9].stationId}">下一页</a>
		<a href="./Station_getLastPage?stationId=${stationInfoList[0].stationId}">上一页</a>
  </body>
</html>
