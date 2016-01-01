<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.domain.Userinfo" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
Integer friendId=((Userinfo)session.getAttribute("userinfo")).getFriendId();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>好友座位预约</title>
    
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
  	<h3 class="text-center">好友座位预约</h3>
    <form action="order_seat?userId=<%=friendId %>" method="post" id="form" onsubmit="validata()">
		<div class="control-group">
			<div class="controls">
				<label class="control-label" for="seatId">输入要预约的座位编号: </label>
				<s:textfield name="orderinfo.seatId" maxlength="30" id="seatId" />
			</div>
		</div><br/>
		<div id="submiter" class="control-group">
			<div class="controls">
				<input type="submit" value="预约 " class="btn btn-primary" />
			</div>
		</div>
    </form>
    <a href="order_by_one_button?userId=<%=friendId %>" class="btn btn-primary">一键预约</a>
  </div>
  </div>
  </div>
  </body>
</html>
