package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Orderinfo;

public class OrderinfoServiceImpl implements OrderinfoService {
	
	private BaseDaoHibImpl<Orderinfo> baseDao;

	public int creatOrderinfo(Orderinfo orderinfo) {
		// TODO Auto-generated method stub
		baseDao.save(orderinfo);
		return 0;
	}

	public boolean deleteOrderinfo(String id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Orderinfo.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	public boolean deleteAllOrderinfo() {
		// TODO Auto-generated method stub
		return false;
	}

	public List getOrderinfoByUserId(Integer userId) {
		// TODO Auto-generated method stub
		String hql="select s from Seatinfo s,Orderinfo o where o.userId="
				+ userId +" and o.seatId=s.seatId";
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Orderinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Orderinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
