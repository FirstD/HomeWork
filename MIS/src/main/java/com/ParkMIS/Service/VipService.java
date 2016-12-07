package com.ParkMIS.Service;

import com.ParkMIS.DAO.VipDAO;
import com.ParkMIS.entity.Vip;

public class VipService {
	private VipDAO vipDAO;
	public boolean add(Vip vip){
		return vipDAO.add(vip);
	}
	public boolean delete(Vip vip){
		return vipDAO.delete(vip);
	}
	public boolean update(Vip vip,Vip vip1){
		return vipDAO.update(vip, vip1);
	}
	public Vip getVip(Vip vip){
		return vipDAO.getVip(vip);
	}
	public VipDAO getVipDAO() {
		return vipDAO;
	}
	public void setVipDAO(VipDAO vipDAO) {
		this.vipDAO = vipDAO;
	}
}
