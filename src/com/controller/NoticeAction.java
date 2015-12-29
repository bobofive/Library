package com.controller;

import java.util.List;

import com.domain.Noticeinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.NoticeinfoService;

public class NoticeAction extends ActionSupport{
	
	private Noticeinfo noticeinfo;
	private NoticeinfoService noticeinfoService;
	private List<Noticeinfo> noticeList;
	private Integer id;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//��ȡ���еĹ���
	public String showAllNotices(){
		noticeList=noticeinfoService.getAllNoticeinfo();
		return "showAllNotices";
	}
	
	//��ȡĳһ���������Ϣ
	public String showNotice(){
		noticeinfo=noticeinfoService.getNoticeinfoById(id);
		return "showNotice";
	}
	//���ݱ��ɾ��������Ϣ
	public String deleteNotice(){
		boolean isDeleteNotice=noticeinfoService.deleteNoticeinfo(id);
		if(isDeleteNotice){
			return "success";
		}else{
			return "error";
		}
	}

	//ɾ�����й�����Ϣ
	public String deleteAllNotice(){
		
		return "";
	}
	
	
	public Noticeinfo getNoticeinfo() {
		return noticeinfo;
	}

	public void setNoticeinfo(Noticeinfo noticeinfo) {
		this.noticeinfo = noticeinfo;
	}

	public NoticeinfoService getNoticeinfoService() {
		return noticeinfoService;
	}

	public void setNoticeinfoService(NoticeinfoService noticeinfoService) {
		this.noticeinfoService = noticeinfoService;
	}

	public List<Noticeinfo> getNoticeList() {
		return noticeList;
	}

	public void setNoticeList(List<Noticeinfo> noticeList) {
		this.noticeList = noticeList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
