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
	
	public String showAllMajor(){
		majorinfoList=majorinfoService.getAllMajorinfo();
		return "showAllMajor";
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
