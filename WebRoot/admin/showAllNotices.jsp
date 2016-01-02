<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.domain.Noticeinfo"%>
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
    
    <title>公告信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/animate.min.css">


  </head>
  
  <body>
  <div class="container">
  <div class="row">
    <h3 class="text-center">
				公告列表
			</h3>
			<table class="table table-hover table-bordered table-striped">
				<thead>
					<tr>
						<th>编号</th>
						<th>标题</th>
						<th>副标题</th>
						<th>内容</th>
						<th>附件</th>
						<th>发布日期</th>
						<th>作者</th>
						<th>查看详情</th>
						<th>删除</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="noticeList" var="notice" status="st">
				    
					<tr>
						<td><s:property value="#notice.id"/></td>
						<td><s:property value="#notice.title"/></td>
						<td><s:property value="#notice.amallTitle"/></td>
						<td><s:property value="#notice.contents"/></td>
						<td><s:property value="#notice.accessory"/></td>
						<td><s:property value="#notice.date"/></td>
						<td><s:property value="#notice.author"/></td>
						<form action="#" method="post">
							<td><input type="submit" class="btn btn-success" value="查看"></td>
						</form>	
						<form action="delete_notice?id=<s:property value="#notice.id"/>" method="post">
							<td><input type="submit" class="btn btn-success" value="删除"></td>
						</form>				
					</tr>
					</s:iterator>
				</tbody>
				
			</table>
	</div>
	</div>
  </body>
</html>
