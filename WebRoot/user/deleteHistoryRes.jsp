<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.domain.Userinfo" %>
<%
	Integer userName=((Userinfo)session.getAttribute("userinfo")).getUserId();
 %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>删除历史记录信息</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	</head>

	<body>
		<%
			    request.setCharacterEncoding("UTF-8");
			    String rid = request.getParameter("rid");
			    if (rid.equals("0")){
			%>
		<script> 
				alert("成功删除！");
				window.location.assign("show_history?userId=<%=userName %>");
			</script>
		<%}
			    else if (rid.equals("1"))
			    {
			    	%>
		<script>
						alert("座位不存在，删除失败！");
						history.go(-1);
					</script>
		<%
			    }else{
			    	%><script>
			    	alert("删除失败！未知原因，请通知管理员");
					history.go(-1);
					</script>
			    	<%
			    }%> 
	</body>
</html>
