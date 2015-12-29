package com.controller;

import java.util.List;

import com.domain.Userinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.UserinfoService;

public class UserAction extends ActionSupport{
	
	private Userinfo userinfo;	
	private UserinfoService userinfoService;
	private List<Userinfo> userList;//全部用户信息
	private List userinfoList;//个人信息
	private String userId;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//获取所有用户的信息
	public String showAllUsersMessage(){
			userList=userinfoService.getAllUserinfo();
			return "showAllUsers";
	}
	
	//获取用户自己的信息
	public String showUserMessage(){
		userinfoList=userinfoService.getUserinfoById(Integer.parseInt(userId));
		return "showUser";
	}
	
	//删除用户信息
	public String deleteUser(){
		boolean isDeleteUser=userinfoService.deleteUserinfo(Integer.parseInt(userId));
		if(isDeleteUser){
			return "success";
		}else{
			return "error";
		}
	}

	//添加用户信息
	public String insertUser(){
		
		if(userinfoService.getUserinfoById(userinfo.getUserId()).size() != 0)
			return "error";
		userinfo.setUserPw("123456");
		int isInsert=userinfoService.creatUserinfo(userinfo);
		if(isInsert==0)
			return "success";
		else
			return "error";
	}

	
	
	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public UserinfoService getUserinfoService() {
		return userinfoService;
	}

	public void setUserinfoService(UserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}

	public List<Userinfo> getUserList() {
		return userList;
	}

	public void setUserList(List<Userinfo> userList) {
		this.userList = userList;
	}

	public List getUserinfoList() {
		return userinfoList;
	}

	public void setUserinfoList(List userinfoList) {
		this.userinfoList = userinfoList;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
