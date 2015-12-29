<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="media user-media bg-dark dker">
	<div class="user-media-toggleHover">
		<span class="fa fa-user"></span>
	</div>
	<div class="user-wrapper bg-dark">
		<a class="user-link" href=""> <img
			class="media-object img-thumbnail user-img" alt="User Picture"
			src="images/user.gif"> <span
			class="label label-danger user-label">16</span> </a>
		<div class="media-body">
			<h5 class="media-heading">Archie</h5>
			<ul class="list-unstyled user-info">
				<li><a href="">Administrator</a>
				</li>
				<li>Last Access : <br> <small> <i
						class="fa fa-calendar"></i>&nbsp;16 Mar 16:32</small></li>
			</ul>
		</div>
	</div>
</div>

<!-- #menu -->
<ul id="menu" class="bg-blue dker">
	<li class="nav-header">Menu</li>
	<li class="nav-divider"></li>
	<li class=""><a href="dashboard.html"> <i
			class="fa fa-dashboard"></i><span class="link-title">&nbsp;Dashboard</span>
	</a>
	</li>
	<li class=""><a href="javascript:;"> <i
			class="fa fa-building "></i> <span class="link-title">用户信息管理</span>
			<span class="fa arrow"></span> </a>
		<ul>
			<li><a href="show_all_users" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 查看用户信息 </a>
			</li>
			<li><a href="admin/insertUser.jsp" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 添加用户信息 </a>
			</li>
			<li><a href="#" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 修改用户信息 </a>
			</li>
			<li><a href="admin/searchUser.jsp" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 删除用户信息 </a>
			</li>
		</ul>
	</li>
	<li class=""><a href="javascript:;"> <i class="fa fa-tasks"></i>
			<span class="link-title">座位信息管理</span> <span class="fa arrow"></span>
	</a>
		<ul>
			<li><a href="show_all_seats" target="content"> <i class="fa fa-angle-right"></i>&nbsp;
					查看座位信息 </a>
			</li>
			<li><a href="#" target="content"> <i class="fa fa-angle-right"></i>&nbsp;
					添加座位信息 </a>
			</li>
			<li><a href="#" target="content"> <i class="fa fa-angle-right"></i>&nbsp;
					修改座位信息 </a>
			</li>
			<li><a href="#" target="content"> <i class="fa fa-angle-right"></i>&nbsp;
					删除座位信息 </a>
			</li>

		</ul>
	</li>
	<li class=""><a href="javascript:;"> <i class="fa fa-pencil"></i>
			<span class="link-title"> 公告信息管理 </span> <span class="fa arrow"></span>
	</a>
		<ul>
			<li><a href="show_all_notices" target="content"> <i class="fa fa-angle-right"></i>&nbsp;
					查看公告 </a>
			</li>
			<li><a href="#" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 发布公告 </a>
			</li>
			<li><a href="#" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 删除公告 </a>
			</li>			
		</ul>
	</li>
	<li class=""><a href="javascript:;"> <i class="fa fa-pencil"></i>
			<span class="link-title"> 其他管理 </span> <span class="fa arrow"></span>
	</a>
		<ul>
			<li><a href="show_all_scademyinfo" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 查看学院信息 </a>
			</li>
			<li><a href="#" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 添加学院信息 </a>
			</li>
			<li><a href="show_all_majorinfo" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 查看专业信息 </a>
			</li>
			<li><a href="#" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 添加专业信息 </a>
			</li>
			<li><a href="show_all_longtermapplyinfo" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 查看长期座位申请信息 </a>
			</li>
			<li><a href="show_all_longtermapplyinfo" target="content"> <i
					class="fa fa-angle-right"></i>&nbsp; 一键清空预约信息 </a>
			</li>
		</ul>
	</li>
</ul>
<!-- /#menu -->
