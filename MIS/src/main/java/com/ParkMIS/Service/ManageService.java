package com.ParkMIS.Service;

import java.util.List;

import com.ParkMIS.DAO.ManageDAO;
import com.ParkMIS.entity.Manage;
import com.ParkMIS.entity.Vip;

public class ManageService {
	private ManageDAO manageDAO;
	public boolean add(Manage manage){
		return manageDAO.add(manage);
	}
	public boolean delete(Manage manage){
		return manageDAO.delete(manage);
	}
	public boolean update(Manage manage1,Manage manage2){
		return manageDAO.update(manage1, manage2);
	}
	public ManageDAO getManageDAO() {
		return manageDAO;
	}
	public void setManageDAO(ManageDAO manageDAO) {
		this.manageDAO = manageDAO;
	};
	public List<Manage> hy(int vid) throws Exception{
		return manageDAO.hy(vid);
		
	}
	public Manage getLastByVip(Vip vip){
		return manageDAO.getLastByVip(vip);
	}
	public Manage getManageByOid(int i){
		return manageDAO.getMangeByOid(i);
	}
}
