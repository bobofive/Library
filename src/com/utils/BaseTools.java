package com.utils;

import java.util.Calendar;

import com.opensymphony.xwork2.ActionContext;

public class BaseTools {
	
	public static String getXn(){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		if(month < 8)
			year--;
		return "" + year;
	}
	public static String getXq(){
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		String nq = "01";
		switch (month)
		{
			case 1:case 2:case 8:case 9:case 10:case 11:case 12:nq="01";break;
			case 3:case 4:case 5 :case 6 :case  7:nq="02";break;
			default:nq="01";break;
		}
		return nq;
	}
	public static void success(String message, String waitSecond, String jumpURL) {
		if(waitSecond == null ){
			waitSecond = "2";
		}
		ActionContext context = ActionContext.getContext();
		context.put("issuccess", "1");
		context.put("message", message);
		context.put("waitSecond", waitSecond);
		context.put("jumpURL", jumpURL);
	}
	public static void error(String message, String waitSecond, String jumpURL) {
		if(waitSecond == null ){
			waitSecond = "3";
		}
		ActionContext context = ActionContext.getContext();
		context.put("issuccess", "0");
		context.put("message", message);
		context.put("waitSecond", waitSecond);
		context.put("jumpURL", jumpURL);
	}
	

}
