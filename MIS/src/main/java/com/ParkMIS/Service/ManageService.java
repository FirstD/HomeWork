package com.ParkMIS.Service;

import com.ParkMIS.DAO.ManageDAO;
import com.ParkMIS.entity.Manage;

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
	
}
