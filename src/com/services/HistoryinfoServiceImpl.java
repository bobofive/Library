package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Historyinfo;

public class HistoryinfoServiceImpl implements HistoryinfoService {
	
	private BaseDaoHibImpl<Historyinfo> baseDao;

	public int creatHistoryinfo(Historyinfo historyinfo) {
		// TODO Auto-generated method stub
		baseDao.save(historyinfo);
		return 0;
	}

	public boolean deleteHistoryinfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Historyinfo.class,id);
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
		return true;
	}

	public List getAllHistoryinfo() {
		// TODO Auto-generated method stub
		return baseDao.findAll(Historyinfo.class);
	}
	
	public List getHistoryinfoByUserId(Integer userId){
		String hql="select h from Historyinfo h where h.userId="+ userId;
		return baseDao.find(hql);
	}

	public BaseDaoHibImpl<Historyinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Historyinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
