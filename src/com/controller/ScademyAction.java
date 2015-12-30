package com.controller;

import java.util.List;

import com.domain.Scademyinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.ScademyinfoService;

public class ScademyAction extends ActionSupport{
	
	private Scademyinfo scademyinfo;
	private ScademyinfoService scademyinfoService;
	private List scademyinfoList;
	private String scademyCode;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	//添加学院信息
	public String insertScademy(){
		if(scademyinfoService.getScademyinfoByCode(scademyinfo.getScademyCode()).size()!=0)
			return "error";
		int isInsert=scademyinfoService.creatScademyinfo(scademyinfo);
		if(isInsert==0)
			return "success";
		else
			return "error";
	}
	
	//显示所有的学院信息
	public String showAllScademy(){
		
		scademyinfoList=scademyinfoService.getAllScademyinfo();
		return "showAllScademy";
	}
	
	

	public Scademyinfo getScademyinfo() {
		return scademyinfo;
	}

	public void setScademyinfo(Scademyinfo scademyinfo) {
		this.scademyinfo = scademyinfo;
	}

	public ScademyinfoService getScademyinfoService() {
		return scademyinfoService;
	}

	public void setScademyinfoService(ScademyinfoService scademyinfoService) {
		this.scademyinfoService = scademyinfoService;
	}

	public List getScademyinfoList() {
		return scademyinfoList;
	}

	public void setScademyinfoList(List scademyinfoList) {
		this.scademyinfoList = scademyinfoList;
	}

	public String getScademyCode() {
		return scademyCode;
	}

	public void setScademyCode(String scademyCode) {
		this.scademyCode = scademyCode;
	}
	
}
