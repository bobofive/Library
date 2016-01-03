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
    
    <title>长期座位申请</title>
    
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/background.css">

  </head>
  
  <body>
  <div class="container">
  <div class="row">
  <div class="col-md-6 col-md-offset-3">
  	<h3 class="text-center">长期座位申请</h3>
    <form action="insert_longtermapply" method="post" id="form" onsubmit="validata()">
		<div class="control-group">			
			<div class="controls">
				<label class="control-label" for="userId">申请人学号: </label>
				<s:textfield name="longtermapplyinfo.userId" maxlength="30" id="userId" cssClass="form-control" />
			</div>
		</div><br/>
		<div class="control-group">
			<div class="controls">
				<label class="control-label" for="seatId">申请座位编号: </label>
				<s:textfield name="longtermapplyinfo.seatId" maxlength="30" id="seatId" cssClass="form-control" />
			</div>
		</div><br/>
		<div class="control-group">
			<div class="controls">
				<label class="control-label" for="time">申请时长: </label>
				<s:textfield name="longtermapplyinfo.time" maxlength="30" id="time" cssClass="form-control" />
			</div>
		</div><br/>
		<div id="submiter" class="control-group">
			<div class="controls">
				<input type="submit" value="提交申请 " class="btn btn-primary" />
			</div>
		</div>
    </form>
  </div>
  </div>
  </div>
  </body>
</html>
