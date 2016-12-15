package com.ParkMIS.Service;

import java.util.List;

import com.ParkMIS.DAO.ParkDAO;
import com.ParkMIS.entity.Admin;
import com.ParkMIS.entity.Park;
import com.ParkMIS.entity.ParkAdmin;

public class ParkService {
	private ParkDAO parkDAO;
	public boolean add(Park park){
		return parkDAO.add(park);
	}
	public boolean delete(Park park){
		return parkDAO.delete(park);
	}
	public boolean update(Park parkN,Park parkO){
		return parkDAO.update(parkN, parkO);
	}
	public ParkDAO getParkDAO() {
		return parkDAO;
	}
	public void setParkDAO(ParkDAO parkDAO) {
		this.parkDAO = parkDAO;
	}
	public List<Park> hkc(String name){
		return parkDAO.hkc(name);
	}
	public List<Park> ykc(String name){
		return parkDAO.ykc(name);
	}
	public List<Park> tcc(String place){
		return parkDAO.tcc(place);
	}
	public Park getPid(String pname){
		return parkDAO.getPid(pname);
	}
	public List<Park> getAll(){
		return parkDAO.getAll();
	}
	public List<ParkAdmin> getAllByPlace(String place){
		return parkDAO.getAllByPlace(place);
	}
	public boolean addOrea(Park park){
		return parkDAO.addOrea(park);
	}
	public List<Park> getOreaByAdmin(Admin admin){
		return parkDAO.getOreaByAdmin(admin);
	}
	public boolean update(Park park){
		return parkDAO.update(park);
	}
	public List<Park> akc(int pid){
		return parkDAO.akc(pid);
	}
}
