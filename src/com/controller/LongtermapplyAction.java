package com.controller;

import java.util.List;

import com.domain.Longtermapplyinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.LongtermapplyinfoService;

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

	//��ӳ���������Ϣ
	public String insertLongtermapplyinfo(){
//		System.out.println(longtermapplyinfo.getId());
//		System.out.println(longtermapplyinfo.getSeatId());
//		System.out.println(longtermapplyinfo.getTime());
//		System.out.println(longtermapplyinfo.getUserId());
//		if(longtermapplyinfoService.getLongtermapplyinfoByUserId(longtermapplyinfo.getUserId())!=null)
//			return "error";
		int isInsert=longtermapplyinfoService.creatLongtermapplyinfo(longtermapplyinfo);
		System.out.println(isInsert);
		if(isInsert==0)
			return "success";
		else
			return "error";
	}
	
	//��ʾ���еĳ���������Ϣ
	public String showAllLongtermapplyinfo(){
		
		longtermapplyList=longtermapplyinfoService.getAllLongtermapplyinfo();
		return "showAllLongtermapply";
	}
	
	//�����û���Ϣ��ѯ��������
	public String showLongtermapplyinfoByUserId(){
		
		myLongtermapplyinfo=longtermapplyinfoService.getLongtermapplyinfoByUserId(userId);
		return "showLongtermapply";
	}
	
	//ɾ��������λ������Ϣ
	public String deleteLongtermapply(){
		boolean isDeleteLongtermapply=longtermapplyinfoService.deleteLongtermapplyinfo(id);
		if(isDeleteLongtermapply){
			return "success";
		}else{
			return "error";
		}
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
