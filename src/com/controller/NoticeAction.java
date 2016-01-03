package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.domain.Noticeinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.NoticeinfoService;
import com.utils.BaseTools;

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
			BaseTools.success("ɾ���ɹ�", null, null);
		}else{
			BaseTools.error("ɾ��ʧ��", null, null);
		}
		return "jump";
	}

	//ɾ�����й�����Ϣ
	public String deleteAllNotice(){
		
		return "";
	}
	
	//��ʾѧ����ҳ�Ĺ���
	public String showIndexNotice() {
		noticeList = noticeinfoService.getIndexNotice();
		System.out.println(noticeList);
		return "show";
	}
	
	//��ӹ�����Ϣ
	public String insertNotice(){
		System.out.println(noticeinfo.getContents());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		noticeinfo.setDate(sdf.format(new Date()));
		int isInsert=noticeinfoService.creatNoticeinfo(noticeinfo);
		if(isInsert==0)
			BaseTools.success("�����ɹ�", null, null);
		else
			BaseTools.error("����ʧ��", null, null);
		return "jump";
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
