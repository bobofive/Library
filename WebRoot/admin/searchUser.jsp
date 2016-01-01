<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查询与删除</title>
    
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div class="container">
  	<div class="row">
  	<h3 class="text-center">删除用户信息</h3>
    <form class="form-horizontal" role="form" action="show_one_user_message" method="post" >
    	<div class="form-group">
    		<label for="inputEmail3" class="col-sm-3 control-label">输入要查询的学号：</label>
    		<div class="col-sm-7">
    			<input type="text" name="userId" class="form-control top">
    		</div>
    		<div class="col-sm-2">
    			<button type="submit" class="btn btn-primary">查询</button>
    		</div>
    	</div>
    	
    </form>
    </div>
   </div>
  </body>
</html>
