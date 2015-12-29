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
