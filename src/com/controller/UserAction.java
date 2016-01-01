package com.controller;

import java.util.List;

import com.domain.Userinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.UserinfoService;
import com.utils.BaseTools;

public class UserAction extends ActionSupport{
	
	private Userinfo userinfo;	
	private UserinfoService userinfoService;
	private List<Userinfo> userList;//全部用户信息
	private List userinfoList;//个人信息
	private String userId;
	private String userPw;
	private String userPwNew;
	private String userPwNewConfirm;
	private String friendId;
	private String friendPw;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//获取所有用户的信息
	public String showAllUsersMessage(){
		userList=userinfoService.getAllUserinfo();
		return "showAllUsers";
	}
	
	//查询单个用户的信息
	public String searchUserMessage(){
		userList=userinfoService.getUserinfoById(Integer.parseInt(userId));
		return "searchUserRe";
	}
	//获取用户自己的信息
	public String showUserMessage(){
		userinfoList=userinfoService.getUserinfoById(Integer.parseInt(userId));
		return "showUser";
	}
	
	//删除用户信息
	public String deleteUser(){
		System.out.println(userId);
		boolean isDeleteUser=userinfoService.deleteUserinfo(Integer.parseInt(userId));
		if(isDeleteUser){
			BaseTools.success("删除成功", null, null);
			return "success";
		}else{
			BaseTools.error("删除失败", null, null);
			return "error";
		}
	}

	//添加用户信息
	public String insertUser(){
		
		if(userinfoService.getUserinfoById(userinfo.getUserId()).size() != 0)
			return "error";
		userinfo.setUserPw("123456");
		int isInsert=userinfoService.creatUserinfo(userinfo);
		if(isInsert==0){
			BaseTools.success("添加成功", null, null);
			return "success";
		}
		else {
			BaseTools.error("添加失败", null, null);
			return "error";
		}
	}
	
	//修改用户信息
	public String updateUserinfo(){
		System.out.println(userinfo.getUserName());
		boolean isSave=userinfoService.updateUserinfo(userinfo);
		if(isSave)
			return "success";
		else
			return "error";
	}
	
	//修改用户密码
	public String updatePassword(){
		userinfo=(Userinfo)(userinfoService.getUserinfoByIdOnly(Integer.parseInt(userId)).get(0));
		if(userPw.equals(userinfo.getUserPw())){
			if(userPwNew.equals(userPwNewConfirm)){
				userinfo.setUserPw(userPwNew);
				userinfoService.updateUserinfo(userinfo);
				return "success";
			}
			else
				return "error";
		}
		else
			return "error";
	}
	
	//设置抢座好友
	public String setFriend(){
		if(userId.equals(friendId))
			return "error";
		userinfo=(Userinfo)(userinfoService.getUserinfoByIdOnly(Integer.parseInt(friendId)).get(0));
		if(friendPw.equals(userinfo.getUserPw())){
			userinfo=(Userinfo)(userinfoService.getUserinfoByIdOnly(Integer.parseInt(userId)).get(0));
			userinfo.setFriendId(Integer.parseInt(friendId));
			userinfoService.updateUserinfo(userinfo);
			return "success";
		}
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

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPwNew() {
		return userPwNew;
	}

	public void setUserPwNew(String userPwNew) {
		this.userPwNew = userPwNew;
	}

	public String getUserPwNewConfirm() {
		return userPwNewConfirm;
	}

	public void setUserPwNewConfirm(String userPwNewConfirm) {
		this.userPwNewConfirm = userPwNewConfirm;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getFriendPw() {
		return friendPw;
	}

	public void setFriendPw(String friendPw) {
		this.friendPw = friendPw;
	}
	
}
