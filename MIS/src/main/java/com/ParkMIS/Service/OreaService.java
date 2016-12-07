package com.ParkMIS.Service;

import com.ParkMIS.DAO.OreaDAO;
import com.ParkMIS.entity.Orea;

public class OreaService {
	private OreaDAO oreaDAO;
	public boolean add(Orea orea){
		return oreaDAO.add(orea);
	}
	public boolean delete(Orea orea){
		return oreaDAO.delete(orea);
	}
	public boolean update(Orea orea,Orea orea1){
		return oreaDAO.update(orea, orea1);
	}
	public OreaDAO getOreaDAO() {
		return oreaDAO;
	}
	public void setOreaDAO(OreaDAO oreaDAO) {
		this.oreaDAO = oreaDAO;
	}
	
}
