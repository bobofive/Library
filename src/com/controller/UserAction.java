package com.controller;

import java.util.List;

import com.domain.Userinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.UserinfoService;

public class UserAction extends ActionSupport{
	
	private Userinfo userinfo;	
	private UserinfoService userinfoService;
	private List<Userinfo> userList;//ȫ���û���Ϣ
	private List userinfoList;//������Ϣ
	private String userId;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//��ȡ�����û�����Ϣ
	public String showAllUsersMessage(){
			userList=userinfoService.getAllUserinfo();
			return "showAllUsers";
	}
	
	//��ȡ�û��Լ�����Ϣ
	public String showUserMessage(){
		userinfoList=userinfoService.getUserinfoById(Integer.parseInt(userId));
		return "showUser";
	}
	
	//ɾ���û���Ϣ
	public String deleteUser(){
		boolean isDeleteUser=userinfoService.deleteUserinfo(Integer.parseInt(userId));
		if(isDeleteUser){
			return "success";
		}else{
			return "error";
		}
	}

	//����û���Ϣ
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
