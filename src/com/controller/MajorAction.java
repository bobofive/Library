package com.controller;

import java.util.List;

import com.domain.Majorinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.MajorinfoService;

public class MajorAction extends ActionSupport{
	
	private Majorinfo majorinfo;
	private MajorinfoService majorinfoService;
	private List majorinfoList;
	private String majorCode;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//���רҵ��Ϣ
	public String insertMajor(){
		
		if(majorinfoService.getMajorinfoByCode(majorinfo.getMajorCode()).size()!=0)
			return "error";
		int isInsert=majorinfoService.creatMajorinfo(majorinfo);
		if(isInsert==0)
			return "success";
		else
			return "error";
	}
	
	//��ʾ���е�רҵ��Ϣ
	public String showAllMajor(){
		majorinfoList=majorinfoService.getAllMajorinfo();
		return "showAllMajor";
	}

	//ɾ��רҵ��Ϣ
	public String deleteMajorinfo(){
		System.out.println(majorCode);
		boolean isDeleteMajorinfo=majorinfoService.deleteMajorinfo(Integer.parseInt(majorCode));
		if(isDeleteMajorinfo)
			return "success";
		else
			return "error";
	}
	
	
	
	public Majorinfo getMajorinfo() {
		return majorinfo;
	}

	public void setMajorinfo(Majorinfo majorinfo) {
		this.majorinfo = majorinfo;
	}

	public MajorinfoService getMajorinfoService() {
		return majorinfoService;
	}

	public void setMajorinfoService(MajorinfoService majorinfoService) {
		this.majorinfoService = majorinfoService;
	}

	public List getMajorinfoList() {
		return majorinfoList;
	}

	public void setMajorinfoList(List majorinfoList) {
		this.majorinfoList = majorinfoList;
	}

	public String getMajorCode() {
		return majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

}
