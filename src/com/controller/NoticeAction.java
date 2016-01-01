package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	//获取所有的公告
	public String showAllNotices(){
		noticeList=noticeinfoService.getAllNoticeinfo();
		return "showAllNotices";
	}
	
	//获取某一个公告的信息
	public String showNotice(){
		noticeinfo=noticeinfoService.getNoticeinfoById(id);
		return "showNotice";
	}
	//根据编号删除公告信息
	public String deleteNotice(){
		boolean isDeleteNotice=noticeinfoService.deleteNoticeinfo(id);
		if(isDeleteNotice){
			return "success";
		}else{
			return "error";
		}
	}

	//删除所有公告信息
	public String deleteAllNotice(){
		
		return "";
	}
	
	//添加公告信息
	public String insertNotice(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		noticeinfo.setDate(sdf.format(new Date()));
		int isInsert=noticeinfoService.creatNoticeinfo(noticeinfo);
		if(isInsert==0)
			return "success";
		else
			return "error";
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
