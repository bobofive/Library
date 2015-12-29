package com.utils;

import java.util.Calendar;

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

}
