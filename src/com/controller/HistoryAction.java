package com.controller;

import java.util.List;

import com.domain.Historyinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.HistoryinfoService;

public class HistoryAction extends ActionSupport{
	
	private List historyinfo;
	private HistoryinfoService historyinfoService;
	private Integer userId;
	private Integer id;
	
	//�����û�����ȡ��ʷ��¼
	public String showHistory(){
		historyinfo=historyinfoService.getHistoryinfoByUserId(userId);
		return "showHistory";
	}
	
	//ɾ����ʷ��¼��Ϣ
	public String deleteHistory() {
		boolean isDeleteHistory=historyinfoService.deleteHistoryinfo(id);
		if(isDeleteHistory){
			return "success";
		}else{
			return "error";
		}	
	}
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
