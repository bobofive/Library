<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.domain.Userinfo"%>
<%@page import="java.text.DecimalFormat"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户信息</title>
    
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
  <div class="row" style="margin-bottom:15px;">
    <h3 class="text-center">
				用户详情列表
			</h3>
			<div>
				<form class="form-horizontal" role="form" action="search_user_message" method="post">
					<label class="col-sm-3 control-label">输入要查询的用户名：</label>
					<div class="col-sm-7">
						<input type="text" name="userId" class="form-control top">
					</div>
					<div class="col-sm-2">
						<button class="btn btn-primary btn-block" type="submit">查询</button>
					</div>
				</form>
			</div>
			</div>
			<div class="row">
			<table class="table table-hover table-bordered table-striped">
				<thead>
					<tr>
						<th>学号</th>
						<th>姓名</th>
						<th>性别</th>
						<th>联系方式</th>
						<th>电子邮箱</th>
						<th>学院</th>
						<th>专业</th>
						<th>好友帐号</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="userList" var="user" status="st">
				    
					<tr>
						<td><s:property value="#user.userId"/></td>
						<td><s:property value="#user.userName"/></td>
						<td><s:property value="#user.userSex"/></td>
						<td><s:property value="#user.phoneNum"/></td>
						<td><s:property value="#user.email"/></td>
						<td><s:property value="#user.scademyName"/></td>
						<td><s:property value="#user.majorName"/></td>
						<td><s:property value="#user.friendId"/></td>
						<form action="delete_user_message?userId=<s:property value="#user.userId"/>" method="post">
							<td><input class="btn btn-danger btn-sm" type="submit" value="删除" onclick="return confirm_delete();"></td>
						</form>				
					</tr>
					</s:iterator>
				</tbody>
				
			</table>
	</div>
	</div>
	<script type="text/javascript" src="js/common.js"></script>
  </body>
</html>
