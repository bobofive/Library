package com.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.domain.Orderinfo;
import com.domain.Userinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.services.OrderinfoService;
import com.utils.BaseTools;

public class OrderAction extends ActionSupport{
	
	private Orderinfo orderinfo;
	private OrderinfoService orderinfoService;
	private List myOrderinfo;
	private String id;
	private String userId;
	private String seatId;
	
	public String execute() {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	//显示预约情况
	public String showOrderByUserId(){
		
		myOrderinfo=orderinfoService.getOrderinfoByUserId(Integer.parseInt(userId));
		return "showOrderMessage";
	}
	
	//预约座位
	public String SeatOrder(){
		//判断用户是否已经预约过了
		if(orderinfoService.getOrderinfoByUserId(Integer.parseInt(userId)).size()!=0){
			BaseTools.error("您已经预约过了", null, null);
			return "jump";
		}
		//判断座位是否可预约
		if(orderinfoService.getOrderinfoBySeatId(orderinfo.getSeatId()).size()!=0){
			BaseTools.error("该座位已被预约", null, null);
			return "jump";
		}
		orderinfo.setUserId(Integer.parseInt(userId));
		int isOrder=orderinfoService.creatOrderinfo(orderinfo);
		if(isOrder==0)
			BaseTools.success("预约成功", null, "show_order?userId="+userId);
		else
			BaseTools.error("预约失败", null, null);
		return "jump";
	}
	
	//在空座位列表中预约座位
	public String seatOrderFromEmpty(){
		HttpSession session=ServletActionContext.getRequest().getSession();
		Integer userId=((Userinfo) session.getAttribute("userinfo")).getUserId();
		//判断用户是否已经预约过了
		if(orderinfoService.getOrderinfoByUserId(userId).size()!=0){
			BaseTools.error("您已经预约过了", null, null);
			return "jump";
		}
		//判断座位是否可预约
		if(orderinfoService.getOrderinfoBySeatId(Integer.parseInt(seatId)).size()!=0){
			BaseTools.error("该座位已被预约", null, null);
			return "error";
		}
		Orderinfo orderinfo=new Orderinfo();
		orderinfo.setSeatId(Integer.parseInt(seatId));
		orderinfo.setUserId(userId);
		int isOrder=orderinfoService.creatOrderinfo(orderinfo);
		if(isOrder==0)
			BaseTools.success("预约成功", null, "show_order?userId="+userId);
		else
			BaseTools.error("预约失败", null, null);
		return "jump";
	}
	
	//一键预约座位
	public String orderByOneButton(){
		//判断用户是否已经预约过了
		if(orderinfoService.getOrderinfoByUserId(Integer.parseInt(userId)).size()!=0){
			BaseTools.error("您已经预约过了", null, null);
			return "jump";
		}
		//随机产生座位号
		Random random = new Random();
		Integer seatId=random.nextInt(10)+1;
		//判断座位是否可预约
		while(true){
			if(orderinfoService.getOrderinfoBySeatId(seatId).size()==0)
				break;
			seatId=random.nextInt(10)+1;
		}
		Orderinfo orderinfo=new Orderinfo();
		orderinfo.setUserId(Integer.parseInt(userId));
		orderinfo.setSeatId(seatId);
		int isOrder=orderinfoService.creatOrderinfo(orderinfo);
		if(isOrder==0)
			BaseTools.success("预约成功", null, "show_order?userId="+userId);
		else
			BaseTools.error("预约失败", null, null);
		return "jump";
	}
	
	//取消预约
	public String deleteOrderinfo(){
		boolean isDeleteOrder=orderinfoService.deleteOrderinfo(id);
		if(isDeleteOrder)
			BaseTools.success("预约成功", null, "user/seatOrder.jsp");
		else
			BaseTools.error("预约失败", null, null);
		return "jump";
	}

	
	
	public Orderinfo getOrderinfo() {
		return orderinfo;
	}

	public void setOrderinfo(Orderinfo orderinfo) {
		this.orderinfo = orderinfo;
	}

	public OrderinfoService getOrderinfoService() {
		return orderinfoService;
	}

	public void setOrderinfoService(OrderinfoService orderinfoService) {
		this.orderinfoService = orderinfoService;
	}

	public List getMyOrderinfo() {
		return myOrderinfo;
	}

	public void setMyOrderinfo(List myOrderinfo) {
		this.myOrderinfo = myOrderinfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSeatId() {
		return seatId;
	}

	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}
	
}
