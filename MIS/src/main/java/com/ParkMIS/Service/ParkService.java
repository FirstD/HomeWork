package com.ParkMIS.Service;

import com.ParkMIS.DAO.ParkDAO;
import com.ParkMIS.entity.Park;

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
	
}
