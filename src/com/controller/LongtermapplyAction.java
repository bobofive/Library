package com.controller;

import java.util.List;

import com.domain.Longtermapplyinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.LongtermapplyinfoService;
import com.utils.BaseTools;

public class LongtermapplyAction extends ActionSupport{
	
	private Longtermapplyinfo longtermapplyinfo;	
	private LongtermapplyinfoService longtermapplyinfoService;
	private List myLongtermapplyinfo;
	private List longtermapplyList;
	private Integer userId;
	private Integer id;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	//添加长期申请信息
	public String insertLongtermapplyinfo(){
//		System.out.println(longtermapplyinfo.getId());
//		System.out.println(longtermapplyinfo.getSeatId());
//		System.out.println(longtermapplyinfo.getTime());
//		System.out.println(longtermapplyinfo.getUserId());
		//判断用户是否已经进行过长期座位申请
		if(longtermapplyinfoService.getLongtermapplyinfoByUserId(longtermapplyinfo.getUserId()).size()!=0){
			BaseTools.error("您已经申请过了", null, null);
			return "jump";
		}
		longtermapplyinfo.setIsAgree("no");
		int isInsert=longtermapplyinfoService.creatLongtermapplyinfo(longtermapplyinfo);
		if(isInsert==0)
			BaseTools.success("申请成功", null, "show_longtermapply_message?userId="+longtermapplyinfo.getUserId());
		else
			BaseTools.error("申请失败", null, null);
		return "jump";
	}
	
	//显示所有的长期申请信息
	public String showAllLongtermapplyinfo(){
		
		longtermapplyList=longtermapplyinfoService.getAllLongtermapplyinfo();
		return "showAllLongtermapply";
	}
	
	//根据用户名查询长期申请信息
	public String searchLongtermapplyinfo(){
		
		longtermapplyList=longtermapplyinfoService.getLongtermapplyinfoByUserId(userId);
		return "searchLongtermapplyRe";
	}
	
	//用户查询个人长期申请信息
	public String showLongtermapplyinfoByUserId(){
		
		myLongtermapplyinfo=longtermapplyinfoService.getLongtermapplyinfoByUserId(userId);
		return "showLongtermapply";
	}
	
	//删除长期座位申请信息
	public String deleteLongtermapply(){
		boolean isDeleteLongtermapply=longtermapplyinfoService.deleteLongtermapplyinfo(id);
		if(isDeleteLongtermapply){
			BaseTools.success("删除成功", null, null);
		}else{
			BaseTools.error("删除失败", null, null);
		}
		return "jump";
	}
	
	//审核用户长期座位申请
	public String checkLongtermapply(){
		longtermapplyinfo=(Longtermapplyinfo)(longtermapplyinfoService.getLongtermapplyinfoById(id).get(0));
		longtermapplyinfo.setIsAgree("yes");
		boolean isCheck=longtermapplyinfoService.updateLongtermapplyinfo(longtermapplyinfo);
		if(isCheck)
			BaseTools.success("已同意", null, null);
		else
			BaseTools.error("失败，未知原因", null, null);
		return "jump";
	}

	
	
	public Longtermapplyinfo getLongtermapplyinfo() {
		return longtermapplyinfo;
	}

	public void setLongtermapplyinfo(Longtermapplyinfo longtermapplyinfo) {
		this.longtermapplyinfo = longtermapplyinfo;
	}

	public LongtermapplyinfoService getLongtermapplyinfoService() {
		return longtermapplyinfoService;
	}

	public void setLongtermapplyinfoService(
			LongtermapplyinfoService longtermapplyinfoService) {
		this.longtermapplyinfoService = longtermapplyinfoService;
	}

	public List getMyLongtermapplyinfo() {
		return myLongtermapplyinfo;
	}

	public void setMyLongtermapplyinfo(List myLongtermapplyinfo) {
		this.myLongtermapplyinfo = myLongtermapplyinfo;
	}

	public List getLongtermapplyList() {
		return longtermapplyList;
	}

	public void setLongtermapplyList(List longtermapplyList) {
		this.longtermapplyList = longtermapplyList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
