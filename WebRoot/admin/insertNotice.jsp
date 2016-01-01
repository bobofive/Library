<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加公告信息</title>
    
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
  	<h3 class="text-center">添加公告信息</h3>
    <form action="insert_notice_message" method="post" id="form" onsubmit="validata()">
		<div class="control-group">			
			<div class="controls">
				<label class="control-label" for="title">标题: </label>
				<s:textfield name="noticeinfo.title" maxlength="30" id="title" />
			</div>
		</div><br/>
		<div class="control-group">			
			<div class="controls">
				<label class="control-label" for="amallTitle">副标题: </label>
				<s:textfield name="noticeinfo.amallTitle" maxlength="30" id="amallTitle" />
			</div>
		</div><br/>
		<div class="control-group">
			<div class="controls">
				<label class="control-label" for="contents">内容: </label>
				<s:textfield name="noticeinfo.contents" maxlength="30" id="contents" />
			</div>
		</div><br/>
		<div class="control-group">
			<div class="controls">
				<label class="control-label" for="author">作者: </label>
				<s:textfield name="noticeinfo.author" maxlength="30" id="author" />
			</div>
		</div><br/>
		<div id="submiter" class="control-group">
			<div class="controls">
				<input type="submit" value="添加 " class="btn btn-primary" />
			</div>
		</div>
    </form>
  </div>
  </div>
  </div>
  </body>
</html>
