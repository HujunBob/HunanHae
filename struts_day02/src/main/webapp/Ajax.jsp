<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="./js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" >
	$(function(){
		$.post("./Json_River_getAllJson.action",function(d){
			var $river=$("#river");
			for(var i=0;i<d.length;i++){
				$river.append($("<option value="+d[i].riverId+">"+d[i].riverName+"</option>"));
			}
		},"json");
		$("#river").change(function(){
			var $riverId=$(this).val();
			var pamas={"riverId":$riverId};
			$.post("./Json_Station_getAllJson.action",pamas,function(d){
				var $station=$("#station");
				document.getElementById('station').options.length=0;
				$station.append($("<option>"+"请选择水电站"+"</option>"));
				//$station.options.length=0;
				if(d!=null){
					for(var i=0;i<d.length;i++){
						$station.append($("<option value="+d[i].stationId+">"+d[i].stationName+"</option>"));
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<select name="riverId" id="river">
		<option>--请选择流域--</option>
	</select>
	<select name="stationId" id="station">
		<option>--请选择电站--</option>
	</select>
</body>
</html>