<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.domain.Longtermapplyinfo" %>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>长期座位申请信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.min.css">

  </head>
  
  <body>
  <div class="container">
  <div class="row">
  <div class="col-md-6 col-md-offset-3">
    <h3 class="text-center">长期座位申请信息列表</h3>
    <table class="table table-hover table-bordered table-striped">
    	<thead>
    		<th>编号</th>
    		<th>申请者学号</th>
    		<th>申请座位</th>
    		<th>申请时长</th>
    	</thead>
    	<tbody>
    		<s:iterator value="longtermapplyList" var="longtermapply" status="st">
    			<td><s:property value="#longtermapply.id"/></td>
    			<td><s:property value="#longtermapply.userId"/></td>
    			<td><s:property value="#longtermapply.seatId"/></td>
    			<td><s:property value="#longtermapply.time"/></td>
    		</s:iterator>
    	</tbody>
    </table>
    </div>
    </div>
    </div>
  </body>
</html>