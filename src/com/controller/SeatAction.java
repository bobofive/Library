package com.controller;

import java.util.List;

import com.domain.Seatinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.SeatinfoService;

public class SeatAction extends ActionSupport{
	
	private Seatinfo seatinfo;
	private SeatinfoService seatinfoService;
	private List<Seatinfo> seatList;
	private List<Seatinfo> emptySeatList;
	private List seatMessage;
	private Integer seatId;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//获取所有的座位信息
	public String showAllSeats(){
		seatList=seatinfoService.getAllSeatinfo();
		return "showAllSeats";
	}
	
	//管理员根据座位编号查询座位信息
	public String showSeat(){
		seatList=seatinfoService.getSeatinfoById(seatId);
		return "showSeat";
	}
	
	//用户根据座位编号查询座位信息
	public String showSeatMessage(){
		seatMessage=seatinfoService.getOrderinfoById(seatId);
		return "showSeat";
	}
	
	//获取所有的空座位信息
	public String showEmptySeat(){
		emptySeatList=seatinfoService.getEmptySeatinfo();
		return "showEmptySeat";
	}

	//删除座位信息
	public String deleteSeat(){
		boolean isDeleteSeat=seatinfoService.deleteSeatinfo(seatId);
		if(isDeleteSeat){
			return "success";
		}else{
			return "error";
		}
	}
	
	//添加座位信息
	public String insertSeat(){
		
		if(seatinfoService.getSeatinfoById(seatinfo.getSeatId())!=null)
			return "error";
		seatinfo.setIsOrder("yes");
		seatinfo.setIsUsed("yes");
		int isInsert=seatinfoService.creatSeatinfo(seatinfo);
		if(isInsert==0)
			return "success";
		else
			return "error";
	}
	
	public Seatinfo getSeatinfo() {
		return seatinfo;
	}

	public void setSeatinfo(Seatinfo seatinfo) {
		this.seatinfo = seatinfo;
	}

	public SeatinfoService getSeatinfoService() {
		return seatinfoService;
	}

	public void setSeatinfoService(SeatinfoService seatinfoService) {
		this.seatinfoService = seatinfoService;
	}

	public List<Seatinfo> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seatinfo> seatList) {
		this.seatList = seatList;
	}

	public List<Seatinfo> getEmptySeatList() {
		return emptySeatList;
	}

	public void setEmptySeatList(List<Seatinfo> emptySeatList) {
		this.emptySeatList = emptySeatList;
	}

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	public List getSeatMessage() {
		return seatMessage;
	}

	public void setSeatMessage(List seatMessage) {
		this.seatMessage = seatMessage;
	}	
	
}
