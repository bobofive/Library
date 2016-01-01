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
    
    <title>个人信息</title>
    
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
    <h3 class="text-center">
				个人信息
			</h3>
			<form action="update_user" method="post" id="userForm"
			 class="form-horizontal">
				<s:iterator value="userinfoList" var="user" status="st">
					<div class="control-group">
						<label class="control-label" for="userId">
							学号：
						</label>
						<div class="controls">
							<input type="text" name="userinfo.userId" value="<s:property value="#user.userId"/>"
								readonly="readonly" maxlength="18" id="userId" />
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<input type="hidden" name="userinfo.userPw" value="<s:property value="#user.userId"/>"
								readonly="readonly" maxlength="18" id="userPw" />
						</div>
					</div>  
					<div class="control-group">
						<label class="control-label" for="userName">
							姓名：
						</label>
						<div class="controls">
							<input type="text" name="userinfo.userName" value="<s:property value="#user.userName"/>"
								readonly="readonly" maxlength="18" id="userName" />
						</div>
					</div> 
					<div class="control-group">
						<label class="control-label" for="userSex">
							性别：
						</label>
						<div class="controls">
							<input type="text" name="userinfo.userSex" value="<s:property value="#user.userSex"/>"
								readonly="readonly" maxlength="18" id="userSex" />
						</div>
					</div> 
					<div class="control-group">
						<label class="control-label" for="scademyName">
							学院：
						</label>
						<div class="controls">
							<input type="text"  value="<s:property value="#user.scademyName"/>"
								readonly="readonly" maxlength="18" id="scademyName" />
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<input type="hidden" name="userinfo.majorCode" value="<s:property value="#user.majorCode"/>"
								readonly="readonly" maxlength="18" id="majorCode" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="majorName">
							专业：
						</label>
						<div class="controls">
							<input type="text"  value="<s:property value="#user.majorName"/>"
								readonly="readonly" maxlength="18" id="majorName" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="friendId">
							好友帐号：
						</label>
						<div class="controls">
							<input type="text" name="userinfo.friendId" value="<s:property value="#user.friendId"/>"
								readonly="readonly" maxlength="18" id="friendId" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="phoneNum">
							联系方式：
						</label>
						<div class="controls">
							<s:textfield name="userinfo.phoneNum" maxlength="30"
									id="phoneNum" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="email">
							电子邮箱：
						</label>
						<div class="controls">
							<s:textfield name="userinfo.email" maxlength="30"
									id="email" />
						</div>
					</div>
					<div><input type="submit" value="修改"></div>
				</s:iterator>
			</form>
			</div>
			</div>
			</div>
  </body>
</html>
