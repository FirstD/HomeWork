package com.ParkMIS.Service;

import com.ParkMIS.DAO.AdminDAO;
import com.ParkMIS.entity.Admin;

public class AdminService {
	private AdminDAO adminDAO;
	public boolean add(Admin admin){
		return adminDAO.add(admin);
	}
	public boolean delete(Admin admin){
		return adminDAO.delete(admin);
	}
	public boolean update(Admin adminO,Admin adminN){
		return adminDAO.update(adminO, adminN);
	}
	public Admin getAdmin(Admin admin){
		return adminDAO.getAdmin(admin);
	}
	public AdminDAO getAdminDAO() {
		return adminDAO;
	}
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}
	
	
}
