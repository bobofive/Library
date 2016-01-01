<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.domain.Userinfo" %>
<%
	Integer userName=((Userinfo)session.getAttribute("userinfo")).getUserId();
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">

	<title>修改密码</title>

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
				<h3 class="text-center">修改密码</h3>
				<div>
					<form action="update_userPw?userId=<%=userName %>" method="post">
						<p>输入原密码：</p>
						<input type="password" name="userPw" class="form-control top"><br/>
						<p>输入新密码：</p>
						<input type="password" name="userPwNew" class="form-control top"><br/>
						<p>重复新密码：</p>
						<input type="password" name="userPwNewConfirm" class="form-control top"><br/>
						<button class="btn btn-lg btn-primary btn-block" type="submit">修改</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
