package com.services;

import java.util.List;

import com.domain.Majorinfo;

public interface MajorinfoService {
	
	//创建专业信息
	int creatMajorinfo(Majorinfo majorinfo);
	//删除专业信息
	boolean deleteMajorinfo(Integer MajorCode);
	//获取所有的专业信息
	List getAllMajorinfo();

}
