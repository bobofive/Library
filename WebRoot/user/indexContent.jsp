<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.domain.Noticeinfo"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<title>学生首页</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.min.css">
  </head>
  
  <body>
    <div class="container" style="margin-top:15px;">
    	<div class="row">
    		<div class="col-md-8">
    			<img src="" />
    		</div>
    		<div class="col-md-4">
    			<div class="panel panel-primary">
				    <div class="panel-heading">公告</div>
				    <s:iterator value="noticeList" var="item" status="st">
						<li class="list-group-item"><a href="#"><s:property value="#item.title"/></a></li>
					</s:iterator>
				</div>
    		</div>
    	</div>
    </div>
    
    
    <!--jQuery -->
    <script src="js/jquery.min.js"></script>
    <!--Bootstrap -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
